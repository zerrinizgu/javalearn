package ch08_Loops.Tasks08_forLoop;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int toplam = 0;

        System.out.println("5 sayı girin:");

        for (int i = 0; i < 5; i++) {
            int sayi = scanner.nextInt();
            if (sayi < 10 || sayi > 20) {
                toplam += sayi;
            }
        }

        System.out.println("10 ile 20 arası hariç diğer sayıların toplamı: " + toplam);
    }
}
