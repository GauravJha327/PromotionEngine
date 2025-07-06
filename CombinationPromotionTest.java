package com.promotionengine.test;

import java.util.*;

import com.promotionengine.promotion.CombinationPromotion;

public class CombinationPromotionTest {
	@Test
	public void apply_CandD_returns30() {
		CombinationPromotion rule = new CombinationPromotion('C', 'D', 30);
	    Map<Character, Integer> items = Map.of('C', 1, 'D', 1);
	    Map<Character, Integer> prices = Map.of('C', 20, 'D', 15);
	    assertEquals(30, rule.apply(items, prices));
	}
}
