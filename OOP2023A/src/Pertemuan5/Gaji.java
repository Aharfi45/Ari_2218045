/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan5;

/**
 *
 * @author Aharfi
 */
public class Gaji {
    int GjPokok,T_hadir,lmbr,GjTotal;
    
    Gaji(){
        this.GjPokok = 3200000;
        this.T_hadir = 25000;
        this.lmbr = 40000;
    }
    int GajiKar(){
       GjTotal = GjPokok;
       return GjTotal;
    }
    int GajiSekretaris(int jmlHadir){
        GjTotal = GjPokok + (jmlHadir*T_hadir);
        return GjTotal;
    }
    int GajiManager(int jmlHadir, int jmlLembur){
        GjTotal = GjPokok + (jmlHadir*T_hadir)+(jmlLembur*lmbr);
        return GjTotal;
    } 
}
