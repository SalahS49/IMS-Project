package com.qa.ims.persistence.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import nl.jqno.equalsverifier.EqualsVerifier;

public class ItemTest {
	@Test
    public void toStringTEST() {
        Item item = new Item(1L, "iphone", 999.99F);
        String expected = "Item [id=1, itemName=iphone, price=999.99]";
        assertEquals(expected, item.toString());
    }

    @Test
    public void firstConstructorTEST() {
        Item item = new Item("iphone",  999.99F);
        assertEquals("iphone", item.getItemName());
        assertEquals(999.99, item.getPrice(), 0.02);
    }

    @Test
    public void secondConstructorTEST() {
        Item item = new Item(1L, "iphone", 999.99F);
        assertEquals(Long.valueOf("1"), item.getId());
        assertEquals("iphone", item.getItemName());
        assertEquals(999.99, item.getPrice(), 0.02);

    }

    @Test
    public void equalsTEST() {
        EqualsVerifier.simple().forClass(Item.class).verify();
    }

    @Test
    public void setIdTEST() {
        Item item = new Item(1L, "iphone", 999.99F);
        item.setId(2L);
        assertEquals(Long.valueOf("2"), item.getId());

    }

    @Test
    public void setItemNameTEST() {
        Item item = new Item(1L, "iphone", 999.99F);
        item.setItemName("iphone");
        assertEquals("iphone", item.getItemName());
    }

  

    @Test
    public void setPriceTEST() {
        Item item = new Item(1L, "iphone",  999.99F);
        item.setPrice(5000);
        assertEquals(5000, item.getPrice(), 0.02);

    }
}
