package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User name = null;
        if (name.equals(null)) {
            throw new UserNotFoundException("User not found exception");
        }
        for (User user : users) {
            if (user.getUsername().equals(login)) {
                name = user;
            }
        }
        return name;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user.getUsername().length() < 3 || !user.isValid()) {
            throw new UserInvalidException("User is not valid");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Evgen Nadeev", true)
        };
        try {
            User user = findUser(users, "Evgen Nadeev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException e) {
            e.printStackTrace();
            System.out.println("User Invalid Exception");
        } catch (UserNotFoundException ea) {
            System.out.println("User Not Found Exception");
            ea.printStackTrace();
        }
    }
}
