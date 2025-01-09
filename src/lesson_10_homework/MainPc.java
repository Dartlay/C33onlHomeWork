package lesson_10_homework;

import lesson_10_homework.Clone.CloneUser;
import lesson_10_homework.Clone.UserManager;

public class MainPc {
    public static void main(String[] args) {
      // getInfoPc();
       getUserManager();
}



    private static void getInfoPc() {
        UserPc user1 = new UserPc("Intel i7",
                "NVIDIA GTX 3080",
                "ASUS ROG",
                "Cooler Master",
                "Corsair 750W",
                "16GB", "1TB SSD");
        UserPc user2 = new UserPc("Intel i7",
                "NVIDIA GTX 3080",
                "ASUS ROG",
                "Cooler Master",
                "Corsair 750W",
                "16GB", "1TB SSD");
        UserPc user3 = new UserPc("AMD Ryzen 5",
                "NVIDIA GTX 1660",
                "MSI B450",
                "Noctua",
                "EVGA 600W",
                "8GB", "500GB HDD");


        System.out.println("user1.equals(user2): " + user1.equals(user2));
        System.out.println("user1.equals(user3): " + user1.equals(user3));


        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
    }
    public static void getUserManager() {
        UserManager userManager = new UserManager();
        CloneUser originalUser = userManager.createOriginalUser();
        System.out.println("Original user: " + originalUser);

        userManager.cloneUser(originalUser);
    }

}


