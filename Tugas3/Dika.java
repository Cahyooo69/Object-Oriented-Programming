/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas3;

/**
 *
 * @author ncahy
 */
public class Dika extends Manusia {
    
    @Override
    public void suara(){
        System.out.println("Dika: Jadi begini...");
    }
    
    @Override
    public void makan(){
        System.out.println("Dika sedang makan di pak tho");
    }
    
    public void lari(int kecepatan){
        System.out.println("Top Speed motor Dika adalah: "+kecepatan+"km/jam");
    }
        public void lari(){
        System.out.println("dika bisa berlari");
    }
    
    public void rambut(String rambut){
        System.out.println("Dika memiliki rambut: "+rambut+".");
    }
}
