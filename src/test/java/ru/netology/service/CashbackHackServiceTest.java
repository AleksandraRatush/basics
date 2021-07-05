package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    private final CashbackHackService cashbackHackService = new CashbackHackService();

    @Test
    public void remainWithAmountDivisibleAboveBoundary() {
        int remain = cashbackHackService.remain(2000);
        assertEquals(remain, 0);
    }

    @Test
    public void remainWithAmountNotDivisibleAboveBoundary() {
        int remain = cashbackHackService.remain(2324);
        assertEquals(remain, 676);
    }

    @Test
    public void remainWithNotDivisibleAmountLessBoundary() {
        int remain = cashbackHackService.remain(99);
        assertEquals(remain, 901);
    }

    @Test
    public void remainWithAmountEqualsBoundary() {
        int remain = cashbackHackService.remain(1000);
        assertEquals(remain, 0);
    }


}
