<%--
  Created by IntelliJ IDEA.
  User: Andrey
  Date: 02.10.2022
  Time: 14:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Форма с радиокнопками</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <section>
        <h2>Найти максимум, минимум или среднеарифметическое 3-х чисел</h2>
        <form action="RadioButtonForm" method="POST">
            Введите первое число: <input name="number_1" type="number" min=1>
            <br><br>
            Введите второе число: <input name="number_2" type="number" min=1>
            <br><br>
            Введите третье число: <input name="number_3" type="number" min=1>
            <br><br>
            <input type="radio" name="operation" value="max" checked>Максимум
            <input type="radio" name="operation" value="min">Минимум
            <input type="radio" name="operation" value="arith">Среднеарифметическое
            <br><br>
            <input type="submit" value="Посмотреть результат">
        </form>
    </section>
</body>
</html>
