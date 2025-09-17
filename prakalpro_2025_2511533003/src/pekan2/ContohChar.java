package pekan2;

public class ContohChar {
	public static void main(String[] args) {
		/*deklarasi variable char*/
		char huruf1 = 'A';
		char huruf2= 'B';
		char angka= '7';
		char simbol = '#';

		
		/*menampilkan nilai variable char*/
		System.out.println("Contoh variable char:");
		System.out.println("Huruf pertama:" + huruf1);
		System.out.println("Huruf kedua:" + huruf2);
		System.out.println("Angka:" + angka);
		System.out.println("simbol:" + simbol);
		
		/*operasi dengan char berdasarkan code unicode/ASCII*/
		char huruf3 = (char) (huruf1 + 1);
		System.out.println("huruf1 + 1:" + huruf3);
		
		// char juga bisa disimpan di dalam intiger (ASCII/Unicode value)
		int kodeHuruf = huruf1;
		String biner1 = String.format("%8s", Integer.toBinaryString(huruf1)).replace(' ', 'O');
		System.out.println("Kode ASCII dari " + huruf1 + " = " + kodeHuruf);
		System.out.println("Kode Biner dari " + huruf1 + " = " + biner1);
		
		// menggabungkan char menjadi string
		String kata = "" + huruf1 + huruf2 + angka + simbol;
		System.out.println("Gabungkan char menjadi string" + kata);
		
	}
}
