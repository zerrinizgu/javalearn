package JavaTutorialTR.src.ch03_ScannerClass_TypeCasting.tasks03;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
         * TASK ->
         *
         * Kullanicidan boyunu cm olarak, kilosunu kilogram olarak alin
         * ve vucut kutle endeksini bulun.
         * Sonucu tamsayi ve ondalikli sayi olarak yazdirin
         *
         * VKE= kilo/(boy*boy) …….. Kilo : kilogram , Boy : metre olmalidir
         *
         * Ornek : Input : boy :180 kilo : 80
         *         Output : Vucut kutle endeksiniz : 24
         *                  Vucut kutle endeksiniz : 24.691…
         *
         *
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("boy(cm):");
        System.out.println("kilo(kg):");
        int boy=scan.nextInt();
 int kilo=scan.nextInt();
 double vke=kilo/(boy*boy/100/100);
        System.out.println(vke);


    }
}
