<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
        
    </head>

    <body>
        <div class="login-box">
            <div class="login-logo">
                <a href="#"><b>SPE</b>UPeU</a>
            </div>
            <form action="login" method="post">
                <div class="login-box-body" style="box-shadow: 0 0 20px 0 black;">
                    <p class="login-box-msg">Iniciar Sesión</p>

                    <div>
                        <div class="form-group has-feedback">
                            <input type="text" class="form-control" placeholder="Usuario" name="user">
                            <span class="glyphicon glyphicon-user form-control-feedback"></span>
                        </div>
                        <div class="form-group has-feedback">
                            <input type="password" class="form-control" placeholder="Contraseña" name="pass">
                            <span class="glyphicon glyphicon-lock form-control-feedback"></span>
                        </div>
                        <div class="row">
                            <div class="col-xs-12">
                                <button type="submit" class="btn btn-primary btn-block btn-flat">Ingresar</button>
                            </div>
                        </div>
                    </div>

                </div>
            </form>
        </div> 
    </body>
</html>
