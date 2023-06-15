package j100_CodeChallange.Challange05.Challange05;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        /* Interview Question
    Write a Java program to reverse a string.
    Use for loop and create a method called reverseString */
        Scanner input = new Scanner(System.in);
        System.out.print("bir string giriniz:");
        String str = input.nextLine();
        for (int i =str.length()-1; i >=0 ; i--) {
            System.out.print(str.charAt(i) + " ");
        }




    }
}
