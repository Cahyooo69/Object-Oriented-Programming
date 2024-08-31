/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas2;

/**
 *
 * @author ncahy
 */
// Class Manusia
public class Manusia {
    private String nama;
    private int usia;

    //ini Constructor
    public Manusia(String nama, int usia) {
        this.nama = nama;
        this.usia = usia;
    }

    public String getNama() {
        return this.nama;
    }
    
    public int getUsia() {
        return this.usia;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @param usia the usia to set
     */
    public void setUsia(int usia) {
        this.usia = usia;
    }
}


