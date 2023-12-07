/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Pertemuan3;

/**
 *
 * @author Aharfi
 */
public class Tabung {

    /**
     * @param args the command line arguments
     */
     double r,t,phi,l,k,v,lp;
    
    void dataJari(double r){
        this.r = r;
    }
    void dataTinggi(double t){
        this.t = t;
    }
    void dataPhi(double phi){
        this.phi = phi;
    }
    
    double cetakJari(){
        return r;
    }
    double cetakTinggi(){
        return t;
    }
    double cetakPhi(){
        return phi;
    }
    double Hit_L(){
        l = phi*r*r;
        return l;
    }
    double Hit_K(){
        k = 2*phi*r;
        return k;
    }
    double Vol(){
        v = phi*r*r*t;
        return v;
    }
    double LuasPermukaan(){
        lp = (2*phi*r*r)+(2*phi*r*t);
        return lp;
    }
    Tabung(){
        phi = 3.14;
        r = 30;
        t = 80;
    }
    public static void main(String[]args) {
        // TODO code application logic here
         Tabung bgn = new Tabung();
         bgn.dataPhi(3.14);
         System.out.println("Bangun Ruang Tabung");
         System.out.println("Jari-Jari Tabung : " + bgn.r);
         System.out.println("Tinggi Tabung : " + bgn.t);
         System.out.println("Rumus Phi : " + bgn.phi);
         System.out.println("Hasil Perhitungan Luas : " + bgn.Hit_L());
         System.out.println("Hasil Perhitungan Keliling : " + bgn.Hit_K());
         System.out.println("Hasil Perhitungan Volume : " + bgn.Vol());
         System.out.println("Hasil Perhitungan Luas Permukaan : " + bgn.LuasPermukaan());
    }
}
