/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package croed;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Scanner;
import java.sql.PreparedStatement;
/**
 *
 * @author ncahy
 */
public class Croed {
    public static void main(String[] args) {
        Kolak kon = new Kolak();
        Connection conn = kon.koneksi("cobaJdbc", "postgres", "codotganteng");
        System.out.println("Monggo dipilih\n1.Insert tabel\n2.View tabel\n3.Update tabel\n4.delete data");
        System.out.print("Pilih Menu : ");
        Scanner sc = new Scanner(System.in);
        int pilihan = sc.nextInt();
        if (pilihan == 4) {
                System.out.println("masukan nim");
                String nim = sc.next();
                deleteData(conn, nim);
                System.out.println("\napakah ingin  melanjutkan\n1.iya\n2.tidak");
                System.out.print("pilihan anda : ");
                int s = sc.nextInt();
                System.out.println("");
                if (s == 1) {
                    main(args);
                } else {
                    System.out.println("semoga harimu menyenangkan");
                    return;
                } 
        } else if (pilihan == 3) {
            System.out.println("\nmasukan nama baru ");
                String nama = sc.next();
                System.out.println("masukan alamat baru");
                String alamat = sc.next();
                System.out.println("masukan nim");
                String nim = sc.next();
                updateData(conn, nama, alamat, nim);
                System.out.println("\napakah ingin  melanjutkan\n1.iya\n2.tidak");
                System.out.print("pilihan anda : ");
                int s = sc.nextInt();
                System.out.println("");
                if (s == 1) {
                    main(args);
                } else {
                    System.out.println("semoga harimu menyenangkan");
                    return;
                }
        } else if (pilihan == 2) {
           
            findTable(conn);
            System.out.println("\nKetik 1 untuk lanjut, Ketik 2 untuk tidak");
            int s = sc.nextInt();
            if (s == 1) {
                main(args);
            } else {
                System.out.println("");
                return;
            }
        } else if (pilihan == 1) {
 
            System.out.println("masukan nama");
            String nama = sc.next();
            System.out.println("masukan nim");
            String nim = sc.next();
            System.out.println("masukan alamat");
            String alamat = sc.next();
            insertData(conn,  nama, nim, alamat);
            System.out.println("\nKetik 1 untuk lanjut, Ketik 2 untuk tidak");
            int s = sc.nextInt();
            if (s == 1) {
                main(args);
            } else {
                System.out.println("");
                return;
            }

        } 

    }
    
    public static void findTable(Connection conn) {
        Statement statement = null;
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM cahyo";
            statement = conn.createStatement();
            statement.execute(sql);
            rs = statement.getResultSet();
            while (rs.next()) {
                // Misalkan kolom-kolom di tabel adalah "nama", "nim", dan "alamat"
                System.out.println("Nama: " + rs.getString("nama"));
                System.out.println("NIM: " + rs.getString("nim"));
                System.out.println("Alamat: " + rs.getString("alamat"));
                System.out.println(); // Baris kosong untuk pemisah
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }

public static void insertData(Connection conn, String nama, String nim, String alamat) {
        PreparedStatement preparedStatement;
        try {
            // Buat SQL query dengan parameter
            String sql = "INSERT INTO cahyo (nama, nim, alamat) VALUES (?, ?, ?)";

            // Buat PreparedStatement
            preparedStatement = conn.prepareStatement(sql);

            // Set parameter untuk query
            preparedStatement.setString(1, nama);
            preparedStatement.setString(2, nim);
            preparedStatement.setString(3, alamat);

            // Eksekusi query
            preparedStatement.executeUpdate();
            System.out.println("Data berhasil ditambahkan");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    } public static void deleteData(Connection conn,  String nim) {
        Statement statement;
        try {
            String query = String.format("Delete from cahyo where nim ='%s'",  nim);
            statement = conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("data berhasil diubah\n");
        } catch (Exception e) {
            System.out.println("gagal");
        }

    }public static void updateData(Connection conn,String nama, String alamat,  String nim) {
        Statement statement;
        try {
            String sql = String.format("Update cahyo set nama ='%s',alamat ='%s' where nim = '%s'",  nama,alamat, nim);
            statement = conn.createStatement();
            statement.executeUpdate(sql);
            System.out.println("data berhasil diubah\n");

        } catch (Exception e) {
            System.out.println("data gagal diubah\n");
        }

    }

}
