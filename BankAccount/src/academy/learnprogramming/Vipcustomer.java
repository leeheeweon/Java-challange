package academy.learnprogramming;

public class Vipcustomer {
    private String name;
    private double creditLimit;
    private String email;

    public Vipcustomer() {
        this("Default name", 1000.0, "lee@naver.com");
    }

    public Vipcustomer(String name, double creditLimit) {
        this(name, creditLimit, "lee@naver.com");
    }

    public Vipcustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
