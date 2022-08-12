package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class WordSelectorTest {

    private WordSelector target;

    @BeforeEach
    void setUp() {
        target = new WordSelector();
    }

    @Test
    void selectWord_normal_returnsAWord() {
        String result = target.selectWord();
        assertTrue(result.length() > 0);
    }

    @Test
    void selectWords_repeatedCalls_doesNotReturnSameWordTwice() {
        String result1 = target.selectWord();
        String result2 = target.selectWord();
        assertNotEquals(result1, result2);
    }
}
