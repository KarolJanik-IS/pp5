package pl.janik.credit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.math.BigDecimal;
import java.util.UUID;

public class CardModuleTest {

    private InMemoryHashMapCardDatabase cardDatabase;

    @Test
    public void itHandleMultipleCardWithdraws() {
        //A
        thereIsCreditCardDatabase();
        String card1Number = thereIsCardWithLimit(1000);
        String card2Number = thereIsCardWithLimit(2000);

        CardApi cardApi = thereIsCardApi();
        //Act
        cardApi.handleWithdraw(new WithdrawRequest(card1Number, BigDecimal.valueOf(500)));
        cardApi.handleWithdraw(new WithdrawRequest(card2Number, BigDecimal.valueOf(1000)));
        //A
        cardBalanceEquals(card1Number, BigDecimal.valueOf(500));
        cardBalanceEquals(card2Number, BigDecimal.valueOf(1000));
    }

    private void thereIsCreditCardDatabase() {
        this.cardDatabase = new InMemoryHashMapCardDatabase();
    }

    private void cardBalanceEquals(String cardNumber, BigDecimal expectedBalance) {
        CreditCard loadedCard = cardDatabase.loadByNumber(cardNumber)
                .orElseGet(() -> {
                    CreditCard defaultCard = new CreditCard("not-exists");
                    return defaultCard;
                });

        assertEquals(expectedBalance, loadedCard.getBalance());
    }

    private String thereIsCardWithLimit(int initialCreditLimit) {
        CreditCard card = new CreditCard(UUID.randomUUID().toString());
        card.assignLimit(BigDecimal.valueOf(initialCreditLimit));

        cardDatabase.save(card);

        return card.getNumber();
    }

    private CardApi thereIsCardApi() {
        return new CardApi(cardDatabase);
    }


}
