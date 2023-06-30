package JavaTutorialTR.src.ch05_ifStatement_TernaryOperator.tasks05;

import java.util.Scanner;

public class NestedIfSoru01 {

	public static void main(String[] args) {
		/*
		 Kullanıcıdan cinsiyetini girmesini isteyin.
Erkek ise yaşını kontrol edin. Yaşı 18 den küçük ise ekrana “Erkek çocuk” yazdırın.
Yaşı 18 den büyük eşit ise ekrana “Adam” yazdırın.
Kadin ise yasini kontrol edin. Yaşı 18 den küçük ise ekrana “Kız çocuk” yazdırın.
Yaşı 18 den büyük eşit ise ekrana “Kadın” yazdırın.
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("cinsiyet giriniz:(kadin/erkek)");
		String cinsiyet=input.nextLine();
		if(cinsiyet.equals("erkek")){
			System.out.println("yasinizi girin");
			int yas=input.nextInt();
		if(yas<18)
			System.out.println("erkek cocuk");
		else System.out.println("adam");

		}else if(cinsiyet.equals("kadin"))
			System.out.println("yasinizi girin");
		int yas=input.nextInt();
	if (yas<18) System.out.println("Kız çocuk");
	else System.out.println("kadin");





		
	}
}
