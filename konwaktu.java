import java.util.Scanner;

public class konwaktu {
    public static void main(String[] args) {
        boolean lagi = true;
        String jawab;

        Scanner wkt = new Scanner(System.in);

        while (lagi) {

            boolean cek = true;
            String waktu;
            int jam, menit, detik, temp;
            while (cek == true) {
                System.out.print("Masukkan Jam :");
                jam = wkt.nextInt();
                System.out.print("Masukkan menit :");
                menit = wkt.nextInt();
                System.out.print("Masukkan detik :");
                detik = wkt.nextInt();
                wkt.nextLine();
                System.out.print("[AM/PM] :");
                waktu = wkt.nextLine().toUpperCase();
                if (jam > 12 || menit > 60 || detik > 60) {
                    System.out.println("Masukan Yang anda masukan salah");
                    continue;
                } else {

                    if (waktu.equalsIgnoreCase("AM")) {
                        if (jam == 12) {
                            temp = 00;

                        } else {
                            temp = jam;

                        }
                    } else if (waktu.equalsIgnoreCase("PM")) {
                        if (jam == 12) {
                            temp = jam;
                        } else {
                            temp = 12 + jam;
                        }
                    } else {
                        System.out.println("Waktu yang anda masukkan salah");
                        continue;
                    }

                    if (jam < 10) {
                        System.out.println("Waktu Asli: 0" + jam + ":" + menit + ":" + detik + " " + waktu);

                    } else if (menit < 10 && detik < 10) {
                        System.out.println("Waktu Asli: " + jam + ":0" + menit + ":0" + detik + " " + waktu);
                    } else if (jam < 10 && menit < 10) {
                        System.out.println("Waktu Asli: 0" + jam + ":0" + menit + ":" + detik + " " + waktu);
                    } else if (jam < 10 && detik < 10) {
                        System.out.println("Waktu Asli: 0" + jam + ":" + menit + ":0" + detik + " " + waktu);
                    } else if (menit < 10) {
                        System.out.println("Waktu Asli: " + jam + ":" + menit + ":0" + detik + " " + waktu);
                    } else if (detik < 10) {
                        System.out.println("Waktu Asli: " + jam + ":" + menit + ":0" + detik + " " + waktu);
                    } else if (jam < 10 && menit < 10 && detik < 10) {
                        System.out.println("Waktu Asli: 0" + jam + ":0" + menit + ":0" + detik + " " + waktu);
                    } else {
                        System.out.println("Waktu Asli: " + jam + ":" + menit + ":" + detik + " " + waktu);
                    }

                    if (temp < 10) {
                        System.out.println("Waktu Konversi : 0" + temp + ":" + menit);

                    } else if (menit < 10) {
                        System.out.println("Waktu Konversi : " + temp + ":0" + menit);
                    } else if (temp < 10 && menit < 10) {
                        System.out.println("Waktu Konversi : 0" + temp + ":0" + menit);
                    } else {
                        System.out.println("Waktu Konversi : " + temp + ":" + menit);
                    }

                }
                cek = false;

            }

            System.out.println("==========================================");
            System.out.println("Apakah anda ingin keluar?");
            System.out.print("Jawab [Y/T]> ");
            jawab = wkt.nextLine();
            if (jawab.equalsIgnoreCase("Y")) {
                lagi = false;
            }
        }

    }
}
