/* Nama File    : Data.java
 * Deskripsi    : Berisi class generik Data yang menyimpan elemen dalam array statis dengan kapasitas 100
 * Pembuat      : Aswalila Adha Putri Telaumbanua - 24060124120014
 * Tanggal      : 30 April 2026
 */

import java.util.Arrays;

public class Data<T> {
    /********** ATRIBUT **********/
    private static final int KAPASITAS = 100;
    private final T[] Ruang;
    private int banyak;

    /********** METHOD ***********/
    public Data(T[] contohRuang){
        this.Ruang = Arrays.copyOf(contohRuang, KAPASITAS); 
        this.banyak = 0;
    }

    // Selektor untuk mengambil elemen pada posisi tertentu
    public T getIsi(int posisi){
        return Ruang[posisi - 1];
    }

    // Mutator untuk isi elemen pada posisi tertentu
    public void setIsi(int posisi, T objek){
        if (Ruang[posisi] == null ){
            banyak++;
        }
        Ruang[posisi - 1] = objek;
    }

     // Selektor untuk mengambil jumlah elemen 
    public int getSize() { 
        return banyak;
    }

}