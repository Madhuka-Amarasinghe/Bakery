package com.company.products;

import java.util.HashMap;
import java.util.Map;

public class Blueberry {

    private String bCode = "MB11";
    private String bName = "Blueberry Muffin";
    Map<String, Double> bPrice = new HashMap<>();

    public Blueberry() {
        this.bPrice.put("2", 9.95);
        this.bPrice.put("5", 16.95);
        this.bPrice.put("8", 24.95);
    }

    public String getbCode() {
        return bCode;
    }

    public void setbCode(String bCode) {
        this.bCode = bCode;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public Map<String, Double> getbPrice() {
        return bPrice;
    }

    public void setbPrice(Map<String, Double> bPrice) {
        this.bPrice = bPrice;
    }

}
