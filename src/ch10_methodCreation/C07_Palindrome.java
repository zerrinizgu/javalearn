package ch10_methodCreation;

import java.util.Scanner;

public class C07_Palindrome {
    public static void main(String[] args) {
        /*
girilen ifadenin polindrome olmasını kontrol eden method create ediniz...
plindrome:her iki yönde okundugunda eşit olan ifadeler
madam , ada ,iki asa, 121
 */
        Scanner input = new Scanner(System.in);
        System.out.println("bir ifade giriniz : ");
String kelime=input.nextLine();
polindrome(kelime);
    }
private static void polindrome(String k){
String ters="";
    for (int i = k.length()-1; i >=0 ; i--) {
       ters+=k.charAt(i);
    } System.out.println("girdigin kelimenin tersi = " + ters);
        if (ters.equals(k)){
            System.out.println("bu kelime polindromdur");
    }else System.out.println("bu kelime polindrom degildir");



}
}