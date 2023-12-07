/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tgs9;

/**
 *
 * @author Aharfi
 */
public class Sekretaris extends Pegawai{
    int jmlHadir;
    public Sekretaris(){
        super();
        this.nama = "Carl";
    }
    @Override
    public int hitGaji(){
        Gajitot = Gajipok + (jmlHadir*T_hadir);
        return Gajitot;
    }
    public void setJmlhadir(int jmlhadir) {
        this.jmlHadir = jmlhadir;
    }
    public int getJmlHadir(){
        return jmlHadir;
    }
}
