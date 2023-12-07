/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas5;

/**
 *
 * @author Aharfi
 */
public class GajiManager extends HitGaji {
    int jmlHadir, jmlLembur;

    GajiManager(int jmlHadir, int jmlLembur) {
        this.jmlHadir = jmlHadir;
        this.jmlLembur = jmlLembur;
    }

    @Override
    int HitungGaji() {
        return GjPokok + (jmlHadir * T_hadir) + (jmlLembur * lmbr);
    }
}
