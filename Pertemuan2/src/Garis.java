/* Nama File : Garis.java
 * Deskripsi : berisi atribut dan method dalam class Titik
 * Pembuat   : Aswalila Adha Putri Telaumbanua
 * Tanggal   : 26 Februari 2026
*/

public class Garis {
    Titik titikAwal;
    Titik titikAkhir;
    static int counterGaris = 0;

    // a. Konstruktor tanpa parameter
    Garis() {
        this.titikAwal = new Titik(0, 0);
        this.titikAkhir = new Titik(1, 1);
        counterGaris++;
    }

    // b. Konstruktor dengan parameter
    Garis(Titik titikAwal, Titik titikAkhir) {
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }

    // c. Getter & Setter
    Titik getTitikAwal() {
        return titikAwal;
    }

    Titik getTitikAkhir() {
        return titikAkhir;
    }

    void setTitikAwal(Titik titikAwal) {
        this.titikAwal = titikAwal;
    }

    void setTitikAkhir(Titik titikAkhir) {
        this.titikAkhir = titikAkhir;
    }

    static int getCounterGaris() {
        return counterGaris;
    }

    // d. Untuk mendapatkan panjang sebuah garis dengan memanfaatkan getJarak
    double getPanjang() {
        return titikAwal.getJarak(titikAkhir);
    }

    // e. Untuk mendapatkan gradien (m) dari sebuah garis
    double getGradien() {
        double dx = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double dy = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        return dy / dx;
    }

    // f. Untuk mendapatkan titik tengah dari sebuah garis
    Titik getTitikTengah() {
        double xTengah = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2;
        double yTengah = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;
        return new Titik(xTengah, yTengah);
    }

    // g. Untuk mengecek apakah garis tersebut sejajar atau tidak
    boolean isSejajar(Garis G) {
        return this.getGradien() == G.getGradien();
    }

    // h. Untuk mengecek apakah garis tersebut tegak lurus atau tidak
    boolean isTegakLurus(Garis G) {
        return this.getGradien() * G.getGradien() == -1;
    }

    // i. Untuk menampilkan titikAwal sebagai Titik Awal dan titikAkhir sebagai Titik Akhir
    void printGaris() {
        System.out.print("Titik Awal: ");
        titikAwal.printTitik();
        System.out.print("Titik Akhir: ");
        titikAkhir.printTitik();
    }

    // j. Untuk menampilkan persamaan garis dalam bentuk string y = mx + c
    String getPersamaan() {
        double m = getGradien();
        double c = titikAwal.getOrdinat() - (m * titikAwal.getAbsis());
        return "y = " + m + "x + " + c;
    }
}