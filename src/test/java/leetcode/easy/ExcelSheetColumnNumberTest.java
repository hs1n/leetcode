package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExcelSheetColumnNumberTest {
    ExcelSheetColumnNumber testClass = new ExcelSheetColumnNumber();

    @Test
    void example01() {
        assertEquals(1, testClass.titleToNumber("A"));
    }

    @Test
    void example02() {
        assertEquals(28, testClass.titleToNumber("AB"));
    }

    @Test
    void example03() {
        assertEquals(701, testClass.titleToNumber("ZY"));
    }
}