package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromeCheckerTest {

    @Test
    public void testIsPalindrome() {
        PalindromeChecker palindromeChecker = new PalindromeChecker();

        // Test basic palindromes
        assertTrue(palindromeChecker.isPalindrome("pilot"), "'pilot' should be a palindrome");
        assertTrue(palindromeChecker.isPalindrome("aeroplane"), "'aeroplane' should be a palindrome");

        // Test case-insensitivity and spaces
        assertTrue(palindromeChecker.isPalindrome("A choir master directing his choristers"), "'A choir master directing his choristers' should be a palindrome");
        assertTrue(palindromeChecker.isPalindrome("No members, No choir"), "'No members, No choir' should be a palindrome");

        // Test non-palindromic strings
        assertFalse(palindromeChecker.isPalindrome("hello"), "'hello' should not be a palindrome");
        assertFalse(palindromeChecker.isPalindrome("Java"), "'Java' should not be a palindrome");

        // Test empty and null strings
        assertTrue(palindromeChecker.isPalindrome(""), "Empty string should be considered a palindrome");
        assertFalse(palindromeChecker.isPalindrome(null), "null should not be considered a palindrome");
    }
}
