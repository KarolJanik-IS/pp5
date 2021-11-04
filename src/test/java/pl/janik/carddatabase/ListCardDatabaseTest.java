package pl.janik.carddatabase;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import pl.janik.credit.CreditCard;

public class ListCardDatabaseTest {

    @Test
    public void itAllowsToStoreCard() {
        //Arrange
        CreditCard card = new CreditCard("123");
        ListCardDatabase db = new ListCardDatabase();
        //Act
        db.save(card);
        CreditCard loaded = db.loadByNumber("123")
                .get();
        //Assert
        assertEquals(card.getNumber(), loaded.getNumber());
    }
}
