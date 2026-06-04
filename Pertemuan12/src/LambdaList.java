/* Nama File    : LambdaList.java
 * Deskripsi    : Berisi implementasi ekspresi lambda pada List, digunakan sebagai parameter pada method.
 * Pembuat      : Aswalila Adha Putri Telaumbanua - 24060124120014
 * Tanggal      : 04 Juni 2026
 * */

import java.util.ArrayList;

public class LambdaList {
    public static void main(String[] args) {
        // Membuat objek ArrayList<String> untuk menyimpan daftar nama mahasiswa
        ArrayList<String> mahasiswaList = new ArrayList<>();

        // Menambahkan nama mahasiswa ke dalam ArrayList dengan add
        mahasiswaList.add("Adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");
        
        // Lambda digunakan sebagai parameter
        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
}