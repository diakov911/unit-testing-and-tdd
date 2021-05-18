package demo;

import com.acme.banking.dbo.domain.Client;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class FirstTest {
    @Test
    public void shouldCreateClientWhenPassValidArgs() {
        final int clientId = 1;
        final String clientName = "Vasya";

        Client sut = new Client(clientId, clientName);
        assumeTrue(sut != null);

        assertEquals(clientId, sut.getId());
        assertEquals(clientName, sut.getName());
    }

    @Test
    public void shouldNotCreateClientWhenPassInvalidId() {
        final int clientId = -1;
        final String clientName = "Vasya";

        try {
            Client sut = new Client(clientId, clientName);
        }
        catch (IllegalArgumentException i) {assertEquals(i.getMessage(),"id!");};

//        assumeTrue(sut != null);
//
//        assertEquals(clientId, sut.getId());
//        assertEquals(clientName, sut.getName());

    }
}
