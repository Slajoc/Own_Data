package einfacheVerzweigungen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BMI {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		System.out.print("Bist du M‰nnlich oder Weiblich? M/W?: ");
		String gender = br.readLine();
		
		System.out.print("Wie groﬂ bist du?: ");
		String height = br.readLine();
		double heightInt = Double.parseDouble(height.trim());
		
		System.out.print("Wie viel wiegst du?: ");
		String weight = br.readLine();
		Double weightInt = Double.parseDouble(weight.trim());
		
		heightInt = heightInt/100;
		double bmi = weightInt / (heightInt * heightInt);
		int bmiRounded = (int) (Math.round(bmi * 100) / 100);
		System.out.println("Deine BMI ist: " +bmiRounded);

		//19-20 BMI Untergewicht
		if(gender.equalsIgnoreCase("m") && bmiRounded <20) System.out.print("Untergewicht");
		else if(gender.equalsIgnoreCase("w") && bmiRounded <19) System.out.print("Untergewicht");
		
		//20-25 und 19-24 BMI Normalgewicht
		else if(gender.equalsIgnoreCase("m") && bmiRounded >=20 && bmiRounded <=25) System.out.print("Normalgewicht");
		else if(gender.equalsIgnoreCase("w") && bmiRounded >=19 && bmiRounded <=24) System.out.print("Normalgewicht");
		
		//26-30 BMI und 25-30 BMI ‹bergewicht 
		else if(gender.equalsIgnoreCase("m") && bmiRounded >=26 && bmiRounded <=30) System.out.print("‹bergewicht");
		else if(gender.equalsIgnoreCase("w") && bmiRounded >=25 && bmiRounded <=30) System.out.print("‹bergewicht");
		
		//31-40 BMI Adipositas
		else if(bmi >=31 && bmi <=40) System.out.print("Adipositas");
		
		//>40 BMI Starke Adipositas
		else if(bmi >40) System.out.print("Starke Adipositas");
	}

}
