package JavaTutorialTR.src.ch05_ifStatement_TernaryOperator.tasks05;

import java.util.Scanner;

public class Ifstatement04 {

    public static void main(String[] args) {
		/*
		 Kullanicidan bir sayi alin
		 sayi 3 basamakli ise console ' a 3 basamakli yazdirin
		 sayi 2 basamakli ise console'a 2 basmakli yazdirin
		 sayi 3 basamakli yada 2 basamakli degilse ikiside degil yazdirin
		 */

        Scanner input = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi = input.nextInt();
        if (sayi > 99 && sayi < 1000)
            System.out.println("3 basamakli");
			else if ((sayi > 9) && (sayi < 100))
                System.out.println("2 basamakli");
            else System.out.println("ikisi de degil");
        }

    }


