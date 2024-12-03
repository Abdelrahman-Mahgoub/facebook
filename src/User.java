import java.util.UUID;

public class User {
    private final String userId;
    private final String email;
    private final String username;
    private final String password;
    private final String dateOfBirth;
    private String status;



    public void setStatus(String status) {
        this.status = status;
    }

    public User( String email, String username, String password, String dateOfBirth) {
        this.email = email;
        this.userId= UUID.randomUUID().toString();
        this.username = username;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.status = "offline";
    }

    public String getUserId() {
        return userId;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getStatus() {
        return status;
    }
}
