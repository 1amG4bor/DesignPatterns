package creationalPattern.builder;

public class BuilderUsage {
    public static void main(String... args) {
        System.out.println("Builder TEST!");
        BankAccount bankAccount = new BankAccount
                .Builder()
                .withAccountNumber("ABC123456")
                .withName("John Doe")
                .withBalance(100.0)
                .build();

        System.out.println("Details of bank-account:");
        System.out.println(bankAccount.toString());
        System.out.println();
    }
}
