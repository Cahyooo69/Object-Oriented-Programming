/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package croed;

/**
 *
 * @author ncahy
 */
public class Throw {
    public static void main(String[] args) {
        // Inisialisasi String
        String message = "Halo, Dunia!";
        
        try {
            // Memanggil method untuk mengakses indeks
            char result = getCharAtIndex(message, 20); // Mencoba mengakses indeks yang tidak valid
            System.out.println("Karakter: " + result);
        } catch (StringIndexOutOfBoundsException e) {
            // Menangani kesalahan yang dilemparkan
            System.err.println("Terjadi StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }
    // Method yang melempar StringIndexOutOfBoundsException
    public static char getCharAtIndex(String str, int index) throws StringIndexOutOfBoundsException {
        // Validasi jika indeks di luar batas
        if (index < 0 || index >= str.length()) {
            // Melempar StringIndexOutOfBoundsException secara manual
            throw new StringIndexOutOfBoundsException("Indeks " + index + " berada di luar batas string.");
        }
        // Jika valid, kembalikan karakter pada indeks yang diminta
        return str.charAt(index);
    }
}
