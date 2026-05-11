/* Nama File    : Piaraan.java
 * Deskripsi    : Kelas Piaraan untuk mengelola antrean objek Anabul di klinik
 * Pembuat      : Aswalila Adha Putri Telaumbanua - 24060124120014
 * Tanggal      : 07 Mei 2026
 */

import java.util.LinkedList;

public class Piaraan {
    /********** ATRIBUT **********/
    private int nbelm;
    private LinkedList<Anabul> Lanabul;

    /********** METHOD ***********/
    // Konstruktor
    public Piaraan(){
        Lanabul = new LinkedList<>();
        nbelm = 0;
    }

    // b) i. getNbelm()
    public int getNbelm() {
        return nbelm;
    }

    // b) ii. enqueueAnabul()
    public void enqueueAnabul(Anabul a){
        Lanabul.addLast(a);
        nbelm++;
    }

    // b) iii. isMember(Anabul)
    public boolean isMember(Anabul a){
        return Lanabul.contains(a);
    }

    // b) iv. getAnabul()
    public Anabul getAnabul(){
        if (!Lanabul.isEmpty()){
            return Lanabul.getFirst();
        }
        return null;
    }

    // b) v. dequeueAnabul()
    public Anabul dequeueAnabul(){
        if (!Lanabul.isEmpty()){
            nbelm--;
            return Lanabul.removeFirst();
        }
        return null;
    }

    // c) showAnabul()
    public void showAnabul(){
        System.out.println("Daftar Anabul (nama panggilan);");
        for (Anabul a : Lanabul){
            System.out.println(" - " + a.getNama());
        }
    }

    // d) countKucing()
    public int countKucing(){
        int count = 0;
        for (Anabul a : Lanabul){
            if (a instanceof Kucing){
                count++;
            }
        }
        return count;
    }

    // e) bobotKucing()
    public double bobotKucing(){
        double total = 0;
        for (Anabul a : Lanabul){
            if (a instanceof Kucing){
                total += ((Kucing) a).getBobot();
            }
        }
        return total;
    }

    // f) showJenisAnabul()
    public void showJenisAnabul(){
        System.out.println("Daftar Anabul & Jenis:");
        for (Anabul a : Lanabul) {
            System.out.println("- " + a.getNama() +
                " (" + a.getClass().getName() + ")");
        }
    }

}