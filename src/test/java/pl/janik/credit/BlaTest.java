package pl.janik.credit;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class BlaTest {

    @Test
    public void itHandleMultipleCardWithdraws() {
        //A
        String card1Number = thereIsCardWithLimit(1000);
        String card2Number = thereIsCardWithLimit(2000);

        CardApi cardApi = thereIsCardApi();
        //Act
        cardApi.handleWithdraw(new withdrawRequest(card1Number, BigDecimal.valueOf(500)));
        cardApi.handleWithdraw(new withdrawRequest(card2Number, BigDecimal.valueOf(1000)));
        //A

        cardBalanceEquals(card1Number, BigDecimal.valueOf(500));
        cardBalanceEquals(card2Number, BigDecimal.valueOf(1000));
    }

    private void cardBalanceEquals(String number, BigDecimal i) {

    }

    private String thereIsCardWithLimit(int i) {
        return null;
    }

    private CardApi thereIsCardApi() {
        return new CardApi();
    }


}
