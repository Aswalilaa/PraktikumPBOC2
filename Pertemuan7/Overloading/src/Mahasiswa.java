/* Nama File    : Mahasiswa.java 
 * Deskripsi    : Berisi implementasi polimorfisme ad-hoc overloading pada class Mahasiswa
 * Pembuat      : Aswalila Adha Putri Telaumbanua - 24060124120014
 * Tanggal      : 23 April 2026
 */

public class Mahasiswa {
    /********** ATRIBUT **********/
    private String nim;
    private String nama;
    private String programStudi;

    /********** METHOD ***********/
    // 2c) Konstruktor tanpa parameter
    public Mahasiswa() {
        nim = "-999";
        nama = "n/a";
        programStudi = "n/a";
    }

    // 2d) Konstruktor dengan 3 parameter
    public Mahasiswa(String nim, String nama, String programStudi) {
        this.nim = nim;
        this.nama = nama;
        this.programStudi = programStudi;
    }

    // 2e) Konstruktor cloning 
    public Mahasiswa(Mahasiswa m) {
        this.nim = m.nim;
        this.nama = m.nama;
        this.programStudi = m.programStudi;
    }

    // 2a) Realisasi class Mahasiswa dengan atribut dan operator yang relevan
    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getProgramStudi() {
        return programStudi;
    }

    // Mutator 
    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Mutator untuk mengubah nilai program studi (menggunakan Overloading)
    // Varian 1: tanpa parameter
    public void setProgramStudi() {
        programStudi = "Kosong";
    }

    // Varian 2: satu parameter String
    public void setProgramStudi(String prodi) {
        programStudi = prodi;
    }

    // Varian 3: satu parameter objek Mahasiswa lain
    public void setProgramStudi(Mahasiswa m) {
        programStudi = m.programStudi;
    }

    // Menampilkan informasi Mahasiswa
    public void cetak() {
        System.out.println("NIM           : " + nim);
        System.out.println("Nama          : " + nama);
        System.out.println("Program Studi : " + programStudi);
    }
}