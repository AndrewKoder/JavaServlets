package org.example.javawebexample;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "RadioButtonForm", value = "/RadioButtonForm")
public class RadioButtonForm extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double number1 = Double.parseDouble(request.getParameter("number_1"));
        double number2 = Double.parseDouble(request.getParameter("number_2"));
        double number3 = Double.parseDouble(request.getParameter("number_3"));
        String calculate = request.getParameter("operation");

        double result = 0;
        String description = "";
        switch (calculate) {
            case "max": result = Math.max(number1, Math.max(number2, number3));
                        description = "Максимальное значение: ";
                        break;
            case "min": result = Math.min(number1, Math.min(number2, number3));
                        description = "Минимальное значение: ";
                        break;
            case "arith": result = (number1 + number2 + number3) / 3;
                          description = "Среднеарифметическое: ";
                          break;
            default: description = "Ошибка! Неверное значение!";
        }

        PrintWriter out = response.getWriter();
        out.println("<html><head><meta charset=\"UTF-8\">" +
                "<link rel=\"stylesheet\" href=\"styles.css\"></head><body>");
        out.println("<section><h2>" + description + result + "</h2>");
        out.println("</section></body></html>");
    }
}
