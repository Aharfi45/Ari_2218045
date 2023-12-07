/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas7;

/**
 *
 * @author Aharfi
 */
public class GajiKaryawan extends GajiPegawai{
    String ID_kar;
    String ID_kar(){
        return ID_kar;
    }
    void ID_karyawan(String ID_kar){
        this.ID_kar = ID_kar;
    }
    
    @Override
    int HitungGaji() {
        GjTotal = GjPokok;
        return GjTotal;
    }
    public GajiKaryawan() {
        this.ID_kar = "KR001";
    }
}
