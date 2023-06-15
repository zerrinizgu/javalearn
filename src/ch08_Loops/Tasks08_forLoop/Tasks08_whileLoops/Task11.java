package ch08_Loops.Tasks08_forLoop.Tasks08_whileLoops;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        /*
    task -> 0 (sıfır) girilene kadar girilen tum sayıların adedini ve toplamını print eden code create edinz.
    */
        Scanner input = new Scanner(System.in);
        int SayiAdedi = 0;

        int toplam = 0;


        System.out.println("İşlemi bitirmek için 0'a basınız.");

        while (true) {
            System.out.print("Bir sayı giriniz: ");
            int sayi = input.nextInt();

            if (sayi == 0) {
                break;
            }
            SayiAdedi++;
            toplam += sayi;

            }

        System.out.println("girilen sayi adedi:"+SayiAdedi);
        System.out.println();



    }



        }


