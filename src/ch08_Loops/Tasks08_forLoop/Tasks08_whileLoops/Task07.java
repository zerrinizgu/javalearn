package ch08_Loops.Tasks08_forLoop.Tasks08_whileLoops;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        // task-> girilen  5 sayının  en büyüğünü print den code create eediniz

            Scanner input = new Scanner(System.in);
            int enBuyuk = Integer.MIN_VALUE;

            System.out.println("5 sayı girin:");

            for (int i = 0; i < 5; i++) {
                int sayi = input.nextInt();
                if (sayi > enBuyuk) {
                    enBuyuk = sayi;
                }
            }

            System.out.println("En büyük sayı: " + enBuyuk);
        //  while (count <= 5) {
        //    System.out.println(count + ". sayıyı girin: ");
        //  int sayi = input.nextInt();

        //if (sayi > enBuyukSayi) {
        // enBuyukSayi = sayi;
        // }

        //  count++;
        //  }

        //  System.out.println("En büyük sayı: " + enBuyukSayi);


        }

    }

