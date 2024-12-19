package lesson_6_homework;

import java.util.Scanner;

public class CreditCardManager {
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_STANDARD = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RED = "\u001B[31m";
    private static CreditCard[] cards = new CreditCard[3];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print(ANSI_YELLOW + "Enter card number for card " + (i + 1) + ": " + ANSI_STANDARD);
            String cardNumber = scanner.nextLine();
            cards[i] = new CreditCard(cardNumber);
        }
        while (true) {
            System.out.println(ANSI_GREEN + "\nChoose an option:" + ANSI_STANDARD);
            System.out.println(ANSI_YELLOW + "1. Add amount" + ANSI_STANDARD);
            System.out.println(ANSI_YELLOW + "2. Withdraw amount" + ANSI_STANDARD);
            System.out.println(ANSI_YELLOW + "3. Check balance" + ANSI_STANDARD);
            System.out.println(ANSI_YELLOW + "4. Print all cards" + ANSI_STANDARD);
            System.out.println(ANSI_YELLOW + "5. Exit" + ANSI_STANDARD);
            int choice = scanner.nextInt();

            if (choice == 5) {
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print(ANSI_YELLOW + "Enter card number: " + ANSI_STANDARD);
                    String cardNumber = scanner.next();
                    CreditCard selectedCard = getCardByNumber(cardNumber);
                    if (selectedCard != null) {
                        System.out.print(ANSI_YELLOW + "Enter amount to add: " + ANSI_STANDARD);
                        double amountToAdd = scanner.nextDouble();
                        selectedCard.addAmount(amountToAdd);
                    } else {
                        System.out.println(ANSI_RED + "Card not found." + ANSI_STANDARD);
                    }
                    break;
                case 2:
                    System.out.print(ANSI_YELLOW + "Enter card number: " + ANSI_STANDARD);
                    cardNumber = scanner.next();
                    selectedCard = getCardByNumber(cardNumber);
                    if (selectedCard != null) {
                        System.out.print(ANSI_YELLOW + "Enter amount to withdraw: " + ANSI_STANDARD);
                        double amountToWithdraw = scanner.nextDouble();
                        String result = selectedCard.withdrawAmount(amountToWithdraw);
                        System.out.println(result);
                    } else {
                        System.out.println(ANSI_RED + "Card not found." + ANSI_STANDARD);
                    }
                    break;
                case 3:
                    System.out.print(ANSI_YELLOW + "Enter card number: " + ANSI_STANDARD);
                    cardNumber = scanner.next();
                    selectedCard = getCardByNumber(cardNumber);
                    if (selectedCard != null) {
                        System.out.println(ANSI_GREEN + "Current balance: " + selectedCard.getBalance() + ANSI_STANDARD);
                    } else {
                        System.out.println(ANSI_RED + "Card not found." + ANSI_STANDARD);
                    }
                    break;
                case 4:
                    for (CreditCard card : cards) {
                        System.out.println(card);
                    }
                    break;
                default:
                    System.out.println(ANSI_RED + "Invalid option." + ANSI_STANDARD);
            }
        }

        scanner.close();
    }

    private static CreditCard getCardByNumber(String cardNumber) {
        for (CreditCard card : cards) {
            if (card.getCardNumber().equals(cardNumber)) {
                return card;
            }
        }
        return null;
    }
}