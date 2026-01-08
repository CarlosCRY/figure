package org.ies.tierno.readers;

import org.ies.tierno.models.Circle;

import java.util.Scanner;

public class CircleReader {
    private final Scanner scanner;

    public CircleReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Circle read () {
        System.out.println("\nColor \n");
        String color = scanner.nextLine();

        System.out.println("\nTamaño del radio: \n");
        int radio = scanner.nextInt();
        scanner.nextLine();

        return new Circle(color, radio);
    }


}
