package com.promotionengine.promotion;

import java.util.*;

public class CombinationPromotion implements Promotion {
    private final char sku1, sku2;
    private final int fixedPrice;
    
    public CombinationPromotion(char sku1, char sku2, int fixedPrice) {
		super();
		this.sku1 = sku1;
		this.sku2 = sku2;
		this.fixedPrice = fixedPrice;
	}

	@Override
    public int apply(Map<Character, Integer> items, Map<Character, Integer> prices) {
        int qty1 = items.getOrDefault(sku1, 0);
        int qty2 = items.getOrDefault(sku2, 0);
        int pairs = Math.min(qty1, qty2);
        return pairs * fixedPrice 
            + (qty1 - pairs) * prices.get(sku1) 
            + (qty2 - pairs) * prices.get(sku2);
    }
}
