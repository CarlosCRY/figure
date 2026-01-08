package org.ies.tierno.readers;

import org.ies.tierno.models.Square;

import java.util.Scanner;

public class SquareReader {
    private final Scanner scanner;

    public SquareReader (Scanner scanner) {
        this.scanner = scanner;
    }

    public Square read () {
        System.out.println("\nColor \n");
        String color = scanner.nextLine();

        System.out.println("\nTamaño del lado: \n");
        int side = scanner.nextInt();
        scanner.nextLine();

        return new Square (color, side);
    }


}
