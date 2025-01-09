package lesson_10_homework.Clone;

import java.util.Scanner;

public class UserManager {
    public CloneUser createOriginalUser() {
        return new CloneUser("Intel i7",
                "NVIDIA GTX 3080",
                "ASUS ROG",
                "Cooler Master",
                "Corsair 750W",
                "16GB", "1TB SSD");
    }

    public void cloneUser(CloneUser originalUser) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the type of cloning s/d: ");
        String cloneType = scanner.nextLine();

        CloneUser clonedUser = null;

        try {
            if ("s".equalsIgnoreCase(cloneType)) {
                clonedUser = (CloneUser) originalUser.clone();
            } else if ("d".equalsIgnoreCase(cloneType)) {
                clonedUser = originalUser.deepClone();
            } else {
                System.out.println("Incorrect cloning type.");
                return;
            }

            System.out.println("Cloned User: " + clonedUser);


            boolean isEqual = originalUser.equals(clonedUser);
            System.out.println("Comparison of the original and the clone: " + isEqual);


            if (isEqual) {
                System.out.println("Original and clone are equal: true");
            } else {
                System.out.println("Original and clone are not equal: false");
            }

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}