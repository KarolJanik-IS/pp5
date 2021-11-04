package pl.janik.credit;

import java.math.BigDecimal;

public class WithdrawRequest {
    private final String number;
    private final BigDecimal money;

    public WithdrawRequest(String number, BigDecimal money) {
        this.number = number;
        this.money = money;
    }

    public String getNumber() {
        return number;
    }

    public BigDecimal getMoney() {
        return money;
    }
}
