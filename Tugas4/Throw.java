/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas4;

/**
 *
 * @author ncahy
 */
public class Throw {
    public static void main(String[] args) {
        
        String message = "Halo, Dunia!";
        
        try {
            char result = getCharAtIndex(message, 20);
            System.out.println("Karakter: " + result);
        } catch (StringIndexOutOfBoundsException e) {
            System.err.println("Terjadi StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }
   
    public static char getCharAtIndex(String str, int index) throws StringIndexOutOfBoundsException {
    
        if (index < 0 || index >= str.length()) {
            throw new StringIndexOutOfBoundsException("Indeks " + index + " berada di luar batas string.");
        }
        return str.charAt(index);
    }
}
