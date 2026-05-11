/* Nama File    : MainTeman.java 
 * Deskripsi    : Kelas aplikasi untuk menguji seluruh operasi pada kelas Teman
 * Pembuat      : Aswalila Adha Putri Telaumbanua - 24060124120014
 * Tanggal      : 07 Mei 2026
 */

public class MainTeman {
    public static void main(String[] args) {
        Teman t = new Teman();
        // Tambah nama
        t.addNama("Lila");
        t.addNama("Dasha");
        t.addNama("Elina");

        // Tampilkan semua teman
        t.showTeman();

        // Jumlah elemen
        System.out.println("Jumlah teman: " + t.getNbelm());

        // Ambil nama berdasarkan indeks
        System.out.println("Nama indeks 1: " + t.getNama(1));

        // Ganti nama
        t.gantiNama("Dasha", "Ariana");

        // Set nama
        t.setNama(0, "Gigi");

        // Cek membership
        System.out.println("Apakah Lila ada? " + t.isMember("Lila"));
        System.out.println("Apakah Gigi ada? " + t.isMember("Gigi"));

        // Hitung jumlah nama tertentu
        System.out.println("Jumlah Lila: " + t.countNama("Lila"));
        System.out.println("Jumlah Gigi: " + t.countNama("Gigi"));

        // Hapus nama
        t.delNama("Lila");

        // Tampilkan lagi
        t.showTeman();
    }
}