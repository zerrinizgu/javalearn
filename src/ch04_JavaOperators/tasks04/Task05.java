package ch04_JavaOperators.tasks04;

import java.util.Scanner;

public class Task05 {

    /*
     * Girilen saati  saniyeye çeviren program yazınız
     * Örnek : 1 saat 10 dakika 50 saniye - > 4250 saniye
     * 1 saat = 3600 saniye
     * 1 dk   = 60 saniye
     *
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir saat giriniz:");
        int saat= input.nextInt();
        System.out.println("bir dakika giriniz:");
        int dakika= input.nextInt();
        System.out.println("bir saniye giriniz:");
        int saniye= input.nextInt();
        int toplamsaniye=(saat*3600+dakika*60+saniye);
        System.out.println(toplamsaniye);


    }

}
