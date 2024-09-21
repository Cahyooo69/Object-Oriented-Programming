/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package croed;

/**
 *
 * @author ncahy
 */
public class CustomE extends Exception {
    public CustomE(String pesan) {
        super(pesan);
    }

    public static void main(String[] args) {
        String password = "cahyo";  // ubah password

        try {
            // Simulasi StringIndexOutOfBoundsException
            char karakter = password.charAt(6); // Ini akan memicu StringIndexOutOfBoundsException
            System.out.println("Karakter: " + karakter);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Kesalahan : Indeks di luar batas saat mengakses string");
        }
    }
}
