<%
    String message = pageContext.getException().getMessage();
    String exception = pageContext.getException().getClass().toString();
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Exception</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <section>
        <h2>Exception occurred while processing the request!</h2>
        <p>Type: <%= exception%></p>
        <p>Message: <%= message %></p>
    </section>
</body>
</html>
