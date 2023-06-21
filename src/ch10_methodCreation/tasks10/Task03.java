package ch10_methodCreation.tasks10;

import java.util.Scanner;

public class Task03 {
static Scanner input=new Scanner(System.in);
	public static void main(String[] args) {
		// Saati saniyeye, mil'i kilometreye, kilogrami gram'a 
		// ceviren bir method yaziniz.
		saat();
		mil();
		kg();

	}

	private static int kg() {
		System.out.println("kg gir");
		int kg=input.nextInt();
		System.out.println(" kg= " + kg*1000);

		return kg;
	}

	private static int mil() {
		System.out.println("mil gir");
		int mil=input.nextInt();
		System.out.println("mil=" + mil*1.609);
		return mil;
	}

	private static int saat() {
		System.out.println("saat gir");
		int saat=input.nextInt();
		System.out.println("saat=" + saat*3600);
		return saat;
	}


}
