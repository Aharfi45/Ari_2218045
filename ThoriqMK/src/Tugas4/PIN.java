/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas4;

/**
 *
 * @author Aharfi
 */
public class PIN {
 //atribut

    String Nama;
    private String Pin;
    String inputUser;
    String hasil;
//konstruktor

    public PIN() {
        Pin = "2218048";
    }
//mutator/setter

    public void setInputUser(String inputUser) {
        this.inputUser = inputUser;
    }
//method

    String cocokkanPin() {
        if (Pin.compareTo(inputUser) == 0) {
            hasil = "PIN Benar !!";
        } else {
            hasil = "PIN Salah !!";
        }
        return hasil;
    }
}