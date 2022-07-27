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
    <title>login</title>
    <link rel="stylesheet" href="css/Stilos.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
</head>
<body>




    <div class="container col-lg-3">
        <form action="ServletLogin" method="post">
          <div class="padre d-flex flex-sm-column justify-content-center align-items-center">
              <div class="form-group">
                  <p><strong> Bienvenidos al sistema de cunsulta</strong>  </p>
              </div>
              <div class="form-group">
                  <label >Usuario:</label>
                  <input type="text" name="usuario" id="usuario"placeholder="ingrese Usuario">
              </div>
              <div class="form-group">
                  <label>passwor:</label>
                  <input type="text"name="clave"id="clave" placeholder="ingrese clave">
              </div>
          </div>

            <input class="btn btn-danger btn-block" type="submit"name="activo" value="Ingresar" id="ingresar">



        </form>

    </div>

    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.3/dist/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
</body>
</html>
