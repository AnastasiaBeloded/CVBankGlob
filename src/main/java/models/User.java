package models;

public class User {
    private String name;
    private String lastName;
    private String email;
    private String password;
    private String ConfirmPassword;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return ConfirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        ConfirmPassword = confirmPassword;
    }

    public User(String name, String lastName, String email, String password, String confirmPassword) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        ConfirmPassword = confirmPassword;
    }

    @Override
    public String toString() {
        return "User{" + "name='" + name + ", lastName='" + lastName + ", email='" + email + ", password='"
                + password + ", ConfirmPassword='" + ConfirmPassword +  '}';
    }
}