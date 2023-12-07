/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tgs8;

/**
 *
 * @author Aharfi
 */
public class Sekretaris extends Abstract_Gaji{
    int jmlHadir;
    public Sekretaris(){
        super();
        this.Nama = "Carl";
    }
    @Override
    public int hitungGaji(){
        Gatot = Gapok + (jmlHadir*T_hadir);
        return Gatot;
    }
    public void setJmlhadir(int jmlhadir) {
        this.jmlHadir = jmlhadir;
    }
    public int getJmlHadir(){
        return jmlHadir;
    }
    
}
    