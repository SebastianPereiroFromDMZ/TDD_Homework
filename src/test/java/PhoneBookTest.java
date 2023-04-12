import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class PhoneBookTest {

    PhoneBook phoneBook = new PhoneBook();



    @Test
    void testAdd() {


        int result = phoneBook.add("Братан", "8-999-134-22-11");

        int expected = 1;

        assertEquals(expected, result);
    }


    @Test
    void testFindByNumber(){
        phoneBook.add("Братан", "8-999-134-22-11");

        String result = phoneBook.findByNumber("8-999-134-22-11");

        String expected = "Братан";

        assertEquals(expected, result);
    }
}
