package einfacheVerzweigungen;

import java.util.Scanner;

public class zahlenRaten2 {

	public static void main(String[] args) {
		while(true){
			try {
				Scanner sc = new Scanner(System.in); //interface / implements
				System.out.print("Gebe die maximale Größe der RDM Zahl ein: ");
				int start = sc.nextInt();
				int random = (int)(Math.random() * start);
				System.out.print("Gebe eine Zahl ein, mit der du beginnen möchtest: ");
				int zahl = sc.nextInt();
				String gk = "keine";
				int i = 0;

				while(true){
					i++;

					if (zahl == -1) zahl = random;
					if (zahl == random){
						System.out.println("");
						System.out.println("Richtig die Zahl war: " +random);
						System.out.println("Du hast " +i +" Versuche ge braucht.");
						return;}

					else if (zahl <= random) gk = "kleiner";
					else if (zahl >= random) gk = "größer";


					System.out.println("Die Zahl " +zahl +" ist " +gk +".");
					System.out.print("Bitte eine neue Zahl eingeben: ");
					zahl = sc.nextInt();}

			} catch(Exception e){
				System.out.println("");
				System.out.println("Bitte eine ZAHL eingeben!");}
			
		}

	}

}
