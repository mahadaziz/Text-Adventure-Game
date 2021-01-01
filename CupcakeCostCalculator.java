import java.util.Scanner;

public class CupcakeCostCalculator {
    public static void main(String[] args) {
        //Calls userInput and takes the array returned from the method
        String [] input = userInput();
        //Calls costCalculation and sends the array to determine final cost
        costCalculation(input);
    }

    /*
    userInput
    This method takes the user input and splits it into an array of Strings
    @return var
    Returns the array that contains the user's input
    */
    public static String [] userInput () {
        //Initialize scanner for user input
        Scanner keyboard = new Scanner(System.in);
        //Take user input and store in a String variable
        String input = keyboard.nextLine();
        //Split user input into an array of Strings where each element holds information the user inputted.
        String [] var = input.split(" ");
        //Returns the array to Main
        return var;
    }

    /*
    costCalculation
    This method calculates the cost of the cupcakes the user wants to purchase. This method also
    determines which price to use given the number of cupcakes being purchased.
    @param input
    An array of Strings that holds the user's input
    */
    public static void costCalculation (String [] input) {
        //Initialize variable
        int cost = 0;

        //If statement to determine and calculate cost based on the number of cupcakes the user is buying
        //is less than or equal to the number of cupcakes where the price changes
        if (Integer.parseInt(input[0]) <= Integer.parseInt(input[1])) {
            //Calculate cost if the user's cupcakes are less than or equal to the number of cupcakes
            //where the price changes
            cost = Integer.parseInt(input[0]) * Integer.parseInt(input[2]);
        }
        else {
            //Calculate cost if the user's cupcakes are greater than the number of cupcakes
            //where the price changes
            cost = Integer.parseInt(input[0]) * Integer.parseInt(input[3]);
        }

        //Print total cost
        System.out.println(cost);
    }
}
