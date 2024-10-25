/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fr5;

/**
 *
 * @author adzkia
 */
public class Fiksi extends Buku {
    private String genre;
    
    public Fiksi(String judul, String penulis, String genre) {
        super(judul, penulis);
        this.genre = genre;
    }

    @Override
    public String info() {
        return super.info() + " - Genre: " + genre;
    }

}
