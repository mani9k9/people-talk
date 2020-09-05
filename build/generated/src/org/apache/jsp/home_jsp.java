package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\" >\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" >\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" >\r\n");
      out.write("<title>PeopleTalk</title>\r\n");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" />\r\n");
      out.write("<link href=\"css/custom.css\" rel=\"stylesheet\" />\t\r\n");
      out.write("<link href=\"datetimepicker/css/datetimepicker.min.css\" rel=\"stylesheet\"  />\r\n");
      out.write("</head>\r\n");
      out.write(" \r\n");
      out.write("  <body data-spy=\"scroll\" data-target=\"#my-navbar\">\r\n");
      out.write("\t<nav class=\"navbar navbar-inverse navbar-fixed-top\" id=\"my-navbar\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#navbar-collapse\">\r\n");
      out.write("\t\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t<a href=\"home.jsp\" class=\"navbar-brand\">PeopleTalk</a>\r\n");
      out.write("\t\t\t</div><!--end header-->\r\n");
      out.write("\t\t</div><!--end container-->\r\n");
      out.write("\t</nav><!--end navbar-->\t\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<section>\r\n");
      out.write("\t\t\t<div class=\"carousel slide\" id=\"screenshot-carousel\" data-ride=\"carousel\">\r\n");
      out.write("\t\t\t\t<ol class=\"carousel-indicators\">\r\n");
      out.write("\t\t\t\t\t<li data-target=\"#screenshot-carousel\" data-slide-to=\"0\" class=\"active\"></li>\r\n");
      out.write("\t\t\t\t\t<li data-target=\"#screenshot-carousel\" data-slide-to=\"1\"></li>\r\n");
      out.write("\t\t\t\t\t<li data-target=\"#screenshot-carousel\" data-slide-to=\"2\"></li>\r\n");
      out.write("\t\t\t\t</ol>\r\n");
      out.write("\t\t\t\t<div class=\"carousel-inner\">\r\n");
      out.write("\t\t\t\t\t<div class=\"item active\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"img/pt1.jpg\" alt=\"Text of the image\" height=\"10\" width=\"1200\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"carousel-caption\">\r\n");
      out.write("\t\t\t\t\t\t\t<h1></h1>\r\n");
      out.write("\t\t\t\t\t\t\t<p></p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"item\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"img/pt2.jpg\" alt=\"Text of the image\" height=\"10\" width=\"1200\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"carousel-caption\">\r\n");
      out.write("\t\t\t\t\t\t\t<h1></h1>\r\n");
      out.write("\t\t\t\t\t\t\t<p></p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"item\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"img/pt3.jpg\" alt=\"Text of the image\" height=\"10\" width=\"1200\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"carousel-caption\">\r\n");
      out.write("\t\t\t\t\t\t\t<h1></h1>\r\n");
      out.write("\t\t\t\t\t\t\t<p></p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div><!--end carousel-inner-->\r\n");
      out.write("\t\t\t\t<a href=\"#screenshot-carousel\" class=\"left carousel-control\" data-slide=\"prev\">\r\n");
      out.write("\t\t\t\t\t<span class=\"glyphicon glyphicon-chevron-left\"></span>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t<a href=\"#screenshot-carousel\" class=\"right carousel-control\" data-slide=\"next\">\r\n");
      out.write("\t\t\t\t\t<span class=\"glyphicon glyphicon-chevron-right\"></span>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t</div><!--end of carousel-->\r\n");
      out.write("\t\t</section>\r\n");
      out.write("\t\t<hr>\r\n");
      out.write("\t</div><!--end of container-->\r\n");
      out.write("                    ");

                    String m=(String)session.getAttribute("msg");
                    if(m!=null){
                    
      out.write("\r\n");
      out.write("                        <div class=\"panel\">\r\n");
      out.write("                            <div class=\"panel-body bg-danger text-center\">\r\n");
      out.write("                                ");
      out.print(m);
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    ");
   
                        session.setAttribute("msg",null);
                    }
                    
      out.write("\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<section>\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-6\">\r\n");
      out.write("\t\t\t\t\t<div class=\"panel panel-default\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"panel-heading text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t<h3>Registration</h3>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"panel-body\">\r\n");
      out.write("\t\t\t\t\t\t\t<form action=\"Register\" method='post' data-toggle=\"validator\" enctype='multipart/form-data'  class=\"form-horizontal\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"email\" class=\"col-lg-3 control-label\">Email:</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-lg-9\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"email\" name=\"email\" class=\"form-control\" id=\"email\" placeholder=\"Enter your email\" required/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div><!--end form group-->\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"name\" class=\"col-lg-3 control-label\">Name:</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-lg-9\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"name\" class=\"form-control\" pattern=\"^[_A-Z a-z]{1,}$\" id=\"name\" placeholder=\"Enter your name\" required/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div><!--end form group-->\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"phone\" class=\"col-lg-3 control-label\">Phone:</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-lg-9\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name='phone' class=\"form-control\" pattern=\"^[_0-9]{1,}$\" maxlength=\"10\" minlength=\"10\" id=\"phone\" placeholder=\"Enter your phone\" required/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div><!--end form group-->\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"gender\" class=\"col-lg-3 control-label\">Gender:</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-lg-9\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"radio\" id=\"gender\"name=\"gender\" value=\"male\" checked/>Male\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"radio\" id=\"gender\"name=\"gender\" value=\"female\"/>Female\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div><!--end form group-->\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"dob\" class=\"col-lg-3 control-label\">Date of Birth:</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-lg-9\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"dob\" class=\"form-control\" id=\"dob\" placeholder=\"dd/MM/YYYY\" required />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div><!--end form group-->\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"state\" class=\"col-lg-3 control-label\">State:</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-lg-9\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<select name=\"state\" class=\"form-control\" id=\"listBox\" onchange='selct_district(this.value)'>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div><!--end form group-->\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"city\" class=\"col-lg-3 control-label\">City:</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-lg-9\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<select name=\"city\" class=\"form-control\" id='secondlist'>\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div><!--end form group-->\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"area\" class=\"col-lg-3 control-label\">Area:</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-lg-9\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"area\" class=\"form-control\" id=\"area\" placeholder=\"Enter your Area\" required/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div><!--end form group-->\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"photo\" class=\"col-lg-3 control-label\">Photo:</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-lg-9\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"file\" name=\"photo\" class=\"form-control\" id=\"photo\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div><!--end form group-->\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"pass\" class=\"col-lg-3 control-label\">Password:</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-lg-9\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"password\" name=\"password\" class=\"form-control\" id=\"pass\" placeholder=\"Enter your password\" required/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div><!--end form group-->\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-lg-10 col-lg-offset-3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"submit\" class=\"btn btn-primary\" value='Register'/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-6\">\r\n");
      out.write("\t\t\t\t\t<div class=\"panel panel-default\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"panel-heading text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t<h3>Login</h3>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"panel-body\">\r\n");
      out.write("\t\t\t\t\t\t\t<form action=\"Login.jsp\" data-toggle=\"validator\" class=\"form-horizontal\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"email\" class=\"col-lg-3 control-label\">Email:</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-lg-9\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"email\" name=\"email\" class=\"form-control\" id=\"email\" placeholder=\"Enter your email\" required />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div><!--end form group-->\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"password\" class=\"col-lg-3 control-label\">Password:</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-lg-9\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"password\" name=\"password\" class=\"form-control\" id=\"pass\" placeholder=\"Enter your name\" required/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div><!--end form group-->\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t  \t\t\t\t\t\t\t<div class=\"col-lg-10 col-lg-offset-3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-primary\">Login</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button type=\"reset\" class=\"btn btn-primary\">Reset</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-lg-10 col-lg-offset-3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"forgetpassword.html\">Forget Password?</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</section>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<hr>\r\n");
      out.write("\t<!--footer-->\r\n");
      out.write("\t<div class=\"navbar navbar-inverse navbar-fixed-bottom\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"navbar-text pull-left\">\r\n");
      out.write("\t\t\t\t<p>Design and Develop by INCAPP</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/jquery-2.2.2.min.js\" ></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/bootstrap.min.js\" ></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/script.js\" ></script>\r\n");
      out.write("  <script type=\"text/javascript\" src=\"js/validator.js\" ></script>\r\n");
      out.write("<script type=\"text/javaScript\" src='js/state.js' ></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"datetimepicker/js/moment.min.js\" ></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"datetimepicker/js/datetimepicker.min.js\" ></script>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("    $(function () {\r\n");
      out.write("        $('#dob').datetimepicker({\r\n");
      out.write("        \tformat: 'DD/MM/YYYY',\r\n");
      out.write("                maxDate: new Date()\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("\t</script>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
