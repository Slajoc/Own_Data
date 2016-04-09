package arrays;

import java.util.Scanner;

public class FestesArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[] = new int[5];
		
		for(int i = 0; i < array.length; i++){
			System.out.print("Zahl " +i +": ");
			int zahl = sc.nextInt();
			array[i] = zahl;		
		}
		
		for(int i = 0; i < array.length; i++){
			System.out.println(array[i]);
		}

	}

}
