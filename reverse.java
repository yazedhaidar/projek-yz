import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        boolean lagi = true;
        String jawab;
        do {
            Scanner rev = new Scanner(System.in);
            String awal, reverse = "";
            int jml, ukuran;
            System.out.print("Masukkan kata yang ingin dibalik :");
            awal = rev.nextLine().toLowerCase();
            String tandabaca[] = { ".", ",", " ", "?", "!", "@", "#", "$", "%", "^", "&", "*", "_", "-", "+", "+", "|",
                    ">", "<", "~", "`" };
            jml = tandabaca.length;
            for (int a = 0; a < jml; a++) {
                awal = awal.replace(tandabaca[a], " ");
            }

            ukuran = awal.length();
            for (int b = ukuran - 1; b >= 0; b--) {
                reverse += awal.charAt(b);

            }
            System.out.println("Kalimat Awal =" + awal);
            System.out.println("Kalimat reverse =" + reverse);
            System.out.println("==========================================");
            System.out.println("Apakah anda ingin keluar?");
            System.out.print("Jawab [Y/T]> ");
            jawab = rev.nextLine();
            if (jawab.equalsIgnoreCase("Y")) {
                lagi = false;
            }
        } while (lagi);
    }
}
