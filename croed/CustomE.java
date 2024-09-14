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
    public CustomE(String pesan){
        super(pesan);
    }
    public static void main(String[] args) {
        String password = "yoyo";  //ubah password
        try {
            if (!password.equals("cahyo")) throw new CustomE("Password yang anda masukkan salah");
            System.out.println("Password benar");
        } catch (CustomE e) {
            System.out.println(e.getMessage());
        }
    }
}
