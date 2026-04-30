/* Nama File    : Anabul.java 
 * Deskripsi    : Class untuk induk Anabul yang assign nama dan perilaku gerak dan bersuar
 * Pembuat      : Aswalila Adha Putri Telaumbanua - 24060124120014
 * Tanggal      : 23 April 2026
 */

public abstract class Anabul {
    protected String Nama;

    public Anabul(String nama){
        this.Nama = nama;
    }

    public String getNama(){ 
        return Nama; 
    }

    public abstract void Gerak();
    public abstract void Bersuara();
}