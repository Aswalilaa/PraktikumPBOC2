/* Nama File    : Anabul.java 
 * Deskripsi    : Berisi implementasi polimorfisme universal inclusion pada kelas induk (superclass) Anabul yang merepresentasikan hewan peliharaan
 * Pembuat      : Aswalila Adha Putri Telaumbanua - 24060124120014
 * Tanggal      : 07 Mei 2026
 */

public abstract class Anabul {
    /********** ATRIBUT **********/
    private String panggilan;
 
    /********** METHOD **********/
    public Anabul(String panggilan) {
        this.panggilan = panggilan;
    }
 
    // Selektor untuk mengambil nilai nama Anabul
    public String getNama() {
        return "Nama : " + panggilan;
    }
 
    // Method untuk merepresentasikan gerak Anabul
    public abstract void Gerak();

    // Method untuk merepresentasikan suara Anabul
    public abstract void Bersuara();
}