package ch07_StringManipulations.tasks07;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
             /* Task->
        Girilen ad soyad bilgilerinin ilk harflerini buyuk harf print eden code create ediniz..
         */
        Scanner input = new Scanner(System.in);
        System.out.println("ad ve soyad giriniz");
        String isim= input.nextLine().toLowerCase();

        int soyadbaslangicindeks= isim.indexOf(" ");
        isim= isim.substring(0,1).toUpperCase()+isim.substring(1,soyadbaslangicindeks)+isim.substring(soyadbaslangicindeks,soyadbaslangicindeks+1).toUpperCase()+isim.substring(soyadbaslangicindeks+1);



 /*
        Scanner input = new Scanner(System.in);
        System.out.println("ad  giriniz");
        String ad= input.nextLine().toLowerCase();
        System.out.println("soyad  giriniz");
        String soyad= input.nextLine().toLowerCase();
        System.out.println(ad.substring(0,1).toUpperCase()+ad.substring(1)+" " +soyad.substring(0,1).toUpperCase()+soyad.substring(1));
        */






    }
}
