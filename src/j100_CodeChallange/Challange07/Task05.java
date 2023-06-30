package j100_CodeChallange.Challange07;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        // task->
        //Kullaniciya kac sayi toplamak istedigini sorun.
        //Kullanici 2,3 veya 4 degerini girerse, kullanicidan bu sayilari girmesini isteyin ve sayilarin toplamini yazdiriniz.
        //Kullanici toplamak istedigi sayi adedini 4'den buyuk girerse "cok sayi girdiniz, ben toplayamam" yazdiriniz.
        //2'den kucuk bir sayiyi girerse "En az 2 sayi girmelisiniz" yazdiriniz
        Scanner input = new Scanner(System.in);
        System.out.println("kac sayi toplamak istersin");
        int sayiadedi = input.nextInt();
        if (sayiadedi < 2) {
            System.out.println("en az 2 sayi girmelisin");

        } else if (sayiadedi == 2) {
            System.out.println("1.sayi gir");
            int sayi1=input.nextInt();
            System.out.println("2.sayi gir");
            int sayi2=input.nextInt();
            System.out.println("sayiTopla(sayi1, sayi2) = " + sayiTopla(sayi1, sayi2));
        } else if (sayiadedi == 3) {
            System.out.println("1.sayi gir");
            int sayi1=input.nextInt();
            System.out.println("2.sayi gir");
            int sayi2=input.nextInt();
            System.out.println("3.sayi gir");
            int sayi3=input.nextInt();
            System.out.println("sayiTopla(sayi1,sayi2,sayi3) = " + sayiTopla(sayi1, sayi2, sayi3));
        } else if(sayiadedi == 4){
                System.out.println("1.sayi gir");
            int sayi1=input.nextInt();
            System.out.println("2.sayi gir");
            int sayi2=input.nextInt();
            System.out.println("3.sayi gir");
            int sayi3=input.nextInt();
            System.out.println("3.sayi gir");
            int sayi4=input.nextInt();
            System.out.println("sayiTopla(sayi1,sayi2,sayi3,sayi4) = " + sayiTopla(sayi1, sayi2, sayi3, sayi4));
        } else
        System.out.print("cok sayi girdiniz ben toplayamam");
}

    private static int sayiTopla(int sayi1, int sayi2, int sayi3, int sayi4) {
        return (sayi1+sayi2+sayi3+sayi4);
    }

    private static int sayiTopla(int sayi1, int sayi2, int sayi3) {
        return (sayi1+sayi2+sayi3);
    }

    private static int sayiTopla(int sayi1, int sayi2) {
       return (sayi1+sayi2);
    }


}
