package JavaTutorialTR.src.ch07_StringManipulations.tasks07;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        // TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz
        Scanner input = new Scanner(System.in);
        System.out.println("bir string giriniz");
        String str= input.nextLine();

        System.out.println("str.contains(\" \") = " + str.contains(" "));


    }
}

