
package Servlet;

import java.io.IOException;
import java.util.HashMap;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class EditProfile extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
     HttpSession session=request.getSession();
     HashMap userDetails=(HashMap) session.getAttribute("userDetails");
    try{
     String e=request.getParameter("email");
     String n=request.getParameter("name");
     String ph=request.getParameter("phone");
     String g=request.getParameter("gender");
     String dt=request.getParameter("dob");
     java.text.SimpleDateFormat sdf=new java.text.SimpleDateFormat("dd/MM/yyyy");
     java.util.Date date=sdf.parse(dt);
     java.sql.Date d=new java.sql.Date(date.getTime());
     String s=request.getParameter("state");
     String c=request.getParameter("city");
     String a=request.getParameter("area");
     db.DbConnect db=new db.DbConnect();
     String k=db.editProfile(n, ph, g, d, s, c, a, e);
     if(k.equalsIgnoreCase("success")){
     session.setAttribute("msg","updation done"); 
     response.sendRedirect("editprofile.jsp");
     }
     else{
      session.setAttribute("msg","updation failed"); 
      response.sendRedirect("editprofile.jsp");
     }
    }catch(Exception ex){
        ex.printStackTrace();
    }
    }
    }
     
     
    

   