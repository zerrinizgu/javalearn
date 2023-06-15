package j100_CodeChallange.Challange05.Challange05;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
/* task-> girilen satır ve sutun değerleri için aşağıdaki şekli print eden code create ediniz.
	 	Get the number of rows and columns from user.
	 	Create a rectangle.
	 	rows = 3 and column = 5 ==> * * * * *
	 	                            * * * * *
	 	                            * * * * *
	 */
        Scanner input = new Scanner(System.in);
        System.out.print("bir satir giriniz:");
        int satir = input.nextInt();


        System.out.print("bir sutun giriniz:");
        int sutun = input.nextInt();
for (int i = 1; i <=satir; i++) {
  for (int j = 1; j <=sutun; j++) {
      System.out.print("* ");

  }
    System.out.println();
}




    }
}
