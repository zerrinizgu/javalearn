package ch10_methodCreation.tasks10;

import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {

    /*
    Fazla mesaiyi hesaplayan bir  method create ediniz
    Yazacağınız program toplam kazancı return etsin.

    Kullanıcıdan saatlik çalışma ücretini, hangi saatler arasında çalıştığını ve
    fazla mesaiye kalırsa kazancını kaç ile katlayacağını alalım.

    Daha sonra şu şekilde bir program yazınız :

    Örnek :
    saatlik çalışma ücreti : 40.0
    hangi saat başladı : 9.0
    hangi saat bitti : 20.0
    mesaiyi kaçla katlayacağız : 1.8

    ucretHesapla(9.0,20.0,40.0,1.8);

    9 ile 17 arasında toplam çalışma 8 saat olduğu için 8 x 40 = 320
    17 ile 20 arasında toplam çalışma 3 saat olduğu için 3 x 40 x 1.8 =  216

    toplam = 536.0
    */
        fazlamesai();
        toplamkazanc();

    }

    private static void toplamkazanc() {
    }

    private static void toplamkazanc( double birimUcret, double baslamaSaati,double bitissaati,double fazlaMesaiCarpani) {
        int mesai= (int) (bitissaati - baslamaSaati);
        double toplamkazanc = (mesai >= 8) ? (8 * birimUcret + ((mesai) - 8) * 40 * fazlaMesaiCarpani) : mesai * birimUcret;
        System.out.println("ToplamKazanc = " + toplamkazanc);

    }

    private static void fazlamesai() {
        Scanner input = new Scanner(System.in);
        System.out.println("saatlik calisma ucretini giriniz");
        double birimUcret = input.nextDouble();
        System.out.println("ise baslama saati girin");
        double baslamaSaati = input.nextDouble();
        System.out.println("bitis saati girin");
        double bitissaati = input.nextDouble();
        System.out.println("fazla mesai carpani girin");
        double fazlaMesaiCarpani = input.nextDouble();

        toplamkazanc( birimUcret,  baslamaSaati, bitissaati,fazlaMesaiCarpani);
    }


}
