import java.util.*;

public class Main {
    public static void main(String[] args) {
        boolean isTrue = true;
        Scanner scanner = new Scanner(System.in);
        //Initializes new array with length of 100
        int[] intArray = new int[100];
        //initializes arrayLength counter variable
        int arrayLength = 0;

        while (isTrue) {
            System.out.println("What integer would you like to add to the array?");
            int newInt = scanner.nextInt();
            //If input is not -1, add integer to array and increase arrayLength by one
            if (newInt != -1) {
                intArray[arrayLength] = newInt;
                arrayLength++;
            } else {
                //if input is -1 end program
                isTrue = false;
            }
        }
        //Counts down from arrayLength, printing the values as it goes
        System.out.println("Your values, reversed: ");
        for (int j = arrayLength - 1; j >= 0; j--) {
            System.out.println(intArray[j]);
        }
    }
}
