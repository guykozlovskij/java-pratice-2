import java.awt.*;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int myAge = 30;
        int herAge = myAge;
        System.out.println(herAge);

        long v = 31234567895L;
        float price = 10.99F;
        double price2 = 10.11;
        char letter = 'A';
        String str = "STR";

        byte age = 30;
        Date now = new Date();

        //sout shortcut
        System.out.println("here " + now);

        Point point1 = new Point(1, 1);
        //a reference to an object in the memory. point2 refers to value of point1 - Point Objec
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);


        String message = "Hello";
        System.out.println(message.endsWith("o"));

        //Arrays
        int[] numberArray = new int[5];
        numberArray[0] = 1;

        System.out.println(Arrays.toString(numberArray));

        int[] numbers = {2, 3, 4, 5, 1};
        System.out.println(numbers.length);
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

//        int[][] multiDimensionArray = {{}};
//        multiDimensionArray[0][0] = 1;
//        System.out.println(Arrays.deepToString(multiDimensionArray));

        //constant conventionally named in all caps
        final float PI = 3.14F;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Age:");
        byte age2 = scanner.nextByte();
        System.out.println("you are " + age2);

    }
}