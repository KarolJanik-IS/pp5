package pl.janik.credit;

import java.util.Optional;

public interface CardDatabase {
    void save(CreditCard card);

    Optional<CreditCard> loadByNumber(String cardNumber);
}
