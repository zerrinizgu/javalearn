package j100_CodeChallange.Challange07;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        /* task->
     Girilen  isim ve soyismin ilk harflerini büyük
     diğer harflerini küçük harf olarak print eden method create ediniz.
     */
        Scanner input = new Scanner(System.in);
        System.out.println("isim gır: ");
        String isim = input.nextLine();
        System.out.println("soyisim gır: ");
        String soyisim = input.nextLine();

        System.out.println("name(isim,soyisim) = " + name(isim, soyisim));
    }
    public static String name(String isim,String soyisim) {
       return( isim.substring(0,1).toUpperCase()+(isim.substring(1).toLowerCase()+" "
               +soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).toLowerCase() ));



    }
}
