<%@page import="java.util.HashMap"%>
<%
HashMap userDetails=(HashMap)session.getAttribute("userDetails");
 if(userDetails!=null)
 {
%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>PeopleTalk</title>

    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
	<link href="css/forgetpassword.css" rel="stylesheet">
	<link href="datetimepicker/css/datetimepicker.min.css" rel="stylesheet"  />
  </head>
  
  <body data-spy="scroll" data-target="#my-navbar">
<nav class="navbar navbar-inverse navbar-fixed-top">
		<div class="container">
			<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
				<span class="sr-only">Toggle navigation</span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="profile.jsp">PeopleTalk</a>
			<div class="navbar-collapse collapse">      ````````
				<ul class="nav navbar-nav navbar-right">
					<li><div class="navbar-text"><p>Welcome: <%= userDetails.get("name")%></p></div></li>
					<li><a href="profile.jsp">Home</a></li>
					<li><a href="home.jsp">Logout</a><li>
				</ul>			
			</div>
		</div>
	</nav><!-- end of navbar-->
		<div class="container">
			<section>
                            
				<div class="panel panel-default">
					<div class="panel-heading text-center">
						<h3>Edit Profile</h3>
					</div>
                                    <br>
                                     <%
                            String msg = (String) session.getAttribute("msg");
                            if (msg != null) {
                        %>
                        <div class="panel panel-danger">
                            <div class="panel-heading text-center">
                                <p><%=msg%></p>
                            </div>
                        </div>
                        <%
                                session.setAttribute("msg", null);
                            }
                        %>
					<div class="panel-body">
						<div class="container">
							<div class="row">
								<div class="col-lg-2 col-lg-offset-1">
									<img src="img/xyz.jpg">
								</div>
								<div class="col-lg-2">
									<form action="" class="form-horizontal">
										<div class="form-group">
										</br>
										</br>
											<label for="changephoto" class="control-label">Change Photo:</label><br>
										</div>
									</form>
								</div>
								<div class="col-lg-3">
									<form action="" data-toggle="validator" enctype='multipart/form-data' class="form-horizontal">
										<div class="form-group">
										</br>
										</br>
											<input type="file" name="changephoto" class="form-control" id="changephoto" required/>	
										</div>
									</form>
								</div>
								<div class="col-lg-3 " >
								<form action="EditProfile" class="form-horizontal">
										<div class="form-group">
										</br>
										</br>
										<button type="submit" class="btn btn-primary">Submit</button>
								</div>	
									</form>
								</div>
							</div>
						</div>
						<hr>
						<div class="container">
							<form action="EditProfile" method="post" data-toggle="validator" class="form-horizontal">
								<div class="form-group">
									<label for="email" class="col-lg-2 control-label">Email:</label>
									<div class="col-lg-5">
                                                                            <label class="form-control" id="email" ><%=userDetails.get("email")%></label>
									</div>
								</div><!--end form group-->
								<div class="form-group">
									<label for="phone" class="col-lg-2 control-label">Phone:</label>
									<div class="col-lg-5">
										<input type="text" name='phone' class="form-control" pattern="^[_0-9]{1,}$" maxlength="10" minlength="10" id="phone" placeholder="<%=userDetails.get("phone")%>"  required/>
									</div>
								</div><!--end form group-->
								<div class="form-group">
									<label for="name" class="col-lg-2 control-label">Name:</label>
									<div class="col-lg-5">
										<input type="text" class="form-control" id="name" name="name" pattern="^[_A-Z a-z]{1,}$"  placeholder="<%=userDetails.get("name")%>"  required/>
									</div>
								</div><!--end form group-->
								<div class="form-group">
									<label for="gender" class="col-lg-2 control-label">Gender:</label>
									<div class="col-lg-5"> 
                                                                                <%
                                                                                    String g=(String)userDetails.get("gender");
                                                                                    if(g.equalsIgnoreCase("male")){
                                                                                %>
										<input type="radio" id="gender"name="gender" value="male" checked/>Male
										<input type="radio" id="gender"name="gender" value="female"/>Female
                                                                                <%}
                                                                                else{%>
                                                                                <input type="radio" id="gender"name="gender" value="male" />Male
										<input type="radio" id="gender"name="gender" value="female"checked/>Female
                                                                                <%
                                                                                    }
                                                                                %>
									</div>
								</div><!--end form group-->
								<div class="form-group">
									<label for="dob" class="col-lg-2 control-label">Date of Birth:</label>
									<div class="col-lg-5">
										<input type="text" name="dob" class="form-control" id="dob" placeholder="<%=userDetails.get("dob")%>"/>
									</div>
								</div><!--end form group-->
								<div class="form-group">
									<label for="state" class="col-lg-2 control-label">State:</label>
                                                                        <div class="col-lg-5">
                                                                                <%=userDetails.get("state")%>
										<select class="form-control" name="state" class="form-control" id="listBox" onchange='selct_district(this.value)'>
											
										</select>
									</div>
								</div><!--end form group-->
								<div class="form-group">
									<label for="city" class="col-lg-2 control-label">City:</label>
									<div class="col-lg-5">
										<select class="form-control" id='secondlist'>
                                                                                    <option>
                                                                                        <%=userDetails.get("city")%>
                                                                                    </option>
										</select>
									</div>
								</div><!--end form group-->
								<div class="form-group">
									<label for="area" class="col-lg-2 control-label">Area:</label>
									<div class="col-lg-5">
                                                                            <input type="text" class="form-control" id="area" name="area" placeholder="<%=userDetails.get("area")%>"  required/>
									</div>
								</div><!--end form group-->
								<div class="form-group">
									<div class="col-lg-10 col-lg-offset-2">
										<input type="hidden" name="email" value="<%=userDetails.get("email")%>">
                                                                            <button type="submit" class="btn btn-primary">Update Profile</button>
									</div>
								</div>
							</form>	
						</div>
					</div>							
				</div>		
		</section>
	</div>
	<!--footer-->
	
	<div class="navbar navbar-inverse navbar-fixed-bottom">
		<div class="container">
			<div class="navbar-text pull-left">
				<p>Design and Develop by INCAPP</p>
			</div>
		</div>
	</div>
   	<script type="text/javascript" src="js/jquery-2.2.2.min.js" ></script>
    <script type="text/javascript" src="js/bootstrap.min.js" ></script>
	<script type="text/javascript" src="js/script.js" ></script>
  <script type="text/javascript" src="js/validator.js" ></script>
<script type="text/javaScript" src='js/state.js' ></script>
<script type="text/javascript" src="datetimepicker/js/moment.min.js" ></script>
<script type="text/javascript" src="datetimepicker/js/datetimepicker.min.js" ></script>
	<script type="text/javascript">
    $(function () {
        $('#dob').datetimepicker({
        	format: 'DD/MM/YYYY',
                maxDate: new Date()
        });
    });
	</script>
  </body>
</html>
<%
}
else{
session.setAttribute("msg","please login first");
response.sendRedirect("home.jsp");
}%>
