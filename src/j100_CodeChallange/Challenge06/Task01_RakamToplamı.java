package j100_CodeChallange.Challenge06;

import java.util.Scanner;

public class Task01_RakamToplamı {
    // Task-> girilen sayının basamaklarındaki rakamların toplamını print eden code create ediniz.
    public static <String> void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("iki tane sayi giriniz");
        int sayi = input.nextInt();
int rakamlarToplami=0;
while (sayi>0) {
    rakamlarToplami+=sayi%10;
    sayi=sayi/10;
}
        System.out.println("rakamlarToplami = " + rakamlarToplami);


    }
    }

