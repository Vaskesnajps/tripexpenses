<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	 <%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!doctype html>
<html lang="en">
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
            <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
                <link rel="shortcut icon" type="image/x-icon" href="${pageContext.request.contextPath}/static/assets/money_euro.png" />
                <!-- Bootstrap CSS -->
                <link rel="stylesheet" href="${pageContext.request.contextPath}/static/assets/web/assets/mobirise-icons/mobirise-icons.css">
                    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/assets/tether/tether.min.css">
                        <link rel="stylesheet" href="${pageContext.request.contextPath}/static/assets/bootstrap/css/bootstrap.min.css">
                            <link rel="stylesheet" href="${pageContext.request.contextPath}/static/assets/bootstrap/css/bootstrap-grid.min.css">
                                <link rel="stylesheet" href="${pageContext.request.contextPath}/static/assets/bootstrap/css/bootstrap-reboot.min.css">
                                    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/assets/theme/css/style.css">
                                        <link rel="stylesheet" href="${pageContext.request.contextPath}/static/assets/mobirise/css/mbr-additional.css" type="text/css">


    

                                            <!-- Optional JavaScript -->
                                            <!-- jQuery first, then Popper.js, then Bootstrap JS -->

                                            <title>Travel Expenses</title>
                                            <style>
                                                body {
                                                background: url("${pageContext.request.contextPath}/static/assets/background2.jpg") no-repeat center center fixed;
                                                /* Center and scale the image nicely */
                                                background-size: cover;        
                                                }
                                                .col-xl-12 {
                                                padding: 0;
                                                align-content: center;
                                                align-items: center;
                                                align-self: center;
                                                margin-top: 8%;
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
                                                background-color:#ecececc9;
                                                border-radius: 50px;
                                                border: 1px solid #d8d8d8c5;
                                                font-weight: bold !important;
                                                }
                                                #act {
                                                font-weight: bold;
                                                }
                                                #nav1 {
                                                position: absolute;
                                                width: 100%;
                                                z-index: 21;
                                                }
                                                .container-fluid {
                                                padding: 0;
                                                }
                                                .btn.btn-outline-primary.my-2.my-sm-0 {
                                                margin-right: -2%;
                                                display: inline-block;
                                                font-weight: 400;
                                                text-align: center;
                                                white-space: nowrap;
                                                vertical-align: middle;
                                                -webkit-user-select: none;
                                                -moz-user-select: none;
                                                -ms-user-select: none;
                                                user-select: none;
                                                border: 1px solid transparent;
                                                padding: .375rem .75rem;
                                                font-size: 1rem;
                                                line-height: 1.5;
                                                border-radius: .25rem;
                                                transition: color .15s ease-in-out,background-color .15s ease-in-out,border-color .15s ease-in-out,box-shadow .15s ease-in-out;
                                                border-color: #007bff;
                                                }
                                                #lg { 
                                                font-size: 0.75em;
                                                }
                                            </style>
                                            <script>

                                            </script>
    </head>
    <body>
        <nav id="nav1" class="navbar navbar-expand-lg navbar-light" style="background-color: #ffffffc9;">
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
					<input id="lg" type="submit" class="btn btn-outline-primary my-2 my-sm-0"   value="Sign Out  <security:authentication property="principal.username" /> ">
				                   
				                        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token }"> 
					</form>
				</sec:authorize>
            </div>
        </nav>
        <div class="container-fluid">
            <section class="carousel slide cid-r3CV8bUKDX" data-interval="false" id="slider1-4">

    

                <div class="full-screen">
                    <div class="mbr-slider slide carousel" data-pause="true" data-keyboard="false" data-ride="carousel" data-interval="4000">
                        <ol class="carousel-indicators">
                            <li data-app-prevent-settings="" data-target="#slider1-4" data-slide-to="0"></li>
                            <li data-app-prevent-settings="" data-target="#slider1-4" data-slide-to="1"></li>
                            <li data-app-prevent-settings="" data-target="#slider1-4" data-slide-to="2"></li>
                            <li data-app-prevent-settings="" data-target="#slider1-4" data-slide-to="3"></li>
                            <li data-app-prevent-settings="" data-target="#slider1-4" data-slide-to="4"></li>
                            <li data-app-prevent-settings="" data-target="#slider1-4" class=" active" data-slide-to="5"></li>
                            <li data-app-prevent-settings="" data-target="#slider1-4" data-slide-to="6"></li>
                            <li data-app-prevent-settings="" data-target="#slider1-4" data-slide-to="7"></li>
                        </ol>
                        <div class="carousel-inner" role="listbox">
                            <div class="carousel-item slider-fullscreen-image" data-bg-video-slide="false" style="background-image: url(${pageContext.request.contextPath}/static/assets/images/mbr-1920x1234.jpg);">
                                <div class="container container-slide">
                                    <div class="image_wrapper">
                                        <div class="mbr-overlay" style="opacity: 0.2;"></div>
                                        <img src="${pageContext.request.contextPath}/static/assets/images/mbr-1920x1234.jpg">
                                            <div class="carousel-caption justify-content-center">
                                                <div class="col-10 align-center"></div>
                                            </div>
                                    </div>
                                </div>
                            </div>
                            <div class="carousel-item slider-fullscreen-image" data-bg-video-slide="false" style="background-image: url(${pageContext.request.contextPath}/static/assets/images/mbr-1920x1275.jpg);">
                                <div class="container container-slide">
                                    <div class="image_wrapper">
                                        <div class="mbr-overlay" style="opacity: 0.2;"></div>
                                        <img src="${pageContext.request.contextPath}/static/assets/images/mbr-1920x1275.jpg">
                                            <div class="carousel-caption justify-content-center">
                                                <div class="col-10 align-center"></div>
                                            </div>
                                    </div>
                                </div>
                            </div>
                            <div class="carousel-item slider-fullscreen-image" data-bg-video-slide="false" style="background-image: url(${pageContext.request.contextPath}/static/assets/images/mbr-1920x1271.jpg);">
                                <div class="container container-slide">
                                    <div class="image_wrapper">
                                        <div class="mbr-overlay" style="opacity: 0.2;"></div>
                                        <img src="${pageContext.request.contextPath}/static/assets/images/mbr-1920x1271.jpg">
                                            <div class="carousel-caption justify-content-center">
                                                <div class="col-10 align-center"></div>
                                            </div>
                                    </div>
                                </div>
                            </div>
                            <div class="carousel-item slider-fullscreen-image" data-bg-video-slide="false" style="background-image: url(${pageContext.request.contextPath}/static/assets/images/mbr-1920x1357.jpg);">
                                <div class="container container-slide">
                                    <div class="image_wrapper">
                                        <div class="mbr-overlay" style="opacity: 0.2;"></div>
                                        <img src="${pageContext.request.contextPath}/static/assets/images/mbr-1920x1357.jpg">
                                            <div class="carousel-caption justify-content-center">
                                                <div class="col-10 align-center"></div>
                                            </div>
                                    </div>
                                </div>
                            </div>
                            <div class="carousel-item slider-fullscreen-image" data-bg-video-slide="false" style="background-image: url(${pageContext.request.contextPath}/static/assets/images/mbr-1920x1280.jpg);">
                                <div class="container container-slide">
                                    <div class="image_wrapper">
                                        <div class="mbr-overlay" style="opacity: 0.2;"></div>
                                        <img src="${pageContext.request.contextPath}/static/assets/images/mbr-1920x1280.jpg">
                                            <div class="carousel-caption justify-content-center">
                                                <div class="col-10 align-center"></div>
                                            </div>
                                    </div>
                                </div>
                            </div>
                            <div class="carousel-item slider-fullscreen-image active" data-bg-video-slide="false" style="background-image: url(${pageContext.request.contextPath}/static/assets/images/mbr-1-1920x1280.jpg);">
                                <div class="container container-slide">
                                    <div class="image_wrapper">
                                        <div class="mbr-overlay" style="opacity: 0.2;"></div>
                                        <img src="${pageContext.request.contextPath}/static/assets/images/mbr-1-1920x1280.jpg">
                                            <div class="carousel-caption justify-content-center">
                                                <div class="col-10 align-center"></div>
                                            </div>
                                    </div>
                                </div>
                            </div>
                            <div class="carousel-item slider-fullscreen-image" data-bg-video-slide="false" style="background-image: url(${pageContext.request.contextPath}/static/assets/images/mbr-2-1920x1280.jpg);">
                                <div class="container container-slide">
                                    <div class="image_wrapper">
                                        <div class="mbr-overlay" style="opacity: 0.2;"></div>
                                        <img src="${pageContext.request.contextPath}/static/assets/images/mbr-2-1920x1280.jpg">
                                            <div class="carousel-caption justify-content-center">
                                                <div class="col-10 align-center"></div>
                                            </div>
                                    </div>
                                </div>
                            </div>
                            <div class="carousel-item slider-fullscreen-image" data-bg-video-slide="false" style="background-image: url(${pageContext.request.contextPath}/static/assets/images/mbr-3-1920x1280.jpg);">
                                <div class="container container-slide">
                                    <div class="image_wrapper">
                                        <div class="mbr-overlay" style="opacity: 0.2;"></div>
                                        <img src="${pageContext.request.contextPath}/static/assets/images/mbr-3-1920x1280.jpg">
                                            <div class="carousel-caption justify-content-center">
                                                <div class="col-10 align-center"></div>
                                            </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <a data-app-prevent-settings="" class="carousel-control carousel-control-prev" role="button" data-slide="prev" href="#slider1-4">
                            <span aria-hidden="true" class="mbri-left mbr-iconfont"></span>
                            <span class="sr-only">Previous</span>
                        </a>
                        <a data-app-prevent-settings="" class="carousel-control carousel-control-next" role="button" data-slide="next" href="#slider1-4">
                            <span aria-hidden="true" class="mbri-right mbr-iconfont"></span>
                            <span class="sr-only">Next</span>
                        </a>
                    </div>
                </div>
                  
            </section>
            <section class="engine">
                <a href="https://mobiri.se/v">html templates</a>
            </section>
            <script src="${pageContext.request.contextPath}/static/assets/web/assets/jquery/jquery.min.js"></script>
            <script src="${pageContext.request.contextPath}/static/assets/popper/popper.min.js"></script>
            <script src="${pageContext.request.contextPath}/static/assets/tether/tether.min.js"></script>
            <script src="${pageContext.request.contextPath}/static/assets/bootstrap/js/bootstrap.min.js"></script>
            <script src="${pageContext.request.contextPath}/static/assets/ytplayer/jquery.mb.ytplayer.min.js"></script>
            <script src="${pageContext.request.contextPath}/static/assets/vimeoplayer/jquery.mb.vimeo_player.js"></script>
            <script src="${pageContext.request.contextPath}/static/assets/bootstrapcarouselswipe/bootstrap-carousel-swipe.js"></script>
            <script src="${pageContext.request.contextPath}/static/assets/smoothscroll/smooth-scroll.js"></script>
            <script src="${pageContext.request.contextPath}/static/assets/theme/js/script.js"></script>
            <script src="${pageContext.request.contextPath}/static/assets/slidervideo/script.js"></script>
        </div>
    </body>
</html>

<%-- <!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home page</title>
</head>
<body>
<p><a href="${pageContext.request.contextPath}/locations">Show all locations</a></p>
<sec:authorize access="hasAuthority('admin')">
                       <p><a href="${pageContext.request.contextPath}/addlocation">Add new location</a></p>
	</sec:authorize>
	
	<p><a href="${pageContext.request.contextPath}/employees">Show all employees</a></p>
	
	<sec:authorize access="hasAuthority('admin')">
	<p><a href="${pageContext.request.contextPath}/addemployee">Add new employee</a></p>
                      <p><a href="${pageContext.request.contextPath}/users">Show all users</a></p>
                      	<p><a href="${pageContext.request.contextPath}/adduser">Add new user</a></p>
                      <p><a href="${pageContext.request.contextPath}/authorities">Show all authorities</a></p>
                      
	</sec:authorize>
	

	
	<p><a href="${pageContext.request.contextPath}/addbusinesstrip">Add new business trip</a></p>
	<p><a href="${pageContext.request.contextPath}/businesstrips">Show all business trips</a></p>
	<p><a href="${pageContext.request.contextPath}/tripbills">Show all trip bills</a></p>
	<p><a href="${pageContext.request.contextPath}/addbill">Add new bill</a></p>
	<p><a href="${pageContext.request.contextPath}/bills">Show all bills</a></p>
	 <sec:authorize access="!isAuthenticated()">
	<c:url var="loginUrl" value="login" />
	<form action="${loginUrl}" method="post">
	<input type="submit" class="btn btn-info"   value="login">
                  
                         <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token }"> 
                </form>
	</sec:authorize>
	
	<sec:authorize access="isAuthenticated()">
	<c:url var="logoutUrl" value="logout" />
	<form action="${logoutUrl}" method="post">
	<input type="submit" class="btn btn-info"   value="logout"> Logged in as <security:authentication property="principal.username" /> 
                   
                        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token }"> 
</form>
</sec:authorize>
</body>
</html> --%>