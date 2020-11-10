package arrayLargest;

import java.util.Scanner;

public class kLargest {

	public static final int arr[] = {4, 5, 9, 12, 9, 22, 45, 7};

	public static void main(String[] args) {

		sort();
		System.out.print("Sorted Array:");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		largest();

	}

	public static void largest() {
		int size = arr.length - 1;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter K:");
		int count = input.nextInt();
		int start = 0;
		System.out.print("Largest "+ count + " Elements: ");
		while (start < count) {
			System.out.print(arr[size] + " ");
			size--;
			start++;
		}

	}

	public static void sort() {

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}
		}

	}
}
