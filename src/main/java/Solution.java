import java.util.*;
import java.lang.*;

public class Solution
{
    //=================================================================================================
    // Test 0
    //=================================================================================================
    /**
     * Check if in given list of numbers, are any two numbers closer to each other than given threshold.
     * >>> hasCloseElements(Arrays.asList(1.0, 2.0, 3.0), 0.5)
     * false
     * >>> hasCloseElements(Arrays.asList(1.0, 2.8, 3.0, 4.0, 5.0, 2.0), 0.3)
     * true
     */
    public boolean hasCloseElements(List<Double> numbers, double threshold)
    {
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i + 1; j < numbers.size(); j++) {
                double distance = Math.abs(numbers.get(i) - numbers.get(j));
                if (distance < threshold)
                    return true;
            }
        }
        return false;
    }

    //=================================================================================================
    // Test 1
    //=================================================================================================
    /**
     * Input to this function is a string containing multiple groups of nested parentheses.
     * Your goal is to separate those groups into separate strings and return the list of those.
     * Separate groups are balanced (each open brace is properly closed) and not nested within each other.
     * Ignore any spaces in the input string.
     *
     * >>> separateParenGroups("( ) (( )) (( )( ))")
     * ["()", "(())", "(()())"]
     */
    public List<String> separateParenGroups(String paren_string) {
        List<String> result = new ArrayList<>();
        StringBuilder current_string = new StringBuilder();
        int current_depth = 0;

        for (char c : paren_string.toCharArray()) {
            if (c == '(') {
                current_depth += 1;
                current_string.append(c);
            } else if (c == ')') {
                current_depth -= 1;
                current_string.append(c);
                if (current_depth == 0) {
                    result.add(current_string.toString());
                    current_string.setLength(0);
                }
            }
        }
        return result;
    }

        //=================================================================================================
        // Test 2
        //=================================================================================================
        /**
         * Given a positive floating point number, it can be decomposed into an integer part
         * (the largest integer smaller than the given number) and decimals (the leftover part always smaller than 1).
         * Return the decimal part of the number.
         *
         * >>> truncateNumber(3.5)
         * 0.5
         */
        public double truncateNumber(double number)
        {
            return number % 1.0;
        }
        //=================================================================================================
        // Test 3
        //=================================================================================================
        /**
         * You're given a list of deposit and withdrawal operations on a bank account that starts with zero balance.
         * Your task is to detect if at any point the balance of the account falls below zero,
         * and at that point, the function should return True. Otherwise, it should return False.
         *
         * >>> belowZero(Arrays.asList(1, 2, 3))
         * false
         * >>> belowZero(Arrays.asList(1, 2, -4, 5))
         * true
         */
        public boolean belowZero(List<Integer> operations) {
            int balance = 0;
            for (int op : operations)
            {
                balance += op;
                if (balance < 0) { return true; }
            } return false;
        }

    //=================================================================================================
    // Test 4
    //=================================================================================================
    /**
     * For a given list of input numbers, calculate Mean Absolute Deviation around the mean of this dataset.
     * Mean Absolute Deviation is the average absolute difference between each element and a center point
     * (mean in this case): MAD = average | x - x_mean |
     *
     * >>> meanAbsoluteDeviation(Arrays.asList(1.0, 2.0, 3.0, 4.0))
     * 1.0
     */
    public double meanAbsoluteDeviation(List<Double> numbers) {
        double sum = 0.0;
        for (double num : numbers) { sum += num; }
        double mean = sum / numbers.size();
        double sum_abs_diff = 0.0;
        for (double num : numbers) { sum_abs_diff += Math.abs(num - mean); }
        return sum_abs_diff / numbers.size();
    }

    //=================================================================================================
    // Test 5
    //=================================================================================================
    /**
     * Insert a number 'delimiter' between every two consecutive elements of the input list `numbers'.
     *
     * >>> intersperse(List.of(), 4)
     * []
     * >>> intersperse(Arrays.asList(1, 2, 3), 4)
     * [1, 4, 2, 4, 3]
     */
    public List<Integer> intersperse(List<Integer> numbers, int delimiter) {
        if (numbers.size() == 0) { return List.of(); }
        List<Integer> result = new ArrayList<>(List.of());
        for (int i = 0; i < numbers.size() - 1; i++) { result.add(numbers.get(i)); result.add(delimiter); }
        result.add(numbers.get(numbers.size() - 1)); return result;
    }

    //=================================================================================================
        // Test 6
        //=================================================================================================
        //=================================================================================================

}


