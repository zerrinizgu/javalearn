package ch05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C05_TernaryOperator {

    public static void main(String[] args) {
        // TASK-> girilen bir tamsayı çiftse yarısını değilse
        // "girilen sayı tek oldugu için yarısı tamsayı değildir"
        // print eden code create ediniz
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayi gir");

        int sayi = input.nextInt();
        String result = (sayi % 2 == 0) ? String.valueOf(sayi / 2) : ((sayi % 2 == 1 ? "gırılen sayının yarısı tamsayı degıldır" :
                "tekrar sayi giriniz"));
        System.out.println(result);

    }
}