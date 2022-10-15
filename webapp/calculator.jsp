<%--
  Created by IntelliJ IDEA.
  User: Andrey
  Date: 09.10.2022
  Time: 19:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Калькулятор </title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
<section>
    <h2>Калькулятор</h2>
    <form action="Calculator" method="post">
        <!-- поле ввода первого числа -->
        <input type="number" name="number_1" value="${number_1}">
        <!-- операция -->
        <select name="operation">
            <option value="+">+</option>
            <option value="-">-</option>
            <option value="/">/</option>
            <option value="*">*</option>
            <option value="^">^</option>
            <option value="%">%</option>
        </select>
        <!-- поле ввода второго числа -->
        <input type="number" name="number_2" value="${number_2}">
        <label>=</label>
        <!-- указываем значение переменной из контекста -->
        <input type="text" name="result" disabled value="${result}">
        <!-- кнопка отправки формы -->
        <button>
            Вычислить
        </button>
    </form>
    <br><br>
</section>
</body>
</html>
