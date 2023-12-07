/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tgs9;

/**
 *
 * @author Aharfi
 */
public class Manager extends Pegawai{
     int jmlHadir,jmlLembur;
    public Manager(){
        super();
        this.nama = "THORIQ";
    }
    @Override
    public int hitGaji() {
        Gajitot = Gajipok + (jmlHadir*T_hadir) + (jmlLembur*Lembur);
        return Gajitot;
    }
    public void setJmlhadir(int jmlhadir) {
        this.jmlHadir = jmlhadir;
    }
    public int getJmlHadir(){
        return jmlHadir;
    }
    public void setJmlLembur(int jmlLembur) {
        this.jmlLembur = jmlLembur;
    }
    public int getJmlLembur(){
        return jmlLembur;
    }
}
