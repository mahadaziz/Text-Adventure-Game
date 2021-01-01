import java.util.Scanner;

public class StylizedCupcakeCostCalculator {
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
        //Take user input
        String input = keyboard.nextLine();
        //Split user input into an array of Strings where each element holds information the user inputted
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
        //Initialize variables
        int t=0, d=0, D=0, k=0;
        String cost;

        //For loop the goes through the array the contains the user input to place the values the user
        //inputted to its corresponding variable in the form of an int
        for(String v : input){
            if ('t' == v.charAt(0)) {
                //Places the user's input value of t to the variable t
                t = Integer.parseInt(v.substring(2));
            }
            else if ('k' == v.charAt(0)) {
                //Places the user's input value of k to the variable k
                k = Integer.parseInt(v.substring(2));
            }
            else if ('d' == v.charAt(0)) {
                //Places the user's input value of d to the variable d
                d = Integer.parseInt(v.substring(2));
            }
            else if ('D' == v.charAt(0)) {
                //Places the user's input value of D to the variable D
                D = Integer.parseInt(v.substring(2));
            }
        }

        //If statement to determine and calculate cost based on the number of cupcakes the user is buying is
        // less than or equal to the number of cupcakes where the price changes
        if (t <= k) {
            cost = t * d + " Dollars";

        }
        else {
            cost = t * D + " Dollars";
        }

        //Print total cost
        System.out.println("*".repeat(cost.length()));
        System.out.println(cost);
        System.out.println("*".repeat(cost.length()));
    }
}
