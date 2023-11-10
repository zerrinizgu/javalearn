package ch27_Abstraction.task27.Ornek2;

import java.time.LocalDate;

public class Kartal extends Hayvan {

    public Kartal(int id, String name, boolean vahsi, LocalDate dogumTarihi, String yiyecek, int yemekMiktari, int gunlikUykuSuresi, String ses) {
        super(id, name, vahsi, dogumTarihi, yiyecek, yemekMiktari, gunlikUykuSuresi, ses);
    }

    @Override
    public int getId() {
        return super.getId();
    }
}
