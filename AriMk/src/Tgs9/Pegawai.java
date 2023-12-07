/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tgs9;

/**
 *
 * @author Aharfi
 */
public abstract class Pegawai {
    String nama;
    int Gajipok,Gajitot,T_hadir,Lembur,jmlHadir,jmlLembur;
    public Pegawai(){
        Gajipok = 3200000;
        T_hadir = 25000;
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
    abstract int hitGaji();
    public static class GjException extends Exception {
            public GjException(String message) {
                super(message);
            }
    }   
}
