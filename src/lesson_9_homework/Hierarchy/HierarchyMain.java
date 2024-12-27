package lesson_9_homework.Hierarchy;

import lesson_9_homework.Hierarchy.Figure.*;
import lesson_9_homework.Hierarchy.Figure.Triangle;

public class HierarchyMain {
    public static void main(String[] args) {
        getFigure();
    }
    public static void getFigure(){
        Figure[] figures = new Figure[5];
        figures[0] = new Triangle(3, 4, 5);
        figures[1] = new Rectangle(4, 6);
        figures[2] = new Circle(3);
        figures[3] = new Triangle(5, 12, 13);
        figures[4] = new Rectangle(2, 8);

        double totalPerimeter = 0;

        for (Figure figure : figures) {
            totalPerimeter += figure.perimeter();
        }

        System.out.println("The sum of the perimeters of all figures: " + totalPerimeter);
    }

}

