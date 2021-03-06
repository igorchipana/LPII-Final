<!DOCTYPE html>
<html lang="en-us">

    <head>
        <meta charset="utf-8">
        <!--<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">-->
        <title> Descanso M�dico </title>
        <%@include file="../jspf/Links.jspf" %>
    </head>

    <body class="">
        <!-- HEADER -->
        <header id="header">
            <div id="logo-group">
                <span id="logo"> <img src="recursos/img/logo-white.png" alt="Descanso-M�dico"> </span>
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
                           "ActionScript",
                           "AppleScript",
                           "Asp",
                           "BASIC",
                           "C",
                           "C++",
                           "Clojure",
                           "COBOL",
                           "ColdFusion",
                           "Erlang",
                           "Fortran",
                           "Groovy",
                           "Haskell",
                           "Java",
                           "JavaScript",
                           "Lisp",
                           "Perl",
                           "PHP",
                           "Python",
                           "Ruby",
                           "Scala",
                           "Scheme"]'>
                    <button type="submit">
                        <i class="fa fa-search"></i>
                    </button>
                    <a href="javascript:void(0);" id="cancel-search-js" title="Cancel Search"><i class="fa fa-times"></i></a>
                </form>
            </div>	
        </header>
        <!-- END HEADER -->
        <!-- Left panel : Navigation area -->
        <!-- Note: This width of the aside area can be adjusted through LESS variables -->
        <aside id="left-panel">
            <!-- User info -->
            <div class="login-info">
                <span> <!-- User image size is adjusted inside CSS, it should stay as it --> 
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
                    <li>
                        <a href="#" title="Dashboard"><i class="fa fa-lg fa-fw fa-home"></i> <span class="menu-item-parent">Dashboard</span></a>
                    </li>

                    <li class="top-menu-invisible">
                        <a href="#"><i class="fa fa-lg fa-fw fa-cube txt-color-blue"></i> <span class="menu-item-parent">SmartAdmin Intel</span></a>
                    </li>
                    <li class="treeview">
                        <a href="#">
                            <i class="fa fa-history" aria-hidden="true"></i> <span>Historial de Pr�stamos</span>
                            <span class="pull-right-container">
                                <i class="fa fa-angle-left pull-right"></i>
                            </span>
                        </a>
                        <ul class="treeview-menu">
                            <li><a href="SVLH?histo=1" target="box"><i class="fa fa-laptop" aria-hidden="true"></i> Pr�stamo del equipo</a></li>
                            <li><a href="SVLH?histo=3" target="box"><i class="fa fa-globe" aria-hidden="true"></i> Todos los Pr�stamos</a></li>
                        </ul>
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
                    <li>Talento Humano</li><li>Descanso M�dico</li><li>Archivar Data</li>
                </ol>
            </div>
            <div id="content">
                <p>sadsadsd</p>
            </div>
        </div>
    </div>
</div>

<div class="page-footer">
    <div class="row">
        <div class="col-xs-12 col-sm-6">
            <span class="txt-color-white">Aplha Team <span class="hidden-xs"> - Upeu</span> � 2016-II</span>
        </div>

        <div class="col-xs-6 col-sm-6 text-right hidden-xs">
            <div class="txt-color-white inline-block">
                <i class="txt-color-blueLight hidden-mobile">Descanso M�dico <i class="fa fa-clock-o"></i> <strong>- Upeu � 2016-II</strong> </i>

            </div>
        </div>
    </div>
</div>

</body>

</html>
