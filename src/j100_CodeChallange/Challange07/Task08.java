package j100_CodeChallange.Challange07;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
             /* task->  girilen bir yılın  artık yıl olup
    olmadığını kontrol eden method create ediniz..
   artık yıl:
            Kural1: 4 ile bölünemeyen yıllar artık yıl değildir.
            Kural2: 4 ile bölünüp 100 ile bölünemeyen yıllar artık yıldır.
            Kural3: 4’ün katı olmasına rağmen 100 ile bölünebilen yıllardan sadece  400’ün katı olan yıllar artık yıldır.
    */
        Scanner input = new Scanner(System.in);
        System.out.println("yil gır: ");
        int yil = input.nextInt();
        System.out.println("artikYilKontrol(yil) = " + artikYilKontrol(yil));


    }

    private static String artikYilKontrol(int yil) {
      return(yil%4==0&&(yil%100!=0||yil%400==0))? "artikYil": "artikYil degil";



    }
}
