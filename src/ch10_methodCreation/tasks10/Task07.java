package ch10_methodCreation.tasks10;

import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {

    /*
    Üç sayı arasındaki en küçük sayıyı bulan  method create ediniz

    Test data:
    12,24,34

    Beklenen Çıktı:
    12
    */
        Scanner input=new Scanner(System.in);
        System.out.println("ilk sayiyi gir");
        double sayi1= input.nextDouble();
        System.out.println("ikinci sayiyi gir");
        double sayi2= input.nextDouble();
        System.out.println("ikinci sayiyi gir");
        double sayi3= input.nextDouble();
        double enkucuksayi=enkucuksayi(sayi3,sayi2,sayi1);
        enkucuksayi(sayi1, sayi2, sayi3);
        System.out.println("enkucuksayi = " + enkucuksayi);


    }

    private static double enkucuksayi(double sayi1, double sayi2, double sayi3) {
        return Math.min(sayi1,Math.min(sayi2,sayi3));


    }
}

