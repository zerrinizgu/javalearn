package ch08_Loops.Tasks08_forLoop.Tasks08_whileLoops;

public class Task04 {

	public static void main(String[] args) {
		/*
		task->  3 basamakli 4 ve 6 ya tam bolunebilen tam sayilari buyukten kucuge ve kaç tane oldugunu print eden code create ediniz.

		 */
		int sayiadedi = 0;

		System.out.println("3 basamaklı, 4 ve 6'ya tam bölünebilen sayılar:");

		for (int i = 999; i >= 100; i--) {
			if (i % 4 == 0 && i % 6 == 0) {
				System.out.println(i);
				sayiadedi++;
			}
		}

		System.out.println("Toplam sayı adedi: " + sayiadedi);
		
		//int i=999;
	//	int sayac=0;
		//while ((i>=100)){
//if(i%4==0&&i%6==0) {
	//System.out.println(i+" ");
		//	sayac++;

}


//i--;
		}
	//System.out.println("kac adet sayi"+sayac);
		
			



