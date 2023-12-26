////// TERMS

// Imports

import java.util.Scanner;
// Scanner is used to read input

import java.util.ArrayList;
// ArrayList is used for storing many values that are of the same type.

// Boilerplate
//           Name of program
public class JavaProject {

    public static void main(String[] args) {

     // End of boilerplate

        // Initialize import
        //      Name of import
        Scanner scanner = new Scanner(System.in);
        // Makes the scanner usable in the file

        //// Prints

        System.out.println("contains text");
        // Prints the text and a linebreak
        System.out.print("contains text");
        // Prints the text without a linebreak


        //// Values

        String text = "contains text";
        int wholeNumber = 123;
        double floatingPoint = 3.141592653;
        boolean trueOrFalse = true;


        scanner.nextLine();
        // Uses whatever is written in the console next as input
        // Examples:
        String text = scanner.nextLine();
        int wholeNumber = scanner.nextInt();
        double floatingPoint = scanner.nextDouble();
        boolean trueOrFalse = scanner.nextBoolean();

        // Modifying calculations from the default (integers)
        ((double)number1 / number2)

        //// Conditionals
        
        // Operators
        + plus
        // 1 + 2 = 3
        - minus
        // 1 - 2 = -1
        / divide
        // 1 / 2 = 0.5
        * multiplication
        // 1 * 2 = 2
        % remainder
        // 1 % 2 = 1
        > greater than
        // 1 > 2 | False
        >= greater than or equal to
        // 1 >= 2 | False
        < less than
        // 1 < 2 | True
        <= less than or equal to
        // 1 <= 2 | True
        == equal to
        // 1 == 2 | False
        != not equal to
        // 1 != 2 | True
        && and
        // (number1 > 1 && number2 > 2)
        || or
        // (number1 > 1 || number2 > 2)
        ! not
        // (!(number1 > 1 && number2 > 2))
        ++ increment [increases by one] 
        // number1++


        if (true) {
            
        }


        if (true) {
            
        } else if (true) {
        
        } else if (true) {
            
        } else {
            
        }

        if (from < number && number < where)
        // NOT if (from < number < where)




        //// Math & Numbers

        Math.sqrt(number);

        int minimumInt = Integer.MIN_VALUE; // The minimum value of a 32-bit signed integer (-2^31).
        int largestInt = Integer.MAX_VALUE; // The maximum value of a 32-bit signed integer (2^31 - 1).

        int minimumLongInt = Long.MIN_VALUE; // The minimum value of a 64-bit signed long integer (-2^63).
        int largestLongInt = Long.MAX_VALUE; // The maximum value of a 64-bit signed long integer (2^63 - 1).

        float minimumFloat = Float.MIN_VALUE; // The smallest positive nonzero value of a 32-bit floating-point (1.4e-45).
        float largestFloat = Float.MAX_VALUE; // The largest finite positive value of a 32-bit floating-point (3.4028235e38).

        double minimumLongFloat = Double.MIN_VALUE; // The smallest positive nonzero value of a 64-bit double-precision floating-point (4.9e-324).
        double largestLongFloat = Double.MAX_VALUE; // The largest finite positive value of a 64-bit double-precision floating-point (1.7976931348623157e308).

        //// Loops


        while (true) {
        //  loop
            if (true) {
            //  break == stop the loop
                break;
            }
        }

        for (initialization; condition; update) {
         // code to be executed repeatedly
        }
        for (int i = 1; i <= 5; i++) {
        System.out.println(i);
        }
         // prints the numbers from 1 to 5


        //// Methods
                        // Name of Method
        public static void greet() {
            // Method code
            System.out.println("Greetings from the method world!");
        }

        greet(); // executes the method code

        // Methods with parameters

        public static void greet(int numOfTimes) {
            int i = 0;
            while (i < numOfTimes) {
                System.out.println("Greetings!");
                i++;
            }
        }


        greet(1);
        System.out.println("");
        greet(3); // OR greet(1 + 2);

        // Greetings!
        //
        // Greetings!
        // Greetings!
        // Greetings!


        public static void sum(int first, int second) {
            System.out.println("The sum of numbers " + first + " and " + second + " is " + (first + second));
        }

        sum(3, 5);

        // Or

        int number1 = 3;
        int number2 = 5;

        sum(number1, number2);

        // Returns

        public static void methodThatReturnsNothing() {
            // method body
            // If return is used, it ends the method.
        }

        public static int methodThatReturnsInteger() {
            //method body, return statement must be included
        }

        public static double methodThatReturnsFloatingPointNumber() {
            // method body, return statement must be included
        }

        public static int alwaysReturnsTen() {
            return 10;
        }

        // ALL CODE MUST BE REACHABLE

        public static int faultyMethod() {
            return 10;
            // This is faulty, as it will never process under any circumstances.
            System.out.println("I claim to return an integer, but I don't.");
        }

        //// ArrayList

        ArrayList<String> list = new ArrayList<>();
        list.add("String is a reference-type variable");

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);

        ArrayList<Double> list = new ArrayList<>();
        list.add(4.2);

        ArrayList<Boolean> list = new ArrayList<>();
        list.add(true);

        // Sample integer saving list
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        // add two values to the word list
        wordList.add("First");
        wordList.add("Second");

        // retrieve the value from position 0 of the word list, and print it
        System.out.println(wordList.get(0));
        // "First"


        int size = list.size();
        // saves the list of the list

        list.remove(1);
        list.remove("First");
        // Deletes the entry of an index at the given location. The entry is removed and all entries after shift down in position by one.

        list.contains()
        // Check to see if a given value is part of an index

        list.contains("First") // = TRUE
        boolean found = list.contains("hello world!");

        if (list.contains("Second")) {
            System.out.println("Second can still be found");
        }


        System.out.println(list);
        print(list);



        // NOTE: Subtract list size by one when reading the list, as if the list is 3 values long, it will try to read value 3 (When the values are saved in places 0, 1 and 2.)

        //// Null 
        // You can use null to check if a value hasn't already been stated 
        // Check if the variable is null or uninitialized
        if (variable == null) {
            // Assign a value only if the variable is null or uninitialized
            variable = "New Value";
        }

        //// Array

        int[] numbers = new int[3]; // explicitly define the size upon creating. This creates an Array to hold three integers

        // An array is declared by adding square brackets after the type of the elements it contains (typeofelements[])
        // A new Array is created by calling new followed by the type of the elements, square brackets and the number of the elements in the square brackets.

        String[] strings = new String[5]; // explicitly define the size upon creating. This creates an Array to hold five strings


        numbers[0] = 2;
        numbers[2] = 5;

        System.out.println(numbers[0]);
        System.out.println(numbers[2]);
    
















    }
}


