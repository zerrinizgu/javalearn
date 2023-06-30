package j100_CodeChallange.Challange07;

import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {

    /* task->
    Girilen bir tamsayı için
    Bu sayinin negatif veya pozitif oldugunu,
    tek mi cift mi oldugunu ve
    uc basamakli veya daha buyukse birler,onlar ve yuzler basamagindaki rakamlarin toplamini,
    100'den kucukse sadece birler basamagini print eden method'lar create ediniz.
    */
        Scanner input = new Scanner(System.in);
        System.out.println("bır  sayi gır: ");
        int sayi = input.nextInt();
        negatifpozitif(sayi);
        tekmiciftmi(sayi);
        birleronlaryuzlerbasrakamtop(sayi);

yuzdenkucukbirlerbas(sayi);
        System.out.println(sayi>99?birleronlaryuzlerbasrakamtop(sayi):yuzdenkucukbirlerbas(sayi));

    }

    private static int yuzdenkucukbirlerbas(int sayi) {
        return sayi%10;

    }

    private static int birleronlaryuzlerbasrakamtop(int sayi) {
        int toplam=0;
        return sayi%10+(sayi/10)%10+sayi/100;


    }

    private static void tekmiciftmi(int sayi) {
        System.out.println(sayi%2==0?"cift" :"tek");
    }

    private static void negatifpozitif(int sayi) {
        System.out.println(sayi>0&&sayi!=0?"pozitif":"negatif");

    }
}