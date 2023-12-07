/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tgs8;

/**
 *
 * @author Aharfi
 */
public abstract class Abstract_Gaji implements GajiInterface{
    String Nama;
    int Gapok,Gatot,T_hadir,Lembur,jmlHadir,jmlLembur;
    
    public void dataNama(String Nama) {
        this.Nama = Nama;
    }
    String cetakNama(){
        return Nama;
    }
        
    public String getNama() {
        return Nama;
    }
    
    public Abstract_Gaji() {
        Gapok = 3000000;
        T_hadir = 15000;
        Lembur = 25000;
    }
    public abstract int hitungGaji();
}
