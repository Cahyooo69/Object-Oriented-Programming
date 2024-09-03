/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas2;

/**
 *
 * @author ncahy
 */
public class Pembalap extends Manusia implements RacingInterface, PemancingInterface, BersepedaInterface {

    private String tim;
    private int nomorPembalap;
    
    public void reflek(){
        System.out.println("Pembalap memiliki reflek Cepat");
    }
    //ini Constructor
    public Pembalap(String nama, int usia, String tim, int nomorPembalap) {

        super(nama, usia);
        this.tim = tim;
        this.nomorPembalap = nomorPembalap;
        this.reflek();
        System.out.print("pembalap memiliki reflek ");
        super.reflek();
        System.out.println("nama "+nama);
        System.out.println("usia "+usia);
    }

    public String getTim() {
        return this.tim;
    }

    public int getNomorPembalap() {
        return this.nomorPembalap;
    }

    @Override
    public void balapan() {
        System.out.println(this.getNama() + " membalap dengan nomor " + this.nomorPembalap + " untuk tim " + this.tim);
    }

    @Override
    public void tampilkanTim() {
        System.out.println("Pembalap ini berada di tim " + this.tim);
    }

    @Override
    public void memancing() {
        System.out.println(this.getNama() + " Hobi memancing");
    }

    @Override
    public void bersepeda() {
        System.out.println(this.getNama() + " Hobi bersepeda");
    }
}