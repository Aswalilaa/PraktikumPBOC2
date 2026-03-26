/* Nama File : Asersi2.java
 * Deskripsi : Program untuk demo asersi, yang akan menolak input jari-jari lingkaran yang bernilai nol
 * Pembuat   : Aswalila Adha Putri Telaumbanua - 24060124120014
 * Tanggal   : 26 Maret 2026
*/

// Class Lingkaran
class Lingkaran {
    private double jariJari;
 
    // Konstruktor
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }
 
    public double hitungKeliling() {
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}
 
// Class Asersi2
public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert (jariJari > 0) : "jari jari tidak boleh nol!!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }
}