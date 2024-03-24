import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.*;

class DatasetUnitTests {
    //==================================================================================================
    //Test 0
    //==================================================================================================

    /**
     * Check if in given list of numbers, are any two numbers closer to each other than given threshold.
     * >>> hasCloseElements(Arrays.asList(1.0, 2.0, 3.0), 0.5)
     * false
     * >>> hasCloseElements(Arrays.asList(1.0, 2.8, 3.0, 4.0, 5.0, 2.0), 0.3)
     * true
     */
    @Test
    void DatasetUnitTest0() {
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
     * <p>
     * >>> separateParenGroups("( ) (( )) (( )( ))")
     * ["()", "(())", "(()())"]
     */
    @Test
    void DatasetUnitTest1() {
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
     * <p>
     * >>> truncateNumber(3.5)
     * 0.5
     */
    @Test
    void DatasetUnitTest2() {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(s.truncateNumber(3.5) == 0.5);
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }

    //=================================================================================================
    // Test 3
    //=================================================================================================

    /**
     * You're given a list of deposit and withdrawal operations on a bank account that starts with zero balance.
     * Your task is to detect if at any point the balance of the account falls below zero,
     * and at that point, the function should return True. Otherwise, it should return False.
     * <p>
     * >>> belowZero(Arrays.asList(1, 2, 3))
     * false
     * >>> belowZero(Arrays.asList(1, 2, -4, 5))
     * true
     */
    @Test
    void DatasetUnitTest3() {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(!s.belowZero(new ArrayList<>(Arrays.asList(1, 2, 3))), s.belowZero(new ArrayList<>(Arrays.asList(1, 2, -4, 5))));
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }

    //=================================================================================================
    // Test 4
    //=================================================================================================

    /**
     * For a given list of input numbers, calculate Mean Absolute Deviation around the mean of this dataset.
     * Mean Absolute Deviation is the average absolute difference between each element and a center point
     * (mean in this case): MAD = average | x - x_mean |
     * <p>
     * >>> meanAbsoluteDeviation(Arrays.asList(1.0, 2.0, 3.0, 4.0))
     * 1.0
     */
    @Test
    void DatasetUnitTest4() {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(Math.abs(s.meanAbsoluteDeviation(new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0, 4.0))) - 1.0) < 1e-6);
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }

    //=================================================================================================
    // Test 5
    //=================================================================================================

    /**
     * Insert a number 'delimiter' between every two consecutive elements of the input list `numbers'.
     * <p>
     * >>> intersperse(List.of(), 4)
     * []
     * >>> intersperse(Arrays.asList(1, 2, 3), 4)
     * [1, 4, 2, 4, 3]
     */
    @Test
    void DatasetUnitTest5() {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(s.intersperse(new ArrayList<>(List.of()), 4).equals(List.of()), s.intersperse(new ArrayList<>(Arrays.asList(1, 2, 3)), 4).equals(Arrays.asList(1, 4, 2, 4, 3)));
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }

    //=================================================================================================
    // Test 6
    //=================================================================================================

    /**
     * Input to this function is a string represented multiple groups for nested parentheses separated by spaces.
     * For each of the group, output the deepest level of nesting of parentheses.
     * E.g. (()()) has maximum two levels of nesting while ((())) has three.
     * >>> parseNestedParens("(()()) ((())) () ((())())")
     * [2, 3, 1, 3]
     */
    @Test
    void DatasetUnitTest6() {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(s.parseNestedParens("(()()) ((())) () ((())()())").equals(Arrays.asList(2, 3, 1, 3)));
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }

    //=================================================================================================
    // Test 7
    //=================================================================================================
    /**
     * Filter an input list of strings only for ones that contain given substring
     * >>> filterBySubstring(List.of(), "a")
     * []
     * >>> filterBySubstring(Arrays.asList("abc", "bacd", "cde", "array"), "a")
     * ["abc", "bacd", "array"]
     */
    @Test
    void DatasetUnitTest7() {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList( s.filterBySubstring(new ArrayList<>(List.of()), "s").equals(List.of()), s.filterBySubstring(new ArrayList<>(Arrays.asList("abc", "bacd", "cde", "array")), "a").equals(Arrays.asList("abc", "bacd", "array")) );
        if (correct.contains(false)) { throw new AssertionError(); }
    }

    //=================================================================================================
    // Test 8
    //=================================================================================================
    /**
     * For a given list of integers, return a tuple consisting of a sum and a product of all the integers in a list.
     * Empty sum should be equal to 0 and empty product should be equal to 1.
     * >>> sumProduct(List.of())
     * [0, 1]
     * >>> sumProduct(Arrays.asList(1, 2, 3, 4))
     * [10, 24]
     */
    @Test
    void DatasetUnitTest8() {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList( s.sumProduct(new ArrayList<>(List.of())).equals(Arrays.asList(0, 1)), s.sumProduct(new ArrayList<>(Arrays.asList(1, 2, 3,4))).equals(Arrays.asList(10, 24)) );
        if (correct.contains(false)) { throw new AssertionError(); }
    }

    //=================================================================================================
    // Test 9
    //=================================================================================================
    /**
     * From a given list of integers, generate a list of rolling maximum element found until given moment in the sequence.
     * >>> rollingMax(Arrays.asList(1, 2, 3, 2, 3, 4, 2))
     * [1, 2, 3, 3, 3, 4, 4]
     */
    @Test
    void DatasetUnitTest9() {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList( s.rollingMax(new ArrayList<>(List.of(1, 2, 3, 2, 3, 4, 2))).equals(List.of(1, 2, 3, 3, 3, 4, 4)) );
        if (correct.contains(false)) { throw new AssertionError(); }
    }

    //=================================================================================================
    // Test 10
    //=================================================================================================
    /** Test if given string is a palindrome */
    @Test
    void DatasetUnitTest10() {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList( Objects.equals(s.makePalindrome(""), ""), Objects.equals(s.makePalindrome("cat"), "catac"), Objects.equals(s.makePalindrome("cata"), "catac") );
        if (correct.contains(false)) { throw new AssertionError(); }
    }

    //=================================================================================================
    // Test 11
    //=================================================================================================
    /**
     * Input are two strings a and b consisting only of 1s and 0s.
     * Perform binary XOR on these inputs and return result also as a string.
     * >>> stringXor("010", "110")
     * "100"
     */
    @Test
    void DatasetUnitTest11() {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList( Objects.equals(s.stringXor("010", "110"), "100") );
        if (correct.contains(false)) { throw new AssertionError(); }
    }

    //=================================================================================================
    // Test 12
    //=================================================================================================
    /**
     * Out of list of strings, return the longest one.
     * Return the first one in case of multiple strings of the same length.
     * Return None in case the input list is empty.
     * >>> longest(List.of())
     * Optional.empty
     * >>> longest(Arrays.asList("a", "b", "c"))
     * Optional[a]
     * >>> longest(Arrays.asList("a", "bb", "ccc"))
     * Optional[ccc]
     */
    @Test
    void DatasetUnitTest12() {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList( s.longest(new ArrayList<>(List.of())).isEmpty(), Objects.equals(s.longest(new ArrayList<>(Arrays.asList("a", "b", "c"))).get(), "a"), Objects.equals(s.longest(new ArrayList<>(Arrays.asList("a", "bb", "ccc"))).get(), "ccc") );
        if (correct.contains(false)) { throw new AssertionError(); }
    }

    //=================================================================================================
    // Test 13
    //=================================================================================================
    /**
     * Return a greatest common divisor of two integers a and b
     * >>> greatestCommonDivisor(3, 5)
     * 1
     * >>> greatestCommonDivisor(25, 15)
     * 5
     */
    @Test
    void DatasetUnitTest13() {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList( s.greatestCommonDivisor(3, 5) == 1, s.greatestCommonDivisor(25, 15) == 5 );
        if (correct.contains(false)) { throw new AssertionError(); }
    }

    //=================================================================================================
    // Test 14
    //=================================================================================================
    /**
     * Return list of all prefixes from shortest to longest of the input string
     * >>> allPrefixes("abc")
     * ["a", "ab", "abc"]
     */
    @Test
    void DatasetUnitTest14() {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList( s.allPrefixes("abc").equals(Arrays.asList("a", "ab", "abc")) );
        if (correct.contains(false)) { throw new AssertionError();}
    }

    //=================================================================================================
    // Test 15
    //=================================================================================================
    /**
     * Return a string containing space-delimited numbers starting from 0 upto n inclusive.
     * >>> stringSequence(0)
     * "0"
     * >>> stringSequence(5)
     * "0 1 2 3 4 5"
     */
    @Test
    void DatasetUnitTest15() {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList( s.stringSequence(0).equals("0"), s.stringSequence(5).equals("0 1 2 3 4 5") );
        if (correct.contains(false)) { throw new AssertionError();}
    }

    //=================================================================================================
    // Test 16
    //=================================================================================================
    /**
     * Given a string, find out how many distinct characters (regardless of case) does it consist of
     * >>> countDistinctCharacters("xyzXYZ")
     * 3
     * >>> countDistinctCharacters("Jerry")
     * 4
     */
    @Test
    void DatasetUnitTest16() {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList( s.countDistinctCharacters("xyzXYZ") == 3, s.countDistinctCharacters("Jerry") == 4 );
        if (correct.contains(false)) { throw new AssertionError(); }
    }

    //=================================================================================================
    // Test 17
    //=================================================================================================
    /**
     * Input to this function is a string representing musical notes in a special ASCII format.
     * Your task is to parse this string and return list of integers corresponding to how many beats does each note last.
     * Here is a legend:
     * "o" - whole note, lasts four beats
     * "o|" - half note, lasts two beats
     * ".|" - quarter note, lasts one beat
     * >>> parseMusic("o o| .| o| o| .| .| .| .| o o")
     * [4, 2, 1, 2, 2, 1, 1, 1, 1, 4, 4]
     */
    @Test
    void DatasetUnitTest17() {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList( s.parseMusic("o o| .| o| o| .| .| .| .| o o").equals(Arrays.asList(4, 2, 1, 2, 2, 1, 1, 1, 1, 4, 4)) );
        if (correct.contains(false)) { throw new AssertionError(); }
    }

    //=================================================================================================
    // Test 18
    //=================================================================================================
    /**
     * Find how many times a given substring can be found in the original string. Count overlapping cases.
     * >>> howManyTimes("", "a")
     * 0
     * >>> howManyTimes("aaa", "a")
     * 3
     * >>> howManyTimes("aaaa", "aa")
     * 3
     */
    @Test
    void DatasetUnitTest18() {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList( s.howManyTimes("", "a") == 0, s.howManyTimes("aaa", "a") == 3, s.howManyTimes("aaaa", "aa") == 3 );
        if (correct.contains(false)) { throw new AssertionError(); }
    }
    //=================================================================================================
    // Test 19
    //=================================================================================================
    /**
     * Input is a space-delimited string of numerals from 'zero' to 'nine'.
     * Valid choices are 'zero', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight', and 'nine'.
     * Return the string with numbers sorted from smallest to largest
     * >>> sortNumbers("three one five")
     * "one three five"
     */
    @Test
    void DatasetUnitTest19() {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList( s.sortNumbers("three one five").equals("one three five") );
        if (correct.contains(false)) { throw new AssertionError(); }
    }

    //=================================================================================================
    // Test 20
    //=================================================================================================
    /**
     * From a supplied list of numbers (of length at least two) select and return two that are the closest to each other
     * and return them in order (smaller number, larger number).
     * >>> findClosestElements(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 2.2))
     * [2.0, 2.2]
     * >>> findClosestElements(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 2.0))
     * [2.0, 2.0]
     */
    @Test
    void DatasetUnitTest20() {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(s.findClosestElements(new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 2.2))).equals(Arrays.asList(2.0, 2.2)), s.findClosestElements(new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 2.0))).equals(Arrays.asList(2.0, 2.0)));
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }

    //=================================================================================================
    // Test 21
    //=================================================================================================
    /**
     * Given list of numbers (of at least two elements), apply a linear transform to that list,
     * such that the smallest number will become 0 and the largest will become 1
     * >>> rescaleToUnit(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0))
     * [0.0, 0.25, 0.5, 0.75, 1.0]
     */
    @Test
    void DatasetUnitTest21() {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList( s.rescaleToUnit(new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0))).equals(Arrays.asList(0.0, 0.25, 0.5, 0.75, 1.0)) );
        if (correct.contains(false)) { throw new AssertionError(); }
    }

    //=================================================================================================
    // Test 22
    //=================================================================================================
    /**
     * Filter given list of any values only for integers
     * >>> filter_integers(Arrays.asList('a', 3.14, 5))
     * [5]
     * >>> filter_integers(Arrays.asList(1, 2, 3, "abc", Map.of(), List.of()))
     * [1, 2, 3]
     */
    @Test
    void DatasetUnitTest22() {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList( s.filterIntergers(new ArrayList<>(Arrays.asList('a', 3.14, 5))).equals(Arrays.asList(5)), s.filterIntergers(new ArrayList<>(Arrays.asList(1,2,3,"abc", Map.of(), List.of()))).equals(Arrays.asList(1,2,3)) );
        if (correct.contains(false)) { throw new AssertionError(); }
    }

    //=================================================================================================
    // Test 23
    //=================================================================================================
    /**
     * Return length of given string
     * >>> strlen("")
     * 0
     * >>> strlen("abc")
     * 3
     */
    @Test
    void DatasetUnitTest23() {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList( s.strlen("") == 0, s.strlen("abc") == 3 );
        if (correct.contains(false)) { throw new AssertionError(); }
    }

    //=================================================================================================
    // Test 24
    //=================================================================================================
    /**
     * For a given number n, find the largest number that divides n evenly, smaller than n
     * >>> largestDivisor(15)
     * 5
     */
    @Test
    void DatasetUnitTest24() {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList( s.largestDivisor(15) == 5 );
        if (correct.contains(false)) { throw new AssertionError(); }
    }

    //=================================================================================================
    // Test 25
    //=================================================================================================
    /**
     * Return list of prime factors of given integer in the order from smallest to largest.
     * Each of the factors should be listed number of times corresponding to how many times it appears in factorization.
     * Input number should be equal to the product of all factors
     * >>> factorize(8)
     * [2, 2, 2]
     * >>> factorize(25)
     * [5, 5]
     * >>> factorize(70)
     * [2, 5, 7]
     */
    @Test
    void DatasetUnitTest25() {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList( s.factorize(8).equals(Arrays.asList(2, 2, 2)), s.factorize(25).equals(Arrays.asList(5,5)), s.factorize(70).equals(Arrays.asList(2,5,7)) );
        if (correct.contains(false)) { throw new AssertionError(); }
    }

    //=================================================================================================
    // Test 26
    //=================================================================================================
    /**
     * From a list of integers, remove all elements that occur more than once.
     * Keep the order of elements left the same as in the input.
     * >>> removeDuplicates(Arrays.asList(1, 2, 3, 2, 4))
     * [1, 3, 4]
     */
    @Test
    void DatasetUnitTest26() {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList( s.removeDuplicates(new ArrayList<>(Arrays.asList(1, 2, 3, 2,4))).equals(Arrays.asList(1, 3, 4)) );
        if (correct.contains(false)) { throw new AssertionError(); }
    }

    //=================================================================================================
    // Test 27
    //=================================================================================================
    /**
     * For a given string, flip lowercase characters to uppercase and uppercase to lowercase.
     * >>> flipCase("Hello")
     * "hELLO"
     */
    @Test
    void DatasetUnitTest27() {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList( Objects.equals(s.flipCase(""), ""), Objects.equals(s.flipCase("Hello"), "hELLO") );
        if (correct.contains(false)) { throw new AssertionError(); }
    }

    //=================================================================================================
    // Test 28
    //=================================================================================================
    /**
     * Concatenate list of strings into a single string
     * >>> concatenate(List.of())
     * ""
     * >>> concatenate(Arrays.asList("a", "b", "c"))
     * "abc"
     */
    @Test
    void DatasetUnitTest28() {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList( Objects.equals(s.concatenate(new ArrayList<>(List.of())), ""), Objects.equals(s.concatenate(new ArrayList<>(Arrays.asList("a", "b", "c"))),"abc") );
        if (correct.contains(false)) { throw new AssertionError(); }
    }

    //=================================================================================================
    // Test 29
    //=================================================================================================
    /**
     * Filter an input list of strings only for ones that start with a given prefix.
     * >>> filterByPrefix(List.of(), "a")
     * []
     * >>> filterByPrefix(Arrays.asList("abc", "bcd", "cde", "array"), "a")
     * ["abc", "array"]
     */
    @Test
    void DatasetUnitTest29() {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList( s.filterByPrefix(new ArrayList<>(List.of()), "a").equals(List.of()), s.filterByPrefix(new ArrayList<>(Arrays.asList("abc", "bcd", "cde", "array")), "a").equals(Arrays.asList("abc", "array")) );
        if (correct.contains(false)) { throw new AssertionError(); }
    }

    //=================================================================================================
    // Test 30
    //=================================================================================================
    /**
     * Return only positive numbers in the list.
     * >>> getPositive(Arrays.asList(-1, 2, -4, 5, 6))
     * [2, 5, 6]
     * >>> getPositive(Arrays.asList(5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10))
     * [5, 3, 2, 3, 9, 123, 1]
     */
    @Test
    void DatasetUnitTest30() {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList( s.getPositive(new ArrayList<>(Arrays.asList(-1, 2, -4, 5, 6))).equals(Arrays.asList(2, 5, 6)), s.getPositive(new ArrayList<>(Arrays.asList(5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10))).equals(Arrays.asList(5, 3, 2, 3, 9, 123, 1)) );
        if (correct.contains(false)) { throw new AssertionError(); }
    }




}
