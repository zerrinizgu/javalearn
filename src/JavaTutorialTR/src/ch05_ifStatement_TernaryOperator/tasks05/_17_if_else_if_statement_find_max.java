package JavaTutorialTR.src.ch05_ifStatement_TernaryOperator.tasks05;

public class _17_if_else_if_statement_find_max {

    public static void main(String[] args) {

      /* Oluşturulan bu 3 int içinde en yüksek değerli olanı bulun.
         Bu en yüksek numarayı yazdırın.

         Not: Num1 = 18 veya Num2 = 25 değerini değiştirdiğinizde kodunuz maksimum değeri yazmalıdır.
         Tüm farklı senaryolarda maksimum sayıyı yazdırmalıdır  */

int a=122;
int b=15;
int c=17;
if (a>b&&a>c){
    System.out.println("a maximum");


} else if (b>a&&b>c){
    System.out.println("b maximum");


}else if(c>a&&c>b){
            System.out.println("c maximum");
        }
    }
}
