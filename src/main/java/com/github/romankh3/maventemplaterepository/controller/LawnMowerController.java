package com.github.romankh3.maventemplaterepository.controller;

import com.github.romankh3.maventemplaterepository.model.Lawn;
import com.github.romankh3.maventemplaterepository.model.Mower;
import com.github.romankh3.maventemplaterepository.service.LawnMowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * REST controller to handle requests for simulating mower operations on a lawn.
 */
@RestController
public class LawnMowerController {

    @Autowired
    private LawnMowerService lawnMowerService;

    /**
     * Endpoint to simulate mower movements based on input instructions.
     *
     * @param input The input string containing the lawn dimensions and mower instructions.
     * @return A list of final positions and orientations of the mowers.
     */
    @PostMapping("/simulate")
    public List<String> simulate(@RequestBody String input) {
        Scanner scanner = new Scanner(input);
        int lawnWidth = scanner.nextInt();
        int lawnHeight = scanner.nextInt();
        Lawn lawn = new Lawn(lawnWidth, lawnHeight);

        List<String> results = new ArrayList<>();
        while (scanner.hasNext()) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            char direction = scanner.next().charAt(0);
            Mower mower = new Mower(x, y, direction);

            String instructions = scanner.next();
            lawnMowerService.executeInstructions(lawn, mower, instructions);

            results.add(mower.getX() + " " + mower.getY() + " " + mower.getDirection());
        }
        scanner.close();
        return results;
    }
}
