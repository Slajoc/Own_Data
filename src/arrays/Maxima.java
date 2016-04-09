package arrays;

import java.util.Arrays;
import java.util.Scanner;

import IOClass.IO;

public class Maxima {

	public static void main(String[] args) {
		double max1 = 0;
		double max2 = 0;
	
		double[] array = IO.doubleArrayEinlesen(0);
		
		//Methode 1
		Arrays.sort(array);
		max1 = array[array.length-1];
		max2 = array[array.length-2];
		System.out.print("Die größte Zahl lautet " +max1 +" und die zweit größte " +max2);
		
		//Methode 2
		max1 = array[0];
		max2 = array[1];
		for(int i = 0;i < array.length;i++) {
			if(array[0] > max1) {
				max2 = max1;
				max1 = array[i];
			}
		}
		
		
		System.out.print("Die größte Zahl lautet " +max1 +" und die zweit größte " +max2);

	

	}

}
