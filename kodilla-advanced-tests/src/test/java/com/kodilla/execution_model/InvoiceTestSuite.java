package com.kodilla.execution_model;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTestSuite {
    Invoice invoice = new Invoice();
    Item bread = new Item("Bread", 4.90);
    Item beer = new Item("Beer", 4.99);
    Item butter = new Item("Butter", 8.60);
    Item juice = new Item("Juice", 2.50);

    @Test
    public void testListSize() {
        // when
        int itemsNumber = invoice.getSize();
        // then
        assertEquals(4, itemsNumber);
    }

    @Test
    public void shouldReturnNameAndPrice() {
        // when
        Item item = invoice.getItem(2);
        // then
        assertEquals("Butter", item.getName());
        assertEquals(8.60, item.getPrice());
    }

    @Test
    public void shouldReturnNullWhenIndexIsNegative() {
        // when
        Item item = invoice.getItem(-1);
        // then
        assertNull(item);
    }

    @Test
    public void shouldReturnNullWhenIndexValueIsTooHigh() {
        // when
        Item item = invoice.getItem(4);
        // then
        assertNull(item);
    }

    @Test
    public void shouldReturnZeroAfterClearingInvoice() {
        // when
        invoice.clear();
        // then
        assertEquals(0, invoice.getSize());
    }

    @BeforeEach
    public void initializeInvoice() {
        invoice.addItem(bread);
        invoice.addItem(beer);
        invoice.addItem(butter);
        invoice.addItem(juice);
    }

    @AfterEach
    public void resetValues() {
        System.out.println("Resetting values...");
    }

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }

    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }
}