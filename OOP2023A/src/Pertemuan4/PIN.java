/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4;

/**
 *
 * @author Aharfi
 */
public class PIN {
    String nama,inputUser,hasilCocok;
    private String pin;
    public PIN(){
        this.pin = "2218045";
    }
    //mutator
    public void setPin(String pin) {
        this.pin = pin;
    }
    String cocokanPin(){
        if(pin.compareTo(inputUser)==0){
            hasilCocok = "Pin benar !!";
        }else{
            hasilCocok = "Pin salah !!";
        }
        return hasilCocok;
    }
}
