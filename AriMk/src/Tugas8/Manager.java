/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas8;

/**
 *
 * @author Aharfi
 */
public class Manager extends Pegawai{
    public Manager(){
        super();
        this.ID = "MG001";
        this.nama = "Tapir parit";
    }
    @Override
    public int hitungGaji() {
        Gatot = Gapok + (jmlHadir*T_trans) + (jmlLembur*Lembur);
        return Gatot;
    }
}
