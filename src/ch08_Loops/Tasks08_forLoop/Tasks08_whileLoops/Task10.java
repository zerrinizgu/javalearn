package ch08_Loops.Tasks08_forLoop.Tasks08_whileLoops;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        // task ->  Girilen bir sayıya kadar  tek olanlarını print eden code create ediniz.
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = input.nextInt();

        System.out.println("Girilen sayıya kadar olan tek sayılar:");

        for (int i = 1; i <= sayi; i++) {
            if (i % 2 != 0) {
                System.out.println(i);


    }

}
}}