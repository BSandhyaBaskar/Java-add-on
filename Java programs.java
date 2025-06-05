import java.util.Scanner;

public class VotingAge
{
    public static void main(String[] args)
    {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age=");
        age = sc.nextInt();
        if (age >= 18)
        {
            System.out.println("You are eligible for vote.");
        }
        else
        {
            System.out.println("You are not eligible for vote.");
        }
    }
}


----------------------------------------------------------------------------------------------------------------------------------------


import java.util.*;

import java.util.Scanner;

public class BloodDonationEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Blood Donation Eligibility Checker!");
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        if (age >= 18 && age <= 65 && weight >= 50.0 ) {
            System.out.println("You are eligible to donate blood. Thank you for your willingness to help!");
        } else {
            System.out.println("You are not eligible to donate blood at the moment.");
        }

        scanner.close();
    }
}