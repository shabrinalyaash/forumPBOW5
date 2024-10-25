/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fr5;

/**
 *
 * @author adzkia
 */
public class Nonfiksi extends Buku {
    private String topik;

    public Nonfiksi(String judul, String penulis, String topik) {
        super(judul, penulis);
        this.topik = topik;
    }

    @Override
    public String info() {
        return super.info() + " - Topik: " + topik;
    }
}
