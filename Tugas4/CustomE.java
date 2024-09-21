/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas4;

/**
 *
 * @author ncahy
 */
public class CustomE extends Exception {
    public CustomE(String pesan) {
        super(pesan);
    }

    public static void main(String[] args) {
        String password = "cahyo";

        try {
           
            char karakter = password.charAt(6);
            System.out.println("Karakter: " + karakter);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Kesalahan : Indeks di luar batas saat mengakses string");
        }
    }
}
