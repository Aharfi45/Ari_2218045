/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Bab3.Inheritance;

/**
 *
 * @author Aharfi
 */
public class Prisma_Segitiga extends segitiga{

    double tinggiPrisma,volume;
    double volumePrisma(){
        volume = (Hitluas()*tinggiPrisma);
        return volume;
    }
}
