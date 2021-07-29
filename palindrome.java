import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {
        // inisialisasi variabel
        boolean cek = true;
        boolean lagi = true;
        String jawab;
        do {

            String Awal, Reverse = "";
            Scanner in = new Scanner(System.in);
            System.out.println("Masukkan kalimat yang ingin dicek apakah palindrome atau tidak:");
            Awal = in.nextLine().toLowerCase();

            String tandaBaca[] = { ".", ",", " ", "?", "!", "@", "#", "$", "%", "^", "&", "*", "_", "-", "+", "+", "|",
                    ">", "<", "~", "`" };
            int jml = tandaBaca.length;
            for (int a = 0; a < jml; a++) {
                // menghilangkan tanda baca
                Awal = Awal.replace(tandaBaca[a], " ");
            }

            int ukuran = Awal.length();
            for (int b = ukuran - 1; b >= 0; b--) {
                Reverse += Awal.charAt(b);
            }

            if (Awal.equalsIgnoreCase(Reverse)) {
                cek = true;
                System.out.println(cek);
            } else {
                cek = false;
                System.out.println(cek);
            }
            System.out.println("==========================================");
            System.out.println("Apakah anda ingin keluar?");
            System.out.print("Jawab [Y/T]> ");
            jawab = in.nextLine();
            if (jawab.equalsIgnoreCase("Y")) {
                lagi = false;
            }
        } while (lagi);
    }
}