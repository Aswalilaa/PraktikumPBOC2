/* Nama File : MBangunDatar.java
 * Deskripsi : Main class yang menggunakan class Bangun Datar, Persegi, dan Lingkaran
 * Pembuat   : Aswalila Adha Putri Telaumbanua
 * Tanggal   : 26 Maret 2026
*/

public class MBangunDatar {
    public static void main (String[] args) {
        BangunDatar P1 = new Persegi(10, "Kuning", "Hitam");
        Persegi P2 = new Persegi(5, "Biru", "Putih");
        BangunDatar L1 = new Lingkaran(7, "Merah", "Hijau");
        Lingkaran L2 = new Lingkaran(14, "Hijau", "Hitam");

        System.out.println("Luas P1 == L1 ? : " + P1.isEqualLuas(L1));
        System.out.println("Keliling P2 == L2 ? : " + P2.isEqualKeliling(L2));

        ((Persegi) P1).zoomIn();
        P2.zoomOut();

        ((Lingkaran) L1).zoomIn();
        L2.zoomOut();

        System.out.println("Sisi P1 setelah zoom in: " + ((Persegi)P1).getSisi());
        System.out.println("Sisi P2 setelah zoom out: " + P2.getSisi());
        System.out.println("Jari L1 setelah zoom in: " + ((Lingkaran)L1).getJari());
        System.out.println("Jari L2 setelah zoom out: " + L2.getJari());
    }
}