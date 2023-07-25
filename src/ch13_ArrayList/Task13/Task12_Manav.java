package ch13_ArrayList.Task13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task12_Manav {
static Scanner input=new Scanner(System.in);
static ArrayList<String>urunListesi=new ArrayList<>(Arrays.asList("domates", "biber", "patlican", "avokado", "muz"));
static ArrayList<Double>urunFiyatListesi=new ArrayList<>(Arrays.asList(8.5,10.3,13.2,35.7,23.8));
static double toplamOdenecekMiktar;

    public static void main(String[] args) {
        /* TASK :
         * Basit bir 5 ürünlü manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
         * 			 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
         * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
         * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
         *
         * */
musteriSecim();
sor();
    }

    private static void sor() {
        System.out.println("baska bir urun almak istiyor musunuz:\nevet:1\nhayir:2");
        int secim= input.nextInt();
        if (secim == 1) {
            musteriSecim();
        } else if (secim==2) {
            kasa();

        }else System.out.println("yanlis giris tekrar giris yapiniz");
        sor();
    }

    private static void kasa() {
        System.out.println("toplamOdenecekMiktar = " + toplamOdenecekMiktar);
        System.out.println("alisveris bitti,tekrar bekleriz");


    }

    private static void musteriSecim() {
        System.out.println("domates:0"+"biber:1"+"patlican:2"+"avokado:3"+"muz:4");
        System.out.println("hangi urunu istersiniz:");
        int urun= input.nextInt();
        if (urun >= 0 && urun <= 4) {
            System.out.println("kac kilo istersiniz:");
            double kilo = input.nextDouble();
            toplamOdenecekMiktar += kilo * urunFiyatListesi.get(urun);
            System.out.println("Sectiğiniz urun = " + urunListesi.get(urun));
            System.out.println("sectiginiz urunun kg fiyati=" + urunFiyatListesi.get(urun));
        } else {
            System.out.println("yanlis giris yaptiniz.tekrar deneyiniz");
            musteriSecim();
        }

    }


}

