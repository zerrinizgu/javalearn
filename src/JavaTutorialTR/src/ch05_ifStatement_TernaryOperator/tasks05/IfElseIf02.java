package JavaTutorialTR.src.ch05_ifStatement_TernaryOperator.tasks05;

import java.util.Scanner;

public class IfElseIf02 {

	public static void main(String[] args) {
		/*Kullanıcıdan bir üçgenin  üç kenar uzunluğunu alın eğer üç kenar uzunluğu birbirine eşit ise ekrana
“Eşkenar üçgen�? yazdırın. Sadece iki kenar uzunluğu birbirine eşit ise ekrana “Ikizkenar üçgen�?
yazdırın. Tüm kenar uzunlukları birbirinden farklı ise “Çeşitkenar üçgen yazdırın�?
		  */
		Scanner input=new Scanner(System.in);
		System.out.println("kenar1,kenar2,kenar3 girin");
		double kenar1= input.nextDouble();
		double kenar2= input.nextDouble();
		double kenar3= input.nextDouble();
		if (kenar1==kenar2 && kenar3==kenar2)
			System.out.println("Eşkenar üçgen�?");
		else if (kenar1==kenar2 || kenar1==kenar3||kenar2==kenar3)
			System.out.println("Ikizkenar üçgen�?");
		else  if(kenar1!=kenar2 && kenar1!=kenar3 && kenar2!=kenar3)
			System.out.println("cesitkenar ucgen");













	}
	

}
