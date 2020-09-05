
package Servlet;

import java.io.*;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class GetPhoto extends HttpServlet {

   
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       try{
        String e=request.getParameter("email");
       db.DbConnect db=new db.DbConnect();
       byte[] b=db.getPhoto(e);
       if(b==null){
       ServletContext ctx=request.getServletContext();
       InputStream fin=ctx.getResourceAsStream("/img/xyz.jpg");
       b=new byte[3500];
       fin.read(b);}
       response.getOutputStream().write(b);
      
       
       }catch(Exception ex){
           ServletContext ctx=request.getServletContext();
           InputStream fin=ctx.getResourceAsStream("/img/xyz.jpg");  
           byte []b=new byte[3500];
           fin.read(b);
           response.getOutputStream().write(b);
         }
       }
    }

  