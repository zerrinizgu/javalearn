package ch07_StringManipulations.tasks07.tasks07;

import java.util.Scanner;

public class task14_r {
    public static void main(String[] args) {

        /* Harflerden oluşan bir Stringin içindeki tüm 'a' ları 'e' ve tüm 'e' leri 'a' yapınız
 */
        Scanner input = new Scanner(System.in);
        System.out.println("bir string girin");
        String str= input.nextLine();

        str= str.replace("a","*");
        str= str.replace("e","a");
        str= str.replace("*","e");
        System.out.println(str);


    }











}
