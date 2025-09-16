package pekan2;

public class DeklarasiVariable {

	static int umur = 25; /*variable langsung diinisialisasikan*/
	public static void main(String[] args) {
		int kode;
		boolean isDibawahUmur; /*perhatikan penulisan nama variable*/
		kode = 1234;	/*pengisian variable (assignment)*/
		double gaji;	/*deklarasi variable dapat dimana saja*/
		gaji = 5500000.23;
		isDibawahUmur = true;
		System.out.println("Status:" + isDibawahUmur);
		System.out.println("Kode:" + kode);
		System.out.println("Umur:" + umur);
		System.out.println("gaji:" + gaji);
	}

}
