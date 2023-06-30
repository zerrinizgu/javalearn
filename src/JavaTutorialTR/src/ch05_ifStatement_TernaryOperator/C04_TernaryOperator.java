package JavaTutorialTR.src.ch05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C04_TernaryOperator {

    public static void main(String[] args) {
        // TASK-> girilen  pozitof bir tamsayının 2 veya daha fazla
        // basamaklı olmasını
        // kontrol eden code create ediniz.
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayi gir");
        int sayi = input.nextInt();
String result=sayi>9&&sayi<100?"2 basamakli":"2 basamakli degildir";
        System.out.println(result);


    }
}
