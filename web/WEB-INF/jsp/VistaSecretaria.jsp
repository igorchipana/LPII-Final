<!DOCTYPE html>
<html lang="en-us">

    <head>
        <meta charset="utf-8">
        <!--<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">-->
        <title>GTH-DescansoMédico </title>
        <%@include file="../jspf/Links.jspf" %>
     </head>
     
      
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
                        <a href="<%=request.getContextPath()%>/InicioSecre"><i class="fa fa-lg fa-fw fa-user-md"></i> <span class="menu-item-parent">Inicio</span></a>
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


        </header>
        <!-- END HEADER -->
        <br>
        <br>
    <center>
        <div class="">	
            <h1><span class="semi-bold">Gestión de</span> <i class="ultra-light">Talento Humano</i> <sup class="badge bg-color-red bounceIn animated"> v 2.0</sup> <br>
                <small class="text-primary slideInRight fast animated"><strong>¡Bienvenido!</strong></small></h1>
                  <br>
                  <br>
            <nav id="menu" class="nav"  >					
                <ul class="slideInLeft fast animated" >
                   
                    <li >
                        <form id="" action="menu" method="POST">
                            <input type="hidden" name="opc" value="List_Privilegios"/>
                            <input type="hidden" name="idmod" value=""/>
                            <a onclick=""  href="#" style="text-decoration: none;font-size:20px " >
                                <span class="icon">
                                    <i aria-hidden="true" class=""></i>
                                </span>
                                <span></span>
                            </a> 
                        </form>
                    </li>
                    
                </ul>
            </nav>
        </div><!-- /container -->
    </center>
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