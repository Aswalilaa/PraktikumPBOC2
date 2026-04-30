/* Nama File    : MAnabul.java 
 * Deskripsi    : Main Program buat demo polimorfisme pada subclass Anabul
 * Pembuat      : Aswalila Adha Putri Telaumbanua - 24060124120014
 * Tanggal      : 23 April 2026
 */

public class MAnabul {
    public static void main(String[] args) {
        Anabul[] peliharaan = new Anabul[4];
        peliharaan[0] = new Kucing("Kitty");
        peliharaan[1] = new Anjing("Puppie");
        peliharaan[2] = new Burung("Tweety");
        peliharaan[3] = new Kucing("Lesha");

        System.out.println("===== Simulasi Anabul =====");
        for (Anabul a : peliharaan) {
            a.Gerak();
            a.Bersuara();
            System.out.println();
        }
    }
}
