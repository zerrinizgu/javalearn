package JavaTutorialTR.src.ch07_StringManipulations.tasks07;

public class Task04 {
    public static void main(String[] args) {

        /*
         Task->
         Girilen iki kelimeden ilki çift sayıda kaqrakter içeriyorsa 2. kelimeyi 1. kelimenin ortasına print eden
         ilk kelime tek sayıda karakter içeriyorsa "kelime2 kelime1 eklenemez" print eden code create ediniz
         name1= mehmet
         name2= ahmet
         Print ==> mehahmetmet
         */
        String name1 ="mehmet";
        String name2 ="ahmet";
int uzunluk=name1.length();
if(uzunluk%2==0)
    System.out.println(name1.substring(0, uzunluk/2)+name2+name1.substring(uzunluk/2));


else
    System.out.println("eklenemez");
}



    }

