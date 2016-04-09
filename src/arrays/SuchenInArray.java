package arrays;

import java.util.Scanner;

public class SuchenInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double array[] = new double[5];

		for(int i = 0; i < array.length; i++){
			System.out.print("Zahl " +i +": ");
			double zahl = sc.nextDouble();
			array[i] = zahl;		
		}

		System.out.print("\nNach welcher Zahl wollen sie suchen: ");
		double zahl = sc.nextDouble();

		for(int i = 0; i < array.length; i++){
			if(zahl == array[i]) {
				System.out.println("Treffer");
			} else {
				System.out.println("Niete");
			}
		}

	}

}
