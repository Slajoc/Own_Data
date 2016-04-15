package de.szut.dqm15.schulze.till.Lagerbestand;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Lagerbestand {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		int counter = 0;
		double money = 0;
		DecimalFormat digits = new DecimalFormat("#0.00");
		
		System.out.println("Wie viele unterschiedliche Artikel haben Sie im Lager?");
		int anzahl = Integer.parseInt(br.readLine());
		
		String articles[] = new String[anzahl];
		double amount[] = new double[anzahl];
		double prices[] = new double[anzahl];
			
		System.out.println("Erfassen Sie die einzelnen Artikelbezeichnungen:");
		for(int i = 0; i < anzahl; i++) {
			articles[i] = br.readLine();
		}
		
		System.out.println("Erfassen Sie jetzt den Einzelpreis jedes Artikels:");
		for(int i = 0; i < anzahl; i++) {
			System.out.print("Preis des Artikels '" + articles[i] + "':");
			prices[i] = Double.parseDouble(br.readLine().replace(',', '.'));
		}
		
		System.out.println("Erfassen Sie jetzt die Anzahl der einzelnen Artikel:");
		for(int i = 0; i < anzahl; i++) {
			System.out.print("Menge des Artikels '" + articles[i] + "':");
			amount[i] = Double.parseDouble(br.readLine());
		}
		
		for(int j = 0; j < anzahl; j++) {
			counter += amount[j];
			
			money += prices[j] * amount[j];
		}
		
		System.out.println("In Ihrem Lager befinden sich insgesamt " + counter
				+ " Artikel im Wert von " + digits.format(money) + " €.");
	}
}