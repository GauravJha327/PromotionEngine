package com.promotionengine.promotion;

import java.util.*;

public class NItemsPromotion implements Promotion {
    private final char skuId;
    private final int quantity;
    private final int fixedPrice;
    
    
    public NItemsPromotion(char skuId, int quantity, int fixedPrice) {
		super();
		this.skuId = skuId;
		this.quantity = quantity;
		this.fixedPrice = fixedPrice;
	}


	@Override
    public int apply(Map<Character, Integer> items, Map<Character, Integer> prices) {
        int itemQty = items.getOrDefault(skuId, 0);
        int promotions = itemQty / quantity;
        int remainder = itemQty % quantity;
        return promotions * fixedPrice + remainder * prices.get(skuId);
    }
}
