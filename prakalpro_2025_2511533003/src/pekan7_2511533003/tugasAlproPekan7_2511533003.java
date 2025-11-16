
import java.util.Scanner;

public class tugasAlproPekan7_2511533003{
    
    public static void main(String[] args) {
        Akun akun = new Akun();
        Scanner console = new Scanner(System.in);
        System.out.println("==== REGISTRASI AKUN BARU ====");
        System.out.print("Masukkan Username: ");
        akun.setUsername(console.nextLine());

        System.out.print("Masukkan Password: ");
        akun.setPassword(console.nextLine());
        
        System.out.print("Masukkan Email: ");
        akun.setEmail(console.nextLine());

        System.out.print("Masukkan Pin (6 digit): ");
        akun.setPin(console.nextInt());

        boolean validPassword = akun.isPasswordValid();
        boolean validEmail = akun.isEmailValid();

        if (!validPassword || !validEmail){
            System.out.println();
            System.out.println("--- REGISTRASI GAGAL ---");
        }

        if (!validPassword){
            System.out.println("Password Anda " + '"' + akun.getPassword() + '"' + " tidak valid (password harus memiliki panjang 8 karakter). Silakan coba lagi");
        }

        if (!validEmail){
            System.out.println("Email Anda " + '"' + akun.getEmail() + '"' + " tidak valid (harus mengandung '@' dan '.'). Silakan coba lagi");
        }

        if (validPassword && validEmail){
            System.out.println();
            System.out.println("--- REGISTRASI BERHASIL ---");
            System.out.println("akun anda " + '"' + akun.getUsername() + '"' + " telah berhasil dibuat");

            System.out.println();
            akun.detailAkun();

            System.out.println();
            System.out.println("--- Uji Tipe Data (PIN Anda: " + akun.getPin() + ") ---");
            System.out.println("PIN (int) + 10 \t\t= " + (akun.getPin() + 10));
            System.out.println("PIN (String) + " + '"' + "10" + '"' + " \t= " + (akun.getPin() + "10"));
        }
    }
}