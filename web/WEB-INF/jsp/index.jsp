<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
         <%@include file="../jspf/Links.jspf" %>
    </head>
         
     <body class="hold-transition login-page" onload="nobackbutton()">
         <div class="login-box" style="width: 20%; margin: 0 auto;margin-top:10%;" aling="center">
             <div class="login-logo" style="text-align: center;">
                <a href="#"><b><h1>Descanso Médico</h1></b><h1>UPeU</h1></a>
            </div>
            <form action="login" method="post">
                <div class="login-box-body" style="box-shadow: 0 0 20px 0 black;">
                    <p class="login-box-msg" style="margin-left: 5px;margin-top: 2px;">Iniciar Sesión</p>

                    <div>
                        <div class="form-group has-feedback" style="margin: 8px;">
                            <input type="text" class="form-control" placeholder="Usuario" name="user">
                            <span class="glyphicon glyphicon-user form-control-feedback"></span>
                        </div>
                        <div class="form-group has-feedback" style="margin: 8px;">
                            <input type="password" class="form-control" placeholder="Contraseña" name="clave">
                            <span class="glyphicon glyphicon-lock form-control-feedback"></span>
                        </div>
                        <div class="row" style="margin:9px ;">
                            <div class="col-xs-12" >
                                <button type="submit" class="btn btn-primary btn-block " style="margin-bottom: 7px;" >Ingresar</button>
                            </div>
                        </div>
                    </div>

                </div>
            </form>
        </div> 
    </body>
</html>
