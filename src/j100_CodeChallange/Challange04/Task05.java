package j100_CodeChallange.Challange04;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        /* Task->
         * Girilen 4 kelime  cumle haline getirip sonunda . ile print eden code create ediniz.
         *
         * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
         *         Output : Cesaret insana sinirlarini ogretir.
         *
         */


            Scanner input = new Scanner(System.in);
            System.out.println("bizim ooolan arkaarkaya 4 kelime giresen :");

            String kelime1= input.next();
            String kelime2= input.next();
            String kelime3= input.next();
            String kelime4= input.next();

            System.out.println(kelime1.toUpperCase().charAt(0) + kelime1.substring(1)+" "+
                    kelime2+" "+kelime3+" "+kelime4+".");
    }
}
