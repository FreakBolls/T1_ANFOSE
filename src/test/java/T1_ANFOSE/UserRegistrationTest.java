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

    @Test
    @DisplayName("Should fail when username is invalid")
    void shouldFailWhenUsernameIsInvalid() {
        UserRegistration userRegistration = new UserRegistration();
        User user = new User("abc","password1","wanla@mail.com",20);

        String addResult = userRegistration.register(user);
        assertEquals("El nombre de usuario no es válido", addResult);
    }

    @Test
    @DisplayName(("Should fail when password is invalid"))
    void shouldFailWhenPasswordIsInvalid() {
        UserRegistration userRegistration = new UserRegistration();
        User user = new User("Walter12","pass","wanla@mail.com",20);

        String addResult = userRegistration.register(user);
        assertEquals("La contraseña debe tener al menos 8 caracteres y contener letras y números", addResult);
    }

    @Test
    @DisplayName(("Should fail when email is invalid  "))
    void shouldFailWhenEmailIsInvalid() {
        UserRegistration userRegistration = new UserRegistration();
        User user = new User("Walter12","password1","correo",20);

        String addResult = userRegistration.register(user);
        assertEquals("Ingrese un correo electrónico válido", addResult);
    }

}