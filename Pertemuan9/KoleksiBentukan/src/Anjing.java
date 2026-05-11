/* Nama File    : Anjing.java
 * Deskripsi    : Berisi implementasi subclass Anjing dari kelas Anabul yang merepresentasikan hewan peliharaan jenis anjing
 * Pembuat      : Aswalila Adha Putri Telaumbanua - 24060124120014
 * Tanggal      : 07 Mei 2026
 */

public class Anjing extends Anabul {
    // Konstruktor untuk membuat objek Anjing dengan nama tertentu
    public Anjing(String panggilan) {
        super(panggilan);
    }

    @Override
    public void Gerak() {
        System.out.println("Gerak: Berlari");
    }

    @Override
    public void Bersuara() {
        System.out.println("Suara: Guk-guk");
    }
}