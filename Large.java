package arrayLargest;

import java.util.Scanner;

public class Large {

	public static void main(String[] args) {		
		
		int arr[] = { 10, 324, 45, 90, 9808 };
		int answer = large(arr);
		System.out.println("Largest is in the array is " + answer);
	}

	public static int large(int[]a) {
		int temp = a[0];
	
		for (int i = 1; i < a.length; i++)
			if (a[i] > temp)
				temp = a[i];
		return temp;
	}

}
