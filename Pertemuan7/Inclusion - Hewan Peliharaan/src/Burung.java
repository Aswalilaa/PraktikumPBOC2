/* Nama File    : Burung.java 
 * Deskripsi    : Class untuk sublass Anabul yaitu burung yang implementasiin perilaku gerak dan suara si burung
 * Pembuat      : Aswalila Adha Putri Telaumbanua - 24060124120014
 * Tanggal      : 23 April 2026
 */

public class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void Gerak() {
        System.out.println(Nama + " (Burung) bergerak dengan terbang.");
    }

    @Override
    public void Bersuara() {
        System.out.println(Nama + " (Burung) bersuara: Cii-cii-cii");
    }
}