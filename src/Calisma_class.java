

import java.util.Scanner;

public class Calisma_class {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir tamsayı girin: ");
        int number = scanner.nextInt();

        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        System.out.println("Tersine çevrilmiş hali: " + reversedNumber);

    }


}


































































