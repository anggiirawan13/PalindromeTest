package com.palindrome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class withRecursive {

    boolean palindromeRecursive(String word, int indexAwal) {
        if (indexAwal < word.length()) {
            if (word.charAt(indexAwal) != (word.charAt(word.length() - indexAwal - 1))) {
                return false;
            } else {
                return this.palindromeRecursive(word, indexAwal+1);
            }
        } else {
            return true;
        }
    }

    @Test
    void palindromeCompareTest() {
        Assertions.assertTrue(palindromeRecursive("katak", 0));
        Assertions.assertTrue(palindromeRecursive("kasur rusak", 0));
        Assertions.assertTrue(palindromeRecursive("kodok", 0));
        Assertions.assertTrue(palindromeRecursive("apa", 0));
        Assertions.assertTrue(palindromeRecursive("ini", 0));
    }

    boolean palindromeRecursiveV2(String word, int indexAwal) {
        if (indexAwal < word.length()) {
            if (word.charAt(indexAwal) != (word.charAt(word.length() - indexAwal - 1))) {
                return false;
            } else {
                return this.palindromeRecursiveV2(word, indexAwal+1);
            }
        } else {
            return true;
        }
    }

    @Test
    void palindromeCompareV2Test() {
        Assertions.assertTrue(palindromeRecursiveV2("katak", 0));
        Assertions.assertTrue(palindromeRecursiveV2("kasur rusak", 0));
        Assertions.assertTrue(palindromeRecursiveV2("kodok", 0));
        Assertions.assertTrue(palindromeRecursiveV2("apa", 0));
        Assertions.assertTrue(palindromeRecursiveV2("ini", 0));
    }

}
