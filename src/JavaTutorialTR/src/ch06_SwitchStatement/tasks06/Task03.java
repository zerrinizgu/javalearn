package JavaTutorialTR.src.ch06_SwitchStatement.tasks06;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        // Kullanıcının girdiği gün sayısına karşılık gelen gün adını yazınız.
        // 1.gün Pazartesi olsun
        Scanner input = new Scanner(System.in);
        System.out.println("gun giriniz:");
        int gun = input.nextInt();
        System.out.println(gun+". gun:");
        switch (gun) {
            case 1:
                System.out.println("pazartesi");
                break;
                case 2:
                System.out.println("sali");
                break;
                case 3:
                System.out.println("carsamba");
                break;
                case 4:
                System.out.println("persembe");
                break;
                case 5:
                System.out.println("cuma");
                break;
                case 6:
                System.out.println("cumartesi");
                break;
                case 7:
                System.out.println("pazar");
                break;
            default:
                System.out.println("hatali giris");

        }
    }
}