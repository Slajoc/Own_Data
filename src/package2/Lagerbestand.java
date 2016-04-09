package package2;

import java.io.IOException;
import IOClass.IO;

public class Lagerbestand {

	public static void main(String[] args) throws IOException {
		System.out.print("Wie viele Artikel wollen sie einlagern: ");
		int n = IO.readInt(0), toCount = 0;
		double toPrice = 0;
		String[] arr = new String[n];
		Double[] price = new Double[n];
		int[] count = new int[n];

		for(int i = 0;i < arr.length;i++) {
			i++;
			System.out.print("\nArtikel " +i +": ");
			arr[i-1] = IO.readString();
			i--;
			System.out.print("Preis des des Artikels: ");
			price[i] = IO.readDouble();
			System.out.print("Mänge des Artikels: ");
			count[i] = IO.readInt(0);
			toPrice += price[i];
			toCount += count[i];
		}
		
		System.out.println("\nGesammtpreis: " +toPrice);
		System.out.println("Gesammtanzahl der Artikel: " +toCount);
		
	}

}
