package j100_CodeChallange.Challange07;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {

    /* task ->
    İki integer sayının eşitliğini kontrol eden java methodunu yazınız.

    num1 = num2 => true
    */
        Scanner input=new Scanner(System.in);
        System.out.println(" sayi1 gir");
        int sayi1=input.nextInt();
        System.out.println(" sayi2 gir");
        int sayi2=input.nextInt();
        System.out.println("esitlikKontrol(sayi1, sayi2) = " + esitlikKontrol(sayi1, sayi2));


    }

    private static String esitlikKontrol(int sayi1, int sayi2) {
        return (sayi1==sayi2?"true":"false");
    }
}
