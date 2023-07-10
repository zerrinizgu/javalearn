package ch12_Arrays.task12;

import java.util.Arrays;

public class Task03 {

    public static void main(String[] args) {
		
		 /*
       Task-> Verilen  bir arrayin tum elemanlarini
        bir soldaki konuma print eden code create ediniz
       input:  [1,2, 3]
        output [2, 3, 1]
        */
// arraydeki her bir elemani index degeri kadar artiralim//kod calismadi
        int[] array = {1, 2, 3};
        int length = array.length;

        // Diziyi bir sola kaydırma
        int temp = array[0];
        for (int i = 0; i < length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[length - 1] = temp;

        // Sonucu yazdırma
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }


    }

}
