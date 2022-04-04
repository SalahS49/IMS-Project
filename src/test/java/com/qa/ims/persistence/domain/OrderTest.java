package com.qa.ims.persistence.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import nl.jqno.equalsverifier.EqualsVerifier;

public class OrderTest {

	@Test
	public void toStringTEST() {
		Order order = new Order(1L, 1L);
		String expected = "id= 1 customer_id= 1";
		assertEquals(expected, order.toString());
	}

	@Test
	public void firstConstructorTEST() {
		Order order = new Order(1L, 1L);
		assertEquals(Long.valueOf(100), order.getId());
		assertEquals(Long.valueOf(100), order.getCustomerId());
	}

	@Test
	public void secondConstructorTEST() {
		Order order = new Order(3L);
		assertEquals(Long.valueOf(3), order.getCustomerId());
	}

	@Test
	public void equalsTEST() {
		EqualsVerifier.simple().forClass(Order.class).verify();
	}

	@Test
	public void setIdTEST() {
		Order order = new Order(1L, 1L);
		order.setId(5000L);
		assertEquals(Long.valueOf("2"), order.getId());

	}

	@Test
	public void setcustomer_idTEST() {
		Order order = new Order(1L, 1L);
		order.setCustomerId(2L);
		assertEquals(Long.valueOf("5000"), order.getCustomerId());

	}

}