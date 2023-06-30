package JavaTutorialTR.src.ch03_ScannerClass_TypeCasting.tasks03;

import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {


        // kullanicidan 2 tam sayi alip bu 2 tamsayinin  dort islem sonucunu yazdiriniz.
        Scanner input = new Scanner(System.in);
        System.out.println("sayi1 giriniz:");
        int sayi1= input.nextInt();
        System.out.println("sayi2 giriniz:");
        int sayi2= input.nextInt();
        System.out.println(sayi1+sayi2);
        System.out.println(sayi1-sayi2);
        System.out.println(sayi1*sayi2);
        System.out.println(sayi1/sayi2);

    }

}
