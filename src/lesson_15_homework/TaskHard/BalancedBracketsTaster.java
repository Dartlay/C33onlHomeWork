package lesson_15_homework.TaskHard;

import static lesson_15_homework.TaskHard.BalancedBrackets.isBalanced;

public class BalancedBracketsTaster {
    public void testBalancedBrackets(){
        System.out.println(isBalanced("()"));
        System.out.println(isBalanced("[()]"));
        System.out.println(isBalanced("{[()]}"));
        System.out.println(isBalanced("([f{[(())):])"));
        System.out.println(isBalanced("(f[]())}}}"));
        System.out.println(isBalanced("f[(])}"));
        System.out.println(isBalanced("{[(])}"));
    }
}
