<%@ page import="com.protalento.entidad.User_login" %><%--
  Created by IntelliJ IDEA.
  User: Luis Nuñez
  Date: 25/07/2022
  Time: 1:22 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>formulario</title>
    <link rel="stylesheet" href="css/formulario.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
</head>
<body>
<%


%>
   <nav class="navbar navbar-dark bg-dark">
       <a style="color: white" class="navbar-toggler "><span class="navbar-toggler-icon"></span> Home</a>
       <div class="dropdown">
           <a style="color: white" href="#"  class="nav-link dropdown-toggle" data-toggle ="dropdown">Signed in as</a>
           <div class="dropdown-menu text-center">
               <form action="ServletForm" method="get">
                   <a><img src="img/profile2.png"height="80" width="80"></a><br>
                   <a>Usuario: ${usuario}</a><br>
                   <a>clave: ${clave}</a><br>
                   <a>Ct Primiun</a><br>
                   <div class="dropdown-divider"></div>
                   <input type="submit" class="dropdown-item" name="activo" value="Exit">

               </form>

           </div>

       </div>
   </nav>

   <div class="container col-lg-4">

       <form action="ServletForm" method="post">
           <div  class="padre d-flex flex-sm-column justify-content-center align-items-center">
               <div class="form-group">
                   <p><strong>completar la informacion </strong></p>
               </div>

               <div class="form-group">
                   <label> ID user:</label>
                   <input type="text" name="Id"placeholder="Id">
               </div>
               <div class="form-group">
                   <label>No Doc: </label>
                   <input type="text" name="Documento" id="documento" placeholder=" Numero documento">

               </div>


               <div class="form-group">
                   <label>Tipo Doc: </label>
                   <input type="text" name="tipo"  id="tipo" placeholder="tipo documento">

               </div>

               <div class="form-group">
                   <label>Nombre:</label>
                   <input type="text" name="nombre" id="nombre" placeholder="Npmbre">
               </div>

               <div class="form-group">
                   <label>Apellido:</label>
                   <input type="text" name="apellido" id="apellido" placeholder="Apellido">

               </div>
               <div class="form-group">
                   <label>FechaN:</label>
                   <input type="text" name="fecha" id="fecha" placeholder="fecha">

               </div>

               <input class="btn btn-danger btn-block" type="submit" name="guardar" value="Guardar" id="guardar">
               <input style="background-color: orange "  class="btn  btn-block" type="reset" name="limpiar" value="Limpiar">

           </div>

       </form>
   </div>




<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.3/dist/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
</body>
</html>
