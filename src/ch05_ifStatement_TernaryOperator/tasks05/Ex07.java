package ch05_ifStatement_TernaryOperator.tasks05;

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {
        /*
          TASK -> Kuualanıcının ehliyetinin varlığını kontrol ediniz.
          Ehliyeti varsa yıl tecrübesi 7 yıl ve üstü ise aldıgı mesafe 100000 km ve üzeri ise
           kontak anahtarını veriniz
          aksi durumda tecrübe yılı ve mesafe eksiklerini print eden code create ediniz


         */
        Scanner input = new Scanner(System.in);
        System.out.println("ehliyetiniz var mi(evet/hayir):");
        String ehliyetVarmi = input.nextLine();

        if (ehliyetVarmi.equalsIgnoreCase("evet")) {
            System.out.println("tecrube yilini giriniz");
            int tecrubeYili = input.nextInt();
            System.out.println("mesafe giriniz");
            int mesafe = input.nextInt();

            if (tecrubeYili >= 7 && mesafe >= 100000) {
                System.out.println("kontak anahtarini alabilirsiniz");
            } else {
                int EksiktecrubeYili = 7 - tecrubeYili;
                System.out.println("EksiktecrubeYili = " + EksiktecrubeYili+"kadar yiliniz eksik");
                int EksikMesafe = 100000 - mesafe;
                System.out.println("EksikMesafe = " + EksikMesafe+"kadar mesafeniz eksik");
            }
        } else
            System.out.println("ehliyetiniz yok,islem yapamayiz");
    }
}



