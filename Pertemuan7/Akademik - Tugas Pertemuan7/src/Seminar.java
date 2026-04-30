/* Nama File    : Seminar.java 
 * Deskripsi    : Berisi class yang merepresentasikan seminar dengan peserta dari civitas akademika
 * Pembuat      : Aswalila Adha Putri Telaumbanua - 24060124120014
 * Tanggal      : 26 April 2026 
*/

public class Seminar {
    /********** ATRIBUT **********/
    private CivitasAkademika[] pesertas;
    private int banyakPeserta;

    /********** METHOD ***********/
    // Konstruktor untuk inisialisasi seminar
    public Seminar() {
        pesertas = new CivitasAkademika[100];
        banyakPeserta = 0;
    }

    // Method untuk menghitung jumlah peserta
    public int countPeserta() {
        return banyakPeserta;
    }

    // Method untuk menambahkan peserta 
    public void registrasi(CivitasAkademika c) {
        pesertas[banyakPeserta] = c;
        banyakPeserta++;
    }

    // Method untuk menampilkan daftar peserta
    public void tampilPeserta() {
        for (int i = 0; i < banyakPeserta; i++) {
            System.out.println(pesertas[i].getNomor() + " | " + pesertas[i].getNama());
        }
    }

    // Method untuk menghitung jumlah mahasiswa
    public int countMahasiswa() {
        int count = 0;
        for (int i = 0; i < banyakPeserta; i++) {
            if (pesertas[i] instanceof Mahasiswa) {
                count++;
            }
        }
        return count;
    }
}