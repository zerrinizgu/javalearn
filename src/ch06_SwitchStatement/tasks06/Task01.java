package ch06_SwitchStatement.tasks06;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        // Girilen bir sayının onlar basamağının değerini yazı ile yazdırınız.

        Scanner input=new Scanner(System.in);
        System.out.println("bir sayi giriniz:");
        int sayi=input.nextInt();
        int onlarbasamagi=(sayi/10)%10;
        switch (onlarbasamagi){
        case 0:
            System.out.println("sifir");
            break;
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
            default:
                System.out.println("yeniden sayi giriniz");









    }
}
}