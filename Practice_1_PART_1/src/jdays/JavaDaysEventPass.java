package jdays;

import java.util.Calendar;

public class JavaDaysEventPass {

    private static final float childrenFare = 1;
    private static final float adultsFare = 2;
    private static boolean isEveningFare = false;
    private static short passValidity = 1;

    private static int travelPassId = 0;

    public static void main(String[] args) {
        try {
            System.out.println("Hello TSI Students!");
            //Exercise 4
            showMessageAboutFareSchedule();
            //Exercise 5
            checkPassValidity();
            //Exercise 6
            checkDiscount();

            //Exercise 7
            travelPassIdGeneration();


            //Exercise 8
            arraysDeclaration();

            int childrenEventCount = 5;
            int adultsEventCount = 10;

            double finalFare = 0.0;

            double totalChildrenFare = childrenFare * childrenEventCount;
            double totalAdultsFare = adultsFare * adultsEventCount;

            System.out.println(String.format("Total children fare: %1s", totalChildrenFare));

            System.out.println(String.format("Total adult fare: %1s", totalAdultsFare));

            finalFare = totalAdultsFare + totalChildrenFare;

            System.out.println(String.format("Total event fare: %1s", finalFare));

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void showMessageAboutFareSchedule() {
        isEveningFare = checkForFareSchedule();

        if (isEveningFare) {
            System.out.println("Evening pass hours are from 5 PM -\n" +
                    "9 PM, additional evening charge applicable for each pass");

            System.out.println("Use of an evening pass incurs an additional charge.");

        } else {
            System.out.println("Regular\n" +
                    "pass hours are from 9 AM - 5 PM, no additional charge applicable");

            System.out.println("No additional charge for use of a regular\n" +
                    "pass.");
        }
    }

    public static boolean checkForFareSchedule() {

        Calendar presentDate = Calendar.getInstance();

        Calendar startDate = Calendar.getInstance();
        startDate.set(Calendar.HOUR_OF_DAY, 17);
        startDate.set(Calendar.MINUTE, 0);
        startDate.set(Calendar.SECOND, 0);

        Calendar endDate = Calendar.getInstance();
        endDate.set(Calendar.HOUR_OF_DAY, 21);
        endDate.set(Calendar.MINUTE, 0);
        endDate.set(Calendar.SECOND, 0);

        if (presentDate.after(startDate) && presentDate.before(endDate)) {
            isEveningFare = true;
        }

        return isEveningFare;
    }

    public static void checkPassValidity() {
        if (isEveningFare && passValidity == 1) {

            System.out.println("Use of an evening\n" +
                    "pass incurs additional charge for each ticket.");

            return;

        } else if (isEveningFare && passValidity == 3 || passValidity == 5) {

            System.out.println("Use of an\n" +
                    "Evening pass incurs an additional charge, a discount is provided for\n" +
                    "use of an 3 or 5 day pass.");
            return;
        } else if (passValidity != 1 || passValidity != 3 || passValidity != 5) {
            System.out.println("Please choose either 1,\n" +
                    "3 or 5 days for pass duration.");
            return;
        }
        System.out.println("Regular pass offers discount based on pass duration.");
    }

    public static void checkDiscount() {

        if (passValidity == 1) {
            System.out.println("No discount on 1 day pass");
            return;
        }
        if (passValidity == 3) {
            System.out.println("3 day pass offers 15% discount");
            return;
        }

        if (passValidity == 5) {
            System.out.println("5 day pass offers 25% discount");
            return;
        }
        System.out.println("'Please choose only 1, 3\n" +
                "or 5 for valid pass duration.");
    }

    public static void travelPassIdGeneration() {
        int numberOfticket = 6;
        for (int i = 0; i < numberOfticket; i++) {
            travelPassId = i;
        }

        System.out.println(String.format("Travel pass id is: %1s", travelPassId));

        int tempIndex = 0;
        while (tempIndex < 5) {
            travelPassId++;
            tempIndex++;
        }

        System.out.println(String.format("Travel pass id is: %1s", travelPassId));
    }

    public static void arraysDeclaration() {

        String forLoopValuesString = "";
        int[] travePassIdSeq = new int[5];
        for (int i = 0; i < 5; i++) {
            travePassIdSeq[i] = i;
            forLoopValuesString += i;

        }
        System.out.println(String.format("This is array values from for loop: %s", forLoopValuesString));

        String whileLoopValuesString = "";
        int tempIndex = 0;
        while (tempIndex < 5) {
            travePassIdSeq[tempIndex] = tempIndex;
            whileLoopValuesString += tempIndex;
            tempIndex++;

        }
        System.out.println(String.format("This is array values from while loop: %s", whileLoopValuesString));

    }


}
