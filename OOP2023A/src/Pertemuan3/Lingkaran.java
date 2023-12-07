/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3;

/**
 *
 * @author Aharfi
 */
public class Lingkaran {
    double r,phi,l,k;
    
    void dataJari(double r){
        this.r = r;
    }
    void dataPhi(double phi){
        this.phi = phi;
    }
    
    double cetakJari(){
        return r;
    }
    double cetakPhi(){
        return phi;
    }
    
    double Hit_L(){
        l = phi*r*r;
        return l;
    }
    double Hit_K(){
        k = 2*phi*r;
        return k;
    }
    
}
