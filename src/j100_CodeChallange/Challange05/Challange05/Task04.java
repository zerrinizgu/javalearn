package j100_CodeChallange.Challange05.Challange05;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        /* task-> girilen sayıdan 1'e kadar olan tamsıyalrın karelerinin toplamını print eden code create ediniz..
	    Örnek Ekran Çıktısı
	    Girilen sayı=4               1 -> 1  2-> 4  3->9
	    Kareler toplamı=14
	     */
        Scanner input = new Scanner(System.in);
        System.out.print("bir sayi giriniz:");
        int sayi = input.nextInt();
        int toplam = 0;
        for (int i = sayi; i >= 1; i--) {
            toplam += i * i;


        }
        System.out.println("girilen sayilarin kareleri toplami=" + toplam);


    }
}

