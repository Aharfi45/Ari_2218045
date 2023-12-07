/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan7;

/**
 *
 * @author Aharfi
 */
public abstract class MakhlukHidup{
    
    private String nama;
    public void setNama(String nama) {
        this.nama = nama;
    }
    String kelasMH(Mamalia A){
        return nama + "Makhluk hiudp kelas mamalia";
    }
    String kelasMH (Pisces A){
        return nama + "Mahkluk hidup kelas pices";
    }
    abstract String bernafas();
}
