package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    private final CashbackHackService cashbackHackService = new CashbackHackService();

    @Test
    public void remainWithAmountDivisibleAboveBoundary(){
        int remain = cashbackHackService.remain(10000);
        assertEquals(remain, 1000);
    }

    @Test
    public void remainWithAmountLessBoundary(){
        int remain = cashbackHackService.remain(99);
        assertEquals(remain, 901);
    }

    @Test
    public void remainWithAmountAboveZero(){
        int remain = cashbackHackService.remain(-99);
        assertEquals(remain, 1099);
        remain = cashbackHackService.remain(-2000);
        assertEquals(remain, 1000);
        remain = cashbackHackService.remain(-2003);
        assertEquals(remain, 1003);
    }

    @Test
    public void remainWithAmountEqualsBoundary(){
        int remain = cashbackHackService.remain(1000);
        assertEquals(remain, 1000);
    }



}
