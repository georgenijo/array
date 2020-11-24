package myArrays;

import java.util.*;
import java.io.*;

public class twoGreaterElements {

	public static void main(String[] args) {
		int[] num = { 10, 20, 21, 22, 23 };
		int size = num.length;
		int counter = 0;
		int temp = 0;
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}

		
		for (int i = 0; i < size; i++) {
			counter = 0;
			for (int j = 0; j < size; j++) {
				if (num[j] > num[i]) {
					counter++;
				}
			}
			if (counter >= 2) {
				System.out.print(num[i] + " ");
			}
		}

	}
}
