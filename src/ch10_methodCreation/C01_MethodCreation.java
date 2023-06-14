package ch10_methodCreation;

public class C01_MethodCreation {
    public static void main(String[] args) {
/*
    code okunabilirliği ve sadeliği için sürekli kullanılan aksiyonlar için method create edip
    main method'a call edip run etmek uygulamanın test edilmesi maintanance ve reusable açısından tercih edilir
    1) Java method'larin sadece name  değil  name + parametre'lere göre run eder
    parametre sayisi, parametre'lerin data tiplerin ve parametrelerin sırası methodu belirler.

    str.endsWith("el");   Bu method'un gorevi gidip kelimenin son kismini kontrol etmek
                          bu method'u kullanmak icin bu method'un kontrol ettikten sonra
                          bana rapor olarak ne getirdigini bilmem lazim (true/false)

    2) Bir method create edildiğinde  method'un aksiyonuna ve aksiyon çıktısı da method içinde create edilir

    3) Bir method olusturulurken  " str.indexOf(String str, int fromIndex) "
       de oldugu gibi
       disaridan kabul edecegi parametreleri ve bu parametrelerin data tiplerini
       deklare edilmeli

       method call edildiğinde  Parametre olarak
       declare edilen data tiplerine uygun value'ler (ARGUMENT)  girilmeli.
*/
        System.out.println("metot creation basliyor");
         topla();

//task:2 tane int deger alan toplayip return eden method create ediniz
        System.out.println("topla2(55,72) = " + topla2(55, 72));
int sonuc=topla2(33,22);
        System.out.println("sonuc = " + sonuc);
        int a=21;
        int b=34;
        System.out.println("topla2(a,b) = " + topla2(a, b));
topla3();

    }//main sonu

    private static void topla3() {//intellij e create ettirilen method
        int a=55;
        int b=9;
        System.out.println(a+b );
        System.out.println("topla 3");
topla();//method call edildi

    }

    public static int topla2(int sayi1,int sayi2){//task01 deki metot create edildi
        int toplam=sayi1+sayi2;
        return toplam;//en son kod olmali

    }
    private static void topla() {
        System.out.println("ilk create ettigimiz metot");
        int i = 55;
        int j =44;
        System.out.println(i+j);
        System.out.println("topla isimli metot calisti");

    }
}
