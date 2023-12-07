/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1;

/**
 *
 * @author Aharfi
 */
public class keyboard {
    String merk,model,keycaps,jenisSwitch;
    double harga;
    int stok;
    //inisialisasi data
    void dataMerek(String merek){
        this.merk = merek;
    }
    void dataModel(String model){
        this.model = model;
    }
    void dataKeycaps(String keycaps){
        this.keycaps = keycaps;
    }
    void dataSwitch(String jenisSwitch){
        this.jenisSwitch = jenisSwitch;
    }
    void dataHarga(double harga){
        this.harga = harga;
    }
    void dataStok(int stok){
        this.stok = stok;
    }
    
    String cetakMerek(){
        return merk;
    }
    String cetakModel(){
        return model;
    }
    String cetakKeycaps(){
        return keycaps;
    }
    String cetakSwitch(){
        return jenisSwitch;
    }
    double cetakHarga(){
        return harga;
    }
    int cetakStok(){
        return stok;
    }
    //method
    void tambahStock(int jumlah){
        if (jumlah > 0) {
            stok += jumlah;
        }
    }
    void jualKeyboard(int jumlah){
        if (jumlah > 0 && jumlah <= stok) {
            stok -= jumlah;
        } else {
            System.out.println("Keyboard lagi kosong , tidak bisa dijual");
        }
    }
    
}

