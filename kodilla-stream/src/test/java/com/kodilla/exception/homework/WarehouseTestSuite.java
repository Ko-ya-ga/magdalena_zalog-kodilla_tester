package com.kodilla.exception.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class WarehouseTestSuite {
    @Test
    public void testgetOrder() throws OrderDoesntExistException {
        // given
        Warehouse.addOrder(new Order("0873812"));
        // when
        String isOrderPresent = Warehouse.getOrder("0873812").getNumber();
        // then
        String expectedOrder = new Order("0873812").getNumber();
        assertEquals(expectedOrder, isOrderPresent);
    }

    @Test(expected = OrderDoesntExistException.class)
    public void testGetOrder_withException() throws OrderDoesntExistException {
        // given
        Warehouse.addOrder(new Order("876576"));
        // when
        String isOrderPresent = Warehouse.getOrder("34567123").getNumber();
        // then
        assertEquals(false, isOrderPresent);
    }
}