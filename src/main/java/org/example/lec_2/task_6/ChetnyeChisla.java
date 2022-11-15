package org.example.lec_2.task_2;

public class ChetnyeChisla { // ChetnyeChisla - названия стоит делать на англ языке, а не транслитом, переводчик тебе в этом поможет
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++)
            if (i % 2 == 0) {
                System.out.println(i);
//эта строка не нужна
            }
    }
}
