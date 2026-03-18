/* Nama File : Persegi.java
 * Deskripsi : berisi atribut dan method dalam class Persegi
 * Pembuat   : Aswalila Adha Putri Telaumbanua
 * Tanggal   : 12 Maret 2026
*/

public class Persegi extends BangunDatar{
    /************* ATRIBUT *************/
    private double sisi;

    /************* METHOD *************/
    public Persegi(){
        setJmlSisi(4);
    }

    public Persegi(double sisi, String warna, String border){
        super(4,warna,border);
        this.sisi = sisi;
    }

    // Getter atau Selektor
    public double getSisi(){
        return sisi;
    }

    // Setter atau Mutator
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    // Method lain
    public double  getLuas(){
        return sisi*sisi;
    }

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
    }

}