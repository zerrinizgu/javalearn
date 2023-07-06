package ch07_StringManipulations.tasks07;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
       /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimelik  ismi
         Örn. Ali Mert Yılmaz -> A.M.Y.  şeklinde print eden code create ediniz.
        */
        Scanner input = new Scanner(System.in);
        System.out.println("3 kelimelik isim giriniz");
        String isim = input.nextLine().toUpperCase();
        int indexOfBosluk = isim.indexOf(' ');
        int indexOfBosluk2 = isim.lastIndexOf(' ');
        String basharfler=isim.substring(0,1).toUpperCase()+"."+isim.substring(indexOfBosluk+1,indexOfBosluk+2).toUpperCase()
                +"."+isim.substring(indexOfBosluk2+1,indexOfBosluk2+2).toUpperCase()+".";
        System.out.println("basharfler = " + basharfler);








    }
}
