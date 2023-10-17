package HomeWork_less29_Task0;

class ElectronicWallet implements PaymentSystem {
    private double balance;

    public ElectronicWallet(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void transferMoney(double amount, String recipient) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Перевод суммы " + amount + " на кошелек " + recipient + " выполнен.");
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
        System.out.println("Баланс электронного кошелька: " + balance);
        return balance;
    }
}