package java102.PolicyManagementSystem;


import java.util.TreeSet;

public class AccountManager {

    TreeSet<Account> users = new TreeSet<>();

    public void addUsers() throws ClassCastException {
        Address address = new HomeAddress("Adana", "Merkez", "Inonu Sokak", "Inonu parkı yanı mehmet apt  Seyhan/Adana");
        User user1 = new User("Baris", "Ozdemir", "fnsstalemate@gmail.com", "9601", "yazalım gelistirici", 26, address, "Individual");
        Account account = new Individual(user1);

        Address address2 = new HomeAddress("Istanbul", "Güngören", "Haznedar sokak", "haznedar sokak kemal ilkokulu karsisi cengiz apt");
        User user2 = new User("Melek", "Guzel", "melek_guzel@gmail.com", "1412", "psikolog", 34, address2, "Enterprise");
        Account account2 = new Enterprise(user2);
        users.add(account);
        users.add(account2);
    }

    public Account login(String email, String password) {
        addUsers();
        try {
            for (Account acc : users) {
                if (acc.getUser().getEmail().equals(email) && acc.getUser().getPassword().equals(password)) {
                    acc.login(email, password, acc);
                    return acc;
                }
            }
            throw new InvalidAuthenticationException("Sifre veya email yanlış girildi!");

        } catch (InvalidAuthenticationException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

}