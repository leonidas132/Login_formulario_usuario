package com.protalento.servles;

import com.protalento.ImplementarUsuario.ImpUser_login;
import com.protalento.entidad.User_login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/ServletLogin")
public class ServletLogin extends HttpServlet {
    ImpUser_login impUser_login =new ImpUser_login();

    int r;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    /*   HttpSession session = null;

        String action = request.getParameter("activo");
        if (action.equals("Ingresar")){
            String clave = request.getParameter("clave");
            String user = request.getParameter("usuario");
            User_login user_login = new User_login(clave,user);
           // user_login.setId(clave);
            //user_login.setUsuario(user);
            r = impUser_login.Validar(user_login);
            System.out.println(r);

            if (r == 1){
                session = request.getSession();
                session.setAttribute("user_login",r);
                request.getRequestDispatcher("bienvenido.jsp").forward(request,response);

            }else{

                request.getRequestDispatcher("login.jsp").forward(request,response);
            }


        }*/

        HttpSession session = null;

        String action = request.getParameter("activo");
        if (action.equals("Ingresar")){
            String clave = request.getParameter("clave");
            String user = request.getParameter("usuario");
            request.setAttribute("usuario",request.getParameter("usuario"));
            request.setAttribute("clave",request.getParameter("clave"));
            if (impUser_login.Validar(clave,user)==true){
                request.getRequestDispatcher("bienvenido.jsp").forward(request,response);

            }else{

                request.getRequestDispatcher("login.jsp").forward(request,response);
            }


        }




    }

}
