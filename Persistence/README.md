# Deskripsi Persistence
Java GUI untuk mengelola data MataKuliah dengan menggunakan database PostgreSQL. Java GUI ini bisa untuk menambahkan, melihat, memodifikasi data MataKuliah yang tersimpan dalam database, menggunakan Report Jasper untuk menampilkan hasil tabel, Button Upload untuk menambahakan data menggunakan file CSV

1. Menggunakan JDBC untuk terhubung ke database
2. CRUD (Create, Read, Update, Delete)
3. Swing untuk membuat GUI nya
4. Menggunakan Report untuk mencetak hasil dari tabel
5. Menggunakan Button Upload untuk menambahkan data yang diperoleh dari sebuah file CSV
6. Menggunakan Persistence untuk souce code tanpa querry

# Penjelasan Source Code

1. Buat design GUI yang diinginkan lalu tambahkan entity classes from Database
   ![image](https://github.com/user-attachments/assets/a56a5907-0c68-46d2-870e-d99696c20513)

2. Pilih database dan masukkan tabel lalu pilih next > finish
   ![image](https://github.com/user-attachments/assets/737ff334-83ec-49ab-9125-4ade18a0f07b)
   ![image](https://github.com/user-attachments/assets/e8ae905b-70e7-4f14-bf2c-1297a86ea1db)

3. Setelah itu pada package META-INF sesuaikan nama Persistence Unit namenya seperti berikut
   ![image](https://github.com/user-attachments/assets/88b15d82-2ca1-4dad-961c-969ebd1d34d9)

4. Masukkan Souuce code berikut pada class Uts untuk memanggil entity class dari persistence
   ![image](https://github.com/user-attachments/assets/fd59661e-b0a5-4577-8167-ca548a965005)

5. Jika sudah selanjutnya adalah memasukkan source code untuk menampilkan data pada database ke dalam table GUI
   ![image](https://github.com/user-attachments/assets/99a272fb-b48e-4658-878a-7d91fc3e33fe)

6. Berikut adalah source code untuk button insert data ke database
   ![image](https://github.com/user-attachments/assets/ff447817-cd1c-46a0-bd6a-ee502fa1f238)

7. Berikut adalah source code untuk button delete
   ![image](https://github.com/user-attachments/assets/8d5afef8-b6d2-403b-b65b-9b68b5ad52d7)

8. Berikut adalah source code untuk button update
   ![image](https://github.com/user-attachments/assets/88f85683-f2e8-40f1-96cb-855bca1e10c5)

9. berikut adalah source code untuk button upload
    ![image](https://github.com/user-attachments/assets/708a3136-8f7d-4ef2-a607-4bb401bb3046)

10. Jika seluruh source code sudah diinput, jalankan program untuk mengecek apakah ada error atau tidak
    ![image](https://github.com/user-attachments/assets/b69c674c-f426-44c4-a832-8e74951449ac)










