/* Nama File : Kendaraan.java
 * Deskripsi : berisi atribut dan method dalam class Kendaraan
 * Pembuat   : Aswalila Adha Putri Telaumbanua
 * Tanggal   : 05 Maret 2026
*/

public class Kendaraan {
    /**************** ATRIBUT ****************/
    private String noPlat;
    private String jenis; // motor atau mobil

    /************* METHOD *************/
    // Konstruktor tanpa parameter
    public Kendaraan(){
        this.noPlat = "";
        this.jenis = "";
    }

    // Konstruktor dengan parameter
    public Kendaraan(String noPlat, String jenis){
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    // Getter atau Selektor
    public String getNoPlat(){
        return noPlat;
    }

    public String getJenis(){
        return jenis;
    }

    // Setter atau Mutator
    public void setNoPlat(String noPlat){
        this.noPlat = noPlat;
    }

    public void setjenis(String jenis){
        this.jenis = jenis;
    }

}