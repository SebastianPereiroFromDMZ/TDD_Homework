import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class PhoneBookTest {

    PhoneBook phoneBook = new PhoneBook();

    private Map<String, String> map;

    @Test
    void testAdd() {
        map = new HashMap<>();

        int result = phoneBook.add("Братан", "8-999-134-22-11");

        int expected = 1;

        assertEquals(expected, result);
    }
}
