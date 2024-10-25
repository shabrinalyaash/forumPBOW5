/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fr5;

/**
 *
 * @author adzkia
 */
public class Peminjaman {
    private Pengguna pengguna;
    private Buku buku;

    public Peminjaman(Pengguna pengguna, Buku buku) {
        this.pengguna = pengguna;
        this.buku = buku;
    }

    public String infoPeminjaman() {
        return pengguna.getNama() + " meminjam " + buku.info();
    }

}
