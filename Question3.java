//Create an interface UserService with a default method getWelcomeMessage(), which returns "Welcome, Guest!" if no name is provided.
// Implement a method getUser(String name) that returns an Optional<String> representing the user's name. In the implementation, 
// if the name is present, return a welcome message with the user's name; otherwise, return the default message.
 
// Hint: Use Optional.ofNullable() and default methods in interfaces.




import java.util.Optional;

interface UserService 
{
    default String getWelcomeMessage()
    {
        return "Welcome New Member";
    }

    default String generateWelcomeMessage(String name)
    {
        return Optional.ofNullable(name)
        .map(n-> "Welcome "+n+ "!")
        .orElse(getWelcomeMessage());
    }
}

class UserServiceImpl implements UserService{}

public class Question3{
    public static void main(String[] args) {
        UserService userservice = new UserServiceImpl();

        System.out.println(userservice.generateWelcomeMessage("Sobhagya"));
        System.out.println(userservice.generateWelcomeMessage(null));

    }
}