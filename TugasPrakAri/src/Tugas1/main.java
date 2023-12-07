/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1;

/**
 *
 * @author Aharfi
 */
public class main {
    public static void main (String[]args){
        keyboard mecha =  new keyboard();
        mecha.dataMerek("Vortex");
        mecha.dataModel("GT65 Japan Sign Road");
        mecha.dataKeycaps("Japan Sign Road Cherry Profile with PBT Dye Sub");
        mecha.dataSwitch("Aflion Blue Sky");
        mecha.dataHarga(1000000);
        mecha.dataStok(15);
        
        System.out.println("***************************************");
        System.out.println("          Keyboard Mechanical");
        System.out.println("***************************************");
        System.out.println("Merek keyboard : " + mecha.cetakMerek());
        System.out.println("Model keyboard : " + mecha.cetakModel());
        System.out.println("Keycaps : " + mecha.cetakKeycaps());
        System.out.println("Jenis switch : " + mecha.cetakSwitch());
        System.out.println("Harga keyboard : " + mecha.cetakHarga());
        System.out.println("Stok keyboard : " + mecha.cetakStok());
        
        mecha.tambahStock(5);
        mecha.jualKeyboard(10);
        
        System.out.println("***************************************");
        System.out.println("          Data Setelah Perubahan");
        System.out.println("***************************************");
        System.out.println("Merek keyboard : " + mecha.cetakMerek());
        System.out.println("Model keyboard : " + mecha.cetakModel());
        System.out.println("Keycaps : " + mecha.cetakKeycaps());
        System.out.println("Jenis switch : " + mecha.cetakSwitch());
        System.out.println("Harga keyboard : " + mecha.cetakHarga());
        System.out.println("Stok keyboard : " + mecha.cetakStok());
        
    }
}
