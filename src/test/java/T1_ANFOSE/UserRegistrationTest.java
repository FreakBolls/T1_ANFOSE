package T1_ANFOSE;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRegistrationTest {

    @Test
    @DisplayName("Should faul when fields are empty")
    void shouldFailWhenFieldsAreEmpty() {
        UserRegistration userRegistration = new UserRegistration();
        User user = new User("","","",0);
        String addResult = userRegistration.register(user);
        assertEquals("Debe completar todos los campos requeridos", addResult);


    }


}