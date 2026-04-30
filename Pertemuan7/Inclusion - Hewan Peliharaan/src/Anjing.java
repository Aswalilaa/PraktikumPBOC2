/* Nama File    : Anjing.java 
 * Deskripsi    : Class untuk sublass Anabul yaitu anjing yang implementasiin perilaku gerak dan suara si anjing
 * Pembuat      : Aswalila Adha Putri Telaumbanua - 24060124120014
 * Tanggal      : 23 April 2026
 */

public class Anjing extends Anabul {
    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void Gerak() {
        System.out.println(Nama + " (Anjing) bergerak dengan melata.");
    }

    @Override
    public void Bersuara() {
        System.out.println(Nama + " (Anjing) bersuara: Guk-guk-guk");
    }
}