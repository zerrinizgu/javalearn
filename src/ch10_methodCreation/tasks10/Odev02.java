package ch10_methodCreation.tasks10;

import java.util.Scanner;

public class Odev02 {
	public static void main(String[] args) {
		/*
		Task-> girilen bir String'deki rakam sayısını hesaplayan method
		create ediniz
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("bir string  gir");
		String str = input.nextLine();
		System.out.println("rakamsay(str) = " + rakamsay(str));


	}
	private static int rakamsay(String str) {
		int sayac=0;

		for (int i = 0; i <str.length() ; i++) {
			if(Character.isDigit(str.charAt(i))){
				sayac++;
		}

		}
		return sayac;
	}
}
