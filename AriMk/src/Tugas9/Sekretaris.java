/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas9;

/**
 *
 * @author Aharfi
 */
public class Sekretaris extends Pegawai {
    public Sekretaris(){
        super();
        this.ID = "SK001";
        this.nama = "Michi dino";
    }
    @Override
    int hitGaji() {
        Gatot = Gapok + (jmlHadir*T_hadir);
        return Gatot;
    }  
}
