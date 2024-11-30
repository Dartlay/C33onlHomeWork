package lesson_2_homework;

public class ArithmeticOperatorsHomeWork {
    public static void main(String[] args) {
        getPrintInfo();
        getPrintVale();
        getCalculation();


    }

    public static void getPrintInfo(){
        System.out.print("This text with out 'New Line'......");
        System.out.println("This text used 'New Line' ");
        System.out.print("This text used Ascii code- n \n");
        System.out.print("Sup");
    }
    public static void getPrintVale(){

        //Primitive data types Integer

        // Min byte value = -127 | Max = 127
        byte  byteValue = -100;
        // Min short value = -32768 | Max = 32768
        short shortValue = 3000;
        // This value is a number or letter used for Ascii code.
        char charValue = 33;
        // Ascii Example
        char charAscii = '!';
        // Min int value = -2147483648 | Max = 2147483648
        int intValue = 1000000;
        // Min long value = -9 QuintillionL | Max = 9 QuintillionL | And there should always be a big L at the end.
        long longValue = 150000000;



        System.out.println("byte = " + byteValue);
        System.out.println("short = " + shortValue);
        System.out.println("char int = " + charValue);
        System.out.println("Ascii = " + charAscii);
        System.out.println("int = " + intValue);
        System.out.println("long = " + longValue);

        //Primitive data types Double
        System.out.println("------------------------");
        //The less precise value after the dot
        float floatValue = 3.1415F;
        //More precise value after the dot
        double doubleValue = 3.14159265;

        System.out.println("float = " + floatValue);
        System.out.println("double = " + doubleValue);

        //Logical data type
        System.out.println("------------------------");
        //boolean always true or false
        boolean isDead = false;
        boolean isJump = true;
        System.out.println("boolean = "+ isDead);
        System.out.println("bolean = " + isJump);

    }
    public static void getCalculation(){

        int height = 972;
        double width = 401.13;


        int getHeightPlus = height + height;
        int getHeightMinus = height - 73;
        int getHeightDilution = (height / 4);
        float getWidhtDilutionFloat = (float) (width / 52);
        int getWidhtDilutionInt = (int) (width / 52);

        double getWidhtDilutionDouble =  (width / 52);

        char getChangeAscii = 33;

        getChangeAscii = (char) (getChangeAscii + 30);

        //Increment and Decrement
        int valueIncrement = 10;
        int valueDecrement = 10;

        valueIncrement++;
        valueDecrement--;

        System.out.println("Int = " + getHeightPlus);
        System.out.println("Int % = " + getHeightPlus%22);
        System.out.println("Int = " + getHeightMinus);
        System.out.println("Int = " + getHeightDilution);
        System.out.println("------------------------");
        System.out.println("Float = " + getWidhtDilutionFloat);
        System.out.println("Double = " + getWidhtDilutionDouble);
        System.out.println("Int = " + getWidhtDilutionInt);
        System.out.println("------------------------");
        System.out.println("Char = " + getChangeAscii);
        System.out.println("------------------------");
        System.out.println("Increment = " + valueIncrement);
        System.out.println("Decrement = " + valueDecrement);
        System.out.println("fd" + (35 + (10-1)));

    }
}

