package JavaTutorialTR.src.ch06_SwitchStatement.tasks06;

import java.util.Scanner;

public class Task_SeyahatProjesi {

    public static void main(String[] args) {

        /*
        bulundugunuz yerden, bir yere yolculuk edeceksiniz.

        1. Köln veya Frankfurta gidebilirsiniz.
        2. Bilet fiyatı hesabı = Her 20 Km başına 5 euro. örn: (100 km yol. Bilet parası  (100/20)* 5 =25 euro

todo İPUCU:  toplamTutar, işlem, FrankfurtKm, KmBirimFiyat   gibi sabit veri tipleri oluşturabilirsiniz.
 İşlemlerde direkt bunları cağırabilirsiniz.

        todo İLK OLARAK;

   "Nereye yolculuk etmek istiyorsunuz?
   (Frankfurt : 60 KM          ---         Köln : 80 KM ---       (20 KM başına 5 euro bilet parası alınmaktadir..)
      yazısı gelsin.

    1.    Frankfurt veya Köln olarak bir giriş yapın. (Girdiğiniz sehrin harfleri , girildikten sonra büyük hale gelsin.

   todo    Frankfurt girildiyse,
        örn: girdi= Frankfurt
                case=FRANKFURT:

      Rota = Frankfurt yazdırın.
      Frankfurt km hesabı işlemi yapın.

      son olarak konsolda: Frankfurt 15 Euro         yazsın.
      todo  case: KÖLN ise

      "Rota = Köln" yazdırın.
       km hesabına göre işlemi yapınız.

       son olarak konsolda:  Köln   20 Euro             yazsın.
2.  Sistem bize "Kaç kişilik bilet istiyorsunuz? (Max 2 kişilik olabilir):   "   sorusunu sorsun.
case:1  ise
        " 1 kişilik " yazdırın. (1 kişilik seçerseniz bir işlem yapmanıza gerek kalmaz,
         bilet ücreti yukarıda çoktan belirlenmiş olur.)
case:2 ise
 "2 kişilik " yazdırın
        2 kişi için bilet fiyatını hesaplayın.
 todo  Son olarak yolculugunuzu check edin;
 konsolda örn:   Frankfurt  - 2 Kişilik    yazsın.
  1.Bakiyemi belirtin.
        2.Toplam Tutarı belirtin.
        3.double paraUstu oluşturun ve hesaplayın.
        4.Double para üstünü yazdırın.

         */
        Scanner input = new Scanner(System.in);
        System.out.println("nereye yolculuk yapmak istiyorsun:(Frankfurt : 60 KM --- Köln : 80 KM ---(20 KM başına 5 euro bilet parası alınmaktadir..)");
        String sehir = input.nextLine().toUpperCase();
        System.out.println("sehir = " + sehir);
        System.out.println("bakiyenizi girin");
        int bakiye=input.nextInt();
        System.out.println("bakiye = " + bakiye+"euro");

        switch (sehir) {
            case "FRANKFURT":

                System.out.println("rotaniz FRANKFURT");
                double toplamTutarFrankfurt = (60 / 20) * 5;
                System.out.println("toplamtutar=" + (60 / 20) * 5 + "euro");
                double paraustu=bakiye-toplamTutarFrankfurt ;
                System.out.println("paraustu = " + paraustu+"euro");
                System.out.println("kac kisilik bilet aliyorsunuz:(Max 2 kişilik olabilir):");
                int biletKisiSayisi = input.nextInt();
                System.out.println("biletKisiSayisiFrankfurt = " + biletKisiSayisi);

                if (biletKisiSayisi == 1){
                    System.out.println("1 kişilik seçerseniz bir işlem yapmanıza gerek kalmaz,\n" +
                            "         bilet ücreti yukarıda çoktan belirlenmiş olur");
                    System.out.println("FRANKFURTA 1 kisilik bilet aliyorsun");

                } else{
                    System.out.println("2 kisilik ");
                    double toplamTutarFrankfurt2 =2* (60 / 20) * 5;
                    System.out.println("toplamTutarFrankfurt2 = " + toplamTutarFrankfurt2);
                    System.out.println("toplamtutarfrankfurt2=" + 2 * (60 / 20) * 5 + "euro");
                    double paraustu2=bakiye-toplamTutarFrankfurt2 ;
                    System.out.println("paraustu2 = " + paraustu2+"euro");

                    System.out.println("FRANKFURTA 2 kisilik bilet aldiniz");
                }
                break;
            case "KOLN":
                System.out.println("rotaniz KOLN");
                double toplamtutarkoln1=(80 / 20) * 5 ;
                System.out.println("toplamtutarkoln1=" + (80 / 20) * 5 + "euro");
                double paraustukoln1=bakiye-toplamtutarkoln1;
                System.out.println("toplamtutarkoln1 = " + toplamtutarkoln1);
                System.out.println("paraustukoln1 = " + paraustukoln1+"euro");
                System.out.println("kac kisilik bilet aliyorsunuz:(Max 2 kişilik olabilir):");
                int biletKisiSayisi2 = input.nextInt();
                System.out.println("biletKisiSayisikoln2 = " + biletKisiSayisi2);
                if (biletKisiSayisi2 == 1){
                    System.out.println("1 kişilik seçerseniz bir işlem yapmanıza gerek kalmaz,\n" +
                            "         bilet ücreti yukarıda çoktan belirlenmiş olur");

                    System.out.println("KOLNE 1 kisilik bilet aliyorsun");
                } else{

                    System.out.println("KOLNE 2 kisilik bilet aldiniz");
                    double toplamtutarkoln2=2 * (80 / 20) * 5;
                    System.out.println("toplamtutarkoln2 = " + toplamtutarkoln2);
                    System.out.println("toplamtutar=" + 2 * (80 / 20) * 5 + "euro");
                    double paraustu4=bakiye-toplamtutarkoln2 ;
                    System.out.println("paraustu4 = " + paraustu4+"euro");
                    System.out.println("KOLNE 2 kisilik bilet aldiniz");
                }
                break;
        }



    }
}
