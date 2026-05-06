/* Nama File    : Burung.java
 * Deskripsi    : Berisi implementasi subclass Burung dari kelas Anabul yang merepresentasikan hewan peliharaan burung
 * Pembuat      : Aswalila Adha Putri Telaumbanua - 24060124120014
 * Tanggal      : 30 April 2026
 */

public class Burung extends Anabul {
    // Konstruktor untuk membuat objek Burung dengan nama tertentu
    public Burung(String nama) {
        super(nama);
    }

    // Method untuk merepresentasikan gerak Burung
    public void Gerak() {
        System.out.println("Gerak: Terbang");
    }

    // Method untuk merepresentasikan suara Burung
    public void Bersuara() {
        System.out.println("Cuit-cuit");
    }

}