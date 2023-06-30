package JavaTutorialTR.src.ch04_JavaOperators.tasks04;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

        /*
         * Kullanicidan uc basamakli bir sayi alin
         * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin

         * Ornek : Inputs : 853
         * Output : Girdiginiz sayinin birler basamagi : 3
         *          Girdiginiz sayinin onlar basamagi : 5
         *          Girdiginiz sayinin yuzler basamagi : 8

         */
        Scanner input = new Scanner(System.in);
        System.out.println("3 basamakli bir sayi giriniz:");
        int sayi = input.nextInt();

        int birlerbasamagi = sayi % 10;
        sayi = sayi / 10;
        int onlarbasamagi = sayi % 10;
        int yuzlerbasamagi = sayi / 10;
        System.out.println("sayinin birlerbasamagi:" + birlerbasamagi + "\nsayinin onlarbasamagi:" + onlarbasamagi + "\nsayinin yuzlerbasamagi:" + yuzlerbasamagi);


    }
}
