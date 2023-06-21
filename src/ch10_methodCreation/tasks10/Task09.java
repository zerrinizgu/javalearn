package ch10_methodCreation.tasks10;


import static ch10_methodCreation.tasks10.Task01.input;

public class Task09 {

    public static void main(String[] args) {

    /*
    Saati saniyeye çeviren  method create ediniz

    Test Data:
    howManySeconds(2);
    Beklenen çıktı:
     7200
    */
saat();
    }
    private static int saat() {
        System.out.println("saat gir");
        int saat=input.nextInt();
        System.out.println("saat=" + saat*3600);
        return saat;



    }
}
