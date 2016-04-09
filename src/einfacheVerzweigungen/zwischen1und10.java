package einfacheVerzweigungen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class zwischen1und10 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Denke dir eine nicht Kommazahl zwischen 1 und 10 aus.");
		int zahl = 5;

		while (true){
			System.out.print("Ist die Zahl < , > oder = " + zahl +": ");
			String input = br.readLine();
			
			if (input.equals("=")){
				System.out.println("Deine Zahl ist " +zahl +".");
				return;
			}

			else if (zahl == 5){
				if (input.equals("<")){
					zahl = 3;
				}
				if (input.equals(">")){
					zahl = 7;
				}	
			}

			else if (zahl == 3){
				if (input.equals("<")){
					zahl = 1;
				}
				if (input.equals(">")){
					System.out.println("Deine Zahl ist 4.");
					return;
				}
			}

			else if (zahl == 1){
				if (input.equals("<")){
					System.out.println("Du LÜGNER :O !");
					return;
				}
				if (input.equals(">")){
					System.out.println("Deine Zahl ist 2.");
					return;
				}
			}
			
			else if (zahl == 7){
				if (input.equals("<")){
					System.out.println("Deine Zahl ist 6.");
					return;
				}
				if (input.equals(">")){
					zahl = 8;
				}
			}

			else if (zahl == 8){
				if (input.equals("<")){
					System.out.println("Du LÜGNER :O !");
					return;
				}
				
				if (input.equals(">")){
					System.out.println("Deine Zahl ist 9.");
					return;
				}
			}
			
			else {
				System.out.println("Bitte < > oder = eingeben!");
				System.out.println("");
				
			}

		}
		
	}

}