/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3;

/**
 *
 * @author Aharfi
 */
public class Lingkarann {
    //atribut
    double x,pi;
    //method
    double luas(){
    double hsl;
    hsl=pi*x*x;
    return hsl;
    }
    double keliling(){
    double hsl;
    hsl=2*pi*x;
    return hsl;
    }
    //konstruktor
    public Lingkarann(){
    this.x=10;
    this.pi=3.14;
    }
     public static void main (String[]args){
     Lingkarann hasil = new Lingkarann();
     System.out.println("jari jari : "+hasil.x);
     System.out.println("luas : "+hasil.luas());
     System.out.println("keliling : "+hasil.keliling());
    }
}
