import java.util.*;

public class Main {
    public static void main(String[] args) {
        boolean isTrue = true;
        Scanner scanner = new Scanner(System.in);
        List<Integer> intArray = new ArrayList<>();

        while (isTrue){
            System.out.println("What integer would you like to add to the array?");
            int newInt = scanner.nextInt();
            if (newInt !=-1) {
                intArray.add(newInt);
            }
            else {
                isTrue = false;
            }
        }
        for (int i = intArray.size() - 1; i >-1; i-- ) {
            System.out.println(intArray.get(i));
        }
    }
}
