/* Nama File    : Kucing.java
 * Deskripsi    : Berisi implementasi subclass Kucing dari class Anabul yang merepresentasikan hewan peliharaan jenis kucing 
 * Pembuat      : Aswalila Adha Putri Telaumbanua - 24060124120014
 * Tanggal      : 07 Mei 2026
 */

public class Kucing extends Anabul {
    /********** ATRIBUT **********/
    private double bobot;
    
    /********** METHOD ***********/
    // Konstruktor untuk membuat objek Kucing
    public Kucing(String panggilan, double bobot) {
        super(panggilan);
        this.bobot = bobot;
    }

    // Selektor untuk mengambil nilai bobot
    public double getBobot() {
        return bobot;
    }

    // Mutator untuk mengubah nilai bobot
    public void setBobot(double bobot) {
        this.bobot = bobot; 
    }

    // Method untuk merepresentasikan gerak Kucing
    @Override
    public void Gerak() {
        System.out.println("Gerak : Melata");
    }

    // Method untuk merepresentasikan suara Kucing
    @Override
    public void Bersuara() {
        System.out.println("Suara : Meong");
    }

}