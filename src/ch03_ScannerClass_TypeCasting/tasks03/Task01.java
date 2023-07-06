package ch03_ScannerClass_TypeCasting.tasks03;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /* TASK->
		 Ask user to enter mid-term grade, final grade, and project grade
		 Calculate the general grade (mid-term : 30% , project : 20%, final : 50%)

		  Example:
		      INPUT: mid-term grade=78
		      		 final grade = 66
		      		 project grade = 90
		      OUTPUT: "Your grade is : 81,6"

		 */
        Scanner input = new Scanner(System.in);
        System.out.println("mid-term grade");
        int midTerm = input.nextInt();
        System.out.println("project");
        int project = input.nextInt();
        System.out.println("final grade");
        int grade = input.nextInt();
        double result = midTerm * 0.3 + project * 0.2 + grade * 0.5;
        System.out.println(result);


    }
}
