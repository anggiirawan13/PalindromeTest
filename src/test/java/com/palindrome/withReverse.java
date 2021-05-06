package com.palindrome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class withReverse {

    boolean palindromeReverse(String word) {
        StringBuilder tempWord = new StringBuilder();

        for (int i = word.length() - 1; i >= 0; i--) {
            tempWord.append(word.charAt(i));
        }

        return word.equals(tempWord.toString());
    }

    @Test
    void palindromeReverseTest() {
        Assertions.assertTrue(palindromeReverse("katak"));
        Assertions.assertTrue(palindromeReverse("kasur rusak"));
        Assertions.assertTrue(palindromeReverse("kodok"));
        Assertions.assertTrue(palindromeReverse("apa"));
        Assertions.assertTrue(palindromeReverse("ini"));
    }

}
