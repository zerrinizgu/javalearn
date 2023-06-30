package JavaTutorialTR.src.ch05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex06 {


    public static void main(String[] args) {

        /*
          TASK -> kullanıcının cinsiyeti KADIN ise 60 yasından buyuk ve prim gunu 6000 den  fazla ise emekliliğini
                kullanıcının cinsiyeti ERKEK ise 65 yasından buyuk ve prim gunu 7000 den  fazla ise emekliliğini
                kontrol edip kalan yıl ve prim gununu print eden code create ediniz...

         */
        Scanner input = new Scanner(System.in);
        System.out.println("cinsiyet gir");
String cinsiyet=input.nextLine();
        System.out.println("YAS GIR");
        int yas= input.nextInt();
        System.out.println("prim gunu gir");
        int primgunu=input.nextInt();

        if (cinsiyet.equals("KADIN")) {
            if (yas >= 60 && primgunu > 6000) {
                int kalanYil = 60 - yas;
                int kalanPrimGun = primgunu - 6000;
                System.out.println("Emekliliğinize " + kalanYil + " yıl kaldı.");
                System.out.println("Kalan prim günü: " + kalanPrimGun);
            } else {
                System.out.println("Emekli olmak için şartları sağlamıyorsunuz.");
            }
        } else if (cinsiyet.equals("ERKEK")) {
            if (yas >= 65 && primgunu > 7000) {
                int kalanYil = 65 - yas;
                int kalanPrimGun = primgunu - 7000;
                System.out.println("Emekliliğinize " + kalanYil + " yıl kaldı.");
                System.out.println("Kalan prim günü: " + kalanPrimGun);
            } else {
                System.out.println("Emekli olmak için şartları sağlamıyorsunuz.");
            }
        } else {
            System.out.println("Geçersiz cinsiyet girişi.");
        }


    }
}
