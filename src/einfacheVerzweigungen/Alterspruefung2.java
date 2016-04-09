package einfacheVerzweigungen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Alterspruefung2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		System.out.print("Wie alt bist du?: ");
		String alter = br.readLine();
		int alterInt = Integer.parseInt(alter.trim());

		if(alterInt <= 14){
			System.out.println("Du bist minderjährig!");
			System.out.println("Du darfst noch nicht Mofa fahren!");}
		
		else if (alterInt >=14 && alterInt <16) System.out.println("Du darfst Mofa fahren, aber nicht Moped!");
		else if (alterInt >=16 && alterInt <18) System.out.println("Du darfst Moped fahrend, aber nicht Auto");
		else if (alterInt >=18) System.out.println("Du darfst Auto fahren.");

	}

}
