/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static Object main;

    public static void main(String[] args) {

        int i = 1;
        while (i < 100) {
            i = doFizzBuzz(i);

//        for (int i = 1; i < 100; i++) {
//
//            // Find out which numbers divide i.
//            boolean divisibleBy3 = i % 3 == 0;
//            boolean divisibleBy5 = i % 5 == 0;
//
//            // Print our appropriate result.
//            if (divisibleBy3 && divisibleBy5) {
//
//                System.out.println("Fizz Buzz");
//
//            } else if (divisibleBy3) {
//
//                System.out.println("Fizz");
//
//            } else if (divisibleBy5) {
//
//                System.out.println("Buzz");
//
//            } else {
//
//                System.out.println(i);
//
//            }
//        }
// Five things that are similar or different between Java and Python:
// 1. has to set an initial value and a range for variables in Java
// 2. i++ instead of i+=1
// 3. more comlicated boolean expression in Java
// 4. similar usage of if statement - if, else if, else
// 5. need sout before print in Java
        }
    }

    public static int doFizzBuzz(int i) {
        // Find out which numbers divide i.
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;

        // Print our appropriate result.
        if (divisibleBy3 && divisibleBy5) {

            System.out.println("Fizz Buzz");

        } else if (divisibleBy3) {

            System.out.println("Fizz");

        } else if (divisibleBy5) {

            System.out.println("Buzz");

        } else {

            System.out.println(i);
        }
        i++;
        return i;
    }
}
