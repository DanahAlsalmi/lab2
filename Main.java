import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        1.Write a program to find all of the longest word in a given dictionary.
         */

//        String[] dictionary = {"cat", "dog", "red", "is", "am"};
//        int maxLength = 0;
//        for (String word : dictionary) {
//            if (word.length() > maxLength) {
//                maxLength = word.length();
//            }
//        }
//
//        System.out.print("Longest words in the dictionary: ");
//        for (String word : dictionary) {
//            if (word.length() == maxLength) {
//                System.out.print(word + ",");
//            }
//        }

        /*
        2. Write a program that displays the number of occurrences of an element in the array.
         */
//        int[] numbers = {1, 1, 1, 3, 3, 5};
//        boolean exists = false;
//        int count = 0;
//
//        System.out.print("Array: ");
//        System.out.println(Arrays.toString(numbers));
//
//        System.out.print("Enter a number to check if it exists in the array:");
//        int num = input.nextInt();
//
//        for (int n : numbers) {
//            if (n == num) {
//                exists = true;
//                count++;
//            }
//        }
//
//        if (exists) {
//            System.out.println(num + " occurs " + count + " times.");
//        } else {
//            System.out.println(num + " occurs " + count + " time");
//        }

        /*
        3.Write a program to find the k largest elements in a given array. Elements in the array can be in any order
         */

//        int[] numbers = {1, 4, 17, 7, 25, 3, 100};
//        System.out.println("Array: " + Arrays.toString(numbers));
//
//        System.out.print("Enter the value of k:");
//        int k = input.nextInt();
//
//        Arrays.sort(numbers);
//        System.out.println(k + " largest elements of the array are:");
//        for (int i = numbers.length - 1; i >= numbers.length - k; i--) {
//            System.out.print(numbers[i] + " ");
//        }

        /*
        4. Create a method to reverse an array of integers. Implement the method without creating a new array.
         */
//        int[] numbers = {5, 4, 3, 2, 1};
//
//        System.out.println("Original array: " + Arrays.toString(numbers));
//
//        reverse(numbers);
//        System.out.println("Reversed array: " + Arrays.toString(numbers));

        /*
            5. Write a menu driven Java program with following option:
            1. Accept elements of an array
            2. Display elements of an array
            3. Search the element within array
            4. Sort the array
            5. To Stop
            the size of the array should be entered by the user.
         */
//        ArrayList<Integer> arr = new ArrayList<>();
//        int size = 0;
//        while (true) {
//            System.out.println("Menu:");
//            System.out.println("1. Accept elements of an array");
//            System.out.println("2. Display elements of an array");
//            System.out.println("3. Search the element within array");
//            System.out.println("4. Sort the array");
//            System.out.println("5. To Stop");
//            System.out.print("Enter your choice: ");
//            int choice = input.nextInt();
//            System.out.println("**************");
//
//            switch (choice) {
//                case 1:
//                    System.out.print("Enter a size of Array : ");
//                    size = input.nextInt();
//                    System.out.println("Enter the elements of the array:");
//                    for (int i = 0; i < size; i++) {
//                        System.out.print(">");
//                        arr.add(input.nextInt());
//                    }
//                    System.out.println("**************");
//
//                    break;
//                case 2:
//                    if (arr.isEmpty()) {
//                        System.out.println("Array is empty. Please enter elements first.");
//                        System.out.println("**************");
//                    } else {
//                        System.out.println("Elements of the array: " + arr);
//                        System.out.println("**************");
//                    }
//                    break;
//                case 3:
//                    if (arr.isEmpty()) {
//                        System.out.println("Array is empty. Please enter elements first.");
//                        System.out.println("**************");
//                    } else {
//                        System.out.print("Enter the element to search: ");
//                        int searchElement = input.nextInt();
//                        if (arr.contains(searchElement)) {
//                            System.out.println(arr.contains(searchElement) + ", Element " + searchElement + " found in the array ");
//                            System.out.println("**************");
//
//                        } else {
//                            System.out.println(arr.contains(searchElement) + ", Element " + searchElement + " not found in the array.");
//                            System.out.println("**************");
//                        }
//                    }
//                    break;
//                case 4:
//                    if (arr.isEmpty()) {
//                        System.out.println("Array is empty. Please enter elements first.");
//                        System.out.println("**************");
//                    } else {
//                    Collections.sort(arr);
//                    System.out.print("Array sorted: ");
//                    System.out.println(arr);
//                    System.out.println("**************");
//                    }
//                    break;
//                case 5:
//                    System.out.println("Program stopped.");
//                    return;
//                default:
//                    System.out.println("Invalid choice, choose from 1-5 Please try again.");
//                    System.out.println("**************");
//
//            }
//        }

        /*
            6. Create a method that generates a random number within a given range. Allow the user to specify the range and call the method to display random numbers.
            Hint: use Random class
         */
//        System.out.print("Enter the minimum value of the range :");
//        int min = input.nextInt();
//        System.out.print("Enter the maximum value of the range :");
//        int max = input.nextInt();
//        System.out.print("Enter the number of random numbers to generate :");
//        int count = input.nextInt();
//
//        System.out.println("Random numbers within the specified range:");
//        RandomNumbers(min, max, count);
        /*
            7. Write a program that checks the strength of a password. Create a method that evaluates a password based on criteria like length, inclusion of special characters, and uppercase/lowercase letters.
            - We have three methods: checkLength, checkSpecialCharacters, and checkUpperCaseLowerCase, each of which assigns a score based on specific criteria.
            - The totalScore is calculated by adding the scores from these methods.
            - Classify the password as strong (8 or more), moderately strong (5 or more), or weak
            based on the totalScore.
            - The criteria for scoring:
            • Length: 0-5 characters (0 points), 6-7 characters (2 points), 8 or more characters (3 points).
            • Special characters: Absence (0 points), Presence (2 points).
            • Uppercase and lowercase letters: Absence of both (0 points), presence of both (3
            points).
         */

//        System.out.print("Enter a Password :");
//        String  pass=input.nextLine();
//
//        int totalScore=0;
//        totalScore += checkLength(pass.length());
//        totalScore += checkSpecialCharacters(pass);
//        totalScore += checkUpperCaseLowerCase(pass);
//
//        if (totalScore >= 8) {
//            System.out.println("Password is strong");
//        } else if (totalScore >= 5) {
//            System.out.println("Password is moderately strong");
//        } else {
//            System.out.println("Password is weak");
//        }

        /*
            8. Create a method that generates the Fibonacci sequence up to a specified number of terms.
            Hint: The Fibonacci sequence is a mathematical sequence of numbers that starts with 0 and 1,
            and each subsequent number in the sequence is the sum of the two preceding ones
         */
//        System.out.print("Enter the number of Fibonacci terms to generate: ");
//        int terms = input.nextInt();
//
//        System.out.println("Fibonacci sequence with " + terms + " terms:");
//        fib(terms);



    }// main


    //Question 4
    public static void reverse(int[] numbers) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;

            left++;
            right--;
        }

    }

    //Question 6
    public static void RandomNumbers(int min, int max, int count) {
        Random random = new Random();

        for (int i = 0; i < count; i++) {
            int randomNumber = random.nextInt((max - min) + 1) + min;
            System.out.print(randomNumber);
            if (i < count - 1) {
                System.out.print(" - ");
            }
        }
        System.out.println();
    }

    //Question7
    public static int checkLength(int length) {
        if (length >= 8) {
            return 3;
        } else if (length >= 6) {
            return 2;
        } else {
            return 0;
        }

    }
    public static int checkSpecialCharacters(String  pass){
        if (pass.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) {
            return 2;
        } else {
            return 0;
        }

    }
    public static int checkUpperCaseLowerCase(String  pass){
        if (pass.matches(".*[a-z].*") && pass.matches(".*[A-Z].*")) {
            return 3;
        } else {
            return 0;
        }

    }
    public static void fib(int terms) {
        int firstTerm = 0;
        int secondTerm = 1;

        System.out.print(firstTerm + " ");
        System.out.print(secondTerm + " ");

        for (int i = 2; i < terms; i++) {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(nextTerm + " ");

            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }


}
