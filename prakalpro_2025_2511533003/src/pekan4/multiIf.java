package pekan4;

import java.util.Scanner;

public class multiIf {
    public static void main(String[] args) {
        int umur;
        char sim;
        Scanner a = new Scanner(System.in);
        System.out.println("input umur anda");
        umur = a.nextInt();
        System.out.println("apakah anda sudah punya sim: ");
        sim = a.next().charAt(0);
        a.close();

        if ((umur >= 17) && (sim == 'y')){
            System.out.println("anda sudah dewasa boleh bawa motor");
        }
        if ((umur >= 17) && (sim != 'y')){
            System.out.println("anda sudah dewasa tetapi tidak boleh boleh bawa motor");
        }
        if ((umur < 17) && (sim != 'y')){
            System.out.println("anda belum cukup umur bawa motor");
        }
        if ((umur < 17) && (sim == 'y')){
            System.out.println("Anda belum cukup umur punya sim");
        }
    }
}
