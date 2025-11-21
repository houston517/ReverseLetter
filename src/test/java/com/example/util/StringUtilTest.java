package com.example.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class StringUtilTest {
    @Test
    void reverseLetters_nullCheck() {
        assertEquals("", StringUtil.reverseLetters(null));
    }
    @Test
    void reverseLetters_emptyString(){
        assertEquals("", StringUtil.reverseLetters(""));
    }

    @Test
    void reverseLetters_normalString(){
        assertEquals("t@eb eht av$J!123", StringUtil.reverseLetters("J@va the be$t!123"));
        assertEquals("fed, cba!", StringUtil.reverseLetters("abc, def!"));
        assertEquals("dlroW, olleH!", StringUtil.reverseLetters("Hello, World!"));
        assertEquals("123-cba-456", StringUtil.reverseLetters("123-abc-456"));
        assertEquals("C1B2A3", StringUtil.reverseLetters("A1B2C3"));
        assertEquals("tseT, 123!", StringUtil.reverseLetters("Test, 123!"));
        assertEquals("eg nahcoN?", StringUtil.reverseLetters("No change?"));
        assertEquals("ey! BiH.", StringUtil.reverseLetters("Hi! Bye."));
    }

    @Test
    void reverseLetters_noLetters(){
        assertEquals("1234!@#", StringUtil.reverseLetters("1234!@#"));
    }

    @Test
    void reverseLetters_onlyLetters(){
        assertEquals("fedcba", StringUtil.reverseLetters("abcdef"));
    }
    @Test
    void reverseLetters_singleLetter(){
        assertEquals("a", StringUtil.reverseLetters("a"));
    }
    @Test
    void reverseLetters_russianLetters(){
        assertEquals("римтев, ирП!", StringUtil.reverseLetters("Привет, мир!"));
    }
}
