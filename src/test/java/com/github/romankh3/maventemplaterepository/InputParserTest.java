package com.github.romankh3.maventemplaterepository;

import com.github.romankh3.maventemplaterepository.util.InputParser;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InputParserTest {

    @Test
    public void testParseInputFile() {
        String filePath = "src/test/resources/test-input.txt";
        List<String> lines = InputParser.parseInputFile(filePath);

        assertEquals(5, lines.size());
        assertEquals("5 5", lines.get(0));
        assertEquals("1 2 N", lines.get(1));
        assertEquals("GAGAGAGAA", lines.get(2));
        assertEquals("3 3 E", lines.get(3));
        assertEquals("AADAADADDA", lines.get(4));
    }
}