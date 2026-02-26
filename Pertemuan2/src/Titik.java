/* Nama File : Titik.java
 * Deskripsi : berisi atribut dan method dalam class Titik
 * Pembuat   : Aswalila Adha Putri Telaumbanua
 * Tanggal   : 26 Februari 2026
*/

public class Titik {
    /***********ATRIBUT***********/
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /***********METHOD***********/
    //konstruktor untuk membuat titik (0,0)
    Titik(double absis, double ordinat){ //Overloading constructor
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    //konstruktor untuk membuat titik (0,0)
    Titik(){
        this(0,0);
    }

    //mengembalikan nilai counterTitik
    static int getCounterTitik(){
        return counterTitik;
    }
    
    //mengembalikan nilai absis
    double getAbsis(){
        return absis;
    }

    //mengembalikan nilai ordinat()
    double getOrdinat(){
        return ordinat;
    }

    //mengeset absis titik dengan nilai baru x
    void setAbsis(double x){
        absis = x;
    }

    //mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y){
        ordinat = y;
    }

    //menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    double getKuadran(){
        if (absis > 0 && ordinat > 0){
            return 1;
        } else if (absis < 0 && ordinat > 0){
            return 2;
        } else if (absis < 0 && ordinat < 0){
            return 3;
        } else if (absis > 0 && ordinat < 0){
            return 4;
        } else {
            return 0;
        }
    }

    double getJarakPusat(){
        return Math.sqrt(absis*absis + ordinat*ordinat);
    }

    public double getJarak(Titik T){
        return Math.sqrt((absis - T.absis)*(absis - T.absis) + (ordinat - T.ordinat)*(ordinat - T.ordinat));
    }

    void refleksiX(){
        this.ordinat = -this.ordinat;
    }

    void refleksiY(){
        this.absis = -this.absis;
    }

    Titik getRefleksiX(){
        return new Titik(absis, -ordinat);
    }

    Titik getRefleksiY(){
        return new Titik(-absis, ordinat);
    }

    //mencetak koordinat titik
    void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    void printCounterTitik(){
        System.out.println(counterTitik);
    }

} //end class Titik