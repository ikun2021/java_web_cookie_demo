package com.example.my001;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/logout")
public class LogoutServlet extends HelloServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();
        for(Cookie cookie : cookies){
            if(cookie.getName().equals("name")){
                cookie.setMaxAge(0);
                resp.addCookie(cookie);
            }
        }
        resp.sendRedirect("index.jsp");
    }
}
