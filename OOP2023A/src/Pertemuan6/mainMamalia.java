/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan6;

/**
 *
 * @author Aharfi
 */
public class mainMamalia {
    public static void main(String[]args){
        Mamalia anjing =  new Mamalia();
        System.out.println("Nama Hewan : " + anjing.nama);
        System.out.println("Tinggi Hewan : " + anjing.tinggi);
        System.out.println("Berat Hewan : " + anjing.berat);
        System.out.println("Cara Bernafas : " + anjing.bernafas());
    }
}
