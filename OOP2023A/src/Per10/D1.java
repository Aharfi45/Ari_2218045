/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Per10;

/**
 *
 * @author Aharfi
 */
public class D1 {
    public static void main(String[]args){
        Lat1 obj = new Lat1();
        obj.bil1 = 20;
        obj.bil2 = 0;
        
        try {
            System.out.println("Hasil Pembagian : " + obj.pembagian());
        }catch(ArithmeticException a){
            System.out.println("Kesalahan karena dibagi dengan 0");
        }  
    }}

