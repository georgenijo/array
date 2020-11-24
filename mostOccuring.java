package myArrays;

import java.util.*;
import java.io.*;

public class mostOccuring {

	public static void main(String[] args) {
		int num[] = {4, 5, 9, 12, 9, 22, 45, 7};
		int size = num.length;
		int counter = 0;
		int most = 0;
		int moccur = 0;

		for (int i = 0; i < size; i++) {
			counter = 0;
			for (int j = 0; j < size; j++) {
				if (num[i] == num[j]) {
					counter++;
					//System.out.println("counter: " + counter);

				}
				if (counter > most) {
					//System.out.println("counter in 2nd loop: " + counter);
					most = counter;
					moccur = num[i];
					//System.out.println("most: " + most);
				}

			}
		}
		System.out.println(moccur);
	}

}
