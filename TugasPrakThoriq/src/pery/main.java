/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pery;

/**
 *
 * @author Aharfi
 */
public class main {
    public static void main(String[]args){
        // Membuat objek rokok1 dari kelas ROKOK
        ROKOK rokok1 = new ROKOK();

       
        // Menampilkan data menggunakan getter
        System.out.println("Merk: " + rokok1.cetakMerk());
        System.out.println("Model: " + rokok1.cetakModel());
        System.out.println("Warna: " + rokok1.cetakWarna());
        System.out.println("Tipe: " + rokok1.cetakTipe());
        System.out.println("Nikotin: " + rokok1.cetakNikotin());
        System.out.println("Harga: " + rokok1.cetakHarga());
        rokok1.tambahStok(10);
        rokok1.jual(5);

    }
}
