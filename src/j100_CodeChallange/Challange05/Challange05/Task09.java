package j100_CodeChallange.Challange05.Challange05;

public class Task09 {
    public static void main(String[] args) {
        /*
    Task-> 11'den 120'ye kadar 4 ve 6 ya tam bölünebilen sayı adedini ve toplamlarını print eden code create ediniz.
     */

        int sayiAdedi=0;
        int toplam=0;
        for (int i = 11; i <=120 ; i++) {
            if (i%4==0&&i%6==0) {
                sayiAdedi++;
                toplam+=i;
                System.out.println(i+" ");
            }

        }
        System.out.println(sayiAdedi);
        System.out.println(toplam );


    }
}
