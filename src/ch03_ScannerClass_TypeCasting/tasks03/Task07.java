package ch03_ScannerClass_TypeCasting.tasks03;

import java.util.Scanner;



public class Task07 {

    public static void main(String[] args) {

    /*  Problem Tanımı
        Mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız.
        Örneğin:İstanbul ile Ankara arası 400km olarak ölçülmektedir. Bu yolu ortalama
        120 km/saat hızla giden bir araç ne kadar sürede hedefe varır?

        Örnek Ekran Çıktısı
        Mesafeyi giriniz: 400
        Hızı giriniz: 100
        Süre 4 saattir.
     */
        Scanner input = new Scanner(System.in);
        System.out.println("mesafe girin:");
        int mesafe =input.nextInt();
        System.out.println("hizi girin:");
        int hiz =input.nextInt();
        System.out.println("sure="+(mesafe/hiz));


    }
}
