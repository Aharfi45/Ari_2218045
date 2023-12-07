/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas7;

/**
 *
 * @author Aharfi
 */
public class GajiSekretaris extends GajiPegawai{
    int jmlHadir;
    String ID_Sek;
    String ID_Sek(){
        return ID_Sek;
    }
    void ID_Sekretaris(String ID_Sek){
        this.ID_Sek = ID_Sek;
    }

    @Override
    int HitungGaji() {
        GjTotal = GjPokok + (jmlHadir*T_hadir);
        return GjTotal;
    }
    
}
