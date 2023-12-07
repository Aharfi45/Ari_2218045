/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pery;

/**
 *
 * @author Aharfi
 */
public class ROKOK {
    String nama,merk,model,warna,tipe;
    double nikotin,harga;
    int stok;
    
    void dataNama(String nama){
        this.nama = nama;
    }
    void dataMerk(String merek){
        this.merk = merek;
    }
    void dataModel(String model){
        this.model = model;
    }
    void dataWarna(String warna){
        this.warna = warna;
    }
    void dataTipe(String tipe){
        this.tipe = tipe;
    }
    void dataNikotin(double nikotin){
        this.nikotin = nikotin;
    }
    void dataHarga(double harga){
        this.harga = harga;
    }
    void dataStok(int stok){
        this.stok = stok;
    }
    
    String cetakNama(){
        return nama;
    }
    String cetakMerk(){
        return merk;
    }
    String cetakModel(){
        return model;
    }
    String cetakWarna(){
        return warna;
    }
    String cetakTipe(){
        return tipe;
    }
    double cetakNikotin(){
        return nikotin;
    }
    double cetakHarga(){
        return harga;
    }
    int cetakStok(){
        return stok;
    }
    void tambahStok(int jumlah){
        if (jumlah > 0) {
            stok += jumlah;
        }
    }
    void jual(int jumlah){
        if (stok >= jumlah) {
            stok -= jumlah;
            System.out.println("Penjualan berhasil. Stok sekarang: " + this.stok);
        } else {
            System.out.println("Stok Rokok lagi kosong , tidak bisa dijual");
        }
    }
    
    ROKOK(){
        this.nama = "Suliya";
        this.merk = "suliya";
        this.model = "putih";
        this.warna = "orange";
        this.tipe = "filter";
        this.nikotin = 300;
        this.stok = 100;
        this.harga = 25000;

    }
}
