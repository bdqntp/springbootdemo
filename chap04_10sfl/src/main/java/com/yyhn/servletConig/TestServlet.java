package com.yyhn.servletConig;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/my")
public class TestServlet extends HttpServlet{
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException
    {
        doPost(req,resp);
    }
    protected void doPost (HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException
    {
        System.out.println("这个是servlet的post方法");
    }
}
