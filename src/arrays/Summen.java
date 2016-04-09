package arrays;

import IOClass.IO;

public class Summen {

	public static void main(String[] args) {
		int countG = 0;
		int countU = 0;
		int sumG = 0;
		int sumU = 0;

		int array[] = IO.intArrayEinlesen(0);

		for(int i = 0; i < array.length; i++){
			if(array[i] % 2 == 0){
				countG++;
				sumG += array[i];
			} else {
				countU++;
				sumU += array[i];
			}
		}

		System.out.print("Gerade Zahlen: ");
		System.out.println(countG +"\nSumme: " +sumG);

		System.out.print("\nUngerade Zahlen: ");
		System.out.println(countU +"\nSumme: " +sumU);
	}
}
