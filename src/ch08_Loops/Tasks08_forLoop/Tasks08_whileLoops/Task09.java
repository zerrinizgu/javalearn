package ch08_Loops.Tasks08_forLoop.Tasks08_whileLoops;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {


        // kullanicidan kac sayi toplamak istedigini alin
        // bu sayilari alin ve bu sayilarin toplamini ekrana yazdirin

        Scanner input=new Scanner(System.in);
        System.out.println("kac tane sayi toplamak istersiniz? ");

        int sayiadedi=input.nextInt();
        int toplam=0;
        for (int i=1; i<=sayiadedi;i++){
            System.out.println(i+" .sayiyi giriniz:");
            int sayi=input.nextInt();
            toplam+=sayi;


        }
        System.out.println("girilen sayilarin toplami:"+toplam);


    }




}
