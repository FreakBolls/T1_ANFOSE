package T1_ANFOSE;

public class UserRegistration {

    public String register(User user) {

        //validar campos vacios
        if(user.getUsername().isEmpty() ||
            user.getPassword().isEmpty() ||
            user.getEmail().isEmpty() ||
            user.getAge() == 0 ){

            return "Debe completar todos los campos requeridos";
        }

        //validar Username
        if(user.getUsername().length() < 6 ||
        user.getUsername().length() > 12 ||
        !user.getUsername().matches("[a-zA-Z0-9]+")){
            return "El nombre de usuario no es válido";
        }


        //validar Contraseña
        if(user.getPassword().length() < 8 ||
                !user.getPassword().matches(".*[a-zA-Z].*") ||
                !user.getPassword().matches(".*\\d.*")){
            return "La contraseña debe tener al menos 8 caracteres y contener letras y números";
        }

        //Email
        if(user.getEmail().length() < 8 ||
          !user.getEmail().contains("@")){
            return "Ingrese un correo electrónico válido";
        }

        //validar edad
        if(user.getAge() < 18){
            return "Debe ser mayor de edad para registrarse";
        }


        return "El usuario ha sido registrado correctamente";
    }
}
