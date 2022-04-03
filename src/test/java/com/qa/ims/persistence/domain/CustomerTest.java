package com.qa.ims.persistence.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import nl.jqno.equalsverifier.EqualsVerifier;

public class CustomerTest {

	@Test
	public void testEquals() {
		EqualsVerifier.simple().forClass(Customer.class).verify();
	}

	public void toStringTest() {
		Customer customer = new Customer(1L, "john", "harry");
		String expected = "id:1 first name:john surname:harry";
		assertEquals(expected, customer.toString());
	}

	@Test
	public void firstConstructorTest() {
		Customer customer = new Customer("john", "harry");
		assertEquals("john", customer.getFirstName());
		assertEquals("harry", customer.getSurname());

	}

	@Test
	public void secondConstructorTest() {
		Customer customer = new Customer(1L, "john", "harry");
		assertEquals(Long.valueOf("1"), customer.getId());
		assertEquals("john", customer.getFirstName());
		assertEquals("harry", customer.getSurname());

	}
}
