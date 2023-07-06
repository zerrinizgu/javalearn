package ch07_StringManipulations.tasks07;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
      /* TASK :
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       */
        Scanner input = new Scanner(System.in);
        System.out.println("İsim ve soy isim giriniz");
        String isim = input.nextLine();

        int indexOfbosluk=isim.indexOf(' ');
        String name = isim.substring(0,indexOfbosluk);
        String cognome=isim.substring(indexOfbosluk+1);
        System.out.println("name = " + name);
        System.out.println("cognome = " + cognome);










    }
}
