package JavaTutorialTR.src.ch05_ifStatement_TernaryOperator.tasks05;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
     //  x = str(input("taş,kağıt,makas")).lower()
     //  y = str(input("taş,kağıt,makas")).lower()

     //  if x == y :
     //  print("berabere")
     //  else if x == "taş" and y== "kağıt":
     //  print("kazanan:y")
     //  else if x == "kağıt" and y == "taş":
     //  print("kazanan: x")
     //  else if x == "makas" and y=="kağıt":
     //  print("kazanan: x")
     //  else if y == "makas" and x== "kağıt":
     //  print("kazanan: y")
     //  else if y== "makas" and x=="taş":
     //  print("kazanan: x")
     //   else
     //  print("sizden istenen ifadelerden birini giriniz")
        Scanner input = new Scanner(System.in);
        System.out.println("x oyuncusunun secimi:(tas,kagit,makas)");
        String x=input.nextLine().toLowerCase();
        System.out.println("y oyuncusunun secimi:(tas,kagit,makas)");
        String y=input.nextLine().toLowerCase();
        if (x.equalsIgnoreCase(y)){
            System.out.println("berabere");
        } else if (x.equals("tas") && y.equals("kagit")){
            System.out.println("kazanan:y");
        } else if (x.equals("kagit") && y.equals("tas")){
            System.out.println("kazanan: x");
        } else if (x.equals("makas") && y.equals("kagit")){
            System.out.println("kazanan: x");
        }else if (y.equals("makas") && x.equals("kagit")){
            System.out.println("kazanan: y");
        }else if ( y.equals("makas") && x.equals("tas")){
            System.out.println("kazanan: x");

        }else{
            System.out.println("sizden istenen ifadelerden birini giriniz");

        }
        input.close();
    }
}
