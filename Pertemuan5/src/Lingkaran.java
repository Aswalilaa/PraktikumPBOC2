/* Nama File : Lingkaran.java
 * Deskripsi : berisi atribut dan method dalam class Lingkaran
 * Pembuat   : Aswalila Adha Putri Telaumbanua
 * Tanggal   : 26 Maret 2026
*/

public class Lingkaran extends BangunDatar implements IResize{
    private double jari;

    // Konstruktor 
    public Lingkaran() {
        super(0, "Default", "Default");
        this.jari = 0;
    }

    public Lingkaran(double rad) {
        super(0, "Default", "Default");
        this.jari = rad;
    }

    public Lingkaran(double rad, String warna, String border) {
        super(0, warna, border);
        this.jari = rad;
    }

    // Getter atau Selektor
    public double getJari(){
        return jari;
    } 

    // Setter atau Mutator
    public void setJari(double jari){
        this.jari = jari;
    }

    // Method lain
    @Override
    public double getLuas(){
        return (Math.PI)*jari*jari;
    }

    @Override
    public double getKeliling(){
        return 2*(Math.PI)*jari;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Radius: " + jari);
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
    }

    // Resize
    @Override
    public void zoomIn() {
        zoom(110);
    }

    @Override
    public void zoomOut() {
        zoom(90);
    }

    @Override
    public void zoom(int percent) {
        jari = jari * percent / 100.0;
    }
}