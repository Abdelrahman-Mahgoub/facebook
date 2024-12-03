public class TestMain {
    public static void main(String[] args) {
        UserDatabase database = new UserDatabase();
        String email = "ahmed@gmail.com";
        String password = "12345678";
        String hashedPassword = Hashing.hashPassword(password);
        database.addUser(email, "ahmed", hashedPassword, "2004-10-26");
        User user = database.authenticate(email, hashedPassword);

        if (user != null) {
            System.out.println("logged in" + user.getUsername());
        } else {
            System.out.println("error");
        }

    }
}
