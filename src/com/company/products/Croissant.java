package com.company.products;

import java.util.HashMap;
import java.util.Map;

public class Croissant {

    private String cCode = "CF";
    private String cName = "Croissant";
    Map<String, Double> cPrice = new HashMap<>();

    public Croissant() {
        this.cPrice.put("3", 5.95);
        this.cPrice.put("5", 9.95);
        this.cPrice.put("9", 16.95);
    }

    public String getcCode() {
        return cCode;
    }

    public void setcCode(String cCode) {
        this.cCode = cCode;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public Map<String, Double> getcPrice() {
        return cPrice;
    }

    public void setcPrice(Map<String, Double> cPrice) {
        this.cPrice = cPrice;
    }
}
