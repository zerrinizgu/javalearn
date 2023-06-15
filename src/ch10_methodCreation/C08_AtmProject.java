package ch10_methodCreation;

import java.util.Scanner;

public class C08_AtmProject {
    static Scanner input=new Scanner(System.in);
    static String password="1234a.1234";
    static double bakiye=1000.25;
    static  int count=3;
    public static void main(String[] args) {
        sifreKontrol();

    }
    private static void sifreKontrol() {
        System.out.println("******");
        System.out.println("***bankamiza hosgeldiniz***");
        System.out.println("sifre girin");

        String sifre=input.nextLine();



    }




}
