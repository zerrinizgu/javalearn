package ch08_Loops.Tasks08_forLoop.Tasks08_whileLoops;

import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {
		/*
		task-> girilen  isim ve soyismi için ilk isminin ilk harfinden soy isminin son harfine kadar olan butun harfleri
		 ayni satirda aralarina bosluk birakarak print rden code create ediniz.

		 */
        Scanner input = new Scanner(System.in);
        System.out.print("İsim: ");
        String isim = input.nextLine();

        System.out.print("Soyisim: ");
        String soyisim = input.nextLine();
        isim = isim.concat(soyisim);

        int i = 0;
        while (isim.length() > i) {
            System.out.print(isim.charAt(i) + " ");
            i++;
        }


    }


}



