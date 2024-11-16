package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashBackHackServiceTest {

    @Test
    public void ifSpendLessThan1000() {
        CashBackHackService service = new CashBackHackService();

        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void ifSpend1000() {
        CashBackHackService service = new CashBackHackService();

        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void ifSpendMoreThan1000() {
        CashBackHackService service = new CashBackHackService();

        int amount = 1100;
        int expected = 900;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }
}
