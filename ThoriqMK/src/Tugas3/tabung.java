/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas3;

import java.util.Scanner;

/**
 *
 * @author Aharfi
 */
public class tabung extends lingkaran {
    double t,volume,luaspermukaan,diameter;
    
    double Hitvolume(){
        volume = 3.14*r*r*t;
        return volume;
    }
    double Hitluaspermukaan(){
        luaspermukaan = (2*3.14*r*r)+(2*3.14*r*t);
        return luaspermukaan;
    }
    public tabung(double r, double t) {
        super(r); 
        this.t = t;
    }

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jari-jari tabung (r): ");
        double r = input.nextDouble();

        System.out.print("Masukkan tinggi tabung (t): ");
        double t = input.nextDouble();
        tabung Tabung = new tabung(r,t);
        
        double volume = Tabung.Hitvolume();
        double luasPermukaan = Tabung.Hitluaspermukaan();

        System.out.println("Volume tabung: " + volume);
        System.out.println("Luas permukaan tabung: " + luasPermukaan);
        double catPerMeterSquare = 1.0; // 1 liter untuk 0.5 m^2
        double totalCatNeeded = luasPermukaan / 0.5 * catPerMeterSquare;
        System.out.println("Jumlah cat yang diperlukan: " + totalCatNeeded + " liter");

        input.close();

    }
}
