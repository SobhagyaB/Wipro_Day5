1 - Write a Java program that demonstrates the use of lambda expressions to sort a list of strings in reverse alphabetical order. 
Then, implement a functional interface StringProcessor with a method process(String str) that takes a string and returns its 
uppercase version. Use this functional interface in conjunction with a lambda expression to process a list of strings and print
 their uppercase forms.
 
 Hint: Use List.sort(), lambda expressions, and String::toUpperCase

 2 - Given a list of employees, each with a name, age, and salary, write a Java program using the Streams API to:
 
Filter employees who are older than 30.
Find the average salary of employees who meet the age condition.
Collect the names of these employees into a List.
Print the list of employee names and the average salary.
Hint: Use filter(), map(), collect(), and average() methods from Streams

3 - Create an interface UserService with a default method getWelcomeMessage(), which returns "Welcome, Guest!"
if no name is provided. Implement a method getUser(String name) that returns an Optional<String> representing the 
user's name. In the implementation, if the name is present, return a welcome message with the user's name; otherwise, 
return the default message.
 
Hint: Use Optional.ofNullable() and default methods in interfaces.
