package package2;

public class switchVariables {
	public static void main(String args[]){
		int a = 5;
		int b = 3;
		int c = 0;
		
		c = a;
		a = b;
		b = c;
		
		System.out.println("Variable A: "+a);
		System.out.println("Variable B: "+b);
	}

}
