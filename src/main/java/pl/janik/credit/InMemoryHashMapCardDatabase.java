package pl.janik.credit;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class InMemoryHashMapCardDatabase implements CardDatabase {
    Map<String, CreditCard> cards;

    public InMemoryHashMapCardDatabase() {
        this.cards = new ConcurrentHashMap<>();
    }

    @Override
    public void save(CreditCard card) {
        cards.put(card.getNumber(), card);
    }

    @Override
    public Optional<CreditCard> loadByNumber(String cardNumber) {
        return Optional.ofNullable(cards.get(cardNumber));
    }
}
