import java.util.*;

/**
 * Created by denistimchenko on 05.03.17.
 */
public class Practice_1_PART2 {

    public static void main(String[] args) {
        double gravity = -9.81; // Earth's gravity in m/s^2
        double initialVelocity = 0.0;
        double fallingTime = 10.0;
        double initialPosition = 0.0;
        double finalPosition = 0.0;
//Exercise 10
        finalPosition = 0.5 * (gravity * (fallingTime * fallingTime)) + (initialVelocity * fallingTime) + initialPosition;

        System.out.println("Pos in " + fallingTime + "sec :" + finalPosition + " m");
//Exercise 11

        //for loop
        for (int counter = 0; counter <= 10; counter++) {
            System.out.printf("%d! = %d\n", counter, factorial(counter));
        }
//Exercise 12
        double[] array = workingWithArrays();
        double smallestItem = getSmallest(array);
        double biggestItem = getBigest(array);
        double meanItem = getMean(array);
        double[] sortedArray = bubbleSort(array);
//Exercise 13
        getMarathonNames();
        System.out.println("smallest item: " + smallestItem + "bigger item: " + biggestItem + "mean item: " + meanItem);
    }

    //recursion
    public static long factorial(long number) {
        if (number <= 1) return 1;
        else return number * factorial(number - 1);
    }

    public static double[] workingWithArrays() {
        double[] array = new double[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = randomFill();
        }
        return array;
    }


    public static double randomFill() {
        Random rand = new Random();
        int randomNum = rand.nextInt();
        return randomNum;
    }

    public static double getSmallest(double[] arr) {
        double small = arr[0];
        for (int i = 0; i < arr.length; i++)
            if (arr[i] < small) {
                small = arr[i];
            }
        return small;
    }

    public static double getBigest(double[] arr) {
        double max = arr[0];
        for (int i = 0; i < arr.length; i++)
            if (max < arr[i]) {
                max = arr[i];
            }
        return max;
    }

    public static double getMean(double[] arr) {
        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum / arr.length;

    }

    public static double[] bubbleSort(double[] numArray) {

        int n = numArray.length;
        double temp = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {

                if (numArray[j - 1] > numArray[j]) {
                    temp = numArray[j - 1];
                    numArray[j - 1] = numArray[j];
                    numArray[j] = temp;
                }

            }
        }
        return numArray;
    }


    public static void getMarathonNames() {

        List<MarathonResults> results = new ArrayList<>();

        String[] names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt",
                "Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
                "Aaron", "Kate"};
        int[] times = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393,
                299, 343, 317, 265};

        for (int i = 0; i < names.length; i++) {
            MarathonResults res = new MarathonResults();
            res.Name = names[i];
            res.Time = times[i];
            results.add(res);
        }
    }
}
