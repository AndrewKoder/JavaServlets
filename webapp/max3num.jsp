<%--
  Created by IntelliJ IDEA.
  User: Andrey
  Date: 01.10.2022
  Time: 20:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Максимум из 3-х чисел</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <section>
        <h2>Найти максимум из 3-х чисел</h2>
        <form action="Max3num" method="post">
            <label>Введите первое число: <input name="number_1" type="number" min=1></label>
            <br><br>
            <label>Введите второе число: <input name="number_2" type="number" min=1></label>
            <br><br>
            <label>Введите третье число: <input name="number_3" type="number" min=1></label>
            <br><br>
            <input type="submit" value="Посмотреть результат">
        </form>
    </section>
</body>
</html>
