/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3;

/**
 *
 * @author Aharfi
 */
public class main {
    public static void main(String[]args){
         Lingkaran bgn = new Lingkaran();
         bgn.dataJari(20);
         bgn.dataPhi(3.14);
         
         System.out.println("Bangun Ruang Lingkarang");
         System.out.println("Jari-Jari Lingkaran : " + bgn.cetakJari());
         System.out.println("Rumus Phi : " + bgn.cetakPhi());
         System.out.println("Hasil Perhitungan Luas : " + bgn.Hit_L());
         System.out.println("Hasil Perhitungan Keliling : " + bgn.Hit_K());
    }
}
