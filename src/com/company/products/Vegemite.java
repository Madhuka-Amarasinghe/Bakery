package com.company.products;

import java.util.HashMap;
import java.util.Map;

public class Vegemite {

    private String vCode = "VS5";
    private String vName = "Vegemite Scroll";
    Map<String, Double> vPrice = new HashMap<>();

    public Vegemite() {
        this.vPrice.put("3", 6.99);
        this.vPrice.put("5", 8.99);
    }

    public String getvCode() {
        return vCode;
    }

    public void setvCode(String vCode) {
        this.vCode = vCode;
    }

    public String getvName() {
        return vName;
    }

    public void setvName(String vName) {
        this.vName = vName;
    }

    public Map<String, Double> getvPrice() {
        return vPrice;
    }

    public void setvPrice(Map<String, Double> vPrice) {
        this.vPrice = vPrice;
    }


}
