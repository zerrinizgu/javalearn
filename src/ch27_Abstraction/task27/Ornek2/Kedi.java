package ch27_Abstraction.task27.Ornek2;

import java.time.LocalDate;

public class Kedi extends Hayvan {


    public Kedi(int id, String name, boolean vahsi, int dogumTarihi, String yiyecek, int yemekMiktari, int gunlikUykuSuresi, String ses) {
        super(id, name, vahsi, LocalDate.ofEpochDay(dogumTarihi), yiyecek, yemekMiktari, gunlikUykuSuresi, ses);
    }
}
