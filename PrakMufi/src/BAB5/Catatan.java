/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB5;

/**
 *
 * @author Aharfi
 */
public class Catatan extends kelola_keuangan{
    String pengeluaran;
    double harga;
    
    void dataPengeluaran(String pengeluaran){
        this.pengeluaran = pengeluaran;
    }
    String cetakPengeluaran(){
        return pengeluaran;
    }
    void dataHargaBarangJasa(double harga){
        this.harga = harga;
    }
    double HargaBarangJasa(){
        return harga;
    }
    @Override
    double kurangSaldo() {
        double saldoakhir = saldoawal - harga;
        return saldoakhir;
    }
    
    
}
