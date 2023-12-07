/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan6;

/**
 *
 * @author Aharfi
 */
public class Mamalia extends MahklukHidup{

    public Mamalia() {
        nama = "Anjing";
        tinggi = 60;
        berat = 4;
    }

    @Override
    String bernafas() {
        return "Bernafas Menggunakan Paru-Paru";
    }
}
