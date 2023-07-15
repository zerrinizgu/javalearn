package ch21_StaticKeyword;

public class C01_OgretmenRunner {
    public static void main(String[] args) {
    C01_Ogretmen.okul="tayyar mehmet okulu";

    C01_Ogretmen ogretmen=new C01_Ogretmen("mustafa bey",35);
        System.out.println("ogretmen = " + ogretmen);
        System.out.println("ogretmen.isim = " + ogretmen.isim);
        System.out.println("ogretmen.tecrube = " + ogretmen.tecrube);
        System.out.println("C01_Ogretmen.okul = " + C01_Ogretmen.okul);


        C01_Ogretmen.okul="YILDIZ TEKNIK okulu";

        C01_Ogretmen ogretmen2=new C01_Ogretmen("mustafa bey",35);

        System.out.println("ogretmen = " + ogretmen2);
        System.out.println("ogretmen.isim = " + ogretmen2.isim);
        System.out.println("ogretmen.tecrube = " + ogretmen2.tecrube);
        System.out.println("C01_Ogretmen.okul = " + C01_Ogretmen.okul);

C01_Ogretmen.maasHesapla();
ogretmen2.evlilikYilDonumu();














    }
}
