package JavaTutorialTR.src.ch05_ifStatement_TernaryOperator.tasks05;

public class _08_if_else_if_statement8 {

    public static void main(String[] args) {

        /*  33 değerinde bir int oluşturun.
            Eğer, 33'ü 4'e böldüğünüzde kalan 3'e eşit ise "Remainder is 3" yazdırınız.
            Eğer, 33'ü 4'e böldüğünüzde kalan 2'e eşit ise "Remainder is 2" yazdırınız.
            Eğer, 33'ü 4'e böldüğünüzde kalan 1'e eşit ise "Remainder is 1" yazdırınız.
            Aksi halde (else) "Reminder is 0" yazdırınız.  */
int sayi=33;
if (33%4==3) System.out.println("Remainder is 3" );
if (33%4==2) System.out.println("Remainder is 2");
if (33%4==1) System.out.println("Remainder is 1");

    }
}
