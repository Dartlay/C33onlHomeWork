package lesson_6_homework;

class CreditCard {
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_Standart = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RED = "\u001B[31m";
    private String cardNumber;
    private double balance;

    public CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
        this.balance = 0.0;
    }

    public void addAmount(double amount) {
        balance += amount;
    }

    public String withdrawAmount(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return "Withdrew " + amount + " from card " + cardNumber;
        } else {
            return "Insufficient balance on card " + cardNumber;
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    @Override
    public String toString() {
        return ANSI_GREEN + "Credit card" +
                "\n"+"\t "+ ANSI_YELLOW + "Card number: " + ANSI_GREEN + cardNumber  +
                "\n" + "\t "+ ANSI_YELLOW +"balance: " + ANSI_GREEN + balance + ANSI_Standart;
    }
}
