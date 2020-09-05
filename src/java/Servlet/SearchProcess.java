
package Servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SearchProcess extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
        HttpSession session=request.getSession();
        HashMap userDetails=(HashMap)session.getAttribute("userDetails");
        if(userDetails!=null){
            String s=request.getParameter("state");
           //System.out.println("Sfcxgsxghs");
            String c=request.getParameter("city");
           // System.out.println("City: "+c);
            String a=request.getParameter("area");
            db.DbConnect db=new db.DbConnect();
            ArrayList<HashMap> allUserDetails=db.searchPeople(s,c,(String)userDetails.get("email"),a);
           // System.out.println("dfghjk"+allUserDetails);
            if(! allUserDetails.isEmpty()){
                HashMap address=new HashMap();
                address.put("state",s);
                address.put("city",c);
                address.put("area", a);
                session.setAttribute("allUserDetails",allUserDetails);
                session.setAttribute("address",address);
                response.sendRedirect("peoplesearch.jsp");
            }else{
                session.setAttribute("msg","NO DATA FOUND");
                response.sendRedirect("profile.jsp");
            }
        }else{
            session.setAttribute("msg","Please Login First");
            response.sendRedirect("home.jsp");
        }
        }catch(Exception ex){}
        }
    }

  