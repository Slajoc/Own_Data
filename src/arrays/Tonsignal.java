package arrays;

import java.io.IOException;

public class Tonsignal {
	final static boolean debug = true;
	static double[] array = null;

	public static void array() {
		array = new double[12];
		array[0] = 1;
		array[1] = 5;
		array[2] = 4;
		array[3] = 5;
		array[4] = 7;
		array[5] = 6;
		array[6] = 8;
		array[7] = 6;
		array[8] = 5;
		array[9] = 4;
		array[10] = 5;
		array[11] = 4;
	}

	public static void main(String[] args) throws IOException {
		double[] arrayN = new double[12];

		if (!debug) {
			array = IOClass.IO.doubleArrayEinlesen(0);
		} else {
			array();
		}

		arrayN[0] = (array[0] + array[1]) / 2;
		arrayN[array.length-1] = (array[array.length-1] + array[array.length-2]) / 2;

		for(int i = 1; i < array.length-1; i++){
			arrayN[i] = (array[i] + array[i+1] + array[i-1]) /3;
		}

		System.out.print("Ursprungssignal: \n");
		for(int i = 0; i < array.length; i++){
			System.out.print((int) array[i] +"  ");
		}

		System.out.print("\nGeglättetes Signal: \n");
		for(int i = 0; i < array.length; i++){
			System.out.print((int) arrayN[i] +"  ");
		}

	}

}