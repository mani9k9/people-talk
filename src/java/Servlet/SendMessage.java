
package Servlet;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

@MultipartConfig
public class SendMessage extends HttpServlet {

   
   
    protected void service(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
       try{
       HttpSession session=request.getSession();
       HashMap userDetails=(HashMap) session.getAttribute("userDetails");
       if(userDetails!=null){
       String temail=request.getParameter("temail");
       String semail=(String) userDetails.get("email");
       String message=request.getParameter("message");
       Part p=request.getPart("filetosend");
       InputStream is=null;
       String filename="";
       if(p!=null){
       filename=p.getSubmittedFileName();
       is=p.getInputStream();
       }
      
       db.DbConnect db=new db.DbConnect();
       String r=db.sendMessage(semail,temail,message,filename,is);
       if(r.equalsIgnoreCase("done")){
       session.setAttribute("msg","Message Sent Successfully..!!");
       }else{
       session.setAttribute("msg","Message sending Failed..!!");
       }
       response.sendRedirect("talk.jsp?temail="+temail);
       }
       else{
           session.setAttribute("msg","Please Login First..!!");
           response.sendRedirect("home.jsp");
               }
       }catch(Exception ex){
           ex.printStackTrace();
       }
     }
   }
    
