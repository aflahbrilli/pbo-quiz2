package com.aflahbrilli.quiz2pbo;

import java.util.HashMap;
import java.util.ArrayList;
/**
 *
 * @author aflah brilli
 */
public class ComboModel {
    
    private HashMap<String, Float> items = new HashMap<>();

    public ComboModel() {
        this.items.put("Gula", new Float(20000));
        this.items.put("Kopi", new Float(5000));
        this.items.put("Susu", new Float(15000));
    }
    
    public ArrayList<String> getJenisName(String item){
        ArrayList<String> str = new ArrayList<>();
        for (String items : this.items.keySet()) {
            str.add(item);
        }
        return str;
    }
    
    public ArrayList<Float> getHargaBarang(){
        ArrayList<Float> flt = new ArrayList<>();
        for (Float item : this.items.values()) {
            flt.add(item);
        }
        return flt;
    }
    
    public void addItem(String name, float Harga){
        this.items.put(name, Harga);
    }
}


