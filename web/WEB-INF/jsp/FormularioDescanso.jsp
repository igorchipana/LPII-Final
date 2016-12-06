<%-- 
    Document   : FormularioDescanso
    Created on : 06/12/2016, 12:43:48 AM
    Author     : Jesus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Descanso Medico</title>
    </head>
    <body>
        <h1>Formulario</h1>
        <div class="container">
            <div class="row">
                <form method="POST" action="inicio" class="center">
                        <div>
                            <input type="text" list="usuarios" name="idtrabajador" class="form-control input-sm chat-input" />
                            <datalist id="usuarios">
                                <!--<option label="nombre" value="id"/>-->
                                
                            </datalist>
                            </br>
                            <input type="date" name="fechainicio" class="form-control input-sm chat-input" />
                            </br>
                            <input type="date" name="fechafin" class="form-control input-sm chat-input"/>
                            </br>
                            <input type="text" name="motivo" class="form-control input-sm chat-input"/>
                            </br>
                            <div class="wrapper">
                                <input type="submit" name="enviar" class="btn btn-success">
                            </div>
                        </div>
                    </form>
                
            </div>
        </div>
    </body>
</html>
