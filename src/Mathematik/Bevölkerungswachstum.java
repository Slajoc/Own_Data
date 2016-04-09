package Mathematik;

import java.util.Scanner;

public class Bevölkerungswachstum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double menschen = 0;
		double zuwachs = 0;
		int zeit = 0;
		double mEnde = 0;
		double zuwachsOut = 0;

		System.out.print("Bitte Anzahl der Menschen in Milliaren erfassen: ");
		menschen = sc.nextDouble();

		System.out.print("Bitte prozentualen Zuswachs pro Jahr eingeben: ");
		zuwachs = sc.nextDouble();

		System.out.print("Bitte Zeitspanne in jahren eingeben: ");
		zeit = sc.nextInt();

		System.out.println("\nJahr \tAnzahl am Jahresanfang \t\tZuwachs \t\tAnzahl am Jahresende");
		for(int i = 1;  i <= zeit; i++) {
			zuwachs = menschen *(zuwachs/100) +1;
			mEnde = menschen + zuwachs;
			System.out.println(i +"\t" +menschen +"\t\t\t" +zuwachs +"\t\t\t" +mEnde);
			menschen = mEnde;
			zuwachs = Math.round(zuwachs* 100.0) / 100.0;
		}

		System.out.print("\nWollen sie einen wieteren Zuwachs berechnen? j/n: ");
		String restart = sc.next();

		if(restart.equalsIgnoreCase("j")){
			main(args);
		}

	}

}
