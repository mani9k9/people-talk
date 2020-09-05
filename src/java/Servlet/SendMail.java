
package Servlet;

import java.io.IOException;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SendMail extends HttpServlet {

  
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        HttpSession session=request.getSession();
        try{
        String e=request.getParameter("email");
        db.DbConnect db=new db.DbConnect();
        String p=db.getPassword(e);
        if(p!=null){
        final String SEmail="abhishek.ab192021@gmail.com";
        final String SPass="iemverma@1234567";
        final String REmail=e;
        final String Sub="your password is here: from PTALK..!!";
        final String Body="your email id: "+e+"and password: "+p;
        Properties props=new Properties();
        props.put("mail.smtp.host","smtp.gmail.com");
            props.put("mail.smtp.socketFactory.port","465");
            props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
            props.put("mail.smtp.auth","true");
            props.put("mail.smtp.port","465");
        Session ses=Session.getInstance(props,
        new javax.mail.Authenticator() {
        protected PasswordAuthentication getPasswordAuthentication(){
        return new PasswordAuthentication(SEmail,SPass);
                }
            }
            );
        Message message=new MimeMessage(ses);
        message.setFrom(new InternetAddress(SEmail));
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(REmail));
        message.setSubject(Sub);
        message.setContent(Body,"text/html" );
        Transport.send(message);
        session.setAttribute("msg","Mail Sent successfully.");
        response.sendRedirect("forgetpassword.jsp");
        }else{
                session.setAttribute("msg", "Wrong Emial ID");
                response.sendRedirect("forgetpassword.jsp");
            }
        }catch(Exception ex){
        session.setAttribute("msg", "Exception: "+ex);
        response.sendRedirect("forgetpassword.jsp");
        ex.printStackTrace();
        }
        }
    }
