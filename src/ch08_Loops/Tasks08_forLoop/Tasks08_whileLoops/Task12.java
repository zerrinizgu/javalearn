package ch08_Loops.Tasks08_forLoop.Tasks08_whileLoops;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {
		/*
		 task->girilen bir metinde harf rakam ve özel karakter sayısını print eden code create ediniz.
		do-While loop
		 */

        Scanner input = new Scanner(System.in);
        System.out.println("bir metin gir");
        String str = input.nextLine().toLowerCase();
//"selam111aaa345-*++*-/"
        int harfSayisi = 0;
        int rakamSayisi = 0;
        int ozelKarakterSayisi = 0;
        int index = 0;
        while (str.length() > index) {
            if (Character.isDigit(str.charAt(index)))
                rakamSayisi++;
            else if (Character.isAlphabetic((str.charAt(index))))
                harfSayisi++;
             else
            ozelKarakterSayisi++;
            index++;

        }
        System.out.println("harfSayisi = " + harfSayisi);
        System.out.println("rakamSayisi = " + rakamSayisi);
        System.out.println("ozelKarakterSayisi = " + ozelKarakterSayisi);

    }


}


