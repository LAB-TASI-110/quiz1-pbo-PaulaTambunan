import java.util.Scanner;

public class Driver2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input total data
        System.out.print("Masukkan total data: ");
        int n = sc.nextInt();

        int[] nilai = new int[n];
        char[] kelompok = new char[n];

        // Input deret nilai
        System.out.println("Masukkan deret nilai:");
        for (int i = 0; i < n; i++) {
            nilai[i] = sc.nextInt();
        }

        // Input deret kelompok
        System.out.println("Masukkan deret kelompok (P/L) untuk tiap mahasiswa:");
        for (int i = 0; i < n; i++) {
            kelompok[i] = sc.next().toUpperCase().charAt(0);
        }

        // Input kelompok yang ingin dihitung
        System.out.print("Masukkan kelompok yang ingin dihitung totalnya (P/L): ");
        char cariKelompok = sc.next().toUpperCase().charAt(0);

        int total = 0;

        // Proses penjumlahan
        for (int i = 0; i < n; i++) {
            if (kelompok[i] == cariKelompok) {
                total += nilai[i];
            }
        }

        // Output
        System.out.println("Total nilai kelompok " + cariKelompok + " = " + total);

        sc.close();
    }
}