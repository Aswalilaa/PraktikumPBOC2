/* Nama File    : Main.java
 * Deskripsi    : Berisi main driver untuk menguji implementasi dari konsep generik
 * Pembuat      : Aswalila Adha Putri Telaumbanua - 24060124120014
 * Tanggal      : 2 Mei 2026
 */

public class Main {
    public static void main(String[] args){

        // Data awal
        Datum<Anabul> data = new Datum<>(new Kucing("Lesha", 3.5));
        Datum<Anabul> data2 = new Datum<>(new Anjing("Puppy"));

        System.out.println("Data awal:");
        Datum.tampilkanAnabul(data.getIsi());
        Datum.tampilkanAnabul(data2.getIsi());
        System.out.println();

        data.setIsi(new Anggora("Suki", 4.2));
        Datum.tampilkanAnabul(data.getIsi());
        System.out.println();

        data.setIsi(new Kembangtelon("Kiko", 5.1));
        Datum.tampilkanAnabul(data.getIsi());

        // Method generik
        System.out.println("\nProsedur Tukar");

        Datum<Anabul> hewan1 = new Datum<>(new Kucing("Lili", 4.5));
        Datum<Anabul> hewan2 = new Datum<>(new Anjing("Popi"));

        System.out.println("Sebelum tukar:");
        Datum.tampilkanAnabul(hewan1.getIsi());
        Datum.tampilkanAnabul(hewan2.getIsi());

        OperatorGenerik.Tukar(hewan1, hewan2);

        System.out.println("Setelah tukar:");
        Datum.tampilkanAnabul(hewan1.getIsi());
        Datum.tampilkanAnabul(hewan2.getIsi());

        // Generik integer
        Datum<Integer> angka1 = new Datum<>(3);
        Datum<Integer> angka2 = new Datum<>(6);

        System.out.println("\nTukar angka:");
        System.out.println("Sebelum: " + angka1.getIsi() + " , " + angka2.getIsi());

        OperatorGenerik.Tukar(angka1, angka2);

        System.out.println("Sesudah: " + angka1.getIsi() + " , " + angka2.getIsi());
    }
}