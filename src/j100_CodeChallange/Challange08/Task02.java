package j100_CodeChallange.Challange08;

public class Task02 {
    public static void main(String[] args) {
        /* task->
         * dizi elemanlarinin ortalama degerini hesaplayan ve
         * ortalamadan buyuk olan elemanlari print eden code create ediniz.
         * input[]= {1,2,3,4,5,6,7}
         * Output1 : 4
         * Output2 : 5,6,7
         */

        int arr [] = {1,2,3,4,5,6,7};
        int toplam=0;
        for (int i = 0; i < arr.length ; i++) {
           toplam+= arr[i];


        }
        System.out.println("toplam = " + toplam);
        System.out.println("ortalama = " + toplam/ arr.length);
        for (int i = 0; i <arr[i] ; i++) {
            if(arr[i]>toplam/arr.length){
                System.out.println("arr[i] = " + arr[i]);
            }
        }
    }
}
