package com.protalento.servles;

import com.protalento.ImplementarUsuario.ImpUser_login;
import com.protalento.ImplementarUsuario.ImpUsuario;
import com.protalento.entidad.User_login;
import com.protalento.entidad.Usuario_formulario;
import com.protalento.utilidades.Fechas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/ServletForm")
public class ServletForm extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // cierre de la sesion
        ImpUser_login impUser_login = new ImpUser_login();
        User_login  user_login= new User_login();
        String action = request.getParameter("activo");
        System.out.println(action);
        if (action.equals("Exit")){
            request.getRequestDispatcher("login.jsp").forward(request,response);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String actio = request.getParameter("guardar");
        if(actio.equals("Guardar")){
            String id = request.getParameter("Id");
            String numeroD = request.getParameter("Documento");
            String tipoD = request.getParameter("tipo");
            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellido");
            String fechaN = request.getParameter("fecha");
            ImpUsuario impUsuario =new ImpUsuario();
            Usuario_formulario usuario_formulario = new Usuario_formulario(id,numeroD,tipoD,nombre,apellido, Fechas.getLocalDate(fechaN));
            impUsuario.insertar(usuario_formulario);
        }





    }
}
