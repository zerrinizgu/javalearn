package ch10_methodCreation.tasks10;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {

    /*    Kullanıcıdan alınan bir mailin doğru olup olmadığını kontrol eden method create ediniz

    Şartlar:
    * Bir mail adresinde @ karakteri olmalı
    * Bir mail adresinde . (nokta) karakteri olmalı
    * Bir mail adresinde @ karakterinden önce en az bir karakter yazılmalı (a@gmail.com gibi)

    Örnekler
    validateEmail("@gmail.com")
    Çıktı : false

    validateEmail("gmail")
    Çıktı : false

    validateEmail("hello@gmail")
    Çıktı : false

    validateEmail("hello@edabit.com")
    Çıktı : true
    */
        Scanner input = new Scanner(System.in);
        System.out.print("Bir mail giriniz: ");
        String str = input.nextLine();
        mailControl(str);
        System.out.println(mailControl(str));

    }

    private static boolean mailControl(String str) {
        return ( str.contains("@") && str.contains(".")&& str.substring(0, str.indexOf(" @")).length()!=0);




    }


}