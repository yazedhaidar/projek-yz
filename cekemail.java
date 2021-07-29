import java.util.Scanner;

public class cekemail {
    public static void main(String[] args) {
        boolean lagi = true;
        String jawab;
        do {
            Scanner email = new Scanner(System.in);
            String Email;
            Boolean loop = true;

            while (loop) {
                System.out.print("Masukkan Email Anda:");
                Email = email.nextLine();
                String a = "@";
                String b = "@.";
                String c = "@";
                String d = ".co.id";
                String e = ".id";
                String f = "..";
                boolean hasil1 = Email.contains(a); // cek apakah terdapat "@"
                boolean hasil2 = Email.contains(b); // cek apakah terdapat "." setelah "@"
                boolean hasil3 = true;
                boolean hasil4 = true;
                boolean hasil5 = true;

                if (Email.indexOf(a) < 20) { // cek apakah terdapat jumlah karakter melebihi 20
                    hasil3 = true;
                } else {
                    hasil3 = false;
                }
                if (Email.contains(d) || Email.contains(e)) { // cek apakah terdapat domain ".co.id" atau ".id"
                    hasil4 = true;
                } else {
                    hasil4 = false;
                }
                if (Email.contains(f) && Email.indexOf(f) > Email.indexOf(a)) { // cek apakah email terdapat ".." pada saat menulis domain
                    hasil5 = false;
                } else {
                    hasil5 = true;
                }
                if (hasil1 == true && hasil2 == true && hasil3 == true && hasil4 == true && hasil5 == true) {
                    System.out.println("Email yang anda masukan benar");
                    loop = false;
                } else {
                    System.out.println("Email Yang anda masukan salah . Silahkan masukan kembali email anda");
                }
            }
            System.out.println("==========================================");
            System.out.println("Apakah anda ingin keluar?");
            System.out.print("Jawab [Y/T]> ");
            jawab = email.nextLine();
            if (jawab.equalsIgnoreCase("Y")) {
                lagi = false;
            }
        } while (lagi);
    }
}
