package JavaTutorialTR.src.ch05_ifStatement_TernaryOperator.tasks05;

import java.util.Scanner;

public class NestedIfSoru02 {

    public static void main(String[] args) {
		/*
		 Kullanıcıdan bir harf girmesini isteyin.
Girdiği küçük harf ise harfin “a” olup olmadığını kontrol edin. Harf “a” ise ekrana “Ilk küçük harf” yazdırın.
“a” değil ise ekrana “Ilk küçük harf değil” yazdırın.
Girdiği büyük harf ise harfin “Z” olup olmadığını kontrol edin. Harf “Z” ise ekrana “Son büyük harf” yazdırın.
“Z” değil ise ekrana “Son büyük harf değil” yazdırın.
		 */
        Scanner input = new Scanner(System.in);
        System.out.println("ch girin");
        char ch = input.nextLine().charAt(0);
        if (Character.isLowerCase(ch)) {
            if (ch == 'a') {
                System.out.println("Ilk küçük harf");
            } else
                System.out.println("Ilk küçük harf değil");
        } else if (Character.isUpperCase(ch)) {
            if (ch == 'Z') {
                System.out.println("Son büyük harf");
        } else
            System.out.println("Son büyük harf değil");
        } else  {

        System.out.println("gecersiz giris");

}
    }}