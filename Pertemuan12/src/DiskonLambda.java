/* Nama File    : DiskonLambda.java
 * Deskripsi    : Berisi implementasi ekspresi lambda dasar, digunakan untuk menghitung diskon.
 * Pembuat      : Aswalila Adha Putri Telaumbanua - 24060124120014
 * Tanggal      : 04 Juni 2026
 * */

// Interface untuk mendefinisikan method hitungDiskon
interface IDiskon {
    public double hitungDiskon(int harga);
}

public class DiskonLambda {
    public static void main(String[] args) {
        // Tanpa lambda 
        IDiskon diskonMerdeka = new IDiskon() {
            public double hitungDiskon(int harga) {
                return harga - (harga * 0.3);
            }
        };
        
        // Lambda inline digunakan untuk logika sederhana satu baris tanpa percabangan
        IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4);
        
        // Lambda blok statement digunakan untuk logika kompleks yang butuh if-else
        IDiskon diskonBiasa = (harga) -> {
            return harga - (harga * 0.1);
        };

        // Menampilkan hasil diskon
        System.out.println("Diskon Merdeka : " + diskonMerdeka.hitungDiskon(45000));
        System.out.println("Diskon Lebaran : " + diskonLebaran.hitungDiskon(45000));
        System.out.println("Diskon Biasa : " + diskonBiasa.hitungDiskon(45000));
    }
}