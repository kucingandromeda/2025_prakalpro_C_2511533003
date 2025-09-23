package pekan3;
import java.util.Scanner;

public class OperatorLogika {

	public static void main(String[] args) {
		boolean A1;
		boolean A2;
		boolean c;

		Scanner keyboard = new Scanner(System.in);
		System.out.println("input aknga-1");
		A1 = keyboard.nextBoolean(); // input 10
		System.out.println("input aknga-2");
		A2 = keyboard.nextBoolean(); // input 5
		keyboard.close();

		System.out.println("A1 = " + A1);
		System.out.println("A2 = " + A2);

		System.out.println("konjungsi");
		c = A1&&A2;
		System.out.println("true and false = " + c);


		System.out.println("disjungsi");
		c = A1||A2;
		System.out.println("true or false = " + c);


		System.out.println("negasi");
		c = !A1;
		System.out.println("bukan true :" + c);
	}

}
