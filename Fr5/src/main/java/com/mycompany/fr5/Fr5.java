/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fr5;

/**
 *
 * @author adzkia
 */
public class Fr5 {

    public static void main(String[] args) {
        Perpustakaan perpustakaan = new Perpustakaan();
        
        // Menambahkan buku
        Buku buku1 = new Fiksi("Laut Bercerita", "Leila S. Chudori", "Historical");
        Buku buku2 = new Nonfiksi("Filosofi Teras", "Henry Manampiring", "Filsafat");
        Buku buku3 = new Fiksi("Hujan", "Tere Liye", "Science Fiction");
        
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);
        perpustakaan.tambahBuku(buku3);
        
        // Menambahkan pengguna
        Pengguna p1 = new Pengguna("Soke");
        perpustakaan.tambahPengguna(p1);
        Pengguna p2 = new Pengguna("Bibin");
        perpustakaan.tambahPengguna(p2);
        Pengguna p3 = new Pengguna("Lail");
        perpustakaan.tambahPengguna(p3);
        
        // Meminjam buku
        System.out.println(perpustakaan.pinjamBuku(p1, buku1));
        System.out.println(perpustakaan.pinjamBuku(p2, buku1));
        System.out.println(perpustakaan.pinjamBuku(p1, buku2));
        System.out.println(perpustakaan.pinjamBuku(p2, buku2));
        System.out.println(perpustakaan.pinjamBuku(p3, buku3));
        System.out.println(perpustakaan.pinjamBuku(p3, buku2));
    }
}
