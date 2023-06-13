package ch08_Loops.Tasks08_forLoop.Tasks08_whileLoops;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
        task-> girilen iki tamsayı arasındaki tamsayıları print eden code create ediniz.
        for loop & while lopp
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Başlangıç sayısını girin: ");
                int baslangic = scanner.nextInt();

                System.out.print("Bitiş sayısını girin: ");
                int bitis = scanner.nextInt();

                System.out.println("Girilen aralıktaki tamsayılar:");
                for (int i = baslangic; i <= bitis; i++) {
                    System.out.println(i);
    }
}
    }