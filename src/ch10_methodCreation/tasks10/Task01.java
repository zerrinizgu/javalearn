package ch10_methodCreation.tasks10;

import java.util.Scanner;


public class Task01 {
  static   Scanner  input = new Scanner(System.in);
    public static void main(String[] args) {
        //task-> girilen iki sayının eşitliğini kontrol eden method create ediniz
boolean aynimi=esitmi();
        System.out.println("sayilar"+(aynimi?"esittir":"esit degildir"));
    }

    private static boolean esitmi() {

        System.out.println("ilk sayiyi gir");
        int sayi1= input.nextInt();
        System.out.println("ikinci sayiyi gir");
        int sayi2= input.nextInt();
        if( sayi1== sayi2)
            return true;
        else return false;


        //2.cozum
      //  Scanner input = new Scanner(System.in);
       // System.out.println("num1 gir:");
      //  int num1=input.nextInt();
       // System.out.println("num2 gir:");
      //  int num2=input.nextInt();
       // sayilarEsitmi(num1,num2);

    }

    //private static void sayilarEsitmi(int num1, int num2) {
       // if (num1==num2)
        //    System.out.println("esitler");
      //  else
        //    System.out.println("esit degiller");














    }







