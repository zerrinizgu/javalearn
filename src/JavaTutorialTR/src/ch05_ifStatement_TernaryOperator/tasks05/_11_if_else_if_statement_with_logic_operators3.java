package JavaTutorialTR.src.ch05_ifStatement_TernaryOperator.tasks05;

public class _11_if_else_if_statement_with_logic_operators3 {

    public static void main(String[] args) {

    /*  Eğer String null (0) değilse ve String uzunluğu 14 ise ve String "i love java" yı kapsıyorsa
        "String is i love java and 14 character." yazdırınız.

        Eğer String null(0) değilse ve karakter biçimini (büyük, kücük harf) görmezden gelirse,
        "String is I love java" yazdırın. */

String str="i love java";
if (str != null &&str.length()==14&&str.contains("i love java")) System.out.println("String is i love java and 14 character.");
if (str != null &&str.equalsIgnoreCase("i love java")) System.out.println("String is I love java");
    }
}
