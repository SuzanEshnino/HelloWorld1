package BankAccount.java;

import BankAccount.java.Mybalance;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class BalanceTest {

    @Test
    public void testIncreaseBalance() {

        double Balance = 50;
        Mybalance balance = new Mybalance();
        balance.Add(Balance);
        double actual = balance.getBalance();
        double expected = 50;
        assertEquals(expected, actual);


    }
}


