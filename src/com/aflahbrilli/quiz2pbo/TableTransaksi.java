package com.aflahbrilli.quiz2pbo;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aflah brilli
 */
public class TableTransaksi extends DefaultTableModel{
    
    private String[] kolom;
    
    public TableTransaksi(){
        this.kolom = new String[]{
            "Name", "Harga", "Jumlah"
        };
    }
    
    public String[] getKolomName(){
        return this.kolom;
    }
}
