<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!doctype html>
<html lang="en">
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
            <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
                <link rel="shortcut icon" type="image/x-icon" href="${pageContext.request.contextPath}/static/assets/money_euro.png" />
                <!-- Bootstrap CSS -->
                <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
					<script src="${pageContext.request.contextPath}/static/alertify.js-0.3.11/lib/alertify.min.js"></script>
                    <!-- include the core styles -->
                    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/alertify.js-0.3.11/themes/alertify.core.css" />
                    <!-- include a theme, can be included into the core instead of 2 separate files -->
                    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/alertify.js-0.3.11/themes/alertify.default.css" />
                    <!-- Optional JavaScript -->
                    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
                    <script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
                    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
                    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>


                    <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
                    <script src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js"></script>
                    <script src="https://cdn.datatables.net/1.10.19/js/dataTables.bootstrap4.min.js"></script>
                 
                        <link rel="stylesheet" href="https://cdn.datatables.net/1.10.19/css/dataTables.bootstrap4.min.css">
    
                            <script>
                                $(document).ready(function() {
                                $("#Add").click(function(event) {
                                $(".col-xl-12").hide();
                                $("#formica").show();
                                }   );
                                $('#example').DataTable({
                                "pageLength": 5
                                });
            
                                setTimeout(function(){
                                $("#divic").fadeIn(200);
                                },200);
                                } );
                            </script>
    
                            <title>Travel Expenses</title>
                            <style>
                                body {
                                background: url("${pageContext.request.contextPath}/static/assets/background2.jpg") no-repeat center center fixed;
                                /* Center and scale the image nicely */
                                background-size: cover;        
                                }
                                .col-xl-12 {
                                padding: 0 2%;
                                align-content: center;
                                align-items: center;
                                align-self: center;
                                }
                                #login {
                                background-image: linear-gradient(to bottom, rgba(170, 170, 170, 1),rgba(170, 170, 170, 1),rgba(99,123,131,0.3));
                                border-radius: 30px;
                                width: 100%;
                                z-index: 20;
                                top: 0; bottom: 0; left: 0; right: 0;
                                margin: auto;
                                text-align: center;
                                padding: 20px;
                                border: 3px solid #ffffffc9;
                                display: none;
                                }
                                
                                #p1 {
		                        font-family: roboto;
		                        font-size: 30px;
		                        font-style: italic;
		                        font-weight: bold;
		                        color: rgba(247, 247, 247, 0.74);
		                        }
		                        label {
		                        font-weight: bold;
		                        color: white;
		                        padding: 10px 0 0 10px;
		                        }
                                .navbar-brand {
                                font-family: 'Trebuchet MS', 'Lucida Sans Unicode', 'Lucida Grande', 'Lucida Sans', Arial, sans-serif;
                                }
                                #foot { 
                                position: fixed;
                                bottom: 0;
                                right: 0;
                                color: #000000;
                                text-align: right;
                                margin-right: 5px;
                                width:100%;
                                }
                                .nav-item {
                                margin-left: 5px;
                                margin-right: 5px;
                                font-size: 1em;
                                }
                                .nav-item.active {
                                font-weight: bold;
                                background-color:#ecececc9;
                                border-radius: 50px;
                                border: 1px solid #d8d8d8c5;
                                }
                                #divic{
                                background-image: linear-gradient(to bottom, rgba(170, 170, 170, 1),rgba(170, 170, 170, 0.5),rgba(99,123,131,0.3));
                                margin-top: 2%;
                                align-content: center;
                                align-items: center;
                                align-self: center;
                                border-radius: 30px;
                                display: none;
                                }
                                .row{
                                
                                }
                                .dataTables_length{
                                display: none;
                                }
                                .container-fluid{
                                }
        
                                #formica{
                                display: none;
                                background-image: linear-gradient(to bottom, rgba(170, 170, 170, 1),rgba(170, 170, 170, 1),rgba(99,123,131,0.3));
                                border-radius: 30px;
                                width: 70%;
                                z-index: 20;
                                top: 0; bottom: 0; left: 0; right: 0;
                                margin: auto;
                                text-align: center;
                                padding: 20px;
                                border: 3px solid #ffffffc9;
                                }
                                #Add{
                                margin-left: 6%;
                                margin-top: 0.7%;
                                position: absolute;
                                z-index: 1;
                                }
                                #lg { 
                                 	font-size: 0.75em;
                                 }
                                 .error {
                                 color: red;
                                 }
                            </style>
                            <script lang="JavaScript">
                            function validateForma() {
                                if (document.getElementById('inputDateFrom').value == "") {
                                    alertify.alert("All fields must be filled!");
                                    document.getElementById('inputDateFrom').focus();
                                    return false;
                                } else if (document.getElementById('inputDateTo').value == "") {
                                    alertify.alert("All fields must be filled!");
                                    document.getElementById('inputDateTo').focus();
                                    return false;
                                } else if (check_datefrom() && check_dateto() && check_dates()) {
                                    return true;
                                } else {
                                    return false;
                                }  
                            }
                            function check_datefrom() {
                                var regExLocName =  /^(0[1-9]|[12][0-9]|3[01])\-(0[1-9]|1[012])\-(20[0-9]\d|20[0-4]\d|2050)$/;
                                if(!regExLocName.test(document.getElementById('inputDateFrom').value)) {
                                    error.innerHTML = "Invalid date format!";
                                    return false;
                                } else {
                                    document.getElementById('error').innerHTML = "";
                                    return true;
                                };
                            }
                            function check_dateto() {
                                var regExLocName =  /^(0[1-9]|[12][0-9]|3[01])\-(0[1-9]|1[012])\-(20[0-9]\d|20[0-4]\d|2050)$/;
                                if(!regExLocName.test(document.getElementById('inputDateFrom').value)) {
                                    error1.innerHTML = "Invalid date format!";
                                    return false;
                                } else {
                                    document.getElementById('error1').innerHTML = "";
                                    return true;
                                };
                            }
                            function check_dates() {
                            	var x = document.getElementById('inputDateFrom').value;
                            	var y = document.getElementById('inputDateTo').value;
                            	if(x > y) {
                            		error1.innerHTML = "Trip ending date should be after starting date!";
                                    return false;
                                } else {
                                    document.getElementById('error1').innerHTML = "";
                                    return true;
                            	};
                            }
                            </script>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-light" style="background-color: #ffffffc9;">
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo03" aria-controls="navbarTogglerDemo03" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <a class="navbar-brand" href="${pageContext.request.contextPath}/">
                <img src="${pageContext.request.contextPath}/static/assets/money.ico" width="50" height="50" alt="">
                    Engineering Travel Expenses
            </a>
      
            <div class="collapse navbar-collapse" id="navbarTogglerDemo03">
                <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
                     
                    <li class="nav-item">
                        <a class="nav-link" href="${pageContext.request.contextPath}/employees">Employees</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="${pageContext.request.contextPath}/locations">Locations</a>
                    </li>
                    <li class="nav-item active">
                        <a id="act" class="nav-link" href="#">Business Trips <span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="${pageContext.request.contextPath}/bills">Bills</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="${pageContext.request.contextPath}/tripbills">Trip Bills</a>
                    </li>
					<sec:authorize access="hasAuthority('admin')">
                    <li class="nav-item">
                        <a class="nav-link" href="${pageContext.request.contextPath}/users">Admin Page</a>
                    </li>
                    </sec:authorize>
                </ul>
                <sec:authorize access="!isAuthenticated()">
					<c:url var="loginUrl" value="login" />
					<form class="form-inline my-2 my-lg-0" action="${loginUrl}" method="post">
					<input type="submit" class="btn btn-outline-primary my-2 my-sm-0"   value="log In">
				                  
				                         <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token }"> 
				                </form>
				</sec:authorize>
                <sec:authorize access="isAuthenticated()">
					<c:url var="logoutUrl" value="logout" />
					<form class="form-inline my-2 my-lg-0" action="${logoutUrl}" method="post">
					<input id="lg" type="submit" class="btn btn-outline-primary my-2 my-sm-0"   value="Sign Out <security:authentication property="principal.username" />">
				                   
				                        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token }"> 
					</form>
				</sec:authorize>

            </div>
        </nav>
        <div class="container-fluid">
            <div class="row">
                <div class="col-xl-12 col-lg-10 col-md-6 col-sm-6 container-fluid" id="divic">
    					<h4 style="color:green; text-align: center;">${message}</h4>
    					
                        <button type="button" id="Add" class="btn btn-light" >Add New Business Trip</button>
                        
                        <div class="table-responsive">
                        <table id="example" class="table table-striped table-bordered" style=" height: 10%; background-color: white;">
                            <thead>
			                    <tr>
			                        <th>ID</th>
			                        <th>From Date:</th>  
			                        <th>To Date:</th>  
			                        <th>Days count:</th> 
			                         <th>Total allowance:</th> 
			                        <th>Employee:</th>
			                        <th>Location:</th>  
			                        <th>Action:</th>  
			                    </tr>
			                </thead>
			                <tbody>
			                    <c:forEach var="businesstrip" items="${businesstrips}">
			                        <tr>
			                            <td>${businesstrip.bustripid}</td>
			                            <td>${businesstrip.fromdate}</td>  
			                            <td>${businesstrip.todate}</td>  
			                            <td>${businesstrip.dayscount}</td>  
			                             <td>${businesstrip.triptotallow}</td>  
			                            <td>${businesstrip.employee}</td>  
			                            <td>${businesstrip.location}</td>  
			                            <td><sec:authorize access="hasAuthority('admin')">
											<a onclick="if(!(confirm('Are u sure u want to delete? '))) return false" href="${pageContext.request.contextPath}/deletebusinesstrip?bustripid=${businesstrip.bustripid}">Delete</a>
											</sec:authorize>
			                            </td>                      
			                        </tr>
			                    </c:forEach>
			                </tbody>
                        </table>
                   </div>
                </div>
                <form id="formica" action="${pageContext.request.contextPath}/docreatebusinesstrip" method="post" onsubmit="return validateForma();">
                    <div class="form-group row">
                        <label for="inputDateFrom" class="col-sm-5 col-form-label">Date From: </label>
                        <div class="col-sm-7">
                            <input type="text" class="form-control" id="inputDateFrom" name="fromdate" placeholder="DD-MM-YYYY" onblur="check_datefrom();">
                        	<div class="error" id="error"></div>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="inputDateTo" class="col-sm-5 col-form-label">Date To: </label>
                        <div class="col-sm-7">
                            <input type="text" class="form-control" id="inputDateTo" name="todate" placeholder="DD-MM-YYYY" onblur="check_dateto();">
                        	<div class="error" id="error1"></div>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="inputLoc" class="col-sm-5 col-form-label">Location: </label>
                        <div class="col-sm-7">
                           <select class="form-control form-control-sm" name="locid" >
									<c:forEach var="location" items="${locations}">
										<option value="${location.locid}">${location.locname}</option>
									</c:forEach>
							</select>
                        </div>
                    </div>                
                    <div class="form-group row">
                        <div class="col-sm-12">
                            <br/>
                            <button class="btn btn-success" type="submit" id="submit">Add</button>
                            <input type="button" class="btn btn-danger" onclick="window.location.reload();" value="Cancel" />
                        </div>
                    </div>        
                </form>
            </div>
            <footer id="foot">
                <p>
                    Engineering Software Lab® Copyright©2018
                </p>
            </footer>
        </div>
    </body>
</html>