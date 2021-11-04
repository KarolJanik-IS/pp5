package pl.janik.carddatabase;

import pl.janik.credit.CardDatabase;
import pl.janik.credit.CreditCard;

import java.util.Optional;

public class ListCardDatabase implements CardDatabase {
    @Override
    public void save(CreditCard card) {

    }

    @Override
    public Optional<CreditCard> loadByNumber(String cardNumber) {
        return Optional.empty();
    }
}
