/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aflahbrilli.quiz2pbo;

/**
 *
 * @author aflah brilli
 */
public class Item {
    private String name;
    private double harga;
    private String jumlah;

    public Item(String name, double harga) {
        this.name = name;
        this.harga = harga;
    }
    
    public Item(){
        
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String getJumlah() {
        return jumlah;
    }

    public void setJumlah(String jumlah) {
        this.jumlah = jumlah;
    }
    
    
}
