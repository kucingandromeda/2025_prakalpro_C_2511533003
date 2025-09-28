package pekan3;

import java.util.Scanner;

public class VolumeTabung{
    public static void main(String[] args) {
        // initialization
        final double PHI = 3.14;
        double jari;
        double tinggi;
        Scanner keyboard = new Scanner(System.in);

        // input
        System.out.println("masukkan jari jari dalam bentuk double");
        jari = keyboard.nextDouble();
        System.out.println("masukkan tinggi dalam bentuk double");
        tinggi = keyboard.nextDouble();

        // process
        double output = PHI * (jari * jari) * tinggi;
        
        // output
        System.out.println("volume tabung: " + output);

    }
}