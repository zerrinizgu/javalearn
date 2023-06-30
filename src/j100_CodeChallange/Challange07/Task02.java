package j100_CodeChallange.Challange07;

import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {
// task-> girilen tamsayının tek-çift olmasını kontrol eden method create ediniz

       Scanner input=new Scanner(System.in);
        System.out.println("bir sayi gir");

        System.out.println("tekcift() = " + tekcift(input.nextInt()));


    }

    public static String tekcift(int sayi) {

        return sayi%2==0 ? "cift" :"tek";

    }
}
