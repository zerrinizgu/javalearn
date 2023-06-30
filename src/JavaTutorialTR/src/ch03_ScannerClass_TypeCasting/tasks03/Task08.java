package JavaTutorialTR.src.ch03_ScannerClass_TypeCasting.tasks03;

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {
        /*
         * Kullanicidan alacaginiz vize1 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */
        Scanner input = new Scanner(System.in);
        System.out.println("vize1 notu  girin:");
        double vize1 = input.nextDouble();
        System.out.println("vize2 notu  girin:");
        double vize2 = input.nextDouble();
        System.out.println("final notu  girin:");
        double finalnot = input.nextDouble();
        double ortalama=((vize1+vize2)/2.0)*0.3+finalnot*0.7;
        System.out.println("ortalama = " + ortalama);

    }
}
