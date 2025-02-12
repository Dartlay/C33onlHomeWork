package lesson_15_homework.Task2;

import static lesson_15_homework.Task2.StringPairs.pairs;

public class StringPairsTaster {
    public void testStringParis (){
        System.out.println(pairs(new String[]{"code", "bug"})); // {c=e, b=g}
        System.out.println(pairs(new String[]{"man", "moon", "main"})); // {m=n}
        System.out.println(pairs(new String[]{"man", "moon", "good", "night"})); // {m=n, g=d, n=t}
    }
}
