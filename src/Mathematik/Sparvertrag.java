package Mathematik;

import java.util.Scanner;

public class Sparvertrag {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double capital = 0;
		double yearEnd = 0;
		int time = 0;
		double percentage = 0;
		double interestAmount = 0;

		System.out.print("Bitte Anfangskapital eingeben: ");
		capital = sc.nextDouble();

		System.out.print("Bitte den Zinssatz eingeben: ");
		percentage = sc.nextDouble();

		System.out.print("Bitte die Laufzeit in Jahren eingeben: ");
		time = sc.nextInt();

		System.out.println("\nJahr \tAnfangskapital \t\tZinsbetrag \t\tJahresendbetrag");

		yearEnd = capital * (1+(percentage/100.0));
		interestAmount = yearEnd - capital;

		for(int i = 1;  i <= time; i++) {
			System.out.println(i +"\t" +capital +"\t\t\t" +interestAmount +"\t\t\t" +yearEnd);
			capital = yearEnd;
			yearEnd = capital * (1+(percentage/100.0));
			//interestAmount = yearEnd - capital;
			yearEnd = Math.round(yearEnd * 100.0) / 100.0;
		}

		System.out.print("\nWollen sie einen wieteren Zinssatz berechnen? j/n: ");
		String restart = sc.next();

		if(restart.equalsIgnoreCase("j")){
			main(args);
		}
		
	}

}