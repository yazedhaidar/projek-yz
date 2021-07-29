
import java.util.Scanner;

public class helloworld {
    public static void main(String[] args) {

        boolean lagi = true;
        String jawab;
        Scanner angka = new Scanner(System.in);
        do {

            int bil;

            System.out.print("Masukkan Bilangan = ");
            bil = angka.nextInt();
            if (bil % 3 == 0) {
                if (bil % 5 == 0) {
                    System.out.println("Hello World");
                } else {
                    System.out.println("Hello ");
                }
            } else if (bil % 5 == 0) {
                if (bil % 3 == 0) {
                    System.out.println("Hello World");
                } else {
                    System.out.println("World ");
                }

            } else {
                System.out.println("Bilangan Tidak bisa dibagi 3 atau 5");
            }
            angka.nextLine();
            System.out.println("========================");
            System.out.println("Apakah anda ingin keluar");
            System.out.print("jawab[Y/T]");
            jawab = angka.nextLine();

            if (jawab.equalsIgnoreCase("Y")) {
                lagi = false;
            }

        } while (lagi);

    }
}