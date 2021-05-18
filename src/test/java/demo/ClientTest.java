package demo;

import com.acme.banking.dbo.domain.Client;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class ClientTest {

    int[] clientId = {-1, 0, 1};
    String[] clientName = {"ClientA", "", null};
    String[] msg = {"id!", "empty name!", "null name!"};

    @Test
    public void shouldCreateClientWhenPassValidParameters() {
        for (int i=1; i<3; i++) {
            Client sut = new Client(clientId[i], clientName[0]);
            assumeTrue(sut != null);

            assertEquals(clientId[i], sut.getId());
            assertEquals(clientName[0], sut.getName());
        }
    }

    @Test
    public void shouldNotCreateClientWhenPassInvalidParameters() {
        for (int i=0; i<3; i++) {
            try {
                Client sut = new Client(clientId[i], clientName[i]);
            } catch (IllegalArgumentException e) {
                assertEquals(e.getMessage(), msg[i]);
            }
        }
    }





//    @Test
//    public void shouldCreateClientWhenPassValidArgs() {
//        final int clientId = 1;
//        final String clientName = "ClientA";
//
//        Client sut = new Client(clientId, clientName);
//        assumeTrue(sut != null);
//
//        assertEquals(clientId, sut.getId());
//        assertEquals(clientName, sut.getName());
//    }
//
//    @Test
//    public void shouldNotCreateClientWhenPassNegativeId() {
//        final int clientId = -1;
//        final String clientName = "ClientA";
//
//        try {
//            Client sut = new Client(clientId, clientName);
//        }
//        catch (IllegalArgumentException e) {
//            assertEquals(e.getMessage(), "id!");
//        };
//    }
//
//    @Test
//    public void shouldNotCreateClientWhenPassEmptyName() {
//        final int clientId = 0;
//        final String clientName = "";
//
//        try {
//            Client sut = new Client(clientId, clientName);
//        }
//        catch (IllegalArgumentException i) {assertEquals(i.getMessage(),"empty name!");};
//    }
//
//    @Test
//    public void shouldNotCreateClientWhenPassNullName() {
//        final int clientId = 0;
//        final String clientName = null;
//
//        try {
//            Client sut = new Client(clientId, clientName);
//        }
//        catch (IllegalArgumentException i) {assertEquals(i.getMessage(),"null name!");};
//    }
}
