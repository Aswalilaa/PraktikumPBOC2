/* Nama File : BangunDatar.java
 * Deskripsi : berisi atribut dan method dalam class Bangun Datar
 * Pembuat   : Aswalila Adha Putri Telaumbanua
 * Tanggal   : 12 Maret 2026
*/

public class BangunDatar {
    /************* ATRIBUT *************/
    private int jmlSisi;
    private String warna;
    private String border;
    private static int counterBangunDatar = 0;

    /************* METHOD *************/
    // Konstruktor tanpa parameter
    public BangunDatar(){
        this.jmlSisi = 0; 
        this.warna = ""; 
        this.border = "";
        counterBangunDatar++;
    }

    // Konstruktor dengan parameter
    public BangunDatar(int jmlSisi, String warna, String border){
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    // Getter atau Selektor
    public int getJmlSisi(){
        return jmlSisi;
    }

    public String getWarna(){
        return warna;
    }

    public String getBorder(){
        return border;
    }
    
    // Setter atau Mutator
    public void setJmlSisi(int jmlSisi){
        this.jmlSisi = jmlSisi;
    } 

    public void setWarna(String warna){
        this.warna = warna;
    }

    public void setBorder(String border){
        this.border = border;
    }

    public void printInfo(){
        System.out.println("Jumlah sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }

    public static void printCounterBangunDatar(){
        System.out.println("Jumlah objek Bangun Datar: " + counterBangunDatar);
    }

}