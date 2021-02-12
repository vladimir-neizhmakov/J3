package com.geekbrains.app;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "MyServlet", urlPatterns = "/hw1")
public class MyServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        for (int i = 0; i < 10; i++) {
            out.printf("<html><body><h1>");
            out.printf(new Product().getProduct());
            out.printf("</br>");
        }
        out.printf("</h1></body></html>");
        out.close();
    }

}
