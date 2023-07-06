package ch07_StringManipulations.tasks07;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {

        //Example 1: Bir String'deki space haric kac tane character kullanildigini gosteren kodu yaziniz
        //           "Ali okula gitti." ==> 14
        Scanner input = new Scanner(System.in);
        System.out.println("bir string girin");
        String str = input.nextLine();
        System.out.println(str.replace(" ", "").length());
        //replace() method'u bir String'deki herhangi bir karakteri veya karakterleri degistirmek icin kullanilir.


        //Example 2: Bir String'deki tum 'a' harflerini 'A' ya ceviriniz.
        System.out.println(str.replaceAll("a", "A"));

        //Example 3: Bir String'deki tum "kara" kelimelerinin yerine "*" koyunuz
        String str1 = str.replaceAll("kara", "*");
        System.out.println("str1 = " + str1);

        //Example 4: Bir String'deki tum sayilari "*" a ceviriniz
        //           "AC202117004" ==> AC*********
        String str2 = str.replaceAll("\\d+", "*");
        System.out.println("str2=" + str2);


    }
}
