/* Nama File    : CivitasAkademika.java 
 * Deskripsi    : Berisi kelas induk (superclass) yang merepresentasikan civitas akademika
 * Pembuat      : Aswalila Adha Putri Telaumbanua - 24060124120014
 * Tanggal      : 26 April 2026 
*/

public class CivitasAkademika {
    /********** ATRIBUT **********/
    protected String nama;

    /********** METHOD ***********/
    // Konstruktor untuk membuat objek CivitasAkademika dengan nama tertentu
    public CivitasAkademika(String nama) {
        this.nama = nama;
    }

    // Selektor untuk mengambil nilai nama
    public String getNama() {
        return nama;
    }

    // Selektor untuk mengambil nomor identitas
    public String getNomor() {
        return " ";
    }
}