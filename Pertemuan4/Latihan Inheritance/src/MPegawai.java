/* Nama File : MPegawai.java
 * Deskripsi : Main class yang menggunakan class Dosen, Dosen Tamu, Dosen Tetap, Pegawai, dan Tendik
 * Pembuat   : Aswalila Adha Putri Telaumbanua
 * Tanggal   : 12 Maret 2026
*/

import java.time.LocalDate;

public class MPegawai{
    public static void main(String[] args) {
        Tendik T1, T2;
        DosenTetap DTe1, DTe2;
        DosenTamu DTa1, DTa2;

        // Tendik
        T1 = new Tendik("222222", "Zayn Malik", 
                                    LocalDate.of(1990, 3, 22), 
                                    LocalDate.of(2015, 7, 1), 
                                    4500000, "Akademik");

        T2 = new Tendik("333333", "Gigi Hadid", 
                                    LocalDate.of(1982, 11, 5), 
                                    LocalDate.of(2006, 2, 15), 
                                    5200000, "Sumber Daya");

        // Dosen Tetap                  
        DTe1 = new DosenTetap("444444", "Timothee Chalamet", 
                                                LocalDate.of(1980, 4, 10), 
                                                LocalDate.of(2005, 8, 1), 
                                                7000000, "Fakultas Teknik", 
                                                "12345678");

        DTe2 = new DosenTetap("555555", "Bella Hadid", 
                                                LocalDate.of(1985, 9, 14), 
                                                LocalDate.of(2010, 6, 20), 
                                                6800000, "Fakultas Ekonomi", 
                                                "23456789");

        // Dosen Tamu                                        
        DTa1 = new DosenTamu("777777", "Kendal Jenner", 
                                             LocalDate.of(1975, 12, 20), 
                                             LocalDate.of(2015, 1, 1), 
                                             4000000, "Fakultas Kedokteran", 
                                             "87654321",
                                             LocalDate.of(2025, 5, 10));

        DTa2 = new DosenTamu("888888", "Leonardo Dicaprio", 
                                             LocalDate.of(1983, 5, 24), 
                                             LocalDate.of(2018, 9, 10), 
                                             4200000, "Fakultas Hukum", 
                                             "76543210",
                                             LocalDate.of(2025, 5, 11));

        T1.printInfo();
        T2.printInfo();

        DTe1.printInfo();
        DTe2.printInfo();
        
        DTa1.printInfo();
        DTa2.printInfo();
    }
}