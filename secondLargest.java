package arrayLargest;

public class secondLargest {

public static final int arr[] = { 10, 324, 45, 90, 9808 };
	
	public static void main(String[] args) {
		
		sort();
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		largest();
	
	}

	public static void largest() {
		int size = arr.length - 2;
		System.out.println();
		System.out.println(arr[size]+" ");
		
	}
	public static void sort () {
		
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
