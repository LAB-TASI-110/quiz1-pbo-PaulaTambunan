import java.util.*;

public class Driver1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<String> listNama = new ArrayList<>();
        List<Integer> listPorsi = new ArrayList<>();
        List<Integer> listTotal = new ArrayList<>();

        int grandTotal = 0;

        while (true) {

            String kode = sc.nextLine();

            // Jika END → berhenti
            if (kode.equalsIgnoreCase("END")) {
                break;
            }

            int harga = 0;
            String namaMenu = "";

            // Tentukan menu berdasarkan kode
            switch (kode) {
                case "NGS":
                    namaMenu = "Nasi Goreng Spesial";
                    harga = 15000;
                    break;
                case "AP":
                    namaMenu = "Ayam Penyet";
                    harga = 20000;
                    break;
                case "SA":
                    namaMenu = "Sate Ayam (10 Tusuk)";
                    harga = 25000;
                    break;
                case "BU":
                    namaMenu = "Bakso Urat";
                    harga = 18000;
                    break;
                case "MAP":
                    namaMenu = "Mie Ayam Pangsit";
                    harga = 15000;
                    break;
                case "GG":
                    namaMenu = "Gado-Gado";
                    harga = 15000;
                    break;
                case "SAM":
                    namaMenu = "Soto Ayam";
                    harga = 17000;
                    break;
                case "RD":
                    namaMenu = "Rendang Daging";
                    harga = 25000;
                    break;
                case "IB":
                    namaMenu = "Ikan Bakar";
                    harga = 35000;
                    break;
                case "NUK":
                    namaMenu = "Nasi Uduk Komplit";
                    harga = 20000;
                    break;
                default:
                    continue; // jika kode salah → ulang input
            }

            int porsiButet = Integer.parseInt(sc.nextLine());

            int porsiUcok = 2 * porsiButet;
            int totalPorsi = porsiButet + porsiUcok; // 3x Butet
            int totalHarga = totalPorsi * harga;

            listNama.add(namaMenu);
            listPorsi.add(totalPorsi);
            listTotal.add(totalHarga);

            grandTotal += totalHarga;
        }

        // Hitung diskon
        double diskon = 0;

        if (grandTotal >= 500000) {
            diskon = 0.25;
        } else if (grandTotal >= 400000) {
            diskon = 0.20;
        } else if (grandTotal >= 300000) {
            diskon = 0.15;
        } else if (grandTotal >= 200000) {
            diskon = 0.10;
        } else if (grandTotal >= 100000) {
            diskon = 0.05;
        }

        int totalAkhir = (int) (grandTotal - (grandTotal * diskon));

        // OUTPUT STRUK
        System.out.println("==============================================");
        System.out.printf("%-25s %-10s %-10s\n", "Menu", "Porsi", "Total");
        System.out.println("==============================================");

        for (int i = 0; i < listNama.size(); i++) {
            System.out.printf("%-25s %-10d %-10d\n",
                    listNama.get(i),
                    listPorsi.get(i),
                    listTotal.get(i));
        }

        System.out.println("==============================================");
        System.out.printf("%-35s %-10d\n", "Total Pembayaran", totalAkhir);
        System.out.println("==============================================");

        sc.close();
    }
}