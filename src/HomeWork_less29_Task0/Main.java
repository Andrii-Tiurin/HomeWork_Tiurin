package HomeWork_less29_Task0;

public class Main {
    public static void main(String[] args) {
        // Создание банковского аккаунта
        BankAccount bankAccount = new BankAccount(5000);
        bankAccount.checkBalance();
        bankAccount.transferMoney(2000, "Recipient");
        bankAccount.checkBalance();
        bankAccount.withdrawMoney(1000);
        bankAccount.checkBalance();

        // Создание электронного кошелька
        ElectronicWallet wallet = new ElectronicWallet(3000);
        wallet.checkBalance();
        wallet.transferMoney(1000, "Recipient");
        wallet.checkBalance();
        wallet.withdrawMoney(500);
        wallet.checkBalance();
    }
}