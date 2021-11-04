package pl.janik.credit;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class CardDatabase {
    Map<String, CreditCard> cards;

    public CardDatabase() {
        this.cards = new ConcurrentHashMap<>();
    }

    public void save(CreditCard card) {
        cards.put(card.getNumber(), card);
    }

    public Optional<CreditCard> loadByNumber(String cardNumber) {
        return Optional.ofNullable(cards.get(cardNumber));
    }
}
