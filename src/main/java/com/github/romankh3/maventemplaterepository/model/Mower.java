package com.github.romankh3.maventemplaterepository.model;

/**
 * Represents a mower on the lawn.
 * The mower has coordinates (x, y) and a direction (N, E, W, S).
 */
public class Mower {
    private int x;
    private int y;
    private char direction; // N, E, W, S

    public Mower(int x, int y, char direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public char getDirection() {
        return direction;
    }

    /**
     * Moves the mower one step forward in the direction it is currently facing.
     */
    public void moveForward() {
        switch (direction) {
            case 'N':
                y++;
                break;
            case 'E':
                x++;
                break;
            case 'S':
                y--;
                break;
            case 'W':
                x--;
                break;
        }
    }

    /**
     * Rotates the mower 90 degrees to the left.
     */
    public void turnLeft() {
        switch (direction) {
            case 'N':
                direction = 'W';
                break;
            case 'E':
                direction = 'N';
                break;
            case 'S':
                direction = 'E';
                break;
            case 'W':
                direction = 'S';
                break;
        }
    }

    /**
     * Rotates the mower 90 degrees to the right.
     */
    public void turnRight() {
        switch (direction) {
            case 'N':
                direction = 'E';
                break;
            case 'E':
                direction = 'S';
                break;
            case 'S':
                direction = 'W';
                break;
            case 'W':
                direction = 'N';
                break;
        }
    }
}
