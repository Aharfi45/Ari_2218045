/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas8;

/**
 *
 * @author Aharfi
 */
public class Pegawai implements Gaji{
    String nama,ID;
    int Gapok,Gatot,T_trans,Lembur,jmlHadir,jmlLembur;
    public Pegawai(){
        Gapok = 3200000;
        T_trans = 25000;
        Lembur = 20000;
    }
    public void dataNama(String Nama) {
        this.nama = nama;
    }
    String cetakNama(){
        return nama;
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

    @Override
    public int hitungGaji() {
        Gatot = Gapok;
        return Gatot;
    }
    
}
