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
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
        String []nama = {"Kangguru, Belalang, Kodok"};
        System.out.println("Hewan Melompat");
            for (int i = 0; i <= 3; i++) {
                String string = nama[i];
                System.out.println(string);
            }
    }
}
