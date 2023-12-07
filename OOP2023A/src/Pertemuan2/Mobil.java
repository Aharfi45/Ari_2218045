/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan2;

/**
 *
 * @author Aharfi
 */
public class Mobil {
    // Attribute
   String merek;
   String model;
   int tahunProduksi;
   String warna;
   double harga;
    // Method
     // non void -> function
        String jalan(){
            return "injak pedal gas";
        }
     // void -> procedure
        void setJudul(){
            System.out.println("Belajar Java");
        }
    // Constructor
    Mobil(){
        this.merek = "AE86";
        this.model = "BLACK LIMITED";
        this.tahunProduksi = 2000;
        this.warna = "HITAM";
        this.harga = 2000000;
    }
}
