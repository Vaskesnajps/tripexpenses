<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
                                background-image: linear-gradient(to bottom, rgba(81, 81, 81, 1),rgba(81, 81, 81, 1),rgba(99,123,131,0.3));
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
                            </style>
                            <script>

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
                    <li class="nav-item">
                        <a class="nav-link" href="${pageContext.request.contextPath}/businesstrips">Business Trips</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="${pageContext.request.contextPath}/bills">Bills</a>
                    </li>
                    <li class="nav-item active">
                        <a id="act" class="nav-link" href="#">Trip Bills <span class="sr-only">(current)</span></a>
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
                <%-- <form class="form-inline my-2 my-lg-0" action="${logoutUrl}" method="post">
                    <button class="btn btn-outline-primary my-2 my-sm-0" type="submit">Sign Out</button>
                </form> --%>
            </div>
        </nav>
        <div class="container-fluid">
            <div class="row">
                <div class="col-xl-12 col-lg-10 col-md-6 col-sm-6 container-fluid" id="divic">
    					<h4 style="color:green; text-align: center;">${message}</h4>
    					<sec:authorize access="hasAuthority('admin')">
                        <button type="button" id="Add" class="btn btn-light" >Add New Total Trip Bills</button>
                        </sec:authorize>
                        <div class="table-responsive">
                        <table id="example" class="table table-striped table-bordered" style=" height: 10%; background-color: white;">
                            <thead>
			                    <tr>
			                        <th>Trip bill Id</th>
			                        <th>Business trip</th> 
			                        <th>Total bill amount</th>  
			                        <th>Total allowance</th>
			                        <th>Summary</th> 
			                        <th>Action:</th>
			                    </tr>
			                </thead>
			                <tbody>
			                    <c:forEach var="tripbill" items="${tripbills}">
			                        <tr>
			                            <td>${tripbill.tripbillid}</td>
			                            <td>${tripbill.businesstrip}</td> 
			                            <td>${tripbill.totalamount}</td>                        
			                            <td>${tripbill.totalalowance}</td> 
			                            <td>${tripbill.summary}</td>
			                            <td><a onclick="if(!(confirm('Are u sure u want to delete? '))) return false" href="${pageContext.request.contextPath}/deletetripbill?tripbillid=${tripbill.tripbillid}">Delete</a>
			                            </td>
			                        </tr>
			                    </c:forEach>
			                </tbody>
                        </table>
                   </div>
                </div>

                <form id="formica" action="${pageContext.request.contextPath}/docreatebill" method="post" onsubmit="return validateForma();">

                    <div class="form-group row">
                        <label for="inputBusinessTripId" class="col-sm-5 col-form-label">BusinessTrip ID: </label>
                        <div class="col-sm-7">
                            <select id="inputBusinessTripId" class="form-control form-control-sm" name="bustripid" >
									<c:forEach var="busstrip" items="${businesstrips}">
										<option value="${busstrip.bustripid}">${busstrip}</option>
									</c:forEach>
							</select>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="inputBillDate" class="col-sm-5 col-form-label">Bill Date: </label>
                        <div class="col-sm-7">
                            <input type="text" class="form-control" id="inputBillDate" name="billdate" placeholder="Bill Date">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="inputItem" class="col-sm-5 col-form-label">Item: </label>
                        <div class="col-sm-7">
                            <input type="text" class="form-control" id="inputItem" name="billitem" placeholder="Item Name">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="inputPrice" class="col-sm-5 col-form-label">Price: </label>
                        <div class="col-sm-7">
                            <input type="text" class="form-control" id="inputPrice" name="price" placeholder="Price">
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
            <!-- <footer id="foot">
                <p>
                    Engineering Software Lab® Copyright©2018
                </p>
            </footer> -->
        </div>
    </body>
</html>
    
<%-- <%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	 <%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All trip bills</title>
</head>
<body>
<table class = "table" border="2" width="600" >
                <thead>
                    <tr>
                        <th>Trip bill Id</th>
                        <th>Business trip</th> 
                        <th>Total bill amount</th>  
                        <th>Total allowance</th>
                        <th>Summary</th> 
                        <th>Action:</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="tripbill" items="${tripbills}">
                        <tr>
                            <td>${tripbill.tripbillid}</td>
                            <td>${tripbill.businesstrip}</td> 
                            <td>${tripbill.totalamount}</td>                        
                            <td>${tripbill.totalalowance}</td> 
                            <td>${tripbill.summary}</td>
                            <td><a onclick="if(!(confirm('Are u sure u want to delete? '))) return false" href="${pageContext.request.contextPath}/deletetripbill?tripbillid=${tripbill.tripbillid}">Delete</a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
</body>
</html> --%>