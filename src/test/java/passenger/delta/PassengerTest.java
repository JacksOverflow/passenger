package passenger.delta;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PassengerTest {
    Passenger testPax = new Passenger();

    @Test
    void PassengerNamePassesLengthLimitAndIsNotNull() {
        testPax.setName("Aaron");
        Assertions.assertTrue(testPax.getName().length() > 3);
        Assertions.assertNotNull(testPax.getName());
    }
    @Test
    void PassengerNameFailsLengthLimit(){
        testPax.setName("Ae");
        Assertions.assertNull(testPax.getName());
    }

    @Test
    void PassengerTitleMatchesAcceptedTitles(){
        testPax.setTitle("Mr");
        Assertions.assertNotNull(testPax.getTitle());
    }
    @Test
    void PassengerTitleDoesNotMatchAcceptedTitles(){
        testPax.setTitle("Dr");
        Assertions.assertNull(testPax.getTitle());
    }

    @Test
    void PassengerIdIsValidAndNotNull(){
        testPax.setId("1234567890");
        Assertions.assertTrue(testPax.getId().length() >= 10);
        Assertions.assertNotNull(testPax.getId());
    }

    @Test
    void PassengerIdIsNotValid(){
        testPax.setId("123");
        Assertions.assertNull(testPax.getId());
    }

    @Test
    void PassengerPhoneIsValidAndNotNull(){
        testPax.setPhone("8083448874");
        Assertions.assertTrue(testPax.getPhone().length() >= 7);
        Assertions.assertNotNull(testPax.getPhone());
    }

    @Test
    void PassengerPhoneIsNotValid(){
        testPax.setPhone("348874");
        Assertions.assertNull(testPax.getPhone());
    }

    @Test
    void PassengerAgeIsValid(){
        testPax.setAge(17);
        Assertions.assertTrue(testPax.getAge() > 16);
    }

    @Test
    void PassengerAgeIsNotValid(){
        testPax.setAge(16);
        Assertions.assertFalse(testPax.getAge() > 16);
    }



}
