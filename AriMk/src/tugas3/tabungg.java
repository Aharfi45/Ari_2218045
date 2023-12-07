/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3;

/**
 *
 * @author Aharfi
 */
public class tabungg extends Lingkarann{
    //atribut
    double tinggi,hasl,diameter;
    //method
    double volume(){
        hasl = luas()*tinggi;
        return hasl;
    }
    //constructor
    tabungg(){
        this.x = 10;
        this.tinggi = 20;
    }
    public static void main(String[]args){
        tabungg hasil = new tabungg();
        hasil.x = 20;
        hasil.tinggi = 5;
        System.out.println("jari jari : "+hasil.x);
        System.out.println("tinggi : "+hasil.tinggi);
        System.out.println("volume : "+hasil.volume());

    }
}
