public class DisplayAccount {
    public static void main(String[] args) {
        Account a1 = new Account();
        Account a2 = new Account();
        a1.setUsername("Jonah Paull");
        a1.setPassword("Jeff");
        a1.setID(200673);
        a2.setUsername("Mike Smith");
        a2.setPassword("1234");
        a2.setID(29844739);
        a1.display();
        a2.display();
        System.out.println(a2.getPassword());
}
}