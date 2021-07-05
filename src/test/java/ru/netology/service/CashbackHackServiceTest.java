package ru.netology.service;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    private final CashbackHackService cashbackHackService = new CashbackHackService();

    @Test
    public void remainWithAmountDivisibleAboveBoundary() {
        int actual = cashbackHackService.remain(2000);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void remainWithAmountNotDivisibleAboveBoundary() {
        int actual = cashbackHackService.remain(2324);
        int expected = 676;
        assertEquals(expected, actual);
    }

    @Test
    public void remainWithNotDivisibleAmountLessBoundary() {
        int actual = cashbackHackService.remain(99);
        int expected = 901;
        assertEquals(expected, actual);
    }

    @Test
    public void remainWithAmountEqualsBoundary() {
        int actual = cashbackHackService.remain(1000);
        int expected = 0;
        assertEquals(expected, actual);
    }


}
