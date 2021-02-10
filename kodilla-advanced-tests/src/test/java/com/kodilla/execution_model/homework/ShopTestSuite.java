package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {
    Set<Order> orders = new HashSet<>();
    Shop shop = new Shop();
    Order puzzle = new Order(24.90, LocalDate.of(2021, 01, 04), "mistermaster");
    Order videoGame = new Order(200.00, LocalDate.of(2021, 01, 12), "kitanai");
    Order ssd = new Order(350.50, LocalDate.of(2021, 01, 14), "Paumaren");
    Order cup = new Order(160.00, LocalDate.of(2021, 01, 17), "stanley");
    Order keyRing = new Order(4.50, LocalDate.of(2021, 01, 24), "ebenui");

    @Test
    public void shouldAddOrdersAndReturnOrdersNumber() {
        // when
        int ordersNumber = shop.getSize();
        // then
        assertEquals(5, ordersNumber);
    }

    @Test
    public void shouldNotAddDuplicateOrders() {
        // given
        Order cup = new Order(160.00, LocalDate.of(2021, 01, 17), "stanley");
        shop.addOrder(cup);
        //when
        int ordersNumber = shop.getSize();
        // then
        assertEquals(5, ordersNumber);
    }

    @Test
    public void shouldSumValuesOfAllOrders() {
        // when
        double ordersValues = shop.sumOrdersValues();
        // then
        assertEquals(739.90, ordersValues);
    }

    @Test
    public void shouldReturnOrdersByDateRange() {
        // given
        LocalDate from = LocalDate.of(2021, 01, 11);
        LocalDate to = LocalDate.of(2021, 01, 18);
        // when
        Set<Order> result = shop.getOrderByDate(from, to);
        // then
        Set<Order> expected = new HashSet<>();
        expected.add(videoGame);
        expected.add(ssd);
        expected.add(cup);
        assertEquals(expected, result);
    }

    @Test
    public void shouldReturnOrdersByValueRange() {
        // given
        double minValue = 40.0;
        double maxValue = 300.0;
        // when
        Set<Order> result = shop.getOrderByValue(minValue, maxValue);
        // then
        Set<Order> expected = new HashSet<>();
        expected.add(videoGame);
        expected.add(cup);
        assertEquals(result ,result);
    }

    @BeforeEach
    public void inicializeShop() {
        shop.addOrder(puzzle);
        shop.addOrder(videoGame);
        shop.addOrder(ssd);
        shop.addOrder(cup);
        shop.addOrder(keyRing);
    }
}