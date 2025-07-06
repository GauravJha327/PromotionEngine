package com.promotionengine.model;

import java.util.*;

public class Cart {
    private final Map<Character, Integer> items = new HashMap<>();
    
	    public void addItem(char skuId, int quantity) {
	        items.merge(skuId, quantity, Integer::sum);
	    }    
}
