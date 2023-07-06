package ch03_ScannerClass_TypeCasting.tasks03;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {

    /*  Problem Tanımı
        Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
        a'nın karesinden b'nin karesini cikarip c nin 3 katina bolunuz

        Örnek Ekran Çıktısı
        a sayısını giriniz: 5
        b sayısını giriniz: 3
        c sayısını giriniz: 1
        sonuç : 5.333333333333333
        */
        Scanner input= new Scanner(System.in);
        System.out.print("a sayısını giriniz: ");
        int a=input.nextInt();
        System.out.print("b sayısını giriniz: ");
        int b=input.nextInt();
        System.out.print("c sayısını giriniz: ");
        int c=input.nextInt();
        double sonuc;
        sonuc=(a*a-b*b)/(c*3.0);
        System.out.println("sonuc = " + sonuc);

    }
}
