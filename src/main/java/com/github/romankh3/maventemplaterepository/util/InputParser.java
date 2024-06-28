package com.github.romankh3.maventemplaterepository.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class InputParser {
    public static List<String> parseInputFile(String filePath) {
        try {
            return Files.readAllLines(Paths.get(filePath));
        } catch (IOException e) {
            e.printStackTrace();
            throw new IllegalArgumentException("Error reading input file");
        }
    }
}