/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas3;

/**
 *
 * @author Aharfi
 */
public class lingkaran {
    //atribut
    double r,luas,keliling,diameter;
    
    //method 
    double Hitluas(){
        luas = 3.14*r*r;
        return luas;
    }
    double Hitkeliling(){
        keliling = 2 * 3.14 * r;
        return keliling;
    }
    //konstruktor   
    public lingkaran(double r){
        this.r = r;
    }
    public lingkaran(){
        this.r=0;
    }
}
