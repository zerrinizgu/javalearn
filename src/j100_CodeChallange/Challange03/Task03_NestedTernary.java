package j100_CodeChallange.Challange03;

import java.util.Scanner;

public class Task03_NestedTernary {
    public static void main(String[] args) {

    /*  Task
     Girilen Final için
    'A'  ->  "Gayet Basarili"
    'B'  ->  "Basarili"
    'C'  ->   "Ha gayret"
    bu notlar disindakilere de Digerleri..
    print eden code create ediniz.
     */

            Scanner input=new Scanner(System.in);
            System.out.println("bizim ooolan final notunuzu harf değerini giriniz :");
            char finalNot=input.next().charAt(0);
            System.out.println(finalNot == 'A' ? "Gayet Basarili" : finalNot == 'B' ? "Basarili" : finalNot == 'C' ? "Ha gayret" : "seneye inş");













        }

    }

