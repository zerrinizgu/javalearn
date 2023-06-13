package JavaTutorialTR.src.ch07_StringManipulations.tasks07;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
		 	Girilen passwordun aşagıdaki şartları sağlamasını kontrol eden coden create ediniz
		 	 a)Ilk karakteri buyuk harf olmalı
		 	 b)Son karakteri sayi olamlı
		 	 c)en az 6 karakter uzunlugunda olmalı

		 */
        Scanner input = new Scanner(System.in);
        System.out.println("bir password giriniz");
        String password= input.next();
      char ilkkarakter= password.charAt(0);
      char sonkarakter= password.charAt(password.length()-1);
      int uzunluk= password.length();

        if (Character.isDigit(sonkarakter) && uzunluk >=6 && ilkkarakter==Character.toUpperCase(ilkkarakter))

            System.out.println("Password is valid");
        else
            System.out.println("Password is invalid");









    }
}
