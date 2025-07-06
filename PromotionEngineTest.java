package com.promotionengine.test;

import com.promotionengine.model.Cart;

public class PromotionEngineTest {
	@Test
	public void scenarioA_returns100() {
	    Cart cart = new Cart();
	    cart.addItem('A', 1); cart.addItem('B', 1); cart.addItem('C', 1);
	    assertEquals(100, engine.calculateTotal(cart));
	}
}
