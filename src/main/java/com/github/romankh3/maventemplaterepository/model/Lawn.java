package com.github.romankh3.maventemplaterepository.model;

/**
 * Represents the lawn where the mowers operate.
 * It has a width and height which define the boundaries.
 */
public class Lawn {
    private final int width;
    private final int height;

    public Lawn(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    /**
     * Checks if the given coordinates are within the boundaries of the lawn.
     *
     * @param x The x-coordinate.
     * @param y The y-coordinate.
     * @return True if within bounds, otherwise false.
     */
    public boolean isWithinBounds(int x, int y) {
        return x >= 0 && x <= width && y >= 0 && y <= height;
    }
}
