package com.promotionengine.model;

public class SKU {
    private final char id;
    private final int unitPrice;
    
    public SKU(char id, int unitPrice) {
        this.id = id;
        this.unitPrice = unitPrice;
    }
    
    public char getId() { return id; }
    public int getUnitPrice() { return unitPrice; }
}
