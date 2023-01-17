public class Main {
    public static void main(String[] args) {
        Account acc1 = new Account(1122,20000);
        acc1.setAnnualInterestRate(0.045);
        acc1.withdraw(2500.00);
        acc1.deposit(3000.00);
        System.out.println("ID: " + acc1.getId());
        System.out.println("Balance: " + acc1.getBalance());
        System.out.println("Annual Interest Rate: " + acc1.getAnnualInterestRate());
        System.out.println("Date Created: " + acc1.getDateCreated());
    }
}