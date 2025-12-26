package org.example.SRP;

public class Main {

    public static void main(String[] args) {
        User a = new User("Ram", "1", "ram@email.com");
        User b = new User("Shyam", "2", "shyam@email.com");
        User c = new User("Divya", "3", "divya@email.com");
        User d = new User("Sanjeev", "4", "sanjeev@email.com");

        UserRepository userRepository = new UserRepository();
        userRepository.saveUser(a);
        userRepository.saveUser(b);
        userRepository.saveUser(c);
        userRepository.saveUser(d);

        UserReport userReport = new UserReport(userRepository);
        userReport.printUser("2");
    }
}
