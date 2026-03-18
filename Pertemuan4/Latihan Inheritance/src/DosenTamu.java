/* Nama File : DosenTamu.java
 * Deskripsi : berisi atribut dan method dalam class Dosen Tamu
 * Pembuat   : Aswalila Adha Putri Telaumbanua
 * Tanggal   : 12 Maret 2026
*/

import java.time.LocalDate;

public class DosenTamu extends Dosen {
    /************* ATRIBUT *************/
    final private String nidk;
    private LocalDate akhirKontrak;
    private static double persenTunjangan = 0.025;

    /************* METHOD *************/
    // Konstruktor
    public DosenTamu(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas, String nidk, LocalDate akhirKontrak){
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidk= nidk;
        this.akhirKontrak = akhirKontrak;
    }

    // Getter atau Selektor
    public String getNIDK(){
        return nidk;
    }

    public LocalDate getAkhirKontrak(){
        return akhirKontrak;
    }

    public static double getPersenTunjangan(){
        return persenTunjangan;
    } 

    // Setter atau Mutator
    public void setAkhirKontrak(LocalDate akhirKontrak){
        this.akhirKontrak = akhirKontrak;
    }

    public static void setPersenTunjangan(double persenTunjangan){
        if(persenTunjangan < getPersenTunjangan()){
            System.out.println("Persentase tunjangan tidak boleh turun");
        }else{
            DosenTamu.persenTunjangan = persenTunjangan;
        }
    }

    // Method lain
    public double getTunjangan(){
        return getPersenTunjangan() * getGajiPokok();
    }

    public void printInfo(){
        System.out.println("Nip           : " + getNip());
        System.out.println("Nama          : " + getNama());
        System.out.println("Tanggal lahir : " + FormatTanggalIndonesia(getTanggalLahir()));
        System.out.println("Tmt           : " + FormatTanggalIndonesia(getTMT())); 
        System.out.println("Jabatan       : Dosen Tetap");
        System.out.println("Fakultas      : " + getFakultas());
        System.out.println("Masa kerja    : " + getLamaKerja().getYears() + " tahun " + getLamaKerja().getMonths() + " bulan");
        System.out.println("Akhir kontrak : " + FormatTanggalIndonesia(getAkhirKontrak()));
        System.out.println("Gaji pokok    : " + FormatRupiah(getGajiPokok()));
        System.out.println("Tunjangan     : " + getPersenTunjangan()*100 + "% x " + FormatRupiah(getGajiPokok()) + " = " + FormatRupiah(getTunjangan()) + "\n");
    }
}