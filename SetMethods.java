/**
 * Created by armandominor on 11/10/15.
 */
// Program calculates Mean and Standard Deviation from a set of numbers in an array.
//Calculation is done from the input given by the user.

import java.util.ArrayList;
import java.util.List;

public class SetMethods extends Mean_StandardDeviation {

    private List<Double> inputList = new ArrayList(); //create new array list

    public SetMethods() {
    }

    public void add(double x) {

        inputList.add(x); // create input list to be used

    }


    public double getMean() {

        double sum = getSum(); //create sum method
        double count = getCount(); //create count method
        double mean = sum / count; //calculate mean

        return mean;

    }

    public double getSum() {
        double sum = 0; //set sum to 0

        for (double d : inputList) {
            sum += d; //sum equals all input values added together
        }
        return sum;
    }

    public double getStandardDeviation() {

        double mean = getMean(); //returns mean
        double calc1; //calculates
        double calc2 = 0; //set calc2 to 0
        double count = getCount(); //return count
        double stdDeviation; //initialize standard deviation

        for (int i = 0; i < count; i++) {
            calc1 = inputList.get(i) - mean; //holds value for further calculation
            calc1 = Math.pow(calc1, 2); //completes calculation
            calc2 = calc2 + calc1;
        }

        calc2 = calc2 / (count-1); //holds value for further calculation
        stdDeviation = Math.sqrt(calc2); //completes calculation for standard deviation
        return stdDeviation;
    }

    public int getCount() {
        return inputList.size();

    }
}