import java.util.*;
import java.lang.*;
import java.util.stream.Collectors;

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
    /**
     * Given list of numbers (of at least two elements), apply a linear transform to that list,
     * such that the smallest number will become 0 and the largest will become 1
     * >>> rescaleToUnit(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0))
     * [0.0, 0.25, 0.5, 0.75, 1.0]
     */
    public List<Double> rescaleToUnit(List<Double> numbers) {
        double min_number = Collections.min(numbers);
        double max_number = Collections.max(numbers);
        List<Double> result = new ArrayList<>();
        for (double x : numbers) {
            result.add((x - min_number) / (max_number - min_number));
        }
        return result;
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
    public List<Integer> filterIntergers(List<Object> values) {
        List<Integer> result = new ArrayList<>();
        for (Object x : values) {
            if (x instanceof Integer) { result.add((Integer) x); }
        }
        return result;
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
    public int strlen(String string) {
        return string.length();
    }

    //=================================================================================================
    // Test 24
    //=================================================================================================
    /**
     * For a given number n, find the largest number that divides n evenly, smaller than n
     * >>> largestDivisor(15)
     * 5
     */
    public int largestDivisor(int n) {
        for (int i = n - 1; i > 0; i--) {
            if (n % i == 0) { return i; }
        }
        return 1;
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
    public List<Integer> factorize(int n) {
        List<Integer> fact = new ArrayList<>();
        int i = 2;
        while (n > 1) {
            if (n % i == 0) {
                fact.add(i);
                n /= i;
            } else {
                i++;
            }
        }
        return fact;
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
    public List<Integer> removeDuplicates(List<Integer> numbers) {
        Map<Integer, Integer> c = new HashMap<>();
        for (int i : numbers) { c.put(i, c.getOrDefault(i, 0) + 1); }
        return numbers.stream().filter(i -> c.get(i) == 1).collect(Collectors.toList());
    }

    //=================================================================================================
    // Test 27
    //=================================================================================================
    /**
     * For a given string, flip lowercase characters to uppercase and uppercase to lowercase.
     * >>> flipCase("Hello")
     * "hELLO"
     */
    public String flipCase(String string) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < string.length(); i++)
        {
            if (Character.isLowerCase(string.charAt(i))) { sb.append(Character.toUpperCase(string.charAt(i))); }
            else { sb.append(Character.toLowerCase(string.charAt(i))); }
        }
        return sb.toString();
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
    public String concatenate(List<String> strings) {
        return String.join("", strings);
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
    public List<String> filterByPrefix(List<String> strings, String prefix) {
        return strings.stream().filter(p -> p.startsWith(prefix)).collect(Collectors.toList());
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
    public List<Integer> getPositive(List<Integer> l) {
        return l.stream().filter(p -> p > 0).collect(Collectors.toList());
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
    public boolean isPrime(int n) {
        if (n < 2) { return false; }
        for (int k = 2; k < n; k++) {
            if (n % k == 0) { return false;}
        }
        return true;
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
    public double poly(List<Double> xs, double x) {
        double result = 0;
        for (int i = 0; i < xs.size(); i++) {
            result += xs.get(i) * Math.pow(x, i);
        }
        return result;
    }
    public double findZero(List<Double> xs) {
        double begin = -1, end = 1;
        while (poly(xs, begin) * poly(xs, end) > 0) {
            begin *= 2; end *= 2;
        }
        while (end - begin > 1e-10) {
            double center = (begin + end) / 2;
            if (poly(xs, begin) * poly(xs, center) > 0) { begin = center; }
            else { end = center; }
        }
        return begin;
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
    public List<Integer> sortThird(List<Integer> l) {
        List<Integer> thirds = new ArrayList<>();
        for (int i = 0; i < l.size(); i += 3) { thirds.add(l.get(i)); }
        Collections.sort(thirds);
        List<Integer> result = l;
        for (int i = 0; i < l.size(); i += 3) { result.set(i, thirds.get(i / 3)); }
        return result;
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
    public List<Integer> unique(List<Integer> l) {
        List<Integer> result = new ArrayList<>(new HashSet<>(l));
        Collections.sort(result);
        return result;
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
    public int maxElement(List<Integer> l) {
        return Collections.max(l);
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
    public int fizzBuzz(int n) {
        int result = 0;
        for (int i = 1; i < n; i++) {
            if (i % 11 == 0 || i % 13 == 0) {
                char[] digits = String.valueOf(i).toCharArray();
                for (char c : digits) {
                    if (c == '7') { result += 1; }
                }
            }
        }
        return result;
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
    public List<Integer> sortEven(List<Integer> l) {
        List<Integer> even = new ArrayList<>();
        for (int i = 0; i < l.size(); i += 2) { even.add(l.get(i)); }
        Collections.sort(even);
        List<Integer> result = l;
        for (int i = 0; i < l.size(); i += 2) { result.set(i, even.get(i / 2)); }
        return result;
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
    public int primeFib(int n) {
        int f0 = 0, f1 = 1;
        while (true) {
            int p = f0 + f1;
            boolean is_prime = p >= 2;
            for (int k = 2; k < Math.min(Math.sqrt(p) + 1, p - 1); k++) {
                if (p % k == 0) {
                    is_prime = false;
                    break;
                }
            }
            if (is_prime) {
                n -= 1;
            }
            if (n == 0) {
                return p;
            }
            f0 = f1;
            f1 = p;
        }
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
    public boolean triplesSumToZero(List<Integer> l) {
        for (int i = 0; i < l.size(); i++) {
            for (int j = i + 1; j < l.size(); j++) {
                for (int k = j + 1; k < l.size(); k++) {
                    if (l.get(i) + l.get(j) + l.get(k) == 0) { return true; }
                }
            }
        }
        return false;
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
    public int carRaceCollision(int n) {
        return n * n;
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
    public List<Integer> incrList(List<Integer> l) {
        return l.stream().map(p -> p + 1).collect(Collectors.toList());
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
    public boolean pairsSumToZero(List<Integer> l) {
        for (int i = 0; i < l.size(); i++) {
            for (int j = i + 1; j < l.size(); j++) {
                if (l.get(i) + l.get(j) == 0) { return true; }
            }
        }
        return false;
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
    public String changeBase(int x, int base) {
        StringBuilder ret = new StringBuilder();
        while (x > 0) {
            ret.append(String.valueOf(x % base));
            x /= base;
        }
        return ret.reverse().toString();
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
    public double triangleArea(double a, double h) {
        return a * h / 2;
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
    public int fib4(int n) {
        List<Integer> results = new ArrayList<>();
        results.add(0); results.add(0);
        results.add(2); results.add(0);
        if (n < 4) { return results.get(n); }
        for (int i = 4; i <= n; i++) {
            results.add(results.get(0) + results.get(1) + results.get(2) + results.get(3));
            results.remove(0);
        }
        return results.get(3);
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
    public double median(List<Integer> l) {
        List<Integer> list = l;
        Collections.sort(list);
        if (l.size() % 2 == 1) {
            return l.get(l.size() / 2);
        } else {
            return (l.get(l.size() / 2 - 1) + l.get(l.size() / 2)) / 2.0;
        }
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
    public boolean tisPalindrome(String text) {
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != text.charAt(text.length() - 1 - i)) { return false; }
        } return true;
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
    public int modp(int n, int p) {
        int ret = 1;
        for (int i = 0; i < n; i++) { ret = (ret * 2) % p; }
        return ret;
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
    public String removeVowels(String text) {
        StringBuilder sb = new StringBuilder();
        for (char ch : text.toCharArray()) {
            if ("aeiou".indexOf(Character.toLowerCase(ch)) == -1) { sb.append(ch); }
        }
        return sb.toString();
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
    public boolean belowThreshold(List<Integer> l, int t) {
        for (int e : l) {
            if (e >= t) { return false; }
        }
        return true;
    }

}


