package pekan4;
import java.util.Scanner;

public class tugasAlproPekan4_2511533003{

    public static void main(String[] args) {
    // inisialisasi
    String namaPembeli;
    int jumlahJam;
    int hari;
    int laptop;

    double subTotal;
    double diskon;

    // input
    Scanner scanner = new Scanner(System.in);

    System.out.println("masukkan nama penyewa");
    namaPembeli = scanner.nextLine();

    System.out.println("masukkan jumlah jam sewa");
    jumlahJam = scanner.nextInt();

    System.out.println("masukkan hari (0-3)");
    hari = scanner.nextInt();

    System.out.println("masukkan jenis laptop (0-3)");
    laptop = scanner.nextInt();

    System.out.println("=============== Pembelian Tiket Bioskop ===============");
    System.out.println("Nama Pembeli\t: " + namaPembeli);

    System.out.println("Jumlah jam\t: " + jumlahJam);

    // hari
    if (hari == 0){
        System.out.println("Waktu Hari\t: Senin-Kamis");        
    } else if (hari == 1){
        System.out.println("Waktu Hari\t: Jumat");
    } else if (hari == 2){
        System.out.println("Waktu Hari\t: Sabtu-Minggu");
    } else {
        System.out.println("Waktu Hari\t: input salah");
    }

    // Jenis Studio
    if ( laptop == 0){
            System.out.println("Jenis Studio\t: ASUS");
    } else if ( laptop == 1){
            System.out.println("Jenis Studio\t: LENOVO");
    } else if ( laptop == 2){
            System.out.println("Jenis Studio\t: AXIO");
    } else {
            System.out.println("Jenis Studio\t: Input salah");
    }

    System.out.println("--------------------------------------------------------");
    subTotal = jumlahJam * 10000;
    diskon = subTotal * 0.2;
    double total = subTotal - diskon ;
    System.out.println("Harga Dasar\t: Rp 25000/jam");
    System.out.println("subTotal\t: " + subTotal);
    System.out.println("Diskon (20%)\t: " + diskon);
    System.out.println("--------------------------------------------------------");
    System.out.println("TOTAL BAYAR :" + total);
    }
}