/* Nama File : MataKuliah.java
 * Deskripsi : berisi atribut dan method dalam class MataKuliah
 * Pembuat   : Aswalila Adha Putri Telaumbanua
 * Tanggal   : 05 Maret 2026
*/

public class MataKuliah {
    /**************** ATRIBUT ****************/
    private String idMatkul;
    private String nama;
    private int sks;

    /************* METHOD *************/
    // Konstruktor tanpa parameter
    public MataKuliah(){
        this.idMatkul = "";
        this.nama = "";
        this.sks = 0;
    }

    // Konstruktor dengan parameter
    public MataKuliah(String idMatkul, String nama, int sks){
        this.idMatkul = idMatkul;
        this.nama = nama;
        this.sks = sks;
    }

    // Getter atau Selektor
    public String getIdMatkul(){
        return idMatkul;
    }

    public String getNama(){
        return nama;
    }

    public int getSks(){
        return sks;
    } 

    // Setter atau Mutator
    public void setIdMatkul(String idMatkul){
        this.idMatkul = idMatkul;
    } 

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setSks(int sks){
        this.sks = sks;
    }

}