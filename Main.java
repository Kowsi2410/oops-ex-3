/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author kowsi
 */
import java.util.Scanner;

// Define the base class Degree
class Degree {
    void getDegree() {
        System.out.println("I got a degree");
    }
}

// Define the subclass Undergraduate, inheriting from Degree
class Undergraduate extends Degree {
    void getDegree() {
        System.out.println("I am an Undergraduate");
    }
}

// Define the subclass Postgraduate, inheriting from Degree
class Postgraduate extends Degree {
    void getDegree() {
        System.out.println("I am a Postgraduate");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user to determine the degree type
        System.out.println("Enter degree type (U for Undergraduate, P for Postgraduate):");
        String degreeType = scanner.nextLine();
        System.out.println("I got a degree");
        // Create objects of the respective classes based on user input
        Degree studentDegree;
        if (degreeType.equalsIgnoreCase("U")) {
            studentDegree = new Undergraduate();
        } else if (degreeType.equalsIgnoreCase("P")) {
            studentDegree = new Postgraduate();
        } else {
            System.out.println("Invalid input. Please enter 'U' for Undergraduate or 'P' for Postgraduate.");
            return;
        }

        // Call the getDegree method of the appropriate class
        studentDegree.getDegree();

        // Close the scanner
        scanner.close();
    }
}
