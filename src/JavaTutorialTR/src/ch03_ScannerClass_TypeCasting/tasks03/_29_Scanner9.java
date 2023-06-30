package JavaTutorialTR.src.ch03_ScannerClass_TypeCasting.tasks03;

import java.util.Scanner;

public class _29_Scanner9 {

    public static void main(String[] args) {

    /*    Bir float oluşturunuz.
          Konsola boyunuzu giriniz.
          Float'ı yazdırınız.   */

        //Kodu aşağıya yazınız.
        Scanner input = new Scanner(System.in);
        System.out.println(("boyunuzu girin"));
      float boy= input.nextFloat();
        System.out.println("boy = " + boy);

    }


}
