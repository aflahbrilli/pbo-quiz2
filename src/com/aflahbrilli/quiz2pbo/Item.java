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
    private float harga;
    private int jumlah;

    public Item(){
        
    }

    public Item(String name, float harga, int jumlah) {
        this.name = name;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHarga() {
        return harga;
    }

    public void setHarga(float harga) {
        this.harga = harga;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    
    public float getTotal(){
        return this.harga * this.jumlah;
    }
    
    public String toString(){
        return this.name;
    }
}
