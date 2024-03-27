import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class LLMUnitTests {
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
    private Solution s;
    @Test
    public void testHasCloseElements() {
    // Test 1: No close elements
        s = new Solution();
        assertFalse(s.hasCloseElements(Arrays.asList(1.0, 2.0, 3.0), 0.5));
    // Test 2: Close elements
        s = new Solution();
        assertTrue(s.hasCloseElements(Arrays.asList(1.0, 2.8, 3.0, 4.0, 5.0, 2.0), 0.3));
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
    public void testSeparateParenGroups() {
        Solution s = new Solution();
        String input = "( ) (( )) (( )( ))";
        List<String> expected = Arrays.asList("()", "(())", "(()())");
        List<String> actual = s.separateParenGroups(input);
        assertEquals(expected, actual);
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
    public void testTruncateNumber() {
        Solution s = new Solution();
        double input = 3.5;
        double expected = 0.5;
        double actual = s.truncateNumber(input);
        assertEquals(expected, actual, 0.000001);
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
    public void testBelowZero() {
        Solution s = new Solution();
        List<Integer> operations = Arrays.asList(1, 2, 3);
        assertFalse(s.belowZero(operations));
        operations = Arrays.asList(1, 2, -4, 5);
        assertTrue(s.belowZero(operations));
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
    public void testMeanAbsoluteDeviation() {
        Solution s = new Solution();
        List<Double> numbers = Arrays.asList(1.0, 2.0, 3.0, 4.0);
        double expected = 1.0;
        double actual = s.meanAbsoluteDeviation(numbers);
        assertEquals(expected, actual, 0.000001);
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
    public void testIntersperse() {
        Solution s = new Solution();
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        int delimiter = 4;
        List<Integer> expected = Arrays.asList(1, 4, 2, 4, 3);
        List<Integer> actual = s.intersperse(numbers, delimiter);
        assertEquals(expected, actual);
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
    public void testParseNestedParens() {
        Solution s = new Solution();
        String input = "(()()) ((())) () ((())())";
        List<Integer> expected = Arrays.asList(2, 3, 1, 3);
        List<Integer> actual = s.parseNestedParens(input);
        assertEquals(expected, actual);
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
    public void testFilterBySubstring() {
        Solution s = new Solution();
        List<String> strings = Arrays.asList("abc", "bacd", "cde", "array");
        String substring = "a";
        List<String> expected = Arrays.asList("abc", "bacd", "array");
        List<String> actual = s.filterBySubstring(strings, substring);
        assertEquals(expected, actual);
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
    public void testSumProduct() {
        Solution s = new Solution();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        List<Integer> expected = Arrays.asList(10, 24);
        List<Integer> actual = s.sumProduct(numbers);
        assertEquals(expected, actual);
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
    public void testRollingMax() {
        Solution s = new Solution();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 3, 4, 2);
        List<Integer> expected = Arrays.asList(1, 2, 3, 3, 3, 4, 4);
        List<Integer> actual = s.rollingMax(numbers);
        assertEquals(expected, actual);
    }

    //=================================================================================================
    // Test 10
    //=================================================================================================
    /** Test if given string is a palindrome */
    @Test
    public void testIsPalindrome() {
        Solution s = new Solution();
        String string = "racecar";
        boolean expected = true;
        boolean actual = s.isPalindrome(string);
        assertEquals(expected, actual);
    }
    @Test
    public void testMakePalindrome() {
        Solution s = new Solution();
        String string = "racecar";
        String expected = "racecarracecar";
        String actual = s.makePalindrome(string);
        assertEquals(expected, actual);
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
    public void testStringXor() {
        Solution s = new Solution();
        String a = "010";
        String b = "110";
        String expected = "100";
        String actual = s.stringXor(a, b);
        assertEquals(expected, actual);
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
    public void testLongest() {
        Solution s = new Solution();
        List<String> strings = Arrays.asList("a", "b", "c");
        Optional<String> expected = Optional.of("c");
        Optional<String> actual = s.longest(strings);
        assertEquals(expected, actual);
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
    public void testGreatestCommonDivisor() {
        Solution solution = new Solution();
        assertEquals(1, solution.greatestCommonDivisor(3, 5));
        assertEquals(5, solution.greatestCommonDivisor(25, 15));
        // Test with some edge cases
        assertEquals(0, solution.greatestCommonDivisor(0, 10));
        assertEquals(10, solution.greatestCommonDivisor(10, 0));
        assertEquals(1, solution.greatestCommonDivisor(1, 1));
        assertEquals(2, solution.greatestCommonDivisor(2, 4));
        // Test with some random inputs
        int a = 1234;
        int b = 5678;
        assertEquals(1234, solution.greatestCommonDivisor(a, b));
        a = 234;
        b = 789;
        assertEquals(234, solution.greatestCommonDivisor(a, b));
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
    public void testAllPrefixes() {
        Solution solution = new Solution();
        String input = "abc";
        List<String> expected = Arrays.asList("a", "ab", "abc");
        List<String> actual = solution.allPrefixes(input);
        assertEquals(expected, actual);
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
    public void testStringSequence() {
        Solution s = new Solution();
        String expected = "0";
        String actual = s.stringSequence(0);
        assertEquals(expected, actual);
        expected = "0 1 2 3 4 5";
        actual = s.stringSequence(5);
        assertEquals(expected, actual);
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
    public void testCountDistinctCharacters() {
        Solution solution = new Solution();
        String input = "xyzXYZ";
        int expected = 3;
        int actual = solution.countDistinctCharacters(input);
        assertEquals(expected, actual);
        input = "Jerry";
        expected = 4;
        actual = solution.countDistinctCharacters(input);
        assertEquals(expected, actual);
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
    public void testParseMusic() {
        Solution solution = new Solution();
        String input = "o o| .| o| o| .| .| .| .| o o";
        List<Integer> expected = Arrays.asList(4, 2, 1, 2, 2, 1, 1, 1, 1, 4, 4);
        List<Integer> actual = solution.parseMusic(input);
        assertEquals(expected, actual);
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
    public void testHowManyTimes() {
        Solution solution = new Solution();
        String input = "";
        String substring = "a";
        int expected = 0;
        int actual = solution.howManyTimes(input, substring);
        assertEquals(expected, actual);
        input = "aaa";
        substring = "a";
        expected = 3;
        actual = solution.howManyTimes(input, substring);
        assertEquals(expected, actual);
        input = "aaaa";
        substring = "aa";
        expected = 3;
        actual = solution.howManyTimes(input, substring);
        assertEquals(expected, actual);
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
    public void testSortNumbers() {
        Solution solution = new Solution();
        String input = "three one five";
        String expected = "one three five";
        String actual = solution.sortNumbers(input);
        assertEquals(expected, actual);
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
    public void testFindClosestElements() {
        Solution solution = new Solution();
        List<Double> numbers = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 2.2);
        List<Double> expected = Arrays.asList(2.0, 2.2);
        List<Double> actual = solution.findClosestElements(numbers);
        assertEquals(expected, actual);
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
    public void testRescaleToUnit() {
        Solution solution = new Solution();
        List<Double> numbers = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
        List<Double> expected = Arrays.asList(0.0, 0.25, 0.5, 0.75, 1.0);
        List<Double> actual = solution.rescaleToUnit(numbers);
        assertEquals(expected, actual);
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
    public void testFilterIntegers() {
        Solution solution = new Solution();
        List<Object> input = Arrays.asList('a', 3.14, 5);
        List<Integer> expected = Arrays.asList(5);
        List<Integer> actual = solution.filterIntergers(input);
        assertEquals(expected, actual);
        input = Arrays.asList(1, 2, 3, "abc", Map.of(), List.of());
        expected = Arrays.asList(1, 2, 3);
        actual = solution.filterIntergers(input);
        assertEquals(expected, actual);
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
    public void testStrlen() {
        Solution solution = new Solution();
        String input = "";
        int expected = 0;
        int actual = solution.strlen(input);
        assertEquals(expected, actual);
        input = "abc";
        expected = 3;
        actual = solution.strlen(input);
        assertEquals(expected, actual);
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
    public void testLargestDivisor() {
        Solution solution = new Solution();
        int input = 15;
        int expected = 5;
        int actual = solution.largestDivisor(input);
        assertEquals(expected, actual);
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
    public void testFactorize() {
        Solution solution = new Solution();
        int input = 8;
        List<Integer> expected = Arrays.asList(2, 2, 2);
        List<Integer> actual = solution.factorize(input);
        assertEquals(expected, actual);
        input = 25;
        expected = Arrays.asList(5, 5);
        actual = solution.factorize(input);
        assertEquals(expected, actual);
        input = 70;
        expected = Arrays.asList(2, 5, 7);
        actual = solution.factorize(input);
        assertEquals(expected, actual);
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
    public void testRemoveDuplicates() {
        Solution solution = new Solution();
        List<Integer> input = Arrays.asList(1, 2, 3, 2, 4);
        List<Integer> expected = Arrays.asList(1, 3, 4);
        List<Integer> actual = solution.removeDuplicates(input);
        assertEquals(expected, actual);
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
    public void testFlipCase() {
        Solution solution = new Solution();
        String input = "Hello";
        String expected = "hELLO";
        String actual = solution.flipCase(input);
        assertEquals(expected, actual);
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
    public void testConcatenate() {
        Solution solution = new Solution();
        List<String> input = Collections.emptyList();
        String expected = "";
        String actual = solution.concatenate(input);
        assertEquals(expected, actual);
        input = Arrays.asList("a", "b", "c");
        expected = "abc";
        actual = solution.concatenate(input);
        assertEquals(expected, actual);
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
    public void testFilterByPrefix() {
        Solution solution = new Solution();
        List<String> input = Collections.emptyList();
        String prefix = "a";
        List<String> expected = Arrays.asList();
        List<String> actual = solution.filterByPrefix(input, prefix);
        assertEquals(expected, actual);
        input = Arrays.asList("abc", "bcd", "cde", "array");
        prefix = "a";
        expected = Arrays.asList("abc", "array");
        actual = solution.filterByPrefix(input, prefix);
        assertEquals(expected, actual);
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
    public void testGetPositive() {
        Solution solution = new Solution();
        List<Integer> input = Arrays.asList(-1, 2, -4, 5, 6);
        List<Integer> expected = Arrays.asList(2, 5, 6);
        List<Integer> actual = solution.getPositive(input);
        assertEquals(expected, actual);
        input = Arrays.asList(5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10);
        expected = Arrays.asList(5, 3, 2, 3, 9, 123, 1);
        actual = solution.getPositive(input);
        assertEquals(expected, actual);
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
    public void testIsPrime() {
        Solution solution = new Solution();
        assertEquals(false, solution.isPrime(6));
        assertEquals(true, solution.isPrime(101));
        assertEquals(true, solution.isPrime(11));
        assertEquals(true, solution.isPrime(13441));
        assertEquals(true, solution.isPrime(61));
        assertEquals(false, solution.isPrime(4));
        assertEquals(false, solution.isPrime(1));
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
    public void testPolyAndFindZero() {
        Solution solution = new Solution();

        // Test poly method
        // Test case 1: Polynomial with coefficients [1, 2, 3] at x=2
        List<Double> coefficients1 = Arrays.asList(1.0, 2.0, 3.0);
        double result1 = solution.poly(coefficients1, 2);
        assertEquals(17.0, result1, 0.0001);

        // Test case 2: Polynomial with coefficients [0, 0, 1] at x=3
        List<Double> coefficients2 = Arrays.asList(0.0, 0.0, 1.0);
        double result2 = solution.poly(coefficients2, 3);
        assertEquals(9.0, result2, 0.0001);

        // Test findZero method
        // Test case 3: Polynomial with coefficients [1, -2, 1]
        List<Double> coefficients3 = Arrays.asList(1.0, -2.0, 1.0);
        double zero1 = solution.findZero(coefficients3);
        assertEquals(1.0, zero1, 0.0001);

        // Test case 4: Polynomial with coefficients [1, 0, -1]
        List<Double> coefficients4 = Arrays.asList(1.0, 0.0, -1.0);
        double zero2 = solution.findZero(coefficients4);
        assertEquals(1.0, zero2, 0.0001);
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
    public void testSortThird() {
        Solution solution = new Solution();
        List<Integer> input = Arrays.asList(1, 2, 3);
        List<Integer> expected = Arrays.asList(1, 2, 3);
        List<Integer> actual = solution.sortThird(input);
        assertEquals(expected, actual);
        input = Arrays.asList(5, 6, 3, 4, 8, 9, 2);
        expected = Arrays.asList(2, 6, 3, 4, 8, 9, 5);
        actual = solution.sortThird(input);
        assertEquals(expected, actual);
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
    public void testUnique() {
        Solution solution = new Solution();
        List<Integer> input = Arrays.asList(5, 3, 5, 2, 3, 3, 9, 0, 123);
        List<Integer> expected = Arrays.asList(0, 2, 3, 5, 9, 123);
        List<Integer> actual = solution.unique(input);
        assertEquals(expected, actual);
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
    public void testMaxElement() {
        Solution solution = new Solution();
        List<Integer> input = Arrays.asList(1, 2, 3);
        int expected = 3;
        int actual = solution.maxElement(input);
        assertEquals(expected, actual);
        input = Arrays.asList(5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10);
        expected = 123;
        actual = solution.maxElement(input);
        assertEquals(expected, actual);
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
    public void testFizzBuzz() {
        Solution solution = new Solution();
        int input = 50;
        int expected = 0;
        int actual = solution.fizzBuzz(input);
        assertEquals(expected, actual);
        input = 78;
        expected = 2;
        actual = solution.fizzBuzz(input);
        assertEquals(expected, actual);
        input = 79;
        expected = 3;
        actual = solution.fizzBuzz(input);
        assertEquals(expected, actual);
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
    public void testSortEven() {
        Solution solution = new Solution();
        List<Integer> input = Arrays.asList(1, 2, 3);
        List<Integer> expected = Arrays.asList(1, 2, 3);
        List<Integer> actual = solution.sortEven(input);
        assertEquals(expected, actual);
        input = Arrays.asList(5, 6, 3, 4);
        expected = Arrays.asList(3, 6, 5, 4);
        actual = solution.sortEven(input);
        assertEquals(expected, actual);
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
    public void testPrimeFib() {
        Solution solution = new Solution();
        int input = 1;
        int expected = 2;
        int actual = solution.primeFib(input);
        assertEquals(expected, actual);
        input = 2;
        expected = 3;
        actual = solution.primeFib(input);
        assertEquals(expected, actual);
        input = 3;
        expected = 5;
        actual = solution.primeFib(input);
        assertEquals(expected, actual);
        input = 4;
        expected = 13;
        actual = solution.primeFib(input);
        assertEquals(expected, actual);
        input = 5;
        expected = 89;
        actual = solution.primeFib(input);
        assertEquals(expected, actual);
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
    public void testTriplesSumToZero() {
        Solution s = new Solution();
        List<Integer> list1 = Arrays.asList(1, 3, 5, 0);
        assertFalse(s.triplesSumToZero(list1));
        List<Integer> list2 = Arrays.asList(1, 3, -2, 1);
        assertTrue(s.triplesSumToZero(list2));
        List<Integer> list3 = Arrays.asList(1, 2, 3, 7);
        assertFalse(s.triplesSumToZero(list3));
        List<Integer> list4 = Arrays.asList(2, 4, -5, 3, 9, 7);
        assertTrue(s.triplesSumToZero(list4));
        List<Integer> list5 = Arrays.asList(1);
        assertFalse(s.triplesSumToZero(list5));
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
    public void testCarRaceCollision() {
        Solution s = new Solution();
        int expected = 0;
        int actual = s.carRaceCollision(0);
        assertEquals(expected, actual);
        expected = 1;
        actual = s.carRaceCollision(1);
        assertEquals(expected, actual);
        expected = 4;
        actual = s.carRaceCollision(2);
        assertEquals(expected, actual);
        expected = 9;
        actual = s.carRaceCollision(3);
        assertEquals(expected, actual);
        expected = 16;
        actual = s.carRaceCollision(4);
        assertEquals(expected, actual);
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
    public void testIncrList() {
        Solution solution = new Solution();
        List<Integer> input = Arrays.asList(1, 2, 3);
        List<Integer> expected = Arrays.asList(2, 3, 4);
        List<Integer> actual = solution.incrList(input);
        assertEquals(expected, actual);
        input = Arrays.asList(5, 3, 5, 2, 3, 3, 9, 0, 123);
        expected = Arrays.asList(6, 4, 6, 3, 4, 4, 10, 1, 124);
        actual = solution.incrList(input);
        assertEquals(expected, actual);
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
    public void testPairsSumToZero() {
        Solution solution = new Solution();
        List<Integer> input = Arrays.asList(1, 3, 5, 0);
        boolean expected = false;
        boolean actual = solution.pairsSumToZero(input);
        assertEquals(expected, actual);
        input = Arrays.asList(1, 3, -2, 1);
        expected = false;
        actual = solution.pairsSumToZero(input);
        assertEquals(expected, actual);
        input = Arrays.asList(1, 2, 3, 7);
        expected = false;
        actual = solution.pairsSumToZero(input);
        assertEquals(expected, actual);
        input = Arrays.asList(2, 4, -5, 3, 5, 7);
        expected = true;
        actual = solution.pairsSumToZero(input);
        assertEquals(expected, actual);
        input = Arrays.asList(1);
        expected = false;
        actual = solution.pairsSumToZero(input);
        assertEquals(expected, actual);
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
    public void testChangeBase() {
        Solution solution = new Solution();
        int x = 8;
        int base = 3;
        String expected = "22";
        String actual = solution.changeBase(x, base);
        assertEquals(expected, actual);
        x = 8;
        base = 2;
        expected = "1000";
        actual = solution.changeBase(x, base);
        assertEquals(expected, actual);
        x = 7;
        base = 2;
        expected = "111";
        actual = solution.changeBase(x, base);
        assertEquals(expected, actual);
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
    public void testTriangleArea() {
        Solution solution = new Solution();
        double a = 5;
        double h = 3;
        double expected = 7.5;
        double actual = solution.triangleArea(a, h);
        assertEquals(expected, actual);
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
    public void testFib4() {
        Solution solution = new Solution();
        int n = 5;
        int expected = 4;
        int actual = solution.fib4(n);
        assertEquals(expected, actual);
        n = 6;
        expected = 8;
        actual = solution.fib4(n);
        assertEquals(expected, actual);
        n = 7;
        expected = 14;
        actual = solution.fib4(n);
        assertEquals(expected, actual);
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
    public void testMedian() {
        Solution solution = new Solution();
        List<Integer> l = Arrays.asList(3, 1, 2, 4, 5);
        double expected = 3;
        double actual = solution.median(l);
        assertEquals(expected, actual);
        l = Arrays.asList(-10, 4, 6, 1000, 10, 20);
        expected = 15.0;
        actual = solution.median(l);
        assertEquals(expected, actual);
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
    public void testIsPalindrome1() {
        Solution solution = new Solution();
        String text = "";
        boolean expected = true;
        boolean actual = solution.tisPalindrome(text);
        assertEquals(expected, actual);
        text = "aba";
        expected = true;
        actual = solution.tisPalindrome(text);
        assertEquals(expected, actual);
        text = "aaaaa";
        expected = true;
        actual = solution.tisPalindrome(text);
        assertEquals(expected, actual);
        text = "zbcd";
        expected = false;
        actual = solution.tisPalindrome(text);
        assertEquals(expected, actual);
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
    public void testModp() {
        Solution solution = new Solution();
        int n = 3;
        int p = 5;
        int expected = 3;
        int actual = solution.modp(n, p);
        assertEquals(expected, actual);
        n = 1101;
        p = 101;
        expected = 2;
        actual = solution.modp(n, p);
        assertEquals(expected, actual);
        n = 0;
        p = 101;
        expected = 1;
        actual = solution.modp(n, p);
        assertEquals(expected, actual);
        n = 3;
        p = 11;
        expected = 8;
        actual = solution.modp(n, p);
        assertEquals(expected, actual);
        n = 100;
        p = 101;
        expected = 1;
        actual = solution.modp(n, p);
        assertEquals(expected, actual);
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
    public void testRemoveVowels() {
        Solution solution = new Solution();
        String text = "";
        String expected = "";
        String actual = solution.removeVowels(text);
        assertEquals(expected, actual);
        text = "abcdef\nghijklm";
        expected = "bcdf\nghjklm";
        actual = solution.removeVowels(text);
        assertEquals(expected, actual);
        text = "abcdef";
        expected = "bcdf";
        actual = solution.removeVowels(text);
        assertEquals(expected, actual);
        text = "aaaaa";
        expected = "";
        actual = solution.removeVowels(text);
        assertEquals(expected, actual);
        text = "aaBAA";
        expected = "B";
        actual = solution.removeVowels(text);
        assertEquals(expected, actual);
        text = "zbcd";
        expected = "zbcd";
        actual = solution.removeVowels(text);
        assertEquals(expected, actual);
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
    public void testBelowThreshold() {
        Solution solution = new Solution();
        List<Integer> l = Arrays.asList(1, 2, 4, 10);
        int t = 100;
        boolean expected = true;
        boolean actual = solution.belowThreshold(l, t);
        assertEquals(expected, actual);
        l = Arrays.asList(1, 20, 4, 10);
        t = 5;
        expected = false;
        actual = solution.belowThreshold(l, t);
        assertEquals(expected, actual);
    }

}