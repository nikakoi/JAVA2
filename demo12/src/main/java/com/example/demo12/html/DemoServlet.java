package com.example.demo12.html;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "demoServlet", value = "/demo-servlet")
public class DemoServlet extends HttpServlet {



    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("Name");
        String lastName = req.getParameter("LastName");
        String email = req.getParameter("Email");
        String password = req.getParameter("Password");

        PrintWriter printWriter = resp.getWriter();
        printWriter.print("<html>");
        printWriter.print("<body>");
        printWriter.print("<h1> students data</h1>");
        printWriter.print("<p> Name: "  + name + "</p>");
        printWriter.print("<p> LastName: " + lastName + "</p>");
        printWriter.print("<p> Email: " + email + "</p>");
        printWriter.print("<p> Password: " + password + "</p>");
        printWriter.print("</body>");
        printWriter.print("</html>");

        printWriter.close();
    }


}
