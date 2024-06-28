package com.github.romankh3.maventemplaterepository.service;


import com.github.romankh3.maventemplaterepository.model.Lawn;
import com.github.romankh3.maventemplaterepository.model.Mower;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit tests for the LawnMowerService class.
 */
public class LawnMowerServiceTest {

    private LawnMowerService lawnMowerService;

    @BeforeEach
    public void setUp() {
        lawnMowerService = new LawnMowerService();
    }

    /**
     * Tests the execution of instructions for moving and rotating mowers.
     */
    @Test
    public void testExecuteInstructions() {
        Lawn lawn = new Lawn(5, 5);
        Mower mower1 = new Mower(1, 2, 'N');
        Mower mower2 = new Mower(3, 3, 'E');

        lawnMowerService.executeInstructions(lawn, mower1, "GAGAGAGAA");
        assertEquals(1, mower1.getX());
        assertEquals(3, mower1.getY());
        assertEquals('N', mower1.getDirection());

        lawnMowerService.executeInstructions(lawn, mower2, "AADAADADDA");
        assertEquals(5, mower2.getX());
        assertEquals(1, mower2.getY());
        assertEquals('E', mower2.getDirection());
    }
}
