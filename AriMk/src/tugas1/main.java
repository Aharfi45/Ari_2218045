/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;

/**
 *
 * @author Aharfi
 */
public class main {
    public static void main(String[]args){
        Hardisk penyimpanan = new Hardisk();
         System.out.println("merek hardisk : " + penyimpanan.merk);
        System.out.println("model hardisk : " + penyimpanan.model);
        System.out.println("kapasitas hardisk : " + penyimpanan.kapasitas);
        System.out.println("speed hardisk : " + penyimpanan.speed);
        System.out.println("ketebalan hardisk : " + penyimpanan.ketebalan);
        System.out.println("harga hardisk : " + penyimpanan.harga);
        
        System.out.println("Cara hardisk bekerja : ");
        penyimpanan.HardiskRead();
        penyimpanan.HardiskWrite();
        penyimpanan.HardiskStop();
    }
}
