package com.promotionengine.test;

import java.util.Map;

import com.promotionengine.promotion.NItemsPromotion;

public class NItemsPromotionTest {
	@Test
	public void apply_3As_returns130() {
		NItemsPromotion rule = new NItemsPromotion('A', 3, 130);
	    Map<Character, Integer> items = Map.of('A', 3);
	    Map<Character, Integer> prices = Map.of('A', 50);
	    assertEquals(130, rule.apply(items, prices));
	}
}
