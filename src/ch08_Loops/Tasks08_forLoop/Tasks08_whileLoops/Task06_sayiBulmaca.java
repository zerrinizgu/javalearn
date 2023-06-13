package ch08_Loops.Tasks08_forLoop.Tasks08_whileLoops;

import java.util.Random;
import java.util.Scanner;

public class Task06_sayiBulmaca {

    public static void main(String[] args) {
        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int tutulanSayi = random.nextInt(100) + 1;
        int tahmin;
        int tahminSayisi = 0;

        System.out.println("Bilgisayar bir sayı tuttu. Tahmin et!");

        do {
            System.out.print("Tahmininiz: ");
            tahmin = scanner.nextInt();
            tahminSayisi++;

            if (tahmin < tutulanSayi) {
                System.out.println("Daha büyük bir sayı girin.");
            } else if (tahmin > tutulanSayi) {
                System.out.println("Daha küçük bir sayı girin.");
            }
        } while (tahmin != tutulanSayi);

        System.out.println("Tebrikler! " + tahminSayisi + " tahminde sayıyı buldunuz.");



    }

}
