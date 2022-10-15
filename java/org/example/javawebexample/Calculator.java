package org.example.javawebexample;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "Calculator", value = "/Calculator")
public class Calculator extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // получение параметров
        double number_1 = Double.parseDouble(request.getParameter("number_1"));
        double number_2 = Double.parseDouble(request.getParameter("number_2"));
        String operation = request.getParameter("operation");

        // вычисление
        double result = 0;
        switch (operation) {
            case "+": result = number_1 + number_2; break;
            case "-": result = number_1 - number_2; break;
            case "*": result = number_1 * number_2; break;
            case "/": result = number_1 / number_2; break;
            case "^": result = (int) Math.pow(number_1, number_2); break;
            case "%": result = (float) (number_1 * 100) / number_2; break;
            default:
                String description = "Ошибка! Не удалось вычислить!";
        }

        HttpSession session = request.getSession();
        session.setAttribute("result", result);
        session.setAttribute("number_1", number_1);
        session.setAttribute("number_2", number_2);

        response.sendRedirect(request.getContextPath() + "/calculator.jsp");
    }
}
