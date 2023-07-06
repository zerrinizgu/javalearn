package ch10_methodCreation.tasks10;

import java.util.Scanner;


public class Task05 {
    public static void main(String[] args) {
        // Task-> girilen iki sayıyı seçilen dört işleme göre hesaplayan method create ediniz..
        Scanner input = new Scanner(System.in);
        System.out.println("ilk sayiyi gir");
        double sayi1 = input.nextDouble();
        System.out.println("ikinci sayiyi gir");
        double sayi2 = input.nextDouble();
        System.out.println("islem secimi giro");
        char islem = input.next().charAt(0);
        dortislem(islem, sayi1, sayi2);

    }

    private static void dortislem(char islem, double sayi1, double sayi2) {
        switch (islem) {
            case '+':
                topla(sayi1, sayi2);
                break;
            case '-':
                cikar(sayi1, sayi2);
                break;
            case '*':
                carp(sayi1, sayi2);
                break;
            case '/':
                bol(sayi1, sayi2);
                break;
            default:
                System.out.println("yanlis giris");


                dortislem(islem, sayi1, sayi2);
        }

    }

    private static void topla(double sayi1, double sayi2)
    {
        System.out.println(sayi1 + sayi2);
    }

    private static void bol(double sayi1, double sayi2) {
        System.out.println(sayi1 / sayi2);
    }

    private static void carp(double sayi1, double sayi2) {
        System.out.println(sayi1 * sayi2);
    }

    private static void cikar(double sayi1, double sayi2) {
        System.out.println(sayi1 - sayi2);
    }
}
