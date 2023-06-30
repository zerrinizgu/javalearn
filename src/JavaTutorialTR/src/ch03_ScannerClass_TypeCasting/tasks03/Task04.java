package JavaTutorialTR.src.ch03_ScannerClass_TypeCasting.tasks03;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        /* TASK ->
        Clarusway spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
        bilgilerini alıp aylık $20 olarak toplam ücretini hesplayıp print eden code create ediniz.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("isim vesoyisim:" );
        String adsoyad=input.nextLine();
        System.out.println("yas:" );
        String yas=input.nextLine();
        System.out.println("kilo:" );
        String kilo=input.nextLine();
        System.out.println("boy:" );
        String boy=input.nextLine();
        System.out.println("devam edilecek ay suresi:" );
        int ay=input.nextInt();
        System.out.println("ay = " + ay);
        System.out.println("toplamucret="+ay*20+"$");


    }
}
