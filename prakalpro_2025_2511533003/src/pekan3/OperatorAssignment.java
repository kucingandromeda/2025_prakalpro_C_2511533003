package pekan3;
import java.util.Scanner;

public class OperatorAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A1;
		int A2;
		Scanner keyboard = new Scanner(System.in);

		System.out.println("input aknga-1");
		A1 = keyboard.nextInt(); // input 10
		System.out.println("input aknga-2");
		A2 = keyboard.nextInt(); // input 5
		keyboard.close();

		System.out.println("assignment penambahan");
		A1 += A2; // penambahan sekarang A1 = 15
		System.out.println("penambahan :" + A1);

		System.out.println("assignment pengurangan");
		A1 -= A2; // pengurangan sekarang A1 = 10
		System.out.println("pengurangan:" + A1);
		
		System.out.println("assignment perkalian");
		A1 *= A2; // perkalian sekarang A1 = 50
		System.out.println("perkalian :" + A1);
		
		System.out.println("assignment hasil bagi");
		A1 /= A2; // hasil bagi sekarang A1 = 10
		System.out.println("pembagian:" + A1);
		
		System.out.println("assignment sisa bagi");
		A1 %= A2; // sisa bagi sekarang A1 = 0
		System.out.println("sisa bagi :" + A1);
		
		



	}

}
