# Deskripsi Persistence Login
Java GUI untuk mengelola data MataKuliah dengan menggunakan database PostgreSQL. Java GUI ini bisa untuk menambahkan, melihat, memodifikasi data MataKuliah yang tersimpan dalam database, menggunakan Report Jasper untuk menampilkan hasil tabel, Button Upload untuk menambahakan data menggunakan file CSV

1. Menggunakan JDBC untuk terhubung ke database
2. CRUD (Create, Read, Update, Delete)
3. Swing untuk membuat GUI nya
4. Menggunakan Report untuk mencetak hasil dari tabel
5. Menggunakan Button Upload untuk menambahkan data yang diperoleh dari sebuah file CSV
6. Menggunakan Persistence untuk souce code tanpa querry
7. Menambahkan Tampilan Login pada Persistence

# Penjelasan Source Code

1. Membuat Jframe form baru untuk tampilan login pada package Persistence
   ![image](https://github.com/user-attachments/assets/2afa8821-d79b-4265-9881-808efa3fb85e)

2. Setelah itu membuat table admin pada pgadmin untuk menyimpan data username dan password
   ![image](https://github.com/user-attachments/assets/a44f08c0-b095-4221-962b-0a5d2c799223)

3. Jika table admin sudah dibuat, selanjutnya adalah membuat entity class from database untuk menambahkan table admin
   ![image](https://github.com/user-attachments/assets/911d5df8-f1d5-40b5-ad3b-2792e5606a6e)

4. Lalu akan muncul class baru dengan nama Admin.java, masukkan source code berikut pada class diatas
   ![image](https://github.com/user-attachments/assets/fd53395b-f3d7-4d18-8b25-7acaee190b4f)

5. Masukkan source code berikut pada button Login
   ![image](https://github.com/user-attachments/assets/b919e024-1070-46ab-9226-b952dd29d22c)

6. Jika seluruh source code sudah diinput, selanjutnya adalah test tampilan loginnya, masukkan username dan password yang sesuai pada table admin, jika source code benar maka akan muncul tampilan berikut
   ![image](https://github.com/user-attachments/assets/db99f7c3-a79a-4f5e-a469-67086a80e0b7)





