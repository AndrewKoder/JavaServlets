package org.example.javawebexample;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Quote", value = "/linus-torvalds-quote")
public class Quote extends HttpServlet {
    private String message;
    private String message2;

    public void init() {
        message = "Bad programmers worry about the code.";
        message2 = "Good programmers worry about data structures and their relationships.";
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<html><head><meta charset=\"UTF-8\">" +
                "<link rel=\"stylesheet\" href=\"styles.css\"></head><body>");
        out.println("<section><h2>" + message + "</h2>");
        out.println("<h2>" + message2 + "</h2>");
        out.println("</section></body></html>");
    }

}
