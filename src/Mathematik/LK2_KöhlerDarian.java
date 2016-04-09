package Mathematik;

import java.util.Scanner;

public class LK2_KöhlerDarian {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double mg = 0;
		double mgStart = 0;
		double zerfall = 0;
		double zerfallStart = 0;
		int zeit = 0;
		double mEnde = 0;
		int restart = 0;

		do{
			System.out.print("Bitte Menge in mg eingeben: ");
			mg = sc.nextDouble();
			mgStart = mg;

			System.out.print("Bitte Zerfallsrate pro Jahr in Prozent eingeben: ");
			zerfall = sc.nextDouble();
			zerfallStart = zerfall;

			System.out.print("Bitte Zeitspanne in Jahren eingeben: ");
			zeit = sc.nextInt();

			System.out.println("\nJahr \tMenge am jahresanfang \t\tZerfall \tMenge am Jahresende");
			System.out.println("---- \t--------------------- \t\t------- \t-------------------");
			for(int i = 1;  i <= zeit; i++) {
				zerfall = zerfallStart;
				zerfall = mg * (zerfall/100);
				zerfall = Math.round(zerfall* 10.0) / 10.0;
				mEnde = mg - zerfall;
				mEnde = Math.round(mEnde* 10.0) / 10.0;
				if(mEnde <= (mgStart/2)){
					System.out.println(i +"\t" +mg +"\t\t\t\t" +zerfall +"\t\t" +mEnde +" **");
				}else {
					System.out.println(i +"\t" +mg +"\t\t\t\t" +zerfall +"\t\t" +mEnde);
				}
				mg = mEnde;
			}

			System.out.print("\nWeitere Aufgabe bearbeiten? 1 = Ja/ 0 = Nein: ");
			restart = sc.nextInt();

		}while(restart == 1);

	}

}