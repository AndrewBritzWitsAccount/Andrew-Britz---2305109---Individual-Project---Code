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

    //=================================================================================================
    // Test 31
    //=================================================================================================
    /**
     * Return true if a given number is prime, and false otherwise.
     *
     * Examples:
     * >>> isPrime(6) false
     * >>> isPrime(101) true
     * >>> isPrime(11) true
     * >>> isPrime(13441) true
     * >>> isPrime(61) true
     * >>> isPrime(4) false
     * >>> isPrime(1) false
     */
    @Test
    void DatasetUnitTest31() {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList( !s.isPrime(6), s.isPrime(101), s.isPrime(11), s.isPrime(13441), s.isPrime(61), !s.isPrime(4), !s.isPrime(1) );
        if (correct.contains(false)) { throw new AssertionError(); }
    }

    //=================================================================================================
    // Test 32
    //=================================================================================================
    /**
     * Evaluates polynomial with coefficients xs at point x.
     *
     * Formula:
     * xs[0] + xs[1] * x + xs[2] * x^2 + ... + xs[n] * x^n
     */
    @Test
    void DatasetUnitTest32() {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList( Math.abs(s.findZero(new ArrayList<>(Arrays.asList(1.,2.)))+0.5)<1e-4, Math.abs(s.findZero(new ArrayList<>(Arrays.asList(-6.,11.,-6.,1.)))-1)<1e-4 );
        if (correct.contains(false)) { throw new AssertionError(); }
    }

    //=================================================================================================
    // Test 33
    //=================================================================================================
    /**
     * This function takes a list l and returns a list l' such that:
     * - l' is identical to l in the indices that are not divisible by three,
     * - its values at the indices that are divisible by three are equal to the values of the corresponding indices of l, but sorted.
     *
     * Example:
     * >>> sortThird(Arrays.asList(1, 2, 3))
     * [1, 2, 3]
     * >>> sortThird(Arrays.asList(5, 6, 3, 4, 8, 9, 2))
     * [2, 6, 3, 4, 8, 9, 5]
     */
    @Test
    void DatasetUnitTest33() {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList( s.sortThird(new ArrayList<>(Arrays.asList(1,2,3))).equals(Arrays.asList(1,2,3)), s.sortThird(new ArrayList<>(Arrays.asList(5, 6, 3, 4, 8, 9, 2))).equals(Arrays.asList(2, 6, 3, 4, 8, 9, 5)) );
        if (correct.contains(false)) { throw new AssertionError(); }
    }

    //=================================================================================================
    // Test 34
    //=================================================================================================
    /**
     * Return sorted unique elements in a list.
     *
     * Example:
     * >>> unique(Arrays.asList(5, 3, 5, 2, 3, 3, 9, 0, 123))
     * [0, 2, 3, 5, 9, 123]
     */
    @Test
    void DatasetUnitTest34() {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList( s.unique(new ArrayList<>(Arrays.asList(5, 3, 5, 2, 3, 3, 9, 0, 123))).equals(Arrays.asList(0, 2, 3, 5, 9, 123)) );
        if (correct.contains(false)) { throw new AssertionError(); }
    }

    //=================================================================================================
    // Test 35
    //=================================================================================================
    /**
     * Return maximum element in the list.
     *
     * Example:
     * >>> maxElement(Arrays.asList(1, 2, 3))
     * 3
     * >>> maxElement(Arrays.asList(5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10))
     * 123
     */
    @Test
    void DatasetUnitTest35() {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList( s.maxElement(new ArrayList<>(Arrays.asList(1, 2, 3))) == 3, s.maxElement(new ArrayList<>(Arrays.asList(5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10))) == 123 );
        if (correct.contains(false)) { throw new AssertionError(); }
    }

    //=================================================================================================
    // Test 36
    //=================================================================================================
    /**
     * Return the number of times the digit 7 appears in integers less than n
     * which are divisible by 11 or 13.
     *
     * Example:
     * >>> fizzBuzz(50)
     * 0
     * >>> fizzBuzz(78)
     * 2
     * >>> fizzBuzz(79)
     * 3
     */
    @Test
    void DatasetUnitTest36() {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList( s.fizzBuzz(50) == 0, s.fizzBuzz(78) == 2, s.fizzBuzz(79) == 3 );
        if (correct.contains(false)) { throw new AssertionError(); }
    }

    //=================================================================================================
    // Test 37
    //=================================================================================================
    /**
     * This function takes a list l and returns a list l' such that:
     * - l' is identical to l in the odd indices,
     * - its values at the even indices are equal to the values of the even indices of l, but sorted.
     *
     * Example:
     * >>> sortEven(Arrays.asList(1, 2, 3))
     * [1, 2, 3]
     * >>> sortEven(Arrays.asList(5, 6, 3, 4))
     * [3, 6, 5, 4]
     */
    @Test
    void DatasetUnitTest37() {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList( s.sortEven(new ArrayList<>(Arrays.asList(1, 2, 3))).equals(Arrays.asList(1, 2, 3)), s.sortEven(new ArrayList<>(Arrays.asList(5,6,3,4))).equals(Arrays.asList(3,6,5,4)) );
        if (correct.contains(false)) { throw new AssertionError(); }
    }

    //=================================================================================================
    // Test 38
    //=================================================================================================
    /**
     * primeFib returns the n-th number that is both a Fibonacci number and prime.
     *
     * Examples:
     * >>> primeFib(1)
     * 2
     * >>> primeFib(2)
     * 3
     * >>> primeFib(3)
     * 5
     * >>> primeFib(4)
     * 13
     * >>> primeFib(5)
     * 89
     */
    @Test
    void DatasetUnitTest38() {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList( s.primeFib(1) == 2, s.primeFib(2) == 3, s.primeFib(3) == 5, s.primeFib(4) == 13, s.primeFib(5) == 89 );
        if (correct.contains(false)) { throw new AssertionError(); }
    }

    //=================================================================================================
    // Test 39
    //=================================================================================================
    /**
     * triplesSumToZero takes a list of integers as an input.
     * It returns True if there are three distinct elements in the list that sum to zero, and False otherwise.
     *
     * Examples:
     * >>> triplesSumToZero(Arrays.asList(1, 3, 5, 0))
     * false
     * >>> triplesSumToZero(Arrays.asList(1, 3, -2, 1))
     * true
     * >>> triplesSumToZero(Arrays.asList(1, 2, 3, 7))
     * false
     * >>> triplesSumToZero(Arrays.asList(2, 4, -5, 3, 9, 7))
     * true
     * >>> triplesSumToZero(Arrays.asList(1))
     * false
     */
    @Test
    void DatasetUnitTest39() {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList( !s.triplesSumToZero(new ArrayList<>(Arrays.asList(1, 3, 5, 0))), s.triplesSumToZero(new ArrayList<>(Arrays.asList(1, 3, -2, 1))), !s.triplesSumToZero(new ArrayList<>(Arrays.asList(1, 2, 3, 7))), s.triplesSumToZero(new ArrayList<>(Arrays.asList(2, 4, -5, 3, 9, 7))) );
        if (correct.contains(false)) { throw new AssertionError(); }
    }

    //=================================================================================================
    // Test 40
    //=================================================================================================
    /**
     * Imagine a road that's a perfectly straight infinitely long line.
     * n cars are driving left to right; simultaneously, a different set of n cars are driving right to left.
     * The two sets of cars start out being very far from each other. All cars move at the same speed.
     *
     * Two cars are said to collide when a car that's moving left to right hits a car that's moving right to left.
     * However, the cars are infinitely sturdy and strong; as a result, they continue moving in their trajectory as if they did not collide.
     *
     * This function outputs the number of such collisions.
     */
    @Test
    void DatasetUnitTest40() {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList( s.carRaceCollision(2) == 4, s.carRaceCollision(3) == 9, s.carRaceCollision(4) == 16, s.carRaceCollision(8) == 64, s.carRaceCollision(10) == 100 );
        if (correct.contains(false)) { throw new AssertionError(); }
    }

    //=================================================================================================
    // Test 41
    //=================================================================================================
    /**
     * Return list with elements incremented by 1.
     *
     * Examples:
     * >>> incrList(Arrays.asList(1, 2, 3))
     * [2, 3, 4]
     * >>> incrList(Arrays.asList(5, 3, 5, 2, 3, 3, 9, 0, 123))
     * [6, 4, 6, 3, 4, 4, 10, 1, 124]
     */
    @Test
    void DatasetUnitTest41() {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList( s.incrList(new ArrayList<>(Arrays.asList(1, 2, 3))).equals(Arrays.asList(2, 3, 4)), s.incrList(new ArrayList<>(Arrays.asList(5, 2, 5, 2, 3, 3, 9, 0, 123))).equals(Arrays.asList(6, 3, 6, 3, 4, 4, 10, 1, 124)) );
        if (correct.contains(false)) { throw new AssertionError(); }
    }

    //=================================================================================================
    // Test 42
    //=================================================================================================
    /**
     * pairsSumToZero takes a list of integers as an input.
     * It returns True if there are two distinct elements in the list that sum to zero, and False otherwise.
     *
     * Examples:
     * >>> pairsSumToZero(Arrays.asList(1, 3, 5, 0))
     * false
     * >>> pairsSumToZero(Arrays.asList(1, 3, -2, 1))
     * false
     * >>> pairsSumToZero(Arrays.asList(1, 2, 3, 7))
     * false
     * >>> pairsSumToZero(Arrays.asList(2, 4, -5, 3, 5, 7))
     * true
     * >>> pairsSumToZero(Arrays.asList(1))
     * false
     */
    @Test
    void DatasetUnitTest42() {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList( !s.pairsSumToZero(new ArrayList<>(Arrays.asList(1, 3, 5, 0))), !s.pairsSumToZero(new ArrayList<>(Arrays.asList(1, 3, -2, 1))), !s.pairsSumToZero(new ArrayList<>(Arrays.asList(1, 2, 3, 7))), s.pairsSumToZero(new ArrayList<>(Arrays.asList(2, 4, -5, 3, 5, 7))) );
        if (correct.contains(false)) { throw new AssertionError(); }
    }

    //=================================================================================================
    // Test 43
    //=================================================================================================
    /**
     * Change numerical base of input number x to base.
     * Return string representation after the conversion.
     * Base numbers are less than 10.
     *
     * Examples:
     * >>> changeBase(8, 3)
     * "22"
     * >>> changeBase(8, 2)
     * "1000"
     * >>> changeBase(7, 2)
     * "111"
     */
    @Test
    void DatasetUnitTest43() {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList( Objects.equals(s.changeBase(8, 3), "22"), Objects.equals(s.changeBase(8, 2), "1000"), Objects.equals(s.changeBase(7, 2), "111") );
        if (correct.contains(false)) { throw new AssertionError(); }
    }

    //=================================================================================================
    // Test 44
    //=================================================================================================
    /**
     * Given length of a side and height, return area for a triangle.
     *
     * Examples:
     * >>> triangleArea(5, 3)
     * 7.5
     */
    @Test
    void DatasetUnitTest44() {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList( s.triangleArea(5, 3) == 7.5 );
        if (correct.contains(false)) { throw new AssertionError(); }
    }

    //=================================================================================================
    // Test 45
    //=================================================================================================
    /**
     * The Fib4 number sequence is a sequence similar to the Fibonacci sequence that's defined as follows:
     * - fib4(0) -> 0
     * - fib4(1) -> 0
     * - fib4(2) -> 2
     * - fib4(3) -> 0
     * - fib4(n) -> fib4(n-1) + fib4(n-2) + fib4(n-3) + fib4(n-4)
     *
     * Please write a function to efficiently compute the n-th element of the fib4 number sequence.
     * Do not use recursion.
     *
     * Examples:
     * >>> fib4(5)
     * 4
     * >>> fib4(6)
     * 8
     * >>> fib4(7)
     * 14
     */
    @Test
    void DatasetUnitTest45() {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList( s.fib4(5) == 4, s.fib4(6) == 8, s.fib4(7) == 14 );
        if (correct.contains(false)) { throw new AssertionError(); }
    }

    //=================================================================================================
    // Test 46
    //=================================================================================================
    /**
     * Return median of elements in the list l.
     *
     * Examples:
     * >>> median(Arrays.asList(3, 1, 2, 4, 5))
     * 3
     * >>> median(Arrays.asList(-10, 4, 6, 1000, 10, 20))
     * 15.0
     */
    @Test
    void DatasetUnitTest46() {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList( s.median(new ArrayList<>(Arrays.asList(3, 1, 2, 4, 5))) == 3, s.median(new ArrayList<>(Arrays.asList(-10, 4, 6, 1000, 10, 20))) == 8.0 );
        if (correct.contains(false)) { throw new AssertionError(); }
    }

    //=================================================================================================
    // Test 47
    //=================================================================================================
    /**
     * Checks if the given string is a palindrome.
     *
     * Examples:
     * >>> isPalindrome("")
     * true
     * >>> isPalindrome("aba")
     * true
     * >>> isPalindrome("aaaaa")
     * true
     * >>> isPalindrome("zbcd")
     * false
     */
    @Test
    void DatasetUnitTest47() {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList( s.isPalindrome(""), s.isPalindrome("aba"), s.isPalindrome("aaaaa"), !s.isPalindrome("zbcd") );
        if (correct.contains(false)) { throw new AssertionError(); }
    }

    //=================================================================================================
    // Test 48
    //=================================================================================================
    /**
     * Return 2^n modulo p (be aware of numerics).
     *
     * Examples:
     * >>> modp(3, 5)
     * 3
     * >>> modp(1101, 101)
     * 2
     * >>> modp(0, 101)
     * 1
     * >>> modp(3, 11)
     * 8
     * >>> modp(100, 101)
     * 1
     */
    @Test
    void DatasetUnitTest48() {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList( s.modp(3, 5) == 3, s.modp(1101, 101) == 2, s.modp(0, 101) == 1, s.modp(3, 11) == 8, s.modp(100, 101) == 1 );
        if (correct.contains(false)) { throw new AssertionError(); }
    }

    //=================================================================================================
    // Test 49
    //=================================================================================================
    /**
     * removeVowels is a function that takes a string and returns a string without vowels.
     *
     * Examples:
     * >>> removeVowels("")
     * ""
     * >>> removeVowels("abcdef\nghijklm")
     * "bcdf\nghjklm"
     * >>> removeVowels("abcdef")
     * "bcdf"
     * >>> removeVowels("aaaaa")
     * ""
     * >>> removeVowels("aaBAA")
     * "B"
     * >>> removeVowels("zbcd")
     * "zbcd"
     */
    @Test
    void DatasetUnitTest49() {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList( Objects.equals(s.removeVowels(""), ""), Objects.equals(s.removeVowels("abcdef\nghijklm"), "bcdf\nghjklm"), Objects.equals(s.removeVowels("abcdef"), "bcdf"), Objects.equals(s.removeVowels("aaaaa"), ""), Objects.equals(s.removeVowels("aaBAA"), "B"), Objects.equals(s.removeVowels("zbcd"), "zbcd") );
        if (correct.contains(false)) { throw new AssertionError(); }
    }

    //=================================================================================================
    // Test 50
    //=================================================================================================
    /**
     * Return True if all numbers in the list l are below threshold t.
     *
     * Examples:
     * >>> belowThreshold(Arrays.asList(1, 2, 4, 10), 100)
     * true
     * >>> belowThreshold(Arrays.asList(1, 20, 4, 10), 5)
     * false
     */
    @Test
    void DatasetUnitTest50() {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList( s.belowThreshold(new ArrayList<>(Arrays.asList(1, 2, 4, 10)), 100), !s.belowThreshold(new ArrayList<>(Arrays.asList(1, 20, 4, 10)), 5) );
        if (correct.contains(false)) { throw new AssertionError(); }
    }
}
