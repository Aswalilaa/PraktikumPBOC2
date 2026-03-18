/* Nama File : Dosen.java
 * Deskripsi : berisi atribut dan method dalam class Dosen
 * Pembuat   : Aswalila Adha Putri Telaumbanua
 * Tanggal   : 12 Maret 2026
*/

import java.time.LocalDate;

public class Dosen extends Pegawai {
    /************* ATRIBUT *************/
    private String fakultas;

    /************* METHOD *************/
    // Konstruktor
    public Dosen(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas){
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.fakultas = fakultas;
    }

    // Getter atau Selektor
    public String getFakultas(){
        return fakultas;
    }

    // Setter atau Mutator
    public void setFakultas(String fakultas){
        this.fakultas = fakultas;
    }

}