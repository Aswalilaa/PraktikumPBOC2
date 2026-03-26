/* Nama File : BangunDatar.java
 * Deskripsi : berisi atribut dan method dalam class Bangun Datar
 * Pembuat   : Aswalila Adha Putri Telaumbanua
 * Tanggal   : 26 Maret 2026
*/

public abstract  class BangunDatar {
    private int jmlSisi;
    private String warna;
    private String border;
    private static int counterBangunDatar = 0;

    // Konstruktor
    public BangunDatar() {
        warna = "Default";
        border = "Default";
    }

    public BangunDatar(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
    }

    // Getter atau Selektor
    public int getJmlSisi() {
        return jmlSisi;
    }

    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    public String getWarna() {
        return warna;
    }

    public String getBorder() {
        return border;
    }

    // Setter atau Mutator
    public void setWarna(String warna) {
        this.warna = warna;
    }
    public void setBorder(String border) {
        this.border = border;
    }

    // Method lain
    public void printInfo() {
        System.out.println("Jumlah sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }

    public static void printCounterBangunDatar(){
        System.out.println("Jumlah objek Bangun Datar: " + counterBangunDatar);
    }
    
    // Method tambahan pertemuan 5
    public abstract double getLuas();
    public abstract double getKeliling();

    public boolean isEqualLuas(BangunDatar X){
        return this.getLuas() == X.getLuas();
    }

    public boolean isEqualKeliling(BangunDatar X){
        return this.getKeliling() == X.getKeliling();
    }
}