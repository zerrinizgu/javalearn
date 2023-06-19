

import java.util.Scanner;

public class Calisma_class {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {// Task-> girilen sayının basamaklarındaki rakamların toplamını print eden code create ediniz.

        System.out.println("bir sayi giriniz");
        int sayi = input.nextInt();

        System.out.println("sayibasamagindakirakamlartoplami="+sayibasamagindakirakamlartoplami(sayi));

    }
    private static int sayibasamagindakirakamlartoplami(int sayi) {
        int sayibasamagindakirakamlartoplami = 0;
        while (sayi>0) {

            sayibasamagindakirakamlartoplami+= sayi % 10;
            sayi=sayi/10;

      }


        return sayibasamagindakirakamlartoplami;
    }


    }





























































