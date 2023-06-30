package JavaTutorialTR.src.ch04_JavaOperators.tasks04;

import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {

        /* Soru
         * Kullanicinin girdigi 3 basamakli sayinin ilk ve son rakamlarinin toplamini veren programi yaziniz.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("3 basamaklı sayı gır:");
        int sayi = input.nextInt();
        int birlerbasamak = sayi % 10;
        int yuzlerbasamak = sayi / 100;
        System.out.println(birlerbasamak + yuzlerbasamak);

    }

}
