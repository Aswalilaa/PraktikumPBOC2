/* Nama File : MGaris.java
 * Deskripsi : berisi atribut dan method dalam class Titik
 * Pembuat   : Aswalila Adha Putri Telaumbanua
 * Tanggal   : 26 Februari 2026
*/

public class MGaris {
    public static void main(String[] args) {
        Titik P = new Titik(-2, 0);
        Titik Q = new Titik(0, 3);
        Titik R = new Titik(-1, 4);
        Titik S= new Titik(3, 6);

        Garis G1 = new Garis(P, Q);
        Garis G2 = new Garis(R, S);

        System.out.println("=== Garis G1 ===");
        G1.printGaris();
        System.out.println("Panjang: " + G1.getPanjang());
        System.out.println("Gradien: " + G1.getGradien());
        System.out.print("Titik Tengah: ");
        G1.getTitikTengah().printTitik();
        System.out.println("Persamaan: " + G1.getPersamaan());

        System.out.println("\n=== Garis G2 ===");
        G2.printGaris();
        System.out.println("Gradien: " + G2.getGradien());

        System.out.println("\nApakah G1 sejajar G2? " + G1.isSejajar(G2));
        System.out.println("Apakah G1 tegak lurus G2? " + G1.isTegakLurus(G2));

        System.out.println("\nJumlah objek Garis = " + Garis.getCounterGaris());
    }
}