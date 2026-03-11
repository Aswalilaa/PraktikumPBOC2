/* Nama File : MMahasiswa.java
 * Deskripsi : main class yang menggunakan class Mahasiswa, Dosen, Kendaraan, dan MataKuliah
 * Pembuat   : Aswalila Adha Putri Telaumbanua
 * Tanggal   : 05 Maret 2026
*/

public class MMahasiswa{
    public static void main(String[] args) {
        // Variabel
        MataKuliah Jarkom, IMK, RPL, MTK, KWU;

        // ArrayList<MataKuliah> listMatkul;
        Mahasiswa M1, M2, M3, M4;
        Kendaraan K1, K2, K3;
        Dosen D1, D2, D3;

        // Testing
        Jarkom = new MataKuliah("Jarkom", "Jaringan Komputer", 3);
        IMK = new MataKuliah("IMK", "Interaksi Manusia dan Komputer", 3);
        RPL = new MataKuliah("RPL", "Rekayasa Perangkat Lunak", 3);
        MTK = new MataKuliah("Matematika", "Matematika", 4);
        KWU = new MataKuliah("KWU", "Kewirausahaan", 2);

        M1 = new Mahasiswa("014", "Dasha Taran", "Hubungan Internasional");
        M2 = new Mahasiswa("118", "Michelle Morrone", "Informatika");
        M3 = new Mahasiswa("036", "Ariana Grande", "Hukum");
        M4 = new Mahasiswa("122", "Selena Gomez", "Manajemen");

        K1 = new Kendaraan("BK 3552 NYT", "Motor Vario");
        K2 = new Kendaraan("BB 7174 KFH", "Motor Harley");
        K3 = new Kendaraan("B 5990 GZI", "Mobil Rush");

        D1 = new Dosen("088", "Laskar Anzar", "Informatika");
        D2 = new Dosen("231", "Nikita Willy", "Hubungan Internasional");
        D3 = new Dosen("333", "Rafani Nikmah", "Manajemen");

        M1.setDosenWali(D2);
        M2.setDosenWali(D2);
        M3.setDosenWali(D1);
        M4.setDosenWali(D3);

        M1.setKendaraan(K2);
        M2.setKendaraan(K3);
        M3.setKendaraan(K1);

        M1.addMatkul(Jarkom);
        M1.addMatkul(IMK);
        M1.addMatkul(KWU);

        M2.addMatkul(KWU);
        M2.addMatkul(Jarkom);
        M2.addMatkul(RPL);

        M3.addMatkul(MTK);
        M3.addMatkul(IMK);
        M3.addMatkul(RPL);

        M4.addMatkul(KWU);
        M4.addMatkul(Jarkom);
        M4.addMatkul(RPL);

        M1.printDetailMhs();
        M2.printDetailMhs();
        M3.printDetailMhs();
        M4.printDetailMhs();
    }
}