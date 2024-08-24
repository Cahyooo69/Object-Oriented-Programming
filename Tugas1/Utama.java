/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1;

/**
 *
 * @author ncahy
 */
public class Utama {
    public static void main(String[] args) {
        amfibi katak = new amfibi();
        aves elang = new aves();
        mamalia unta = new mamalia();
        pisces sepat = new pisces();
        reptil anaconda = new reptil();
        dikotil apel = new dikotil();
        monokotil jagung = new monokotil();
        
        katak.setNama("Saya Katak");
        System.out.println("Nama "+katak.getNama());
        katak.setHabitat("Saya hidup di darat dan di air");
        System.out.println(katak.getHabitat());
        katak.setJumlahKaki(4);
        System.out.println("Saya memiliki kaki "+katak.getJumlahKaki());
        katak.bernafas();
        katak.tumbuh();
        katak.melompat();
        katak.bertelur();
        katak.jenisKaki();
        
        System.out.println("");
        
        elang.setNama("Saya Elang");
        System.out.println("Nama "+elang.getNama());
        elang.setHabitat("Saya hidup di dataran tinggi");
        System.out.println(elang.getHabitat());
        elang.setJumlahKaki(2);
        System.out.println("Saya memiliki kaki "+elang.getJumlahKaki());
        elang.bernafas();
        elang.tumbuh();
        elang.terbang();
        elang.bertelur();
        elang.paruh();
        elang.karnovira();
        elang.bulu();
        
        System.out.println("");
        
        unta.setNama("Saya Unta");
        System.out.println("Nama "+unta.getNama());
        unta.setHabitat("Saya hidup di gurun pasir");
        System.out.println(unta.getHabitat());
        unta.setJumlahKaki(4);
        System.out.println("Saya memiliki kaki "+unta.getJumlahKaki());
        unta.bernafas();
        unta.tumbuh();
        unta.berkembangbiak();
        unta.jumlahKaki();
        unta.punuk();
        unta.kelenjar();
        
        System.out.println("");
        
        sepat.setNama("Saya Sepat");
        System.out.println("Nama "+sepat.getNama());
        sepat.setHabitat("Saya hidup di air tawar");
        System.out.println(sepat.getHabitat());
        sepat.setJumlahKaki(0);
        System.out.println("Saya memiliki kaki "+sepat.getJumlahKaki());
        sepat.pernafasan();
        sepat.tumbuh();
        sepat.sisik();
        sepat.berkembangbaik();
        
        System.out.println("");
        
        anaconda.setNama("Saya Anaconda");
        System.out.println("Nama "+anaconda.getNama());
        anaconda.setHabitat("Saya hidup di hutan");
        anaconda.setHabitat(anaconda.getHabitat());
        anaconda.setJumlahKaki(0);
        System.out.println("Saya memiliki kaki "+anaconda.getJumlahKaki());
        anaconda.bernafas();
        anaconda.tumbuh();
        anaconda.pernafasan();
        anaconda.berkembangbiak();
        anaconda.caraBergerak();
        anaconda.kulit();
        
        System.out.println("");
    
        apel.setNama("Saya Apel");
        System.out.println("Nama "+apel.getNama());
        apel.setWarnaDaun("Warna daun saya Hijau");
        System.out.println(apel.getWarnaDaun());
        apel.bernafas();
        apel.tumbuh();
        apel.biji();
        apel.akar();
        apel.batang();
        
        System.out.println("");
        
        jagung.setNama("Saya Jagung");
        System.out.println("Nama "+jagung.getNama());
        jagung.setWarnaDaun("Warna Daun Saya Hijau");
        System.out.println(jagung.getWarnaDaun());
        jagung.bernafas();
        jagung.tumbuh();
        jagung.akar();
        jagung.biji();
        jagung.daun();
    }
}
