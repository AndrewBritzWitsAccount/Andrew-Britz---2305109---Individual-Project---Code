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
    /**
     * Input to this function is a string represented multiple groups for nested parentheses separated by spaces.
     * For each of the group, output the deepest level of nesting of parentheses.
     * E.g. (()()) has maximum two levels of nesting while ((())) has three.
     * >>> parseNestedParens("(()()) ((())) () ((())())")
     * [2, 3, 1, 3]
     */
    public List<Integer> parseNestedParens(String paren_string) {
        String[] groups = paren_string.split(" ");
        List<Integer> result = new ArrayList<>(List.of());
        for (String group : groups) {
            if (group.length() > 0) {
                int depth = 0; int max_depth = 0;
                for (char c : group.toCharArray()){
                        if (c == '(') { depth += 1; max_depth = Math.max(depth, max_depth);}
                        else { depth -= 1; } } result.add(max_depth);
            } }
        return result;
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
    public List<String> filterBySubstring(List<String> strings, String substring) {
        List<String> result = new ArrayList<>();
        for (String x : strings)
        {
            if (x.contains(substring)) { result.add(x); }
        }
        return result;
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
    public List<Integer> sumProduct(List<Integer> numbers) {
        int sum = 0; int product = 1;
        for (int n : numbers) { sum += n; product *= n; }
        return Arrays.asList(sum, product);
    }

    //=================================================================================================
    // Test 9
    //=================================================================================================
    /**
     * From a given list of integers, generate a list of rolling maximum element found until given moment in the sequence.
     * >>> rollingMax(Arrays.asList(1, 2, 3, 2, 3, 4, 2))
     * [1, 2, 3, 3, 3, 4, 4]
     */
    public List<Integer> rollingMax(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        if (numbers.size() == 0) { return result; }
        int rollingMax = numbers.get(0);
        result.add(rollingMax);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) > rollingMax) { rollingMax = numbers.get(i);}
            result.add(rollingMax);
        }
        return result;
    }

    //=================================================================================================
    // Test 10
    //=================================================================================================
    /** Test if given string is a palindrome */
    public boolean isPalindrome(String string) {
        int i = 0; int j = string.length() - 1;
        while (i < j) {
            if (string.charAt(i)!= string.charAt(j)) { return false; }
            i++;
            j--;
        }
        return true;
    }
    public String makePalindrome(String string) {
        if (string.length() == 0) { return ""; }
        int beginning_of_suffix = 0;
        while (!isPalindrome(string.substring(beginning_of_suffix))) { beginning_of_suffix++; }
        return string + new StringBuffer(string.substring(0, beginning_of_suffix)).reverse().toString();
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
    public String stringXor(String a, String b) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == b.charAt(i)) { result.append("0");}
            else { result.append("1");}
        }
        return result.toString();
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
    public Optional<String> longest(List<String> strings) {
        if (strings.isEmpty()) { return Optional.empty(); }
        String longest = strings.get(0);
        for (String s : strings) {
            if (s.length() > longest.length()) { longest = s; }
        }
        return Optional.of(longest);
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
    public int greatestCommonDivisor(int a, int b) {
        if (a == 0 || b == 0) {
            return a + b;
        }
        if (a == b) {
            return a;
        }
        if (a > b) {
            return greatestCommonDivisor(a % b, b);
        } else {
            return greatestCommonDivisor(a, b % a);
        }
    }

    //=================================================================================================
    // Test 14
    //=================================================================================================
    /**
     * Return list of all prefixes from shortest to longest of the input string
     * >>> allPrefixes("abc")
     * ["a", "ab", "abc"]
     */
    public List<String> allPrefixes(String string) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= string.length(); i++) {
            result.add(string.substring(0, i));
        }
        return result;
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
    public String stringSequence(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(i);
            sb.append(" ");
        }
        sb.append(n);
        return sb.toString();
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
    public int countDistinctCharacters(String string) {
        Set<Character> set = new HashSet<>();
        for (char c : string.toLowerCase().toCharArray()) { set.add(c); }
        return set.size();
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
    public List<Integer> parseMusic(String string) {
        String[] notes = string.split(" ");
        List<Integer> result = new ArrayList<>();
        for (String s : notes) {
            switch (s) { case "o" -> result.add(4); case "o|" -> result.add(2); case ".|" -> result.add(1); }
        }
        return result;
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
    public int howManyTimes(String string, String substring) {
        int times = 0;
        for (int i = 0; i < string.length() - substring.length() + 1; i++) {
            if (string.substring(i, i + substring.length()).equals(substring)) { times += 1; }
        }
        return times;
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
    public String sortNumbers(String numbers) {
        String[] nums = numbers.split(" ");
        List<Integer> num = new ArrayList<>();
        for (String string : nums) {
            switch (string) { case "zero" -> num.add(0); case "one" -> num.add(1); case "two" -> num.add(2); case "three" -> num.add(3); case "four" -> num.add(4); case "five" -> num.add(5); case "six" -> num.add(6); case "seven" -> num.add(7); case "eight" -> num.add(8); case "nine" -> num.add(9); }
        }
        Collections.sort(num); List<String> result = new ArrayList<>();
        for (int m : num) {
            switch (m) { case 0 -> result.add("zero"); case 1 -> result.add("one"); case 2 -> result.add("two"); case 3 -> result.add("three"); case 4 -> result.add("four"); case 5 -> result.add("five"); case 6 -> result.add("six"); case 7 -> result.add("seven"); case 8 -> result.add("eight"); case 9 -> result.add("nine"); }
        }
        return String.join(" ", result);
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
    public List<Double> findClosestElements(List<Double> numbers) {
        List<Double> closest_pair = new ArrayList<>();
        closest_pair.add(numbers.get(0));
        closest_pair.add(numbers.get(1));
        double distance = Math.abs(numbers.get(1) - numbers.get(0));
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i + 1; j < numbers.size(); j++) {
                if (Math.abs(numbers.get(i) - numbers.get(j)) < distance) { closest_pair.clear(); closest_pair.add(numbers.get(i)); closest_pair.add(numbers.get(j)); distance = Math.abs(numbers.get(i) - numbers.get(j)); }
            }
        } Collections.sort(closest_pair);
        return closest_pair;
    }


    //=================================================================================================
    // Test 21
    //=================================================================================================

}


