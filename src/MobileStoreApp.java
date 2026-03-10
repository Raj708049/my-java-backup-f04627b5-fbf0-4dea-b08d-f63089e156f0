

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MobileStoreApp { ;

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            System.out.println("\nMenu");
            System.out.println("1. Add Mobile");
            System.out.println("2. Filter and Display Mobiles by Brand");
            System.out.println("3. Display Mobiles Released After a Specific Date");
            System.out.println("4. Sort and Display Mobiles by Brand");
            System.out.println("5. Filter and Display Mobiles by Brand and Release Date");
            System.out.println("6. Display Mobiles Released on a Specific Date");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            try {
                int choice = scanner.nextInt();
                scanner.nextLine();
    // TODO: Use a switch statement to handle the different menu options based on the user's choice.
                System.out.println("Exiting...");
                running = false;
                break;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                       // TODO: Handle cases where the user enters an invalid input that is not an integer.

        }
        scanner.close();
    }

    private static void addMobile() {
        //TODO: Validate the user's inputs, if it is invalid ,print an error message accordingly.
        System.out.print("Enter Brand: ");
        String brand = scanner.nextLine().trim();

        System.out.print("Enter Model: ");
        String model = scanner.nextLine().trim();

            System.out.print("Enter the release date (yyyy-MM-dd): ");
        String inputDate = scanner.nextLine();
        System.out.print("Enter Price: ");
            String priceInput = scanner.nextLine().trim(); // Read input as a string




        System.out.println("Mobile added successfully");
    }


    private static void filterByBrand() {
        System.out.print("Enter the brand to filter: ");
        String brand = scanner.nextLine().trim();

        //TODO: Use Predicate<Mobile> to filter and display mobiles by brand
        //TODO: Check if the list is empty or not and display appropriate messages if the list is not empty

            System.out.println("No mobiles found for the brand: " + brand);

    }

    private static void displayMobilesReleasedAfterDate() {
        // TODO: Define a DateTimeFormatter with the pattern "yyyy-MM-dd" for parsing user input.
        LocalDate date = null;

        // TODO: Validate the user input to ensure it's a valid date using a loop.
            System.out.print("Enter the date (yyyy-MM-dd) to filter mobiles released after: ");
            String inputDate = scanner.nextLine().trim();
//TODO: Parse the input date and Handle invalid date formats using Date Time Parse Exception by displaying an error message


        //TODO: Use Predicate to filter and display the list of mobiles and also check if the list is empty or not and return appropriate messages if the list is not empty



                System.out.println("No mobiles found released after " + date);



    private static void sortMobilesByBrand() {
        // TODO: Use the Stream API and lambda expressions to sort the list of mobiles by their brand in a case-insensitive manner.
    }

    private static void filterMobilesByBrandAndReleaseDate() {

        System.out.print("Enter the brand to filter by: ");
        String brand = scanner.nextLine().trim(); // This variable can be used directly
           //TODO: Validate the user input to ensure it's a valid date using a loop.

            System.out.print("Enter the release date (yyyy-MM-dd) to filter mobiles released after: ");
            String inputDate = scanner.nextLine().trim();

            //TODO: Parse the input date and Handle invalid date formats using Date Time Parse Exception by displaying an error message

            }

        //TODO: Filter Mobiles By Brand and release date using Predicate and also print appropraite messages if the list is empty



            System.out.println("No mobiles found for brand " + brand + " released after " + releaseDate);

    }


    private static void displayMobilesByExactDate() {
        // TODO: Define a DateTimeFormatter with the pattern "yyyy-MM-dd" for parsing user input.

        LocalDate dates = null;

        // TODO: Validate the user input to ensure it's a valid date using a loop.
            System.out.print("Enter the release date (yyyy-MM-dd) to find mobiles released on that date: ");
            String inputDate = scanner.nextLine().trim();
        //TODO: Parse the input date and Handle invalid date formats using Date Time Parse Exception by displaying an error message

            }

       //TODO: Use Predicate to filter and display the list of mobiles and also check if the list is empty or not and return appropriate messages.
        LocalDate finalDates = dates;
        System.out.println("No mobiles found released on " + dates);
    }

    private static void displayMobiles(List<Mobile> mobileList) {
        if (mobileList.isEmpty()) {
            System.out.println("No mobiles to display.");
        }
        mobileList.forEach(System.out::println);
    }

}