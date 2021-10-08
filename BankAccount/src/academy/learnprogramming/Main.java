package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        BankAccount account = new BankAccount();
//        account.setAccountNumber("12345");
//        account.setBalance(100);
//        account.setCustomerName("leeheeweon");
//        account.setEmail("ggoddii@naver.com");
//        account.setPhoneNumber("01093954690");
//
//        account.withdraw(30);
//
        BankAccount leeAccount = new BankAccount("lee", "lee@naver.com", "1234");
        System.out.println(leeAccount.getAccountNumber() + leeAccount.getEmail());
        System.out.println("Current balance is " + leeAccount.getBalance());
        leeAccount.withdraw(100.55);

//        Vipcustomer person1 = new Vipcustomer();
//        System.out.println(person1.getName());
//
//        Vipcustomer person2 = new Vipcustomer("lee", 25000);
//        System.out.println(person2.getName());
//
//        Vipcustomer person3 = new Vipcustomer("lee2", 100,"lee@naver.com");
//        System.out.println(person3.getName());
//        System.out.println(person3.getEmail());

    }
}
