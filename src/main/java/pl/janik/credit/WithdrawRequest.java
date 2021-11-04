package pl.janik.credit;

import java.math.BigDecimal;

public class withdrawRequest {
    private final String number;
    private final BigDecimal money;

    public withdrawRequest(String number, BigDecimal money) {
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
