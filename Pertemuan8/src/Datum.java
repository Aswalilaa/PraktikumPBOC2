/* Nama File    : Datum.java
 * Deskripsi    : Berisi kelas generik dengan atribut isi bertipe generik
 * Pembuat      : Aswalila Adha Putri Telaumbanua - 24060124120014
 * Tanggal      : 30 April 2026
 */

public class Datum<T> {
    /********** ATRIBUT **********/
    private T isi;
 
    /********** KONSTRUKTOR **********/
    public Datum(T isi) {
        this.isi = isi;
    }
 
    /********** METHOD **********/
    public T getIsi() {
        return isi;
    }
 
    public void setIsi(T isibaru) {
        this.isi = isibaru;
    }

    public static void tampilkanAnabul(Anabul anabul) {
        System.out.println("Nama: " + anabul.getNama());
        anabul.Gerak();
        anabul.Bersuara();
    }
}