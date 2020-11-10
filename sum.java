package arrayLargest;

import java.util.Scanner;


public class sum {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter five numbers: ");

		double[] arr = new double[5];
		double sum = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextDouble();
			sum += arr[i];
		}
		
		System.out.printf("Sum: %.2f%n",sum);


	}

}
