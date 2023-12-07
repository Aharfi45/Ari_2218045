/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Per10;

/**
 *
 * @author Aharfi
 */
public class D2 {
    public static void main(String[]args){
        Lat2 obj = new Lat2();
        for(int i=0;i<=2;i++){
            System.out.println(obj.nama[i]);
        }
        try{
            obj.nama[3]= "Wahyu";
            System.out.println(obj.nama[3]);
        }catch(Exception a){
            System.out.println(a);
        }
    }
}
