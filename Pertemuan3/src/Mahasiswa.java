/* Nama File : Mahasiswa.java
 * Deskripsi : berisi atribut dan method dalam class Mahasiswa
 * Pembuat   : Aswalila Adha Putri Telaumbanua
 * Tanggal   : 05 Maret 2026
*/

import java.util.ArrayList;

public class Mahasiswa {
    /************* ATRIBUT *************/
    private String nim;
    private String nama;
    private String prodi;
    private ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    /************* METHOD *************/
    // Konstruktor tanpa parameter
    public Mahasiswa(){
        this.nim = "";
        this.nama = "";
        this.prodi = "";
        this.listMatkul = new ArrayList<>();
    }

    // Konstruktor dengan parameter
    public Mahasiswa(String nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatkul = new ArrayList<>();
    }

    // Getter atau Selektor
    public String getNim(){
        return nim;
    }

    public String getNama(){
        return nama;
    }

    public String getProdi(){
        return prodi;
    }

    public ArrayList<MataKuliah> getListMatkul() {
        return listMatkul;
    }

    public Dosen getDosenWali(){
        return dosenWali;
    }

    public Kendaraan getKendaraan(){
        return kendaraan;
    }

    // Setter atau Mutator
    public void setNim(String nim){
        this.nim = nim;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setProdi(String prodi){
        this.prodi = prodi;
    }

    public void setListMatkul(ArrayList<MataKuliah> listMatkul) {
        this.listMatkul = listMatkul;
    }

    public void setDosenWali(Dosen dosenWali){
        this.dosenWali = dosenWali;
    }

    public void setKendaraan(Kendaraan kendaraan){
        this.kendaraan = kendaraan;
    }

    // Method lain
    public void addMatkul(MataKuliah M) {
        listMatkul.add(M);
    }

    // Menjumlahkan sks dari listmatkul
    public int getJumlahSks() {
        int i, Jumlah = 0;
        for(i=0; i<listMatkul.size(); i++) {
            Jumlah += listMatkul.get(i).getSks();
        }
        return  Jumlah;
    }

    // Mengembalikan jumlah matkul yang diambil
    public int getJumlahMatkul() {
        return listMatkul.size();
    }

    // Menampilkan nim, nama, prodi mahasiswa
    public void printMhs() {
        System.out.println("nim : " + nim);
        System.out.println("nama : " + nama);
        System.out.println("prodi: " + prodi);
    }

    // Menampilkan detail mahasiswa
    public void printDetailMhs() {
        int i;
        System.out.println("nim: " + nim);
        System.out.println("nama: " + nama);
        System.out.println("prodi: " + prodi);
        System.out.println("Mata kuliah diambil : ");
        for(i=0; i<listMatkul.size(); i++) {
            System.out.println("- " + listMatkul.get(i).getNama() + ", ");
        }

        System.out.println("Data dosen wali :");
        System.out.println("Nama: " + dosenWali.getNama());
        System.out.println("NIP : " + dosenWali.getNip());
        System.out.println("Prodi : " + dosenWali.getProdi());
        if(this.getKendaraan() != null) {
            System.out.println("Data kendaraan :\nPlat : " + kendaraan.getNoPlat() + "\nJenis : " + kendaraan.getJenis() + "\n");
        }
        else {
            System.out.println("Tidak ada kendaraan\n");
        }
    }  
} 