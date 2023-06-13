package JavaTutorialTR.src.ch06_SwitchStatement.tasks06;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
// 2- Girilen 3 basamaklı bir sayıyı yazı ile yazdırınız
        Scanner input = new Scanner(System.in);
        System.out.println("3 basamakli bir sayi girin");
        int sayi = input.nextInt();

        int yuzler, onlar, birler = input.nextInt();
        yuzler = sayi%100;
        onlar = (sayi/100)%10;
        birler = sayi%10;
        switch (yuzler) {
            case 1:
                System.out.println("yuz");
                break;
            case 2:
                System.out.println("ikiyuz");
                break;
            case 3:
                System.out.println("ucyuz");
            case 4:
                System.out.println("dortyuz");
                break;
            case 5:
                System.out.println("besyuz");
                break;
            case 6:
                System.out.println("altiyuz");
                break;
            case 7:
                System.out.println("yediyuz");
                break;
            case 8:
                System.out.println("sekizyuz");
                break;
            case 9:
                System.out.println("dokuzyuz");
                break;

        }
        switch (onlar) {
            case 1:
                System.out.println("on");
                break;
            case 2:
                System.out.println("yirmi");
                break;
            case 3:
                System.out.println("otuz");
                break;
            case 4:
                System.out.println("kirk");
                break;
            case 5:
                System.out.println("elli");
                break;

            case 6:
                System.out.println("atmis");
                break;
            case 7:
                System.out.println("yetmis");
                break;
            case 8:
                System.out.println("seksen");
                break;
            case 9:
                System.out.println("doksan");
                break;

        }
        switch (birler) {

            case 1:
                System.out.println("bir");
                break;
            case 2:
                System.out.println("iki");
                break;
            case 3:
                System.out.println("uc");
                break;
            case 4:
                System.out.println("dort");
                break;
            case 5:
                System.out.println("bes");
                break;
            case 6:
                System.out.println("alti");
                break;
            case 7:
                System.out.println("yedi");
                break;
            case 8:
                System.out.println("sekiz");
                break;
            case 9:
                System.out.println("dokuz");
                break;


        }

    }
}
