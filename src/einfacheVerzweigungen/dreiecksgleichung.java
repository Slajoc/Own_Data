package einfacheVerzweigungen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class dreiecksgleichung {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		System.out.print("Seite a: ");
		String a = br.readLine();

		System.out.print("Seite b: ");
		String b = br.readLine();

		System.out.print("Seite c: ");
		String c = br.readLine();

		double A = Double.parseDouble(a.trim());
		double B = Double.parseDouble(b.trim());
		double C = Double.parseDouble(c.trim());
		
		double s = (A+B+C)/2;
		double area = Math.sqrt(s*(s-A)*(s-B)*(s-C));

		if (A < (B+C) && B < (A+C) && C < (B+A)){
			System.out.println("Das Dreieck ist zeichenbar!");
			System.out.println("Umfang: " + (A+B+C));
			System.out.println("Flächeninhalt: " +area);
			
		}
		else {
			System.out.println("Das Dreieck ist nicht zeichenbar!");
		}

	}

}