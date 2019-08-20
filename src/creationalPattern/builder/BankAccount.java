package creationalPattern.builder;

public class BankAccount {
    private String name;
    private String accountNumber;
    private double balance;

    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }

    public BankAccount(Builder builder) {
        this.name = builder.name;
        this.accountNumber = builder.accountNumber;
        this.balance = builder.balance;
    }

    public static class Builder {
        private String name;
        private String accountNumber;
        private double balance;

        public Builder() {
        }

        public Builder withName(String name) {
            System.out.println("\tadd name..");
            this.name = name;
            return this;
        }

        public Builder withAccountNumber(String accountNumber) {
            System.out.println("\tadd accountNumber..");
            this.accountNumber = accountNumber;
            return this;
        }

        public Builder withBalance(double balance) {
            System.out.println("\tadd balance..");
            this.balance = balance;
            return this;
        }

        public BankAccount build() {
            return new BankAccount(this);
        }
    }
}
