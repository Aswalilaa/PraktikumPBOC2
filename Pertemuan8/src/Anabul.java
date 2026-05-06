/* Nama File    : Anabul.java 
 * Deskripsi    : Berisi implementasi polimorfisme universal inclusion pada kelas induk (superclass) Anabul yang merepresentasikan hewan peliharaan
 * Pembuat      : Aswalila Adha Putri Telaumbanua - 24060124120014
 * Tanggal      : 30 April 2026
 */

public abstract class Anabul {
    /********** ATRIBUT **********/
    private String nama;
 
    /********** METHOD **********/
    public Anabul(String nama) {
        this.nama = nama;
    }
 
    // Selektor untuk mengambil nilai nama Anabul
    public String getNama() {
        return "Nama : " + nama;
    }
 
    // Method untuk merepresentasikan gerak Anabul
    public abstract void Gerak();

    // Method untuk merepresentasikan suara Anabul
    public abstract void Bersuara();
}