package Servlet;
import java.io.IOException;
import java.util.HashMap;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class changePassword extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response){
        HttpSession session=request.getSession();
        HashMap userDetails=(HashMap) session.getAttribute("userDetails");
        try{    
        String e=(String) userDetails.get("email");
        String o=request.getParameter("oldpassword");
        String n=request.getParameter("newpassword");
        String c=request.getParameter("confirmpassword");
        db.DbConnect db=new db.DbConnect();
        String cp=db.changePassword(e,o,n,c);
        if(cp.equalsIgnoreCase("done")){
        session.setAttribute("msg","password changed successfully..");
        response.sendRedirect("changepassword.jsp");
        }else if(cp.equalsIgnoreCase("fail")){
         session.setAttribute("msg","password change failed");
        response.sendRedirect("changepassword.jsp");
        }else {
        session.setAttribute("msg","new password and confirmed password did not matched..");
        response.sendRedirect("changepassword.jsp");
        }
        
        }catch(Exception ex){
        ex.printStackTrace();
        }
        }
    }

  