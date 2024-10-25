/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fr5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adzkia
 */
public class Perpustakaan {
    private List<Buku> koleksiBuku = new ArrayList<>();
    private List<Pengguna> penggunaList = new ArrayList<>();

    public void tambahBuku(Buku buku) {
        koleksiBuku.add(buku);
    }

    public void tambahPengguna(Pengguna pengguna) {
        penggunaList.add(pengguna);
    }

    public String pinjamBuku(Pengguna pengguna, Buku buku) {
        Peminjaman peminjaman = new Peminjaman(pengguna, buku);
        return peminjaman.infoPeminjaman();
    }
}
