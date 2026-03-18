/* Nama File : DosenTetap.java
 * Deskripsi : berisi atribut dan method dalam class Dosen Tetap
 * Pembuat   : Aswalila Adha Putri Telaumbanua
 * Tanggal   : 12 Maret 2026
*/

import java.time.LocalDate;

public class DosenTetap extends Dosen {
    /************* ATRIBUT *************/
    final private String nidn;
    final private static int bup = 65;
    private static double persenTunjangan = 0.02; 

    /************* METHOD *************/
    // Konstruktor
    public DosenTetap(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas, String nidn){
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidn = nidn;
    }

    // Getter atau Selektor
    public String getNidn(){
        return nidn;
    }

    public static int getBup(){
        return bup;
    } 

    public static double getPersenTunjangan(){
        return persenTunjangan;
    } 

    // Setter atau Mutator
    public static void setPersenTunjangan(double persenTunjangan){
        if(persenTunjangan < getPersenTunjangan()){
            System.out.println("Persentase tunjangan tidak boleh turun");
        }else{
            DosenTetap.persenTunjangan = persenTunjangan;
        }
    }

    // Method lain
    public double getTunjangan(){
        return getPersenTunjangan() * getGajiPokok() * getLamaKerja().getYears();
    }

    public LocalDate getTanggalPensiun(){
        return getTanggalLahir().plusYears(getBup()).plusMonths(1).withDayOfMonth(1);
    }

    public void printInfo(){
        System.out.println("Nip           : " + getNip());
        System.out.println("Nama          : " + getNama());
        System.out.println("Tanggal lahir : " + FormatTanggalIndonesia(getTanggalLahir()));
        System.out.println("Tmt           : " + FormatTanggalIndonesia(getTMT()));
        System.out.println("Jabatan       : Dosen Tetap");
        System.out.println("Fakultas      : " + getFakultas());
        System.out.println("Masa kerja    : " + getLamaKerja().getYears() + " tahun " + getLamaKerja().getMonths() + " bulan");
        System.out.println("Bup           : " + getTanggalPensiun());
        System.out.println("Gaji pokok    : " + FormatRupiah(getGajiPokok()));
        System.out.println("Tunjangan     : " + getPersenTunjangan()*100 + "% x " + FormatRupiah(getGajiPokok()) + " = " + FormatRupiah(getTunjangan()) + "\n");
    }
}