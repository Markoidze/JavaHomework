package Day9;

import java.util.Scanner;

public class Home1 {
    //TODO Task
// 1. Write program that gets two inputs from user then prints sum


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Value 1:");
        int number = scanner.nextInt();
        System.out.println("Value 2:");

        // 2. Write simple calculator,
//     a. reads first input
//     b. reads operator (+, -, *, /)
//     c. reads second input
//     d. prints result
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::");
        int number2 = scanner.nextInt();
        int sum = number + number2;
        System.out.println("Total is your" + sum);

        System.out.println("::::::::::::::::::::::::::::::::::::::::::::");
// 3. Write program that calculates from string:
//    ex: one plus nine => 10, four subtract 2 => 2

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number(string): ");
        String str1 = in.nextLine();
        int result = Integer.parseInt(str1);
        System.out.printf("integer value:",result);
        System.out.printf("\n");
    }
}

//    public class Test {
//        public static void main(String[] args)
//        {
//            for (;;)
//                System.out.println("TECHNO");
//        }
//    }
////Options:
////4.TECHNO (Infinitely)

//    class Test {
//        public
//        static void main(String[] args)
//        {
//            for (int i = 0; i < 3)
//            System.out.println("TECHNO");
//        }
//    }
////Options:

////2.Compile time error

//    class Test {
//        public static void main(String[] args)
//        {
//            boolean b = true;
//            if (b = false) {
//                System.out.println("HELLO");
//            } else {
//                System.out.println("BYE");
//            }
//        }
//    }
////Option:

////4.BYE

//
//    public class Test {
//        public
//        static void main(String[] args)
//        {
//            int a = 10, b = 20;
//            if (a < b) {
//                if (a > b) {
//                    System.out.println("HELLO TECHNO");
//                } else {
//                    System.out.println("WELCOME");
//                }
//            }
//        }
//    }
////Option:

////2.WELCOME

//
//    class Test {
//        public static void main(String[] args)
//        {
//            for (int i = 0;; i++) {
//                System.out.println("HIII");
//            }
//            System.out.println("BYE");
//        }
//    }
////Options:

////4. Compile time error


