package JavaTutorialTR.src.ch07_StringManipulations.tasks07;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        /* TASK :
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */
        Scanner input = new Scanner(System.in);
        System.out.println("3 harfli Bir isim giriniz");
        String isim = input.next();

        String birinciHarf=isim.substring(0,1);
        String ikinciHarf=isim.substring(1,2);
        String ucuncuHarf=isim.substring(2,3);
        String result=!birinciHarf.equals(ikinciHarf)&&
                !ucuncuHarf.equals(ikinciHarf)&&!birinciHarf.equals(ucuncuHarf)?"unique":"no";
        System.out.println(result);
    }
}