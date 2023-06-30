package j100_CodeChallange.Challange08;


public class Task03 {

    public static void main(String[] args) {
        /* task->
         *(String iniz: "HeySiri"  Diziyi "ByeSiri" ye cevirin )
         *
         */
        System.out.println("HeySiri".replace("Hey","Bye"));
String arr[] ="HeySiri".split("y");
arr[0] ="Bye";
        System.out.println("(arr[0]+arr[1]) = " + (arr[0] + arr[1]));


    }
}
