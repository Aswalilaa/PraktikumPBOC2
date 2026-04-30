/* Nama File    : Mahasiswa.java 
 * Deskripsi    : Kelas turunan dari CivitasAkademika yang merepresentasikan Mahasiswa
 * Pembuat      : Aswalila Adha Putri Telaumbanua - 24060124120014
 * Tanggal      : 26 April 2026 
*/

public class Mahasiswa extends CivitasAkademika {

    /********** ATRIBUT **********/
    private String nim;
    private Dosen dosenWali;

    /********** METHOD ***********/
    // Konstruktor untuk membuat objek Mahasiswa
    public Mahasiswa(String nama, String nim) {
        super(nama);
        this.nim = nim;
    }

    // Selektor untuk mengambil NIM (implementasi getNomor)
    public String getNomor() {
        return nim;
    }

    // Mutator untuk mengubah dosen wali
    public void setWali(Dosen dw) {
        this.dosenWali = dw;
    }

    // Menampilkan data Mahasiswa
    public void tampilDataMahasiswa() {
        System.out.println("NIM         : " + nim);
        System.out.println("Nama        : " + nama);
        System.out.println("Dosen Wali  : " + dosenWali.getNama());
    }
}