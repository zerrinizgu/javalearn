package JavaTutorialTR.src.ch05_ifStatement_TernaryOperator.tasks05;

import java.util.Scanner;

public class Task01 {
    public static <Scanner> void main(String[] args) {

        //Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu asagidaki tabloya gore ekrana yazdiriniz
        //0 - 4 => bebek
        //5 - 12 => cocuk
        //13 - 20 => genc
        //21 - 30 => yetiskin
        //Tanimlanmamis evre
java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.println("yas degeri:");
        int yas=scan.nextInt();
if (yas>=0 &&yas<=4) System.out.println( "bebek");if (yas>=5 &&yas<=12) System.out.println( "cocuk");
if (yas>=13 &&yas<=20) System.out.println( "genc");if (yas>=21 &&yas<=30) System.out.println( "yetiskin");


    }
}
