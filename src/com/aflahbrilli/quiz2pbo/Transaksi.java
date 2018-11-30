
package com.aflahbrilli.quiz2pbo;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.ArrayList;
/**
 *
 * @author aflah brilli
 */
public class Transaksi {
    
    private final String kode;
    private ArrayList<Item> items= new ArrayList();
    private float total;
    
    public Transaksi(){
        this.kode = null;
    }

    public Transaksi(String kode, ArrayList<Item> items ) {
        this.kode = kode;
        this.items = items;
    }
    
    public void setTotal(){
        float total = 0;
        for (Item titem : this.items) {
            total += item.getTotal();
        }
        this.total = total;
    }
    
    public String Pembayaran(){
        setTotal();
        String obt = " ";
        obt += "Kode\t\t : "+ this.kode +"\n";
        obt += "Daftar Belanja : \n";
        for (Item item : this.items) {
            obt += "\t"+ item.getName() + "(" + item.getJumlah() + ") :" +item.getTotal() +"\n";
        }
        obt += "Total\t\t : " +this.total;
        return obt;
    }
}    