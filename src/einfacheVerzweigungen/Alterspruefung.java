package einfacheVerzweigungen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Alterspruefung {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		System.out.print("Wie alt bist du?: ");
		String alter = br.readLine();
		int alterInt = Integer.parseInt(alter.trim());
		
		if(alterInt <= 14) System.out.println("Du bist minderjährig!");
		else if (alterInt > 14) System.out.println("Du bist schon volljährig!");

	}

}
