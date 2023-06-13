package ch08_Loops.Tasks08_forLoop;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /*
        girilen iki sayı arasındaki çift sayıları yanyana  print eden code create ediniz..
         */
        Scanner input = new Scanner(System.in);
        System.out.println("iki tane sayi giriniz");
        int sayi1 = input.nextInt();
        int sayi2 = input.nextInt();

        for (int i = Math.min(sayi1, sayi2); i<Math.max(sayi1, sayi2); i++){
            System.out.println(i%2==0? i+" ": "");


        }
    }
    }






















