<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!doctype html>
<html lang="en">
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
            <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
                <%-- <link rel="shortcut icon" type="image/x-icon" href="${pageContext.request.contextPath}/assets/money_euro.png" /> --%>

                <!-- Bootstrap CSS -->
                <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">

                    <!-- Optional JavaScript -->
                    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
                    <script src="${pageContext.request.contextPath}/static/alertify.js-0.3.11/lib/alertify.min.js"></script>
                    <!-- include the core styles -->
                    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/alertify.js-0.3.11/themes/alertify.core.css" />
                    <!-- include a theme, can be included into the core instead of 2 separate files -->
                    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/alertify.js-0.3.11/themes/alertify.default.css" />
                    <script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
                    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-cookie/1.4.1/jquery.cookie.js"></script>
                    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
                    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>

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
                        background-image: linear-gradient(to bottom, rgba(56, 204, 241, 1),rgba(56, 204, 241, 1),rgba(99,123,131,0.3));
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
                        #signup {
                        background-image: linear-gradient(to bottom, rgba(56, 204, 241, 1),rgba(56, 204, 241, 1),rgba(99,123,131,0.3));
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
                        color: rgba(22, 22, 22, 0.74);
                        }
                        label {
                        font-weight: bold;
                        }
                        .navbar-brand {
                        margin: 0 auto;
                        font-family: 'Trebuchet MS', 'Lucida Sans Unicode', 'Lucida Grande', 'Lucida Sans', Arial, sans-serif;
                        font-size: 30px;
                        }
                        #foot { 
                        position: fixed;
                        bottom: 0;
                        right: 0;
                        width: 100%;
                        color: #000000;
                        text-align: right;
                        margin-right: 5px;
                        }
                        .invalid {
                        border: 2px solid red;
                        }
                        .error {
                        color: red;
                        }
                        #back {
                        margin-right: 10px;
                        float: left;
                        }
                        #button {
                        border: 2px solid #ffffffc9;
                        border-radius: 10px;
                        }
                    </style>
                    <script>
                        $(document).ready(function (){
                        setTimeout(function(){
                        $("#login").fadeIn(2000);
                        },500);     
                        $("#item").click(function(event){
                        $("#login").hide();
                        $("#signup").show();
                        });
                        $("#back").click(function(event){
                        $("#signup").hide();
                        $("#login").show();
                        });
                        $("#submit").click(function(event) {
                        event.preventDefault();
                        $("#signup").fadeOut("fast", function(){
                        //Once button has faded, invoke the form submission
                        $("#forma").submit();
                        });
                        });
                        }); 
                    </script>
                    <script lang="JavaScript">
                        function validateFormb() {
                        if (document.getElementById('inputUsername').value == "") {
                        alertify.alert("All fields must be filled!");
                        document.getElementById('inputUsername').focus();
                        return false;
                        } else if (document.getElementById('inputPassword').value == "") {
                        alertify.alert("All fields must be filled!");
                        document.getElementById('inputPassword').focus();
                        return false;
                        } else {
                        return true;
                        }
                        }
                    </script>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-light" style="background-color: #ffffffc9;">
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo03" aria-controls="navbarTogglerDemo03" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <a class="navbar-brand" href="#">
                <img src="${pageContext.request.contextPath}/static/assets/money.ico" width="50" height="50" alt="">
                    Engineering Travel Expenses
            </a>
        </nav>
        <div class="container-fluid">
            <div class="row">
                <div class="col-xl-12">
                    <div id="login" class="col-xl-4 col-lg-6 col-md-6 col-sm-8" style="margin:0 auto;">
                        <form id="formb" onsubmit="return validateFormb();" action="${pageContext.request.contextPath}/login" method="POST">
                            <div class="form-group row">
                                <div class="col-sm-12" style="text-align:center;">
                                    <p id="p1">Please log in to continue...</p>
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="username" class="col-sm-3 col-form-label">Username: </label>
                                <div class="col-sm-9">
                                    <input type="text" class="form-control" id="username" name="username" placeholder="Username">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="password" class="col-sm-3 col-form-label">Password: </label>
                                <div class="col-sm-9">
                                    <input type="password" class="form-control" id="password" name="password" placeholder="Password">
                                </div>
                            </div>
                            <div class="form-group row">
                                <div class="col-sm-12">
                                    <br/>
                                    <button type="submit" class="btn btn-primary" id="button">Sign in</button>
                                </div>
                        
                            </div>        
                        </form>
                    </div>
                </div>
            </div>
            <footer id="foot">
                <p>
                    Engineering Software Lab® Copyright©2018
                </p>
            </footer>
        </div>
    </body>
</html>