package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Bank bank = new Bank("korea bank");
        bank.addBranch("adelaide");
        bank.addCustomer("adelaide", "Tim", 50.05);
        bank.addCustomer("adelaide", "lee", 175.05);
        bank.addCustomer("adelaide", "Thee", 220.05);

        bank.addBranch("yongin");
        bank.addCustomer("yongin", "lee2", 150.54);

        bank.addCustomerTransaction("adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("adelaide", "lee", 12.22);
        bank.addCustomerTransaction("adelaide", "Thee", 1.22);

        bank.listCustomer("adelaide", true);
        bank.listCustomer("yongin",true);

    }
}
