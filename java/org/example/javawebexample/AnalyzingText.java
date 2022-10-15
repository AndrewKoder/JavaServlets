package org.example.javawebexample;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "AnalyzingText", value = "/AnalyzingText")
public class AnalyzingText extends HttpServlet {
    public static char[] vowels = new char[]{'а','я','у','ю','и','ы','э','е','о','ё'};
    public static char[] consonants = new char[]{'б','в','г','д','й','ж','з','к','л','м','н','п','р','с','т','ф',
            'х','ц','ч','ш','щ','ь','ъ'};
    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
    // метод проверяет, согласная ли буква
    public static boolean isCons(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : consonants)   // ищем среди массива согласных
        {
            if (c == d)
                return true;
        }
        return false;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String str = request.getParameter("txt");
        char[] chArr = str.toCharArray();//создаем массив, куда поместим строку переданную с формы,которую переводим в char
        ArrayList<Character> listVow = new ArrayList<Character>();//список для гласных
        ArrayList<Character> listNVow = new ArrayList<Character>();//список для негласных
        ArrayList<Character> listPunct = new ArrayList<Character>();//список для знаков препинания
        int v = 0; int con = 0; int p = 0;
        for (int i = 0; i < chArr.length; i++) {
            if (isVowel(chArr[i])) {//проверяем условие методом isVowel если текуший символ гласная
                listVow.add(chArr[i]); //помещаем гласную в свой список
                v++;
            } else if (chArr[i] == ' ') {// проверяем есть ли пробел, и пропускаем его
                continue;
            } else if (isCons(chArr[i])){//проверяем условие методом isCons если текуший символ согласная
                listNVow.add(chArr[i]);//помещаем согласную в свой список
                con++;
            } else {//остальные символы помещаем в список знаков препинания
                listPunct.add(chArr[i]);
                p++;
            }
        }

        request.setAttribute("qvow", "Количество гласных: ");
        request.setAttribute("qnvow", "Количество согласных: ");
        request.setAttribute("qpunct", "Количество знаков препинания: ");
        request.setAttribute("quanVow", v);
        request.setAttribute("quanNVow", con);
        request.setAttribute("quanPunct", p);

        request.setAttribute("lvow", "Список гласных: ");
        request.setAttribute("lnvow", "Список согласных: ");
        request.setAttribute("lpunct", "Список знаков препинания: ");
        request.setAttribute("listVow", listVow);
        request.setAttribute("listNVow", listNVow);
        request.setAttribute("listPunct", listPunct);

        getServletContext().getRequestDispatcher("/analyzingtext.jsp").forward(request, response);

    }
}
