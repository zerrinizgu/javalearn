package ch08_Loops.Tasks08_forLoop.Tasks08_whileLoops;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
/*
Task-> girilen sayıların toplamı 333 gectiğinde girilen sayı adedini ve toplamını prşnt eden code create ediniz.
 */Scanner scanner = new Scanner(System.in);
        int toplam = 0;
        int sayiAdedi = 0;

        while (toplam <= 333) {
            System.out.print("Bir sayı girin: ");
            int sayi = scanner.nextInt();
            toplam += sayi;
            sayiAdedi++;
        }

        System.out.println("Girilen sayı adedi: " + sayiAdedi);
        System.out.println("Girilen sayıların toplamı: " + toplam);
}
}