/* Nama File    : LambdaMap.java
 * Deskripsi    : Berisi implementasi lambda pada map untuk menampilkan key (NIM) dan value (nama mahasiswa).
 * Pembuat      : Aswalila Adha Putri Telaumbanua - 24060124120014
 * Tanggal      : 04 Juni 2026
 * */

import java.util.HashMap;
import java.util.Map;

public class LambdaMap {
    public static void main(String[] args) {
        // Membuat objek Map untuk menyimpan NIM dan nama mahasiswa
        Map<String, String> mahasiswaMap = new HashMap<>();

        // Menambahkan data mahasiswa ke dalam Map dengan put(key, value)
        mahasiswaMap.put("24060124120010", "Adi");
        mahasiswaMap.put("24060124120011", "Bambang");
        mahasiswaMap.put("24060124120012", "Cici");
        mahasiswaMap.put("24060124120013", "Didi");

        // Lambda untuk menampilkan key dan value dari MAP
        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM : " + nim + ", Nama : " + nama));
    }
}