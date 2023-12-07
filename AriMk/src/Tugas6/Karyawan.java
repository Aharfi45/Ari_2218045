/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas6;

/**
 *
 * @author Aharfi
 */
public class Karyawan extends Pegawai {
    int GjTotal;
    public Karyawan(){
        this.nama = "Kiseki";
        this.alamat = "jl.bambu";
    }
    @Override
    int hitGaji() {
        GjTotal = GjPokok;
        return GjTotal;
    }
}
