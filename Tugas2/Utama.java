/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas2;

/**
 *
 * @author ncahy
 */
public class Utama {
    public static void main(String[] args) {
        //ini Constructor
        Pembalap pembalap = new Pembalap("Lewis Hamilton", 36, "Mercedes", 44);

        //ini interface
        pembalap.balapan();
        pembalap.tampilkanTim();
        pembalap.memancing();
        pembalap.bersepeda();
        
        //ini Casting
        Manusia ilham = (Manusia) pembalap;
        ilham.setNama("Cahyo");
        ilham.setUsia(20);
        System.out.println("nama "+ilham.getNama());
        System.out.println("umur "+ilham.getUsia());
    }
}

