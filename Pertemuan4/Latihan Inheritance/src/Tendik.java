/* Nama File : Tendik.java
 * Deskripsi : berisi atribut dan method dalam class Tendik
 * Pembuat   : Aswalila Adha Putri Telaumbanua
 * Tanggal   : 12 Maret 2026
*/

import java.time.LocalDate;

public class Tendik extends Pegawai {
    /************* ATRIBUT *************/
    final private static int bup = 55;
    private static double persenTunjangan = 0.01; 
    private String bidangKerja;

    /************* METHOD *************/
    // Konstruktor
    public Tendik(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String bidangKerja){
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.bidangKerja = bidangKerja;
    }

    // Getter atau Selektor
    public String getBidangKerja(){
        return bidangKerja;
    }   

    public static double getPersenTunjangan(){
        return persenTunjangan;
    }
 
    public static int getBUP(){
        return bup;
    }

    // Selektor atau Mutator 
    public void setBidangKerja(String bidangKerja){
        this.bidangKerja = bidangKerja;
    }

    public static void setPersenTunjangan(double persenTunjangan){
        if(persenTunjangan < getPersenTunjangan()){
            System.out.println("Persentase tunjangan tidak boleh turun");
        }else{
            Tendik.persenTunjangan = persenTunjangan;
        }
    }

    // Method lain
    public double getTunjangan(){
        return getPersenTunjangan() * getGajiPokok() * getLamaKerja().getYears();
    }

    public LocalDate getTanggalPensiun(){
        return getTanggalLahir().plusYears(getBUP()).plusMonths(1).withDayOfMonth(1);
    }

    public void printInfo(){
        System.out.println("Nip           : " + getNip());
        System.out.println("Nama          : " + getNama());
        System.out.println("Tanggal lahir : " + FormatTanggalIndonesia(getTanggalLahir()));
        System.out.println("Tmt           : " + FormatTanggalIndonesia(getTMT()));
        System.out.println("Bidang kerja  : " + getBidangKerja());
        System.out.println("Masa kerja    : " + getLamaKerja().getYears() + " tahun " + getLamaKerja().getMonths() + " bulan");
        System.out.println("Gaji pokok    : " + FormatRupiah(getGajiPokok()));
        System.out.println("Tunjangan     : " + getPersenTunjangan()*100 + "% x " + FormatRupiah(getGajiPokok()) + " = " + FormatRupiah(getTunjangan()) + "\n");
    }
}