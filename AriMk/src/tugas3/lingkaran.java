/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3;

/**
 *
 * @author Aharfi
 */
public class lingkaran {
    //atribut
    double r,luas,keliling,pi;
    //method 
    double Hitluas(){
        luas = pi*r*r;
        return luas;
    }
    double Hitkeliling(){
        keliling = 2 * pi * r;
        return keliling;
    }
    //konstruktor   
    public lingkaran(double r){
        this.r = r;
        this.pi = 3.14;
    }
    public lingkaran(){
        this.r=0;
    }}



