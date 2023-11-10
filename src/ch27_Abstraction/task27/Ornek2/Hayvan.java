package ch27_Abstraction.task27.Ornek2;


import java.time.LocalDate;

public abstract class Hayvan {
private int id;
private String name;
private boolean vahsi;
private LocalDate dogumTarihi;
private String yiyecek;
private int yemekMiktari;
private int gunlikUykuSuresi;
private String  ses;

    public Hayvan(int id, String name, boolean vahsi, LocalDate dogumTarihi, String yiyecek, int yemekMiktari, int gunlikUykuSuresi, String ses) {
        this.id = id;
        this.name = name;
        this.vahsi = vahsi;
        this.dogumTarihi = dogumTarihi;
        this.yiyecek = yiyecek;
        this.yemekMiktari = yemekMiktari;
        this.gunlikUykuSuresi = gunlikUykuSuresi;
        this.ses = ses;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVahsi() {
        return vahsi;
    }

    public void setVahsi(boolean vahsi) {
        this.vahsi = vahsi;
    }

    public LocalDate getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(LocalDate dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    public String getYiyecek() {
        return yiyecek;
    }

    public void setYiyecek(String yiyecek) {
        this.yiyecek = yiyecek;
    }

    public int getYemekMiktari() {
        return yemekMiktari;
    }

    public void setYemekMiktari(int yemekMiktari) {
        this.yemekMiktari = yemekMiktari;
    }

    public int getGunlikUykuSuresi() {
        return gunlikUykuSuresi;
    }

    public void setGunlikUykuSuresi(int gunlikUykuSuresi) {
        this.gunlikUykuSuresi = gunlikUykuSuresi;
    }

    public String getSes() {
        return ses;
    }

    public void setSes(String ses) {
        this.ses = ses;
    }

    @Override
    public String toString() {
        return "Hayvan{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", vahsi=" + vahsi +
                ", dogumTarihi=" + dogumTarihi +
                ", yiyecek='" + yiyecek + '\'' +
                ", yemekMiktari=" + yemekMiktari +
                ", gunlikUykuSuresi=" + gunlikUykuSuresi +
                ", ses='" + ses + '\'' +
                '}';
    }
}
