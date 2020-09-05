<%@page import="java.util.HashMap"%>
<%
    String e=request.getParameter("email");
    String p=request.getParameter("password");
    db.DbConnect db=new db.DbConnect();
    HashMap UserDetails=db.checkLogin(e, p);
    if(UserDetails!=null){
            session.setAttribute("UserDetails",UserDetails);
            response.sendRedirect("profile.jsp");
    }else{
            session.setAttribute("msg","Invalid Id or Password");
            response.sendRedirect("home.jsp");
    }
%>