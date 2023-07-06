package ch05_ifStatement_TernaryOperator.tasks05;

public class _18_if_else_statement_find_min {

    public static void main(String[] args) {

    /*    Oluşturulan bu 3 int arasında en düşük değerdeki numarayı bulunuz.
          Bu numarayı yazdırınız.
          Not: Kodunuz her farklı senaryoda en küçük numarayı yazdırmalıdır.

          Örn: 10-11-12 > 10  */
        int a=60;
        int b=11;
        int c=12;
        if (a<b&&a<c){
            System.out.println("a minimum");


        } else if (b<a&&b<c){
            System.out.println("b minimum");


        }else if(c<a&&c<b)
            System.out.println("c minimum");






    }
}
