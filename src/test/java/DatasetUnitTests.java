import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class DatasetUnitTests
{
    //=================================================================================================
    //Test 0
    //==================================================================================================
    /**
     * Check if in given list of numbers, are any two numbers closer to each other than given threshold.
     * >>> hasCloseElements(Arrays.asList(1.0, 2.0, 3.0), 0.5)
     * false
     * >>> hasCloseElements(Arrays.asList(1.0, 2.8, 3.0, 4.0, 5.0, 2.0), 0.3)
     * true
     */
    @Test void DatasetUnitTest0()
    {
        Solution s = new Solution();

        List<Boolean> correct = Arrays.asList(
                !s.hasCloseElements(new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0)), 0.5),
                s.hasCloseElements(new ArrayList<>(Arrays.asList(1.0, 2.8, 3.0, 4.0, 5.0, 2.0)), 0.3)
        );

        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }

    //=================================================================================================
    //Test 1
    //==================================================================================================
    /**
     * Input to this function is a string containing multiple groups of nested parentheses.
     * Your goal is to separate those groups into separate strings and return the list of those.
     * Separate groups are balanced (each open brace is properly closed) and not nested within each other.
     * Ignore any spaces in the input string.
     *
     * >>> separateParenGroups("( ) (( )) (( )( ))")
     * ["()", "(())", "(()())"]
     */
    @Test void DatasetUnitTest1()
    {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(
                s.separateParenGroups("( ) (( )) (( )( ))").equals(Arrays.asList("()", "(())", "(()())"))
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
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
    @Test void DatasetUnitTest2()
    {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList( s.truncateNumber(3.5) == 0.5 );
        if (correct.contains(false)) { throw new AssertionError();}
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
    @Test void DatasetUnitTest3()
    {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList( !s.belowZero(new ArrayList<>(Arrays.asList(1, 2, 3))), s.belowZero(new ArrayList<>(Arrays.asList(1, 2, -4, 5))) );
        if (correct.contains(false)) { throw new AssertionError(); }
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
    @Test void DatasetUnitTest4()
    {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList( Math.abs(s.meanAbsoluteDeviation(new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0, 4.0))) - 1.0) < 1e-6 );
        if (correct.contains(false)) { throw new AssertionError(); }
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
    @Test void DatasetUnitTest5()
    {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList( s.intersperse(new ArrayList<>(List.of()), 4).equals(List.of()), s.intersperse(new ArrayList<>(Arrays.asList(1,2,3)), 4).equals(Arrays.asList(1,4,2,4,3)) );
        if (correct.contains(false)) { throw new AssertionError(); }
    }
}