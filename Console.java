package com.tictactoe;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Console {
    private final ArrayList<Integer> inputOccurred = new ArrayList<>();

    public int getMachine() {
        Random random = new Random();
        int machine;
        do machine = random.nextInt(9) + 1 ; while (inputOccurred.contains(machine));
        inputOccurred.add(machine);
        return machine;
    }

    public int getUser() {
        int user;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            user = scanner.nextInt();
            if (!(user > 0 && user < 10) || (inputOccurred.contains(user))) {
                System.out.println("Please Input Correct Position");
                continue;
            }
            else break;
        }
        inputOccurred.add(user);
        return user;

    }
}
