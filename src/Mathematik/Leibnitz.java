package Mathematik;

public class Leibnitz {

	public static double pi(int laenge) {
		double wert = 0.0;
		double zaehler = 1.0;
		double nenner = 1.0;

		for(int i = 0;i < laenge; i ++){
			wert += zaehler / nenner;
			zaehler *= -1;
			nenner += 2;
		}

		return wert * 4;

	}

	public static void main(String[] Args){
		System.out.println(pi(100000000));
	}

}