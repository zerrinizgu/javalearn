package JavaTutorialTR.src.ch03_ScannerClass_TypeCasting.tasks03;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

    /*  Problem Tanımı
        Bir dik üçgenin iki dik kenarını alarak hipotenüsünü hesaplayan kod yazınız.

        Örnek Ekran Çıktısı
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13      */
        Scanner input = new Scanner(System.in);
        System.out.println("kenar1 giriniz:");
        int kenar1= input.nextInt();
        System.out.println("kenar2 giriniz:");
        int kenar2= input.nextInt();
        double hipotenus = Math.sqrt(Math.pow(kenar1, 2) + Math.pow(kenar2, 2));
        System.out.println("hipotenus = " + hipotenus);


    }
}
