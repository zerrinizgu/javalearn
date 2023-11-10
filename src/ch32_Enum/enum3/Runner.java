package ch32_Enum.enum3;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {

    Kitap kitap1=new Kitap();
kitap1.name="Sefiller";
kitap1.kategori=Kategori.FANTEZI;

Kitap kitap2=new Kitap();
kitap2.name="Calikusu";
kitap2.kategori=Kategori.TARIH;
Kitap kitap3=new Kitap();
kitap3.name="Suc ve Ceza";
kitap3.kategori=Kategori.KLASIK;
        ArrayList<Kitap>kitapList=new ArrayList<>();
kitapList.add(kitap1);
kitapList.add(kitap2);
kitapList.add(kitap3);

        for (Kitap each:kitapList
             ) {
           if (each.kategori.equals(Kategori.KLASIK))
               System.out.println(each);
        }



    }
}
