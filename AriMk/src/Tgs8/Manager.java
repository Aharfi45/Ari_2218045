/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tgs8;

/**
 *
 * @author Aharfi
 */
public class Manager extends Abstract_Gaji{
    int jmlHadir,jmlLembur;
    public Manager(){
        super();
        this.Nama = "THORIQ";
    }
    @Override
    public int hitungGaji() {
        Gatot = Gapok + (jmlHadir*T_hadir) + (jmlLembur*Lembur);
        return Gatot;
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
