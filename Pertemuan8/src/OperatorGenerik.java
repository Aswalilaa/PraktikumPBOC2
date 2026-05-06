/* Nama File    : OperatorGenerik.java
 * Deskripsi    : Berisi prosedur generik Tukar dan fungsi generik Bobot2
 * Pembuat      : Aswalila Adha Putri Telaumbanua - 24060124120014
 * Tanggal      : 30 April 2026
 */

public class OperatorGenerik {
    // Prosedur Tukar dengan 2 parameter
    public static <T> void Tukar(Datum<T> d1, Datum<T> d2) {
        T temp = d1.getIsi();
        d1.setIsi(d2.getIsi());
        d2.setIsi(temp);
    }

    // Fungsi generik untuk mengembalikan jumlah bobot 2 objek
    public static double Bobot2(Kucing K1, Kucing K2) {
        return K1.getBobot() + K2.getBobot();
    }
}