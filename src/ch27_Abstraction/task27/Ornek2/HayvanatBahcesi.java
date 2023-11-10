package ch27_Abstraction.task27.Ornek2;

public class HayvanatBahcesi {
    public static void main(String[] args) {
Kedi kedi=new Kedi(122, "minnos", true,2016,
        "mama",3, 2, "miyav");
kedi.getDogumTarihi();
        System.out.println(kedi.getGunlikUykuSuresi());
        System.out.println(kedi.getYemekMiktari());
        System.out.println(kedi.getName());

    }
}
