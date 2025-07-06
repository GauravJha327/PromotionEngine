package com.promotionengine.test;

public class CartTest {
	@Test
	public void addItem_incrementsQuantity() {
	    CartTest cart = new CartTest();
	    cart.addItem('A', 2);
	    assertEquals(2, cart.getItems().get('A'));
	}
}
