package org.example.javawebexample;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Max3num", value = "/Max3num")
public class Max3num extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double number1 = Double.parseDouble(request.getParameter("number_1"));
        double number2 = Double.parseDouble(request.getParameter("number_2"));
        double number3 = Double.parseDouble(request.getParameter("number_3"));

        PrintWriter out = response.getWriter();
        out.println("<html><head><meta charset=\"UTF-8\">" +
                "<link rel=\"stylesheet\" href=\"styles.css\"></head><body>");
        out.println("<section><h2>Максимальное число: " + Math.max(number1, Math.max(number2, number3)) + "</h2>");
        out.println("</section></body></html>");
    }
}
