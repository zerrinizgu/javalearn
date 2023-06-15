package ch08_Loops.Tasks08_forLoop.Tasks08_whileLoops;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        // Kullanicidan toplamak uzere pozitif sayilar isteyin,
        // islemi bitirmek icin 0’a basmasini soyleyin.
        //	Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin
        //	ve “Negatif sayi giremezsiniz” yazdirip basa donun
        //	Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini,
        //	yanlislikla kac negative sayi girdigini
        //	ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.

        Scanner input = new Scanner(System.in);
        int pozitifSayiAdedi = 0;
        int negatifSayiAdedi = 0;
        int toplam = 0;

        System.out.println("Pozitif sayılar toplam");
        System.out.println("İşlemi bitirmek için 0'a basınız.");

        while (true) {
            System.out.print("Bir sayı giriniz: ");
            int sayi = input.nextInt();

            if (sayi == 0) {
                break;
            } else if (sayi < 0) {
                System.out.println("Negatif sayı giremezsiniz.");
                negatifSayiAdedi++;
                continue;
            }

            pozitifSayiAdedi++;
            toplam += sayi;
        }

        System.out.println("Girilen pozitif sayı adedi: " + pozitifSayiAdedi);
        System.out.println("Girilen  negatif sayı adedi: " + negatifSayiAdedi);
        System.out.println("Girilen pozitif sayıların toplamı: " + toplam);

    }
}
