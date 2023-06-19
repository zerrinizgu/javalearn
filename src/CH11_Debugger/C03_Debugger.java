package CH11_Debugger;

public class C03_Debugger {
    static int count=7;
    public static void main(String[] args) {
        method01();


    }

    private static void method01() {
        System.out.println("***** method1 calisiyor *****");
        int a=0;
        count++;

        for (int i = 0; i <=10 ; i++) {
            System.out.println(i+" ");
            a+=2*i;

        }
        System.out.println();
        System.out.println("****method2 call ediliyor *****");

    }
    private static void method2() {
        System.out.println("***metot 02 calisuiyor *****");
        count+=5;
method2();
        for (int x = 0;  x<7 ; x++) {
            System.out.println(x+" ");
        }
        System.out.println();

    }



}
