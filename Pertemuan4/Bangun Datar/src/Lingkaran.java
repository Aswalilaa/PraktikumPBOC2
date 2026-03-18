/* Nama File : Lingkaran.java
 * Deskripsi : berisi atribut dan method dalam class Lingkaran
 * Pembuat   : Aswalila Adha Putri Telaumbanua
 * Tanggal   : 12 Maret 2026
*/

public class Lingkaran extends BangunDatar {
    /************* ATRIBUT *************/
    private double jari;

    /************* METHOD *************/
    public Lingkaran(){
        setJmlSisi(0);
    }
    
    // Getter atau Selektor
    public double getJari(){
        return jari;
    }

    public double getLuas(){
        return (Math.PI)*jari*jari;
    }

    public double getKeliling(){
        return 2*(Math.PI)*jari;
    }

    // Setter atau Mutator
    public void setJari(double jari){
        this.jari = jari;
    }

}