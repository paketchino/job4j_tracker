package ru.job4j.Example;

import org.junit.Test;

import static org.junit.Assert.*;

public class CryptographyTest {

    @Test
    public void codeLengthLess4() {
        String code = Cryptography.code("123");
        assertEquals("123", code);
    }
}