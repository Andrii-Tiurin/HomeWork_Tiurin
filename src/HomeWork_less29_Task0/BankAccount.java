package HomeWork_less29_Task0;
// Реализация банковского аккаунта
class BankAccount implements PaymentSystem {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void transferMoney(double amount, String recipient) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Перевод суммы " + amount + " на счет " + recipient + " выполнен.");
        } else {
            System.out.println("Недостаточно средств для перевода.");
        }
    }

    @Override
    public void withdrawMoney(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Снятие суммы " + amount + " выполнено.");
        } else {
            System.out.println("Недостаточно средств для снятия.");
        }
    }

    @Override
    public double checkBalance() {
        System.out.println("Баланс банковского счета: " + balance);
        return balance;
    }
}