/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas7;

/**
 *
 * @author Aharfi
 */
public class GajiManager extends GajiPegawai {
    int jmlHadir,jmlLembur;
    String ID_Manager;
    String ID_Manager(){
        return ID_Manager;
    }
    void ID_Manager(String ID_Manager){
        this.ID_Manager = ID_Manager;
    }

    @Override
    int HitungGaji() {
        GjTotal = GjPokok + (jmlHadir*T_hadir)+(jmlLembur*lmbr);
        return GjTotal;
    }
    
}
