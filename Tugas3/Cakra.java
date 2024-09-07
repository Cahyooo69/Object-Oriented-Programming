/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas3;

/**
 *
 * @author ncahy
 */
public class Cakra extends Manusia {
    
    @Override
    public void suara(){
        System.out.println("Cakra: Apakah Anda pernah???");
    }
    @Override
    public void makan(){
        System.out.println("Cakra sedang makan ayam geprek");
    }
    
    public void berjalan(){
        System.out.println("Cakra berjalan");
    }
    public void berjalan(String tangan){
        System.out.println("Cakra berjalan menggunakan "+tangan);
    }
    public void cekOverride(){
        this.makan();
//        super.makan();
    }
}
