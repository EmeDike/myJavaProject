import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

    public class PersonTest {

        @Test
        void testIsAdult() {
            Person adultPerson = new Person("John Doe", 25);
            assertTrue(adultPerson.isAdult(), adultPerson.getName() + " should be an adult");

            Person nonAdultPerson = new Person("Jane Doe", 16);
            assertFalse(nonAdultPerson.isAdult(), nonAdultPerson.getName() + " should not be an adult");
        }

        @Test
        void testGetName() {
            Person adultPerson = new Person("John Doe", 25);
            assertEquals("John Doe", adultPerson.getName(), "Name should match for adult person");

            Person nonAdultPerson = new Person("Jane Doe", 16);
            assertEquals("Jane Doe", nonAdultPerson.getName(), "Name should match for non-adult person");
        }
    }
