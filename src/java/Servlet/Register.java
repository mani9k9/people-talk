
package Servlet;

import java.io.*;
import java.util.HashMap;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.*;
import javax.servlet.http.Part;
 @MultipartConfig
public class Register extends HttpServlet {

   
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session=request.getSession();
        try{
            String e=request.getParameter("email");
            String p=request.getParameter("password");
            String n=request.getParameter("name");
            String ph=request.getParameter("phone");
            String g=request.getParameter("gender");
            String s=request.getParameter("state");
            String c=request.getParameter("city");
            String a=request.getParameter("area");
            String dt=request.getParameter("dob");
            
           java.text.SimpleDateFormat sdf=new java.text.SimpleDateFormat("dd/MM/yyyy");
           java.util.Date date=sdf.parse(dt);
           java.sql.Date d=new java.sql.Date(date.getTime());
            
            Part part=request.getPart("photo");
            InputStream is=null;
            if(part!=null){
                is=part.getInputStream();
            }
            HashMap userDetails=new HashMap();
            userDetails.put("email",e);
            userDetails.put("pass",p);
            userDetails.put("name",n);
            userDetails.put("phone", ph);
            userDetails.put("gender", g);
            userDetails.put("dob", d);
            userDetails.put("state", s);
            userDetails.put("city", c);
            userDetails.put("area", a);
            userDetails.put("photo", is);
            db.DbConnect db=new db.DbConnect();
            String m=db.insertUser(userDetails);
            if(m.equalsIgnoreCase("SUCCESS")){
                userDetails.remove("pass");
                userDetails.remove("photo");
            session.setAttribute("msg","Registration Successful");
            session.setAttribute("userDetails", userDetails);
            response.sendRedirect("profile.jsp");
            }else if(m.equalsIgnoreCase("Already")){
                session.setAttribute("msg","Account with this e-mail ID already exists..!1");
                response.sendRedirect("home.jsp");
            }else{
                session.setAttribute("msg","Registration failed..!!");
                response.sendRedirect("home.jsp");
            }
        }catch(Exception ex){
        session.setAttribute("msg",ex.getMessage());
        response.sendRedirect("home.jsp");
        }
        
    }
}