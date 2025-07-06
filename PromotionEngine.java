package com.promotionengine.engine;

import java.util.*;

import com.promotionengine.model.Cart;
import com.promotionengine.promotion.Promotion;

public class PromotionEngine {
	private final List<Promotion> promotions;
    private final Map<Character, Integer> unitPrices;
    
    
    
    public PromotionEngine(List<Promotion> promotions, Map<Character, Integer> unitPrices) {
		super();
		this.promotions = promotions;
		this.unitPrices = unitPrices;
	}



	public int calculateTotal(Cart cart) {
        Map<Character, Integer> items = new HashMap<>(cart.getItems());
        int total = 0;
        
        for (Promotion p : promotions) {
            total += p.apply(items, unitPrices);
        }
        
        
        items.forEach((sku, qty) -> 
            total += qty * unitPrices.get(sku));
            
        return total;
    }
}
