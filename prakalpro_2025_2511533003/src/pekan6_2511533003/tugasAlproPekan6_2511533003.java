import java.util.Random;
import java.util.Scanner;

public class tugasAlproPekan6_2511533003{
    public static void main(String[] args) {
        boolean win_status = false;
        int try_times = 0;

        boolean running = true;
        while (running) { 
            Random random = new Random();

            int dadu_1 = random.nextInt(7) + 1;
            int dadu_2 = random.nextInt(7) + 1;
            int jumlah = dadu_1 + dadu_2;
            System.out.println(dadu_1 + " + " + dadu_2 + " = " + jumlah);
            if (jumlah == 7){
                System.out.println("tebakan anda benar");
                win_status = true;
            } else {
                System.out.println("tebakan anda salah");
            }
            try_times += 1;
            System.out.println("mau lempar dadu lagi? (ya / tidak)");

            Scanner console = new Scanner(System.in);
            String scanner = console.nextLine();
            if (scanner.equalsIgnoreCase("tidak")){
                running = false;
            } else {
                if (win_status){
                    try_times = 0;
                }
                win_status = false;
            }
        }

        if (win_status){
            System.out.println("anda menang setelah " + try_times + " kali percobaan");
        } else {
            System.out.println("anda gagal menang");
        }
    }
}