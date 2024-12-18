package lesson_6_homework.atm;

import java.util.Scanner;

public class ATM{
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_STANDARD = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RED = "\u001B[31m";
    private int twentyCount;
    private int fiftyCount;
    private int hundredCount;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ATM atm = new ATM(10, 5, 2);
        atm.displayStatus();

        while (true) {
            System.out.println(ANSI_YELLOW + "\nChoose an option:" + ANSI_STANDARD);
            System.out.println(ANSI_YELLOW + "1. Add money" + ANSI_STANDARD);
            System.out.println(ANSI_YELLOW + "2. Withdraw money" + ANSI_STANDARD);
            System.out.println(ANSI_YELLOW + "3. Display ATM status" + ANSI_STANDARD);
            System.out.println(ANSI_YELLOW + "4. Exit" + ANSI_STANDARD);
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print(ANSI_YELLOW + "Enter number of 20s to add: " + ANSI_STANDARD);
                    int addTwenties = scanner.nextInt();
                    System.out.print(ANSI_YELLOW + "Enter number of 50s to add: " + ANSI_STANDARD);
                    int addFifties = scanner.nextInt();
                    System.out.print(ANSI_YELLOW + "Enter number of 100s to add: " + ANSI_STANDARD);
                    int addHundreds = scanner.nextInt();
                    atm.addMoney(addTwenties, addFifties, addHundreds);
                    break;
                case 2:
                    System.out.print(ANSI_YELLOW + "Enter amount to withdraw: " + ANSI_STANDARD);
                    int amountToWithdraw = scanner.nextInt();
                    atm.withdrawMoney(amountToWithdraw);
                    break;
                case 3:
                    atm.displayStatus();
                    break;
                case 4:
                    System.out.println(ANSI_RED + "Exiting..." + ANSI_STANDARD);
                    scanner.close();
                    return;
                default:
                    System.out.println(ANSI_RED + "Invalid option. Please try again." + ANSI_STANDARD);
            }
        }
    }

    public ATM(int twentyCount, int fiftyCount, int hundredCount) {
        this.twentyCount = twentyCount;
        this.fiftyCount = fiftyCount;
        this.hundredCount = hundredCount;
    }

    public void addMoney(int twenty, int fifty, int hundred) {
        this.twentyCount += twenty;
        this.fiftyCount += fifty;
        this.hundredCount += hundred;
        System.out.println(ANSI_GREEN + "Added " + twenty + " twenties, " + fifty + " fifties, and " + hundred + " hundreds." + ANSI_STANDARD);
    }

    public boolean withdrawMoney(int amount) {
        if (amount % 10 != 0) {
            System.out.println(ANSI_RED + "Amount must be a multiple of 10." + ANSI_STANDARD);
            return false;
        }

        int originalAmount = amount;
        int hundredToWithdraw = Math.min(amount / 100, hundredCount);
        amount -= hundredToWithdraw * 100;

        int fiftyToWithdraw = Math.min(amount / 50, fiftyCount);
        amount -= fiftyToWithdraw * 50;

        int twentyToWithdraw = Math.min(amount / 20, twentyCount);
        amount -= twentyToWithdraw * 20;

        if (amount == 0) {
            hundredCount -= hundredToWithdraw;
            fiftyCount -= fiftyToWithdraw;
            twentyCount -= twentyToWithdraw;

            System.out.println(ANSI_GREEN + "Withdrawn " + originalAmount + ": " +
                    hundredToWithdraw + " hundreds, " +
                    fiftyToWithdraw + " fifties, " +
                    twentyToWithdraw + " twenties." + ANSI_STANDARD);
            return true;
        } else {
            System.out.println(ANSI_RED + "Unable to dispense the requested amount." + ANSI_STANDARD);
            return false;
        }
    }

    public void displayStatus() {
        System.out.println(ANSI_YELLOW + "ATM Status:" + ANSI_STANDARD);
        System.out.println(ANSI_YELLOW + "20s: " + twentyCount + ANSI_STANDARD);
        System.out.println(ANSI_YELLOW + "50s: " + fiftyCount + ANSI_STANDARD);
        System.out.println(ANSI_YELLOW + "100s: " + hundredCount + ANSI_STANDARD);
    }


}