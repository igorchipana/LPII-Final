<%-- 
    Document   : Reg_Secretaria
    Created on : 07/12/2016, 06:53:24 PM
    Author     : IgorCB
--%>

<%@page import="pe.edu.upeu.dm.Modelo.Modelo_TraPerso"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="pe.edu.upeu.dm.Modelo.Modelo_Trabajador"%>
<%@page import="pe.edu.upeu.dm.Modelo.Modelo_Persona"%>
<jsp:useBean id="lista" scope="session" class="java.util.ArrayList"/>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%@include file="../jspf/Links.jspf"%>
        <link rel="stylesheet" type="text/css" href="//cdn.datatables.net/1.10.12/css/jquery.dataTables.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script type="text/javascript" charset="utf8" src="//cdn.datatables.net/1.10.12/js/jquery.dataTables.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <script>
        $(document).ready(function () {
            $('#table_id').DataTable();
        });
    </script>
    <body class="" onload="nobackbutton();">

        <!-- HEADER -->
        <header id="header">
            <div id="logo-group">
                <span id="logo"> <img src="recursos/img/logoRRHH.png" style="margin-top: -7px; width:110px; height:40px;margin-left: 10px; " alt="Descanso-Médico"> </span>
            </div>

            <div class="pull-right">
                <div id="logout" class="btn-header transparent pull-right">
                    <span> <a href="login.html" title="Sign Out" data-action="userLogout" data-logout-msg="You can improve your security further after logging out by closing this opened browser"><i class="fa fa-sign-out">Salir</i></a> </span>
                </div>
                <div id="search-mobile" class="btn-header transparent pull-right">
                    <span> <a href="javascript:void(0)" title="Search"><i class="fa fa-search"></i></a> </span>
                </div>
                <form action="search.html" class="header-search pull-right">
                    <input id="search-fld"  type="text" name="param" placeholder="Buscador" data-autocomplete='[
                           "ActionScript", "AppleScript", "Asp", "BASIC","C","C++","Clojure","COBOL","ColdFusion","Erlang","Fortran","Groovy","Haskell","Java","JavaScript","Lisp", "Perl",
                           "PHP", "Python","Ruby", "Scala","Scheme"]'>
                    <button type="submit">
                        <i class="fa fa-search"></i>
                    </button>
                    <a href="javascript:void(0);" id="cancel-search-js" title="Cancel Search"><i class="fa fa-times"></i></a>
                </form>
            </div>	
        </header>

        <!-- END HEADER -->

        <aside id="left-panel">
            <!-- User info -->
            <div class="login-info">
                <span> 
                    <a href="javascript:void(0);" id="show-shortcut" data-action="toggleShortcut">
                        <img src="recursos/img/DOCENTEM.jpg" alt="me" class="online" /> 
                        <span>
                            cargar la sesion
                        </span>
                        <i class="fa fa-angle-down"></i>
                    </a> 

                </span>
            </div>
            <!-- end user info -->

            <nav>
                <ul>
                    <li class="top-menu-invisible">
                        <a href="<%= request.getContextPath()%>/InicioSecre"><i class="fa fa-lg fa-fw fa-user-md"></i> <span class="menu-item-parent">Inicio</span></a>
                    </li>

                    <li>
                        <a href="<%= request.getContextPath()%>/listarTrabajadores" title="Dashboard"><i class="fa fa-lg fa-fw fa-folder-open"></i> <span class="menu-item-parent">Data Trabajadores</span></a>
                    </li>

                    <li>
                        <a href="<%=request.getContextPath()%>/registrar" title="Dashboard"><i class="fa fa-lg fa-fw fa-pencil-square"></i> <span class="menu-item-parent">Registrar Descanso</span></a>
                    </li>

                </ul>	

            </nav>
            <span class="minifyme" data-action="minifyMenu"> 
                <i class="fa fa-arrow-circle-left hit"></i> 
            </span>
        </aside>

        <div id="main" role="main">
            <div id="ribbon">
                <span class="ribbon-button-alignment"> 
                    <span id="refresh" class="btn btn-ribbon" data-action="resetWidgets" data-title="refresh"  rel="tooltip" data-placement="bottom" data-original-title="<i class='text-warning fa fa-warning'></i> Warning! This will reset all your widget settings." data-html="true">
                        <i class="fa fa-refresh"></i>
                    </span> 
                </span>

                <ol class="breadcrumb">
                    <li>Talento Humano</li><li>Descanso Médico</li><li>Archivar Data</li>
                </ol>
            </div>
            <!--</div>-->


            <div class="row">
                <div style="padding: 4%;box-sizing: border-box;">
                    <div class="box box-success">
                        <div class="box-header with-border">
                            <center> <h1 >Registro del Descanso</h1> </center>
                        </div>
                        <form role="form" method="post" action="ec">
                            <div class="box-body col-md-12">
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label for="marca">Nombre:</label>
                                        <input type="text" required="" maxlength="30" onkeypress="return soloLetras(event)" class="form-control" id="marca" name="marca" placeholder="Marca">
                                    </div>

                                    <div class="form-group">
                                        <label for="serie">Apellido Paterno</label>
                                        <input type="text" required="" maxlength="30" class="form-control" id="serie" name="serie" placeholder="Serie">
                                    </div>
                                    
                                     <div class="form-group">
                                        <label for="serie">Fecha Inicio del Descanso</label>
                                        <input type="date" required="" maxlength="30" class="form-control" id="serie" name="serie" placeholder="Serie">
                                    </div>
                                   
                                </div>
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label for="codigo">DNI</label>
                                        <input type="text" required="" maxlength="30"  class="form-control" id="codigo" name="codigo" placeholder="Código">
                                    </div>

                                    <div class="form-group">
                                        <label for="codigo">Apellido Materno</label>
                                        <input type="text" required="" maxlength="30"  class="form-control" id="codigo" name="codigo" placeholder="Código">
                                    </div>
                                    
                                     <div class="form-group">
                                        <label for="serie">Fecha Fin del Descanso</label>
                                        <input type="date" required="" maxlength="30" class="form-control" id="serie" name="serie" placeholder="Serie">
                                    </div>
                                </div>
                                <div class="form-group col-md-12">
                                    <label for="descripcion">Motivo del descanso</label>
                                    <textarea  required="" maxlength="120" class="form-control" rows="3" id="descripcion" name="descripcion" placeholder="Descripcion"></textarea>
                                </div>

                                
                                <div class="col-md-12">
                                    <center><button type="button" class="btn btn-success" data-toggle="modal" data-target="#registrar">Registrar</button></center>
                                </div> 

                                <div class="modal fade" id="registrar">
                                    <div class="modal-dialog">
                                        <div class="modal-content">
                                            <div class="modal-header">
                                                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                                                <center><h2 class="modal-title">Atención</h2></center>
                                            </div>
                                            <div class="modal-body">
                                                <h3 style="text-align: justify">¿Esta seguro de que desea registrar este nuevo Descanso? Si es necesario verifique los campos nuevamente.</h3>
                                            </div>
                                            <div class="modal-footer">
                                                <input type="submit" class="btn btn-default btn-lg" value="Registrar">
                                                <button type="button" class="btn btn-danger btn- btn-lg" data-dismiss="modal">Cerrar</button>                                                        
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </form>
                    </div>      
                </div>
            </div>
        </div>


        <div class="page-footer">
            <div class="row">
                <div class="col-xs-12 col-sm-6">
                    <span class="txt-color-white">Aplha Team <span class="hidden-xs"> - Upeu</span> © 2016-II</span>
                </div>
                <div class="col-xs-6 col-sm-6 text-right hidden-xs">
                    <div class="txt-color-white inline-block">
                        <i class="txt-color-blueLight hidden-mobile">Descanso Médico <i class="fa fa-clock-o"></i> <strong>- Upeu © 2016-II</strong> </i>
                    </div>
                </div>
            </div>
        </div>




    </body>

</html>
