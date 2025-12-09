package org.example.SRP;

public class UserManager {

    private Validation validation = new Validation();
    private Email emailService = new Email();
    private Database database = new Database();

    public void addUser(String email, String password) {
        if (validation.isValidEmail(email) && validation.isValidPassword(password)) {
            database.saveToDatabase(email, password);
            emailService.sendWelcomeEmail(email);
        } else {
            System.out.println("Email Invalido o contraseña invalida, no se envia el correo.");
        }
    }
}
