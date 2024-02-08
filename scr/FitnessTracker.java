public class FitnessTracker {
    public static void main(String[] args) {
        User user1 = new User("John", 15, 8, 1990, "john.doe@example.com", "1234567890");
        User user2 = new User("Alice", 25, 4, 1985, "alice.smith@example.com", "9876543210");
        User user3 = new User("Bob", 10, 11, 2000, "bob.johnson@example.com", "5555555555");

        user1.printAccountInfo();
        user2.printAccountInfo();
        user3.printAccountInfo();

        user1.setSurname("Doe");
        user1.setWeight(75);
        user1.setPressure("120/90");
        user1.setStepsPerDay(8000);
        user2.setWeight(68);
        user2.setPressure("130/80");
        user2.setStepsPerDay(10000);

        user1.printAccountInfo();
        user2.printAccountInfo();
    }
}