/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas6;

/**
 *
 * @author Aharfi
 */
public class Manager extends Pegawai {
    int jmlHadir,jmlLembur,T_hadir,lmbr,GjTotal;
    public Manager(){
        this.nama = "Joko";
        this.alamat = "jl.bambu";
        this.jmlHadir = 0;
        this.T_hadir = 25000;
        this.jmlLembur = 0;
        this.lmbr = 40000;
    }
    @Override
    int hitGaji() {
        GjTotal = GjPokok + (jmlHadir*T_hadir)+(jmlLembur*lmbr);
        return GjTotal;
    }
}
