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
        numbers[0] = 2;
        numbers[1] = 1; 
        numbers[2] = 5;

        // An array is declared by adding square brackets after the type of the elements it contains (typeofelements[])
        // A new Array is created by calling new followed by the type of the elements, square brackets and the number of the elements in the square brackets.

        String[] strings = new String[5]; // explicitly define the size upon creating. This creates an Array to hold five strings
        strings[0] = Apple;
        strings[1] = Pear;
        strings[2] = Jeans;
        strings[3] = Jerome;
        strings[4] = Oxidizer;

        System.out.println(numbers[0]); // 2
        System.out.println(numbers[2]); // 5

        System.out.println(numbers[3]); // Jerome
        System.out.println(numbers[2]); // Jeans

        arrayname.length // Displays length
        int arraylength = numbers.length // = 3
        System.out.println("Length of the array: " + strings.length) // = 5

    }

     //// Binary Search Implementation
    
     public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Avoids potential overflow
            if (array[mid] == target) {
                return mid; // Target found at index mid
            } else if (array[mid] < target) {
                left = mid + 1; // Search right half
            } else {
                right = mid - 1; // Search left half
            }
        }
        return -1; // Target not found
    }

    int[] nums = {1, 3, 5, 7, 9};
    int index = binarySearch(nums, 5);
    System.out.println("Index of target: " + index); // 2

    //// Bubble Sort

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    int[] values = {5, 2, 9, 1, 5, 6};
    bubbleSort(values);
    System.out.println(Arrays.toString(values)); // [1, 2, 5, 5, 6, 9]
    
    //// LinkedList Traversal
    
    LinkedList<String> names = new LinkedList<>();
    names.add("Alice");
    names.add("Bob");
    names.add("Charlie");

    for (String name : names) {
        System.out.println(name);
    }
    // Output:
    // Alice
    // Bob
    // Charlie

    //// Recursive Factorial
    public static int factorial(int n) {
        if (n == 0) {
            return 1; // Base case
        }
        return n * factorial(n - 1); // Recursive step
    }

    System.out.println(factorial(5)); // 120

    //// Interface and Class Implementation
    
    interface Animal {
        void speak();
    }

    class Dog implements Animal {
        public void speak() {
            System.out.println("Woof!");
        }
    }

    class Cat implements Animal {
        public void speak() {
            System.out.println("Meow!");
        }
    }

    Animal dog = new Dog();
    Animal cat = new Cat();
    dog.speak(); // Woof!
    cat.speak(); // Meow!

    //// Sorting with Comparator
    class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return name + " (" + age + ")";
        }
    }

    class AgeComparator implements Comparator<Person> {
        public int compare(Person p1, Person p2) {
            return Integer.compare(p1.age, p2.age);
        }
    }

    ArrayList<Person> people = new ArrayList<>();
    people.add(new Person("Alice", 30));
    people.add(new Person("Bob", 25));
    people.add(new Person("Charlie", 35));

    Collections.sort(people, new AgeComparator());
    System.out.println(people);
    // Output: [Bob (25), Alice (30), Charlie (35)]

    //// Measuring Big-O Efficiency

    /*
    * Big-O notation measures the time or space complexity of an algorithm.
    * It describes how the performance scales with input size (n).
    */

    // Common Big-O Notations:
    // O(1): Constant time, does not depend on input size.
    // Example: Accessing an element by index in an array.
    int firstElement = array[0]; // O(1)

    // O(log n): Logarithmic time, input size reduces by half at each step.
    // Example: Binary Search.
    // Refer to binarySearch example above. 

    // O(n): Linear time, scales directly with input size.
    // Example: Summing all elements in an array.
    int sum = 0;
    for (int i = 0; i < array.length; i++) {
        sum += array[i]; // O(n)
    }

    // O(n log n): Log-linear time, typical for efficient sorting algorithms.
    // Example: Merge Sort.
    // In Merge Sort, the array is repeatedly divided in half until each subarray has one element (this is the
    // log n part). Then, those subarrays are merged back together while comparing and arranging the
    // elements (this is the n part, as we process every element in the array). The result is a time complexity
    // of O(n log n).

    // O(n^2): Quadratic time, nested loops on input size.
    // Example: Bubble Sort.
    for (int i = 0; i < array.length; i++) {
        for (int j = i + 1; j < array.length; j++) {
            if (array[i] > array[j]) {
                // Swap
            }
        }
    }

    // O(2^n): Exponential time, doubles with each input addition.
    // Example: Recursive Fibonacci.
    public static int fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2); // O(2^n)
    }

    /*
        * To measure efficiency:
        * - Count the loops or recursive calls.
        * - Analyze how operations depend on input size (n).
        */

    //// On finding Code Purpose

    /*
    * To determine the purpose of a code segment:
    * 1. Identify the input and output of the method or code.
    * 2. Look for patterns, such as summing numbers, sorting arrays, or searching for elements.
    * 3. Break the code into small, understandable sections:
    *    - Check for loops (What do they iterate over? How many times?).
    *    - Look for conditionals (What conditions are being checked?).
    *    - Observe methods or library functions being called (What are they doing?).
    */

    // Example: Identify the purpose of this code
    public static int mystery(int[] array) {
        int max = Integer.MIN_VALUE; // Initialize with the smallest possible value.
        for (int num : array) {
            if (num > max) {
                max = num; // Update max if a larger value is found.
            }
        }
        return max; // Return the largest value in the array.
    }

    /*
    * Purpose: This code finds and returns the largest value in an array.
    * Steps:
    * - Initialize max to the smallest possible value.
    * - Iterate through the array, comparing each value to max.
    * - Update max if the current value is larger.
    */

    /*
    * Write a quick summary for each code block to determine its role.
    * For example:
    * - Initialization? (Setting variables, allocating memory)
    * - Processing? (Loops, conditionals, or calculations)
    * - Output? (Printing, returning values)
    */



}


