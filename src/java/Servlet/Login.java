
package Servlet;

import java.io.*;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;


public class Login extends HttpServlet {

   
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
    HttpSession session=request.getSession();
   try{
    String e=request.getParameter("email");
    String p=request.getParameter("password");
    db.DbConnect db=new db.DbConnect();
    HashMap userDetails=db.checkLogin(e, p);
    if(userDetails!=null){
            session.setAttribute("userDetails",userDetails);
            response.sendRedirect("profile.jsp");
    }else{
            session.setAttribute("msg","Invalid Id or Password");
            response.sendRedirect("home.jsp");
   }
   }catch(Exception ex){
   session.setAttribute("msg","Login Failed"+ex);
   }
        }
           }

  