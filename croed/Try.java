/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package croed;

/**
 *
 * @author ncahy
 */


public class Try {
    public static void main(String[] args) {
        // Inisialisasi String
        String message = "Halo, Cahyo!";

        try {
            // Mencoba mengakses indeks yang tidak valid
            char firstChar = message.charAt(0); // Indeks valid
            System.out.println("Karakter pertama: " + firstChar);

            char invalidChar = message.charAt(20); // Indeks tidak valid (panjang string hanya 12)
            System.out.println("Karakter ke-20: " + invalidChar);

        } catch (StringIndexOutOfBoundsException e) {
            // Menangani kesalahan ketika indeks di luar batas string
            System.err.println("Terjadi StringIndexOutOfBoundsException: Anda mencoba mengakses indeks di luar panjang string.");
            System.err.println("Detail kesalahan: " + e.getMessage());
        }
    }
}


