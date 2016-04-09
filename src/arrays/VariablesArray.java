package arrays;

import java.util.Scanner;

public class VariablesArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Wie lang soll der Array sein: ");
		int length = sc.nextInt();
		int array[] = new int[length];
		
		for(int i = 0; i < array.length; i++){
			System.out.print("Zahl " +i +": ");
			int zahl = sc.nextInt();
			array[i] = zahl;		
		}
		
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i]);
		}

	}

}
