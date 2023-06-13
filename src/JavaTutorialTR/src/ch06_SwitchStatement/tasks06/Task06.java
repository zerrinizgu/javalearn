package JavaTutorialTR.src.ch06_SwitchStatement.tasks06;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args)


    {
        // kullanicidan VIP (Very Important Person) kisaltmasinda hangi harfin anlamini
        // istedigi soralim
        // girilen harfin aciklamasini yazdiralim

        Scanner input = new Scanner(System.in);
        System.out.println("\"VIP\"kisaltmasinda hangi harfin anlamini istiyorsunuz:");
        char ch = input.nextLine().toLowerCase().charAt(0);
        switch (ch) {
            case 'v':
                System.out.println("verry");
                break;
            case 'i':
                System.out.println("important");
                break;
            case 'p':
                System.out.println("person");
                break;
            default:
                System.out.println("yanlis karakter girdiniz");
        }
    }
}
