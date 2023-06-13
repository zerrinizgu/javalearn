package JavaTutorialTR.src.ch04_JavaOperators.tasks04;

import java.util.Scanner;

public class Task09 {


    /*
     Çiftlikteki hayvanların ayaklarının toplam sayısını bulma.
     Çiftlikteki bulunun inek, koyun, tavukların ayark sayısını hesaplayalım.

     */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("ineksayisi:");
        int inek=scan.nextInt();

        System.out.println("inekayak");
        System.out.println("koyunsayisi:");
        int koyun=scan.nextInt();

        System.out.println("tavuksayisi:");
        int tavuk=scan.nextInt();

      int toplamayaksayisi=inek*4+koyun*4+tavuk*2;
        System.out.println("toplamayaksayisi:"+toplamayaksayisi);


    }

}
