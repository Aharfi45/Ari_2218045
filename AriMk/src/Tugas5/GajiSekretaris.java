/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas5;

/**
 *
 * @author Aharfi
 */
public class GajiSekretaris extends HitGaji {
    int jmlHadir;

    GajiSekretaris(int jmlHadir) {
        this.jmlHadir = jmlHadir;
    }

    @Override
    int HitungGaji() {
        return GjPokok + (jmlHadir * T_hadir);
    }
}
