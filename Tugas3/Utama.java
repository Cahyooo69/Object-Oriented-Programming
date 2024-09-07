/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas3;

/**
 *
 * @author ncahy
 */
public class Utama {
    public static void main(String[] args) {
     
        Dika dika = new Dika();
        Cakra cakra = new Cakra();
        
        //memanggil abstract
        dika.suara();
        cakra.suara();
        
        //memanggil method override
        dika.makan();
        cakra.makan();
        cakra.berjalan();
        cakra.berjalan("Tangan");
        
        //memanggil method overload
        dika.lari();
        dika.lari(120);
        dika.rambut("Keriting");
        
        //cek Override
        cakra.cekOverride();
        
    }
}
