package pl.janik.credit;

import java.util.Arrays;
import java.util.List;

public class CardApi {

    CardDatabase cardDatabase;

    public CardApi(CardDatabase cardDatabase) {
        this.cardDatabase = cardDatabase;
    }

    public void handleWithdraw(WithdrawRequest withdrawRequest) {
        CreditCard card = cardDatabase
                .loadByNumber(withdrawRequest.getNumber())
                .get();

        card.withdraw(withdrawRequest.getMoney());

        cardDatabase.save(card);
    }

    public List<String> cards() {
        return Arrays.asList(
                "number 1",
                "number 2"
        );
    }
}
