package j100_CodeChallange.Challange07;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
/* task->
     cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method create ediniz.
      */
        Scanner input = new Scanner(System.in);
        System.out.println("bır cm sayi gır: ");
       int cmsayi = input.nextInt();
        System.out.println("metreCevir(cmsayi) = " + metreCevir(cmsayi));
        System.out.println("kilometreCevir(cmsayi) = " + kilometreCevir(cmsayi));
    }

    private static double kilometreCevir(int cmsayi) {
return cmsayi/10000;
    }

    private static double metreCevir(int cmsayi) {
       return cmsayi/100;
    }


}

