package ch08_Loops.Tasks08_forLoop.Tasks08_whileLoops;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        /*
        task -> x karakteri girilene kadar "javaCAN" x karakteri girildiğinde "jAVATAR" print eden code create ediniz.
        do-while lopp
         */
Scanner input=new Scanner(System.in);
char ch;
do{
    System.out.println("karakter gir");
     ch=input.next().charAt(0);
    System.out.println("javacan");

}while(ch!='x');
        System.out.println("jAVATAR");

    }
}
