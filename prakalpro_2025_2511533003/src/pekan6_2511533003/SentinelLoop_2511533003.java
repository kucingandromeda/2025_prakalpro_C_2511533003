package pekan6_2511533003;

import java.util.Scanner;

public class SentinelLoop_2511533003 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int sum = 0;
		int number = 12;

		while (number != 0) { 
			System.out.println("Masukkan angka (0 untuk keluar): ");
			number = console.nextInt();
			sum = sum + number;
		}
		System.out.println("totalnya adalah " + sum);
	}

}
