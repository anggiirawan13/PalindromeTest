package com.palindrome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class withCompare {

    boolean palindromeCompare(String word) {
        for (int i = 0; i < word.length(); i ++) {
            if (word.charAt(i) != (word.charAt(word.length() - i - 1))) {
                return false;
            }
        }

        return true;
    }

    @Test
    void palindromeCompareTest() {
        Assertions.assertTrue(palindromeCompare("katak"));
        Assertions.assertTrue(palindromeCompare("kasur rusak"));
        Assertions.assertTrue(palindromeCompare("kodok"));
        Assertions.assertTrue(palindromeCompare("apa"));
        Assertions.assertTrue(palindromeCompare("ini"));
    }

    boolean palindromeCompareV2(String word) {
        for (int i = 0; i < word.length() / 2; i ++) {
            if (word.charAt(i) != (word.charAt(word.length() - i - 1))) {
                return false;
            }
        }

        return true;
    }

    @Test
    void palindromeCompareV2Test() {
        Assertions.assertTrue(palindromeCompareV2("katak"));
        Assertions.assertTrue(palindromeCompareV2("kasur rusak"));
        Assertions.assertTrue(palindromeCompareV2("kodok"));
        Assertions.assertTrue(palindromeCompareV2("apa"));
        Assertions.assertTrue(palindromeCompareV2("ini"));
    }

}
