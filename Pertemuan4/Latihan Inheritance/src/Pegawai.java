/* Nama File : Pegawai.java
 * Deskripsi : berisi atribut dan method dalam class Pegawai
 * Pembuat   : Aswalila Adha Putri Telaumbanua
 * Tanggal   : 12 Maret 2026
*/

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Pegawai {
    /************* ATRIBUT *************/
    final private String nip;
    private String nama;
    private LocalDate tanggalLahir;
    private LocalDate tmt;
    private double gajiPokok;

    /************* METHOD *************/
    // Konstruktor
    public Pegawai(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok){
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }

    // Getter atau Selektor
    public String getNip(){
        return nip;
    }

    public String getNama(){
        return nama;
    }

    public LocalDate getTanggalLahir(){
        return tanggalLahir;
    }

    public LocalDate getTMT(){
        return tmt;
    }

    public double  getGajiPokok(){
        return gajiPokok;
    }

    // Setter atau Mutator
    public void setNama(String nama){
        this.nama = nama;
    }

    public void setTanggalLahir(LocalDate tanggalLahir){
        this.tanggalLahir = tanggalLahir;
    }

    public void setTmt(LocalDate tmt){
        this.tmt = tmt;
    }

    public void setGajiPokok(double gajiPokok){
        this.gajiPokok = gajiPokok;
    }

    // Method lain
    public Period getLamaKerja(){
        return Period.between(tmt, LocalDate.of(2025,3,10));
    }

    public String FormatTanggalIndonesia(LocalDate Tanggal){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));
        return Tanggal.format(formatter);
    }

    public String FormatRupiah(double Nilai){
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        return formatRupiah.format(Nilai);
    }

}