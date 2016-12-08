<%-- 
    Document   : SecreDataTra
    Created on : 07/12/2016, 10:30:23 AM
    Author     : Igor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>GTH-DescansoMédico</title>
        <%@include file="../jspf/Links.jspf" %>
        <link rel="stylesheet" type="text/css" href="//cdn.datatables.net/1.10.12/css/jquery.dataTables.css">
        <script type="text/javascript" charset="utf8" src="//cdn.datatables.net/1.10.12/js/jquery.dataTables.js"></script>
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

            <div id="content">

                <!-- HEADER -->
                <header id="header">
                    <h1 style="text-align: center;"><span class="semi-bold">Data de</span> <i class="ultra-light">Trabajadores</i> <br></h1>
                </header>  
                <div class="box-header with-border">
                            <center> <h1> Datos de Todos los Trabajadores</h1> </center>
                </div>

                <div class="widget-body no-padding"  style="width: 80%;margin-left: 10%;margin-top: 5px;">
                    <table  id="table_id"  cellspacing="0"  class="table table-striped table-bordered  display" style="width: 100%;margin-left: 0%;">
                        <thead>
                            <tr class="active">
                                <td style="text-align: center;" data-hide="phone,tablet"><i class="fa fa-fw fa-user-secret" aria-hidden="true"></i><strong> Código</strong></td>
                                <td style="text-align: center;" data-hide="phone,tablet"><i class="fa fa-fw fa-user-secret" aria-hidden="true"></i><strong> Nombres</strong></td>
                                <td style="text-align: center;" data-class="expand"><i class="fa fa-fw fa-user-plus"></i><strong> Apellidos</strong></td>
                                <td style="text-align: center;" data-hide="phone"><i></i> <strong>DNI</strong></td>
                                <td style="text-align: center;" data-hide="phone"><i class="fa fa-fw fa-calendar text-muted hidden-md hidden-sm hidden-xs" aria-hidden="true"></i> <strong>Fecha Nacimiento</strong></td>
                                <td style="text-align: center;" data-hide="phone"><i class="fa fa-fw fa-home text-muted hidden-md hidden-sm hidden-xs" aria-hidden="true"></i><strong> Nacionalidad</strong></td>
                                <td style="text-align: center;" data-hide="phone"><i class="fa fa-fw fa-home text-muted hidden-md hidden-sm hidden-xs"></i> <strong><strong>Departamento</strong></td>
                                <td style="text-align: center;" data-hide="phone,tablet"><i class="fa fa-fw fa-home txt-color-blue hidden-md hidden-sm hidden-xs"></i><strong>Distrito</strong></td>
                                <td style="text-align: center;" data-class="expand"><i class="fa fa-fw fa-phone-square text-muted hidden-md hidden-sm hidden-xs"></i> <strong>Celular</strong></td>
                                <td style="text-align: center;" data-hide="phone"><i class="fa fa-fw fa-at text-muted hidden-md hidden-sm hidden-xs"></i> <strong>Correo Personal</strong></td>
                                <td style="text-align: center;" data-hide="phone"><i></i><strong> Sexo </strong></td>

                            </tr>
                        </thead>

                        <tbody>



                            <c:forEach var="datos" begin="0" items="${lista}" varStatus="loop">    

                                <tr>
                                     <td style="text-align: center;"><c:out value="${datos.codigo}"></c:out></td>
                                    <td style="text-align: center;"><c:out value="${datos.nombres}"></c:out></td>
                                    <td style="text-align: center;"><c:out value="${datos.apellidos_p}"></c:out> 
                                        &nbsp;&nbsp; <c:out value="${datos.apellido_m}"></c:out></td>
                                    <td> <c:out value="${datos.dni}"></c:out></td>
                                    <td style="text-align: center;"><c:out value="${datos.fecha_nac}"></c:out></td>
                                    <td style="text-align: center;"> <c:out value="${datos.nacionalidad}"></c:out></td>
                                    <td style="text-align: center;"> <c:out value="${datos.departamento}"></c:out></td>
                                    <td style="text-align: center;"> <c:out value="${datos.distrito}"></c:out></td>
                                    <td style="text-align: center;"> <c:out value="${datos.celular}"></c:out></td>
                                    <td style="text-align: center;"> <c:out value="${datos.correo_per}"></c:out></td>
                                    <td style="text-align: center;"> <c:out value="${datos.sexo}"></c:out></td>


                                    </tr>
                            </c:forEach>

                        </tbody>
                    </table>  
                    <br>
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
