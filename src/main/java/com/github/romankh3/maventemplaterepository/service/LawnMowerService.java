package com.github.romankh3.maventemplaterepository.service;


import com.github.romankh3.maventemplaterepository.model.Lawn;
import com.github.romankh3.maventemplaterepository.model.Mower;
import org.springframework.stereotype.Service;

/**
 * Service to handle the logic for moving mowers on the lawn.
 */
@Service
public class LawnMowerService {

    /**
     * Executes a sequence of instructions to control the mower on the lawn.
     *
     * @param lawn         The lawn where the mower operates.
     * @param mower        The mower to control.
     * @param instructions The sequence of instructions.
     */
    public void executeInstructions(Lawn lawn, Mower mower, String instructions) {
        for (char instruction : instructions.toCharArray()) {
            switch (instruction) {
                case 'A':
                    moveMower(lawn, mower);
                    break;
                case 'G':
                    mower.turnLeft();
                    break;
                case 'D':
                    mower.turnRight();
                    break;
            }
        }
    }

    /**
     * Moves the mower forward if the new position is within bounds.
     *
     * @param lawn  The lawn where the mower operates.
     * @param mower The mower to move.
     */
    private void moveMower(Lawn lawn, Mower mower) {
        int initialX = mower.getX();
        int initialY = mower.getY();
        mower.moveForward();

        // Check if the new position is within bounds
        if (!lawn.isWithinBounds(mower.getX(), mower.getY())) {
            // Revert to initial position if out of bounds
            mower = new Mower(initialX, initialY, mower.getDirection());
        }
    }
}
