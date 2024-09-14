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
        System.out.println("Monggo dipilih\n1.Create table\n2.Input data tabel\n3.View tabel\n4.Delete tabel");
        System.out.print("Pilih Menu : ");
        Scanner sc = new Scanner(System.in);
        int pilihan = sc.nextInt();
        if (pilihan == 1) {
            System.out.println("Masukan nama tabel");
            String nama = sc.next();
            createTable(conn, nama);
            System.out.println("\nKetik 1 untuk lanjut, Ketik 2 untuk tidak");
            int s = sc.nextInt();
            if (s == 1) {
                main(args);
            } else {
                System.out.println("");
                return;
            }
        } else if (pilihan == 4) {
            System.out.println("masukan nama tabel");
            String nama = sc.next();
            deleteTable(conn, nama);
            System.out.println("\nKetik 1 untuk lanjut, Ketik 2 untuk tidak");
            int s = sc.nextInt();
            if (s == 1) {
                main(args);
            } else {
                System.out.println("");
                return;
            }
        } else if (pilihan == 3) {
            System.out.println("masukan nama tabel");
            String nama = sc.next();
            findTable(conn, nama);
            System.out.println("\nKetik 1 untuk lanjut, Ketik 2 untuk tidak");
            int s = sc.nextInt();
            if (s == 1) {
                main(args);
            } else {
                System.out.println("");
                return;
            }
        } else if (pilihan == 2) {
            System.out.println("masukan nama tabel");
            String namaTabel = sc.next();
            System.out.println("masukan nama");
            String nama = sc.next();
            System.out.println("masukan nim");
            String nim = sc.next();
            System.out.println("masukan alamat");
            String alamat = sc.next();
            insertData(conn, namaTabel, nama, nim, alamat);
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

    public static void createTable(Connection conn, String namaTabel) {
        Statement statement;
        try {
            String query = String.format("Create table %s (nama varchar(100),nim varchar(15),alamat varchar(50))", namaTabel);
            statement = conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Tabel telah buat");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void deleteTable(Connection conn, String nama) {
        Statement statement = null;
        try {
            String sql = String.format("Drop table %s", nama);
            statement = conn.createStatement();
            statement.executeUpdate(sql);
            System.out.println("Table telah dihapus");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public static void findTable(Connection conn, String nama) {
        Statement statement = null;
        ResultSet rs = null;
        try {
            String sql = String.format("SELECT * FROM %s", nama);
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

    
public static void insertData(Connection conn, String namaTabel, String nama, String nim, String alamat) {
        PreparedStatement preparedStatement;
        try {
            // Buat SQL query dengan parameter
            String sql = String.format("INSERT INTO %s (nama, nim, alamat) VALUES (?, ?, ?)", namaTabel);

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
    }

}

