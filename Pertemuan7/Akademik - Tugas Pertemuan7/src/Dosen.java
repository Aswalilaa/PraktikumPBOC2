/* Nama File    : Dosen.java 
 * Deskripsi    : Kelas turunan dari CivitasAkademika yang merepresentasikan Dosen
 * Pembuat      : Aswalila Adha Putri Telaumbanua - 24060124120014
 * Tanggal      : 26 April 2026 
*/

public class Dosen extends CivitasAkademika {
    /********** ATRIBUT **********/
    private String nip;

    /********** METHOD ***********/
    // Konstruktor untuk membuat objek Dosen
    public Dosen(String nama, String nip) {
        super(nama);
        this.nip = nip;
    }

    // Selektor untuk mengambil NIP (implementasi getNomor)
    public String getNomor() {
        return nip;
    }
}