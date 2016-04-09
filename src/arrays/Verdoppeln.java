package arrays;

import java.util.Scanner;

public class Verdoppeln {

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
		
		System.out.print("Uhrsprüngliches Array: ");
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] +" ");
		}
		
		System.out.print("\nNeues Array: ");
		for(int i = 0; i < array.length; i++){
			array[i] = array[i] *2;
			System.out.print(array[i] +" ");
		}

	}

}
