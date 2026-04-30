/* Nama File    : Kucing.java 
 * Deskripsi    : Class untuk sublass Anabul yaitu kucing yang implementasiin perilaku gerak dan suara si kucing
 * Pembuat      : Aswalila Adha Putri Telaumbanua - 24060124120014
 * Tanggal      : 23 April 2026
 */

public class Kucing extends Anabul {
    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void Gerak() {
        System.out.println(Nama + " (Kucing) bergerak dengan melata.");
    }

    @Override
    public void Bersuara() {
        System.out.println(Nama + " (Kucing) bersuara: Meong");
    }
}