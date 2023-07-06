package ch06_SwitchStatement.tasks06;

import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {
		/*
		 Kullanizi ay ismini girdiginde o ayin kac cektigini ekrana yazan bir program yapiniz
		 */

        Scanner input = new Scanner(System.in);
        System.out.println("ay adi giriniz:");
        String ay = input.nextLine().toLowerCase();
        switch (ay) {
            case "ocak":
            case "mart":
            case "mayis":
            case "temmuz":
            case "agustos":
            case "ekim":
            case "aralik":
                System.out.println("31 gun");

            case "nisan":
            case "haziran":
            case "eylul":
            case "kasim":
                System.out.println("30 gun");
            case "subat":
                System.out.println("hangi yildasiniz");
                int yil=input.nextInt();
                if(yil%4==0&&yil%100!=0 || yil%400==0){ System.out.println(yil+"in subat ayi 29 gundur");


        }else System.out.println(yil+"in subat ayi 28 gundur");
                break;

        }
    }

}
