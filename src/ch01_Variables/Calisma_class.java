package ch01_Variables;


import java.util.Scanner;

public class Calisma_class {


    public static void main(String[] args) {
        /* Task->
         * Girilen  bir cumle ve bir harf için
         * Cumlede harfin kac kere
         * kullanildigini print eden code create ediniz.
         *  ORNEK:
         * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
         *
         * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("bir cumle gir : ");
        String cumle = input.nextLine().toLowerCase();
        System.out.println("bir harf gir : ");
        char harf = input.next().charAt(0);
int count=0;
        for (int i = 0; i <cumle.length() ; i++) {
            if (cumle.charAt(i)==harf) {
                count++;
            }
        }

        System.out.println("cumle icinde istedigin harf sayisi"+" " +harf+" "+count+" "+"tane var");



}
}










































































