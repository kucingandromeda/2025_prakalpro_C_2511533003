package pekan2;

public class TugasAlproPekan2{
    public static void main(String[] args) {
        int absensi1 = 1;
        char kelas1 = 'A';
        float nilai1 = 89;
        boolean kelulusan1 = true;
        tampilkan_data_siswa(absensi1, kelas1, nilai1, kelulusan1);

        int absensi2 = 2;
        char kelas2 = 'B';
        float nilai2 = 64;
        boolean kelulusan2 = false;
        tampilkan_data_siswa(absensi2, kelas2, nilai2, kelulusan2);
    }

    public static void tampilkan_data_siswa(int urutanAbsen, char kelas, float nilai, boolean kelulusan) {
        System.out.println("_____Data Siswa_____");
        System.out.println("absensi ke\t: " + urutanAbsen);
        System.out.println("kelas\t\t: " + kelas);
        System.out.println("nilai\t\t: " + nilai);
        System.out.println("status lulus\t: " + kelulusan);
        System.out.println("\n");
    }
}

