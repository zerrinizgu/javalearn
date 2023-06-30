package JavaTutorialTR.src.ch03_ScannerClass_TypeCasting.tasks03;

import java.util.Scanner;

public class _28_Scanner7 {

    public static void main(String[] args) {

        /*    Bir boolean oluşturunuz.
              Konsola "Bir Banka Hesabınız Var mı ? " yazınız.
              Varsa True , yoksa False olarak  konsoldan cevap veriniz.
              Boolean'ı yazdırınız.   */

        //Kodu aşağıya yazınız.
        Scanner input = new Scanner(System.in);
        System.out.println(("birbanka hesabiniz var mi?:"));
        String cevap = input.nextLine();
        boolean bankahesabi = cevap.equalsIgnoreCase("EVET");
        System.out.println("bankahesabi = " + bankahesabi);
    }
}
