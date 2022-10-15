<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Анализ текста</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
<section>
    <h2>Анализ текста</h2>
    <form action="AnalyzingText" method="post">
        <label>Введите текст: <input type="text" name="txt"></label>
        <br><br>
        <input type="submit" value="Посмотреть результат">
    </form>
    <ul>
        <ol>
            <c:out value="${qvow}" />
            <c:out value="${quanVow}" />
        </ol>
        <ol>
            <c:out value="${lvow}" />
            <c:forEach var="vow" items="${listVow}">
                <c:out value="${vow}" />
            </c:forEach>
        </ol>
    </ul>
            <ul>
                <ol>
                    <c:out value="${qnvow}" />
                    <c:out value="${quanNVow}" />
                </ol>
                <ol>
                <c:out value="${lnvow}" />
                    <c:forEach var="nvow" items="${listNVow}">
                        <c:out value="${nvow}" />
                    </c:forEach>
                </ol>
            </ul>
                    <ul>
                        <ol>
                            <c:out value="${qpunct}" />
                            <c:out value="${quanPunct}" />
                        </ol>
                        <ol>
                        <c:out value="${lpunct}" />
                            <c:forEach var="punct" items="${listPunct}">
                                <c:out value="${punct}" />
                            </c:forEach>
                        </ol>
                    </ul>
</section>
</body>
</html>
