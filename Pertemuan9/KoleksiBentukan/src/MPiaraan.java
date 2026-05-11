/* Nama File    : MPiaraan.java
 * Deskripsi    : Kelas aplikasi untuk menguji seluruh operasi pada kelas Piaraan
 * Pembuat      : Aswalila Adha Putri Telaumbanua - 24060124120014
 * Tanggal      : 07 Mei 2026
 */

public class MPiaraan {
    public static void main(String[] args) {
        Piaraan p = new Piaraan();

        // Tambah anabul
        p.enqueueAnabul(new Kucing("Lesha", 7.2));
        p.enqueueAnabul(new Anjing("Puppy"));
        p.enqueueAnabul(new Kucing("Lili", 5.5));

        // c. Tampilkan semua nama
        p.showAnabul();

        // d. Jumlah kucing
        System.out.println("Jumlah kucing: " + p.countKucing());

        // e. Total bobot kucing
        System.out.println("Total bobot kucing: " + p.bobotKucing());

        // f. Tampilkan nama + jenis
        p.showJenisAnabul();
    }
}