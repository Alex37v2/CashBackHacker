package ru.netology;

import static org.junit.Assert.*;

public class CashBackHackerServiceTest {
    @org.junit.Test
    public void cashbackFirst() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void noCashback() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void cashbackSecond() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 1500;
        int expected = 500;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }
}