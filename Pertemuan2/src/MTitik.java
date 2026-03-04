/* Nama File : MTitik.java
 * Deskripsi : berisi atribut dan method dalam class Titik
 * Pembuat   : Aswalila Adha Putri Telaumbanua
 * Tanggal   : 26 Februari 2026
*/

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik(); //Membuat objek titik T1 (0,0)
        T1.setAbsis(3); //mengubah absis T1 dengan nilai 3
        T1.setOrdinat(4); //mengubah ordinat T1 dengan nilai 4
        T1.printTitik(); //mencetak koordinat T1 ke layar
        T1.geser(3,4); //menggeser T1 sejauh (3,4)
        T1.printTitik(); //menampilkan kooordinat T1 setelah digeser

        Titik T2 = T1;
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik();

        // Membuat objek baru
        Titik T3 = new Titik(3,5); \

        // refleksiX
        T1.refleksiX();
        T1.printTitik();

        // refleksiY
        T1.refleksiY();
        T1.printTitik();

        // Jarak T3 ke pusat
        System.out.println("Jarak T3 ke pusat: " + T3.getJarakPusat());

        // Jarak T3 ke T1
        System.out.println("Jarak T3 ke T1: " + T3.getJarak(T1));

        // Kuadran T3
        System.out.println("Kuadran T3: " + T3.getKuadran());

        // getRefleksiX
        Titik T5 = T3.getRefleksiX();
        T5.printTitik();

        // getRefleksiY
        Titik T4 = T3.getRefleksiY();
        T4.printTitik();

        System.out.println("Jumlah objek Titik = " + Titik.getCounterTitik());
    }
}