package com.promotionengine.test;

import com.promotionengine.model.SKU;

public class SKUTest {
	@Test
	public void testSKUCreation() {
	    SKU sku = new SKU('A', 50);
	    assertEquals('A', sku.getId());
	    assertEquals(50, sku.getUnitPrice());
	}
}
