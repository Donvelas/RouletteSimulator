
import java.util.Random;

public class App {
    public static void main(String[] args) {
        // Initialize variables
        int winsOnColor = 0;
        int losses = 0;
        int totalGames = 1; // Since we are simulating only 1 game

        // Print welcome message
        System.out.println("Welcome to the Roulette Simulator!");

        // Step 1: Set the number of games to simulate
        int numberOfGames = 1; // For this example, we are only simulating 1 game

        // Step 2: Set the type of color bet
        String colorBet = "Black"; // For this example, the user chooses Black

        // Step 3: Inform the user that no specific number will be bet on
        System.out.println("No specific number will be bet on for this simulation.");

        // Step 4: Loop through the number of games to simulate
        for (int i = 0; i < numberOfGames; i++) {
            // Simulate a spin of the roulette wheel
            String outcomeColor = simulateSpin();

            // Check if the outcome matches the user's color bet
            if (outcomeColor.equals(colorBet)) {
                winsOnColor++;
            } else {
                losses++;
            }
        }

        // Step 5: Calculate and Display the results
        double winRateOnColor = ((double) winsOnColor / totalGames) * 100;
        String result = "Out of " + totalGames + " game betting on " + colorBet + " with no number chosen, you won "
                + winsOnColor + " times on color and lost " + losses + " times. Your win rate on color is "
                + winRateOnColor + "%.";
        System.out.println(result);
    }

    // Simulate a spin of the roulette wheel
    public static String simulateSpin() {
        Random rand = new Random();
        int outcome = rand.nextInt(37); // 0 to 36 inclusive
        if (outcome == 0) {
            return "Green";
        } else if (outcome % 2 == 0) {
            return "Black";
        } else {
            return "Red";
        }
    }
}