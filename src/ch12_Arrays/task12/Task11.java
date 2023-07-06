package ch12_Arrays.task12;

import java.util.Arrays;

public class Task11 {
    public static void main(String[] args) {
        /*
		 TASK :
		 $ ve  £  isareti olanlarin toplamlarini ayri ayri bulup yazdıran java code create ediniz.
        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        */
        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        double dolartoplam = 0;
        double poundtoplam = 0;
        String[] array = str.split(" ");
        System.out.println("Arrays.toString(array) = " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i].contains("$")) {
               dolartoplam += Double.parseDouble(array[i].replace("$", ""));

            } else
                poundtoplam += Double.parseDouble(array[i].replace("£", ""));

        }
        System.out.println("toplam $ = " + dolartoplam);
        System.out.println("toplam £= " + poundtoplam);

    }
}
