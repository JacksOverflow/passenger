package passenger.delta;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PassengerTest {
    Passenger testPax;

    @BeforeEach
    void init() { testPax = new Passenger(); }

    @Test
    void PassengerNamePassesLengthLimitAndIsNotNull() {
        testPax.setName("Aaron");
        Assertions.assertTrue(testPax.getName().length() > 3);
        Assertions.assertNotNull(testPax.getName());
    }
    @Test
    void PassengerNameFailsLengthLimit(){
        String name = "Ae";
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class, ()-> testPax.setName(name));
        Assertions.assertEquals("Invalid Name Length - too short --> Entered: " + name, exception.getMessage());
    }

    @Test
    void PassengerTitleMatchesAcceptedTitles(){
        testPax.setTitle("Mr");
        Assertions.assertNotNull(testPax.getTitle());
    }
    @Test
    void PassengerTitleDoesNotMatchAcceptedTitles(){
        String title = "Dr";

        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class, ()-> testPax.setTitle(title));
        Assertions.assertEquals("Invalid Title - Mr, Mrs, Ms Accepted --> Entered: " + title, exception.getMessage());
    }

    @Test
    void PassengerIdIsValidAndNotNull(){
        testPax.setId("1234567890");
        Assertions.assertTrue(testPax.getId().length() >= 10);
        Assertions.assertNotNull(testPax.getId());
    }

    @Test
    void PassengerIdIsNotValid(){
        String id = "123";

        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class, ()-> testPax.setId(id));
        Assertions.assertEquals("Invalid ID Length - too short --> Entered: " + id, exception.getMessage());
    }

    @Test
    void PassengerPhoneIsValidAndNotNull(){
        testPax.setPhone("8083448874");
        Assertions.assertTrue(testPax.getPhone().length() >= 7);
        Assertions.assertNotNull(testPax.getPhone());
    }

    @Test
    void PassengerPhoneIsNotValid(){
        String phone = "348874";
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class, ()-> testPax.setPhone(phone));
        Assertions.assertEquals("Invalid Phone Length - too short --> Entered: " + phone, exception.getMessage());

    }

    @Test
    void PassengerAgeIsValid(){
        testPax.setAge(17);
        Assertions.assertTrue(testPax.getAge() > 16);
    }

    @Test
    void PassengerAgeIsNotValid(){
            int age = 16;
            Throwable exception = Assertions.assertThrows(IllegalArgumentException.class, ()-> testPax.setAge(age));
            Assertions.assertEquals("Invalid Age - Passenger is too young --> Entered: " + age, exception.getMessage());
    }
}
