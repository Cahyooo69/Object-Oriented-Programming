/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package croed;
import java.util.Scanner;
/**
 *
 * @author ncahy
 */
public class Try {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Masukkan angka 1:");
            int contoh = sc.nextInt();
            
            if (contoh != 1) {
                throw new Exception(); //pengecualian jjika bukan angka 1 yang diinput
            }
            
            System.out.println("Anda Benar");
        } catch (Exception e) {
            System.err.println("Anda Salah");
        }
    }
  }

