/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;

/**
 *
 * @author Aharfi
 */
public class Hardisk {
    String merk,model,kapasitas,speed,ketebalan;
    double harga;
    //Konstruktor
    public Hardisk(){
        this.merk = "WD";
        this.model = "WD - Black";
        this.kapasitas = "2000GB";
        this.speed = "7400RPM";
        this.ketebalan = "4Cm";
        this.harga = 1700000;
    }
    //Method
    void HardiskRead(){
        System.out.println("Hardisk membaca data");
    }
    void HardiskWrite(){
        System.out.println("Hardisk menulis data");
    }
    void HardiskStop(){
        System.out.println("Hardisk berhenti");
    }
}
