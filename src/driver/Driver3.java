import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Driver3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input data mahasiswa
        System.out.print("Nama Mahasiswa: ");
        String nama = sc.nextLine();

        System.out.print("NIM: ");
        String nim = sc.nextLine();

        System.out.print("Tanggal Pengantaran (yyyy-mm-dd): ");
        LocalDate tanggalPengantaran = LocalDate.parse(sc.nextLine());

        System.out.print("Tanggal Pengambilan (yyyy-mm-dd): ");
        LocalDate tanggalPengambilan = LocalDate.parse(sc.nextLine());

        // Input jumlah pakaian
        System.out.print("Jumlah Kemeja: ");
        int kemeja = sc.nextInt();

        System.out.print("Jumlah Kaos Berkerah: ");
        int kaos = sc.nextInt();

        System.out.print("Jumlah Dress: ");
        int dress = sc.nextInt();

        System.out.print("Jumlah Celana: ");
        int celana = sc.nextInt();
        sc.nextLine(); // membersihkan buffer

        // Hitung selisih hari
        long selisihHari = ChronoUnit.DAYS.between(tanggalPengantaran, tanggalPengambilan);

        // Tentukan status berdasarkan aturan
        String status;
        if (selisihHari == 3) {
            status = "Selesai";
        } else {
            status = "Still on process";
        }

        // Input konfirmasi admin
        System.out.print("Masukkan status (Done / lainnya): ");
        String konfirmasi = sc.nextLine();

        System.out.println("\n=== OUTPUT ===");

        if (konfirmasi.equalsIgnoreCase("Done") && status.equals("Selesai")) {
            System.out.println("Laundry sudah selesai diproses.");
            System.out.println("Nama: " + nama);
            System.out.println("NIM: " + nim);
            System.out.println("Kemeja: " + kemeja);
            System.out.println("Kaos Berkerah: " + kaos);
            System.out.println("Dress: " + dress);
            System.out.println("Celana: " + celana);
        } else {
            System.out.println("Still on process");
        }

        sc.close();
    }
}