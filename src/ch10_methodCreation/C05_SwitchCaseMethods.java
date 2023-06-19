package ch10_methodCreation;

import java.util.Scanner;

import static ch10_methodCreation.C05_Crud.*;

public class C05_SwitchCaseMethods {
//karsilama method u yazalaim
//karsilama method u yazalaim

    public static void menu() {
        System.out.println("sistemimize hosgeldin");
        System.out.println("uygulamaya kayit olmak icin 1  \nkullanici sorgulamak icin 2  \n" +
                "kullanici bilgi guncelleme icin 3   \nkullanici silme icin 4  \ncikis islemler icin 5 e basiniz");

        Scanner in = new Scanner(System.in);
        int secim = in.nextInt();

        switch (secim) {
            case 1:
                createUser();
                menu();
                break;
            case 2:
                getUser();
                menu();
                break;
            case 3:
                updateUser();
                menu();
                break;
            case 4:
                deleteUser();
                menu();
                break;
            case 5:
                cikis();
                break;
            default:
                System.out.println("hatali bir secim yaptiniz");
                menu();
                break;


        }











        }






}
