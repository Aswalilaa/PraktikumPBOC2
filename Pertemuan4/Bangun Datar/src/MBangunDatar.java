/* Nama File : MBangunDatar.java
 * Deskripsi : Main class yang menggunakan class Bangun Datar, Persegi, dan Lingkaran
 * Pembuat   : Aswalila Adha Putri Telaumbanua
 * Tanggal   : 12 Maret 2026
*/

public class MBangunDatar {
    public static void main(String[] args) {
        // Variabel
        BangunDatar B1;
        Persegi P1;
        Lingkaran L1;

        B1 = new BangunDatar(4, "Merah", "Hitam");
        P1 = new Persegi();
        L1 = new Lingkaran();

        // Persegi
        P1.setJmlSisi(4);
        P1.setWarna("Biru");
        P1.setBorder("Putih");
        P1.setSisi(5);

        System.out.println("Persegi");
        P1.printInfo();
        System.out.println("Sisi: " + P1.getSisi());
        System.out.println("Luas: " + P1.getLuas());
        System.out.println("Keliling: " + P1.getKeliling());
        System.out.println();

        // Lingkaran
        L1.setWarna("Hijau");
        L1.setBorder("Hitam");
        L1.setJari(7);

        System.out.println("Lingkaran");
        L1.printInfo();
        System.out.println("Jari-jari: " + L1.getJari());
        System.out.println("Luas: " + L1.getLuas());
        System.out.println("Keliling: " + L1.getKeliling());

        // BangunDatar
        System.out.println("Bangun Datar");
        B1.printInfo();
        System.out.println();
        
    }
}