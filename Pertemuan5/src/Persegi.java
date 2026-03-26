/* Nama File : Persegi.java
 * Deskripsi : berisi atribut dan method dalam class Persegi
 * Pembuat   : Aswalila Adha Putri Telaumbanua
 * Tanggal   : 26 Maret 2026
*/

public class Persegi extends BangunDatar implements IResize{
    private double sisi;

    // Konstruktor
    public Persegi() {
        this.sisi = 0;
        setJmlSisi(4);
    }

    public Persegi(double sisi) {
        this.sisi = sisi;
        setJmlSisi(4);
    }

    public Persegi(double sisi, String warna, String border) {
        super(4, warna, border);
        this.sisi = sisi;
        setJmlSisi(4);
    }

    // Getter atau Selektor
    public double getSisi() {
        return sisi;
    }

    // Setter atau Mutator
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    // Method lain
    @Override
    public double  getLuas(){
        return sisi*sisi;
    }

    @Override
    public double getKeliling(){
        return 4*sisi;
    }

    public double  getDiagonal(){
        return (Math.sqrt(2))*sisi;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi: " + sisi);
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
    }

    // Resiza
    @Override
    public void zoomIn(){
        sisi = sisi*1.1;
    }

    @Override
    public void zoomOut(){
        sisi = sisi*0.9;
    }
    
    @Override
    public void zoom(int percent){
        sisi = sisi * percent /100;
    }
}