Nama  : John Isaac Witness<br>
NIM	  : 00000088626<br>
Mobile Application Programming Week 13<br>
Link GitHub: <a href="https://github.com/akunjone/LAB_WEEK_13">Click Here</a> 

<h1>Part 1 - Using Data Binding in Android</h1>
Output:
<img width="1919" height="1012" alt="image" src="https://github.com/user-attachments/assets/b6d07d7d-c505-4f8e-8972-f7af3a9cec4a" />

<h1>Part 2 - Using Repository with Room</h1>
Setelah menggunakan Room database, output tetap sama:
<img width="1919" height="1011" alt="image" src="https://github.com/user-attachments/assets/f47db324-b0f4-4245-9dda-986380b11337" />

Namun bedanya jika menggunakan Room, semua movie yang didapat disimpan dan dimasukkan kedalam Room. Sehingga jika koneksi terputus, movies tetap ada (namun tidak ter up-to-date dengan waktu saat ini).
Misal koneksi terputus (saya ubah sedikit API-key nya), maka akan tetap muncul movienya:
<img width="1919" height="1011" alt="image" src="https://github.com/user-attachments/assets/c86cec1e-73ba-4021-b3c4-3fb5b7c44b7e" />

<h1>Part 3 - Using WorkManager</h1>
Project di Part 2 sudah hampir selesai, tapi database tidak bisa direfresh datanya ke versi terbaru dari API. Cara menyelesaikan masalah ini adalah dengan mengambil data dari API saat selang waktu tertentu atau saat user tidak membuka aplikasi. Dengan cara ini, data yang sudah dicache akan selalu up-to-date. Kita bisa melakukannya dengan mengatur WorkManager.
Output:
<img width="1919" height="1016" alt="image" src="https://github.com/user-attachments/assets/83c42d7b-095b-43d9-9132-7a19ed577e43" />

Sama seperti sebelumnya, namun, database sudah ter up-to-date.

<h2>NOTES</h2>
Untuk assignment, soal dan jawaban telah ada di Commit 4 dan saya sisipkan di output file. Dan link menuju ke sini sudah saya masukkan ke pdf output yang saya kumpulkan.
<hr>
Terima kasih.
