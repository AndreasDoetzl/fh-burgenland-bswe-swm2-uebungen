package io.muehlbachler.bswe;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringServiceTest {
    private StringService stringService = new StringService();

    @Test
    public void testToUpperCase() {
        assertEquals("ABC", stringService.toUpperCase("abc"), "abc toUpperCase should be ABC");
    }

    @Test
    public void testToUpperCase_Null() {
        assertEquals(null, stringService.toUpperCase(null), "null should be null");
    }

    @Test
    public void testToUpperCase_EmptyString() {
        assertEquals("", stringService.toUpperCase(""), "EmptyString should be emptyString");
    }

    @Test
    public void testToUpperCase_Number() {
        assertEquals("12345", stringService.toUpperCase("12345"));
    }

    @Test
    public void testToUpperCase_Symbols() {
        assertEquals("#*$%&?=)(&/", stringService.toUpperCase("#*$%&?=)(&/"));
    }



}
