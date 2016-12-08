<%-- 
    Document   : principal1
    Created on : 06/12/2016, 11:45:43 AM
    Author     : Igor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="row main">
                <ul class="side-nav fixed blue " id="mobile-demo">
                    <li class="btn-MobileMenu ShowHideMenu"><a href="#" class="tooltipped waves-effect waves-light" data-position="bottom" data-delay="50" data-tooltip="Menu" data-tooltip-id="dfe31ee5-0431-d8c9-a168-65d2cc76fd78"><i class="zmdi zmdi-more-vert"></i></a></li>
                    <li style="padding:5px;"></li>
                    <li>
                        <div class="userView">
                            <div class="background grey">
                            </div>
                            <i class="zmdi zmdi-account-circle zmdi-hc-5x"></i>
                            <span class="white-text name center-align">Rodrigo</span>

                        </div>
                    </li>
                    <li><a href="inicio" target="mainContent"><i class="material-icons">icon</i>inicio</a></li>
                    <li><a href="descansos" target="mainContent"><i class="material-icons ">icon</i>descanso</a></li>
                    <li><a href="historial" target="mainContent"><i class="material-icons">icon</i>Historial</a></li>
                    <li><a href="logout"><i class="material-icons">settings_power</i>Salir</a></li>
                </ul>
                <div class="col s12 m12 l12 green   container" style="height: 93vh">
                    <iframe src="productos" name="mainContent" style="height: 100%;width: 100%; border: none;">
                    </iframe>
                </div>
            </div>

            <script src="<c:url value="resources/js/jquery-3.0.0.min.js"/>" type="text/javascript"></script>
            <script src="<c:url value="resources/js/materialize.min.js"/>" type="text/javascript"></script>
            
            <%@include file="../jspf/footer.jspf" %>
        </body>
    </body>
</html>
