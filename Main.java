import java.util.Scanner;

public class Main {

    // Store the start time in milliseconds
    private static long startTime;

    // Method to start the timer
    public static void startTimer() {
        startTime = System.currentTimeMillis();  // Record the start time
        System.out.println("Shift started.");
        System.out.println("Type 'help' for command list.");
        
    }

    // Method to get the elapsed time in seconds since the timer started
    public static long getElapsedTime() {
        long currentTime = System.currentTimeMillis();  // Get the current time
        return (currentTime - startTime) / 1000;  // Return the elapsed time in seconds
    }
}