package se.example;

/**
 * Methods samples.
 */
public class Main {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(0);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int measure = 1024;
        double megaBytes = kiloBytes / measure;
        if (kiloBytes >=0) {
            System.out.println(kiloBytes + " KB = " + Math.round(megaBytes)+ " MB and " + kiloBytes % measure + " KB");
        } else {
            System.out.println("Invalid Value");
        }
    }

}