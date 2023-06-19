package ch10_methodCreation.tasks10;

import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {
        //task -> girilen ad ve soyadın ilk harfleri buyuk diğerlerini kucuk yapan method create ediniz

        Scanner input=new Scanner(System.in);
        System.out.println("adini gir ");
        String ad=input.nextLine();
        System.out.println("SOYadini gir ");
        String soyad=input.nextLine();
        GIRILENADVESOYAD(ad, soyad);

    }

    private static void GIRILENADVESOYAD(String ad,String soyad) {
      ad=ad.substring(0,1).toUpperCase()+ad.substring(1).toLowerCase();
      soyad=soyad.substring(0,1).toUpperCase()+soyad.substring(1).toLowerCase();
        System.out.println(ad+" "+soyad);




    }


}
