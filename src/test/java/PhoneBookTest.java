import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
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
    void testFindByNumber() {
        phoneBook.add("Братан", "8-999-134-22-11");

        String result = phoneBook.findByNumber("8-999-134-22-11");

        String expected = "Братан";

        assertEquals(expected, result);
    }


    @Test
    void testFindByName() {
        phoneBook.add("Братан", "8-999-134-22-11");

        String result = phoneBook.findByName("Братан");

        String expected = "8-999-134-22-11";

        assertEquals(expected, result);
    }

    @Test
    void testPrintAllNames(){
        phoneBook.add("Братан", "8-999-134-22-11");
        phoneBook.add("Леха", "8-993-134-22-11");
        phoneBook.add("Шурик", "8-997-134-22-11");

        ArrayList<String> expected = new ArrayList<>(Arrays.asList("Братан","Леха","Шурик"));

        ArrayList<String> result = phoneBook.printAllNames();

        assertEquals(expected, result);
    }
}
