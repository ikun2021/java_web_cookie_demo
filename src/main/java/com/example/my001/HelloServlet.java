package com.example.my001;

import java.io.*;
import javax.servlet.FilterConfig;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/cookieLogin")
public class HelloServlet extends HttpServlet {
    private String myUsername = "admin";
    private String myPassword = "123123";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        System.out.println(username);

        String password = req.getParameter("password");
        System.out.println(password);
        if(username.equals(myUsername)&&password.equals(myPassword)){
            Cookie cookie = new Cookie("name",username);
            cookie.setMaxAge(200*24*24*7);
            resp.addCookie(cookie);
            resp.sendRedirect("success.jsp");
        }else{
            resp.sendRedirect("index.jsp");
        }


    }
}