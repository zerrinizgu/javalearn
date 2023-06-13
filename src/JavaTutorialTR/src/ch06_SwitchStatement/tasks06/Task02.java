package JavaTutorialTR.src.ch06_SwitchStatement.tasks06;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        // Kullanıcının yasadıgı güne  göre 100 gün sonra hangi gün olduğunuz yazdırınız.
        // pazartesi hafta başlangıcı
        Scanner input =new Scanner(System.in);
        System.out.println("kacinci gundesiniz:");
        System.out.println("pazartesi:1\nSali:2\nCarsamba:3\nPersembe:4\nCuma:5\nCumartesi:6\nPazar:7\n");
        int gun= input.nextInt();
        gun= (gun+100)%7;
        switch (gun){
case 1:
    System.out.println("pazartesi:");
    break;
    case 2:
    System.out.println("sali:");
    break;
    case 3:
    System.out.println("carsamba:");
    break;
    case 4:
    System.out.println("persembe:");
    break;
    case 5:
    System.out.println("cuma:");
    break;
    case 6:
    System.out.println("cumartesi:");
    break;
    case 0:
    System.out.println("pazar:");
    break;























        }
    }
}

