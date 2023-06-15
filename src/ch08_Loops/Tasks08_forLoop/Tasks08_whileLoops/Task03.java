package ch08_Loops.Tasks08_forLoop.Tasks08_whileLoops;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		/*

        task-> girilen  tamsayı için carpim tablosunu print eden code create ediniz.

		 Ornek input = 13
		 13x1=13 13x2=26  . . .. .  . 13x10=130
		 */
		Scanner input = new Scanner(System.in);
		System.out.println(" bir tamsayi giriniz:");
		int sayi = input.nextInt();


			for(int j=1; j<=10; j++){ //carpim tablosunun ikinci carpani

				System.out.println("sayi*j degeri= "+sayi +"*"+j +" = " + sayi*j);

			}

			System.out.println(); //dummy kod islevsiz kodu okumayi ve konsol kozme
		//int i=1;
		//while (i<=10){
		//System.out.println("sayi*j degeri= "+sayi +"*"+j +" = " + sayi*j);


	}

}
