package arrays;

import java.util.Scanner;

public class VariablesArrayMethoden {

	static Scanner sc = new Scanner(System.in);
	static int array[] = null;
	static int length;

	public static void main(String[] args) {
		array = einlesen(array);
		ausgeben();
	}

	public static int[] einlesen(int array[]) {
		System.out.print("Wie lang soll der Array sein: ");
		length = sc.nextInt();
		array = new int[length];
		for(int i = 0; i < array.length; i++){
			System.out.print("Zahl " +i +": ");
			int zahl = sc.nextInt();
			array[i] = zahl;
		}
		return array;

	}

	public static void ausgeben() {
		for(int i = 0; i < length; i++){
			System.out.print(array[i]);

		}

	}

}