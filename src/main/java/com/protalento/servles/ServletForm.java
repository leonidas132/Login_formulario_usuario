package com.protalento.servles;

import com.protalento.ImplementarUsuario.ImpUser_login;
import com.protalento.entidad.User_login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/ServletForm")
public class ServletForm extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ImpUser_login impUser_login = new ImpUser_login();
        User_login  user_login= new User_login();
        String action = request.getParameter("activo");
        System.out.println(action);
        if (action.equals("Exit")){
           request.getRequestDispatcher("login.jsp").forward(request,response);
        }
    }
}
