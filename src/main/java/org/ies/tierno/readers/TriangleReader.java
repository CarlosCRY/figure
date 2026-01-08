package org.ies.tierno.readers;

import org.ies.tierno.models.Triangle;

import java.util.Scanner;

public class TriangleReader {
    private final Scanner scanner;

    public TriangleReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Triangle read () {
        System.out.println("\nColor \n");
        String color = scanner.nextLine();

        System.out.println("\nTamaño de la base: \n");
        int base = scanner.nextInt();
        scanner.nextLine();

        System.out.println("\nAltura: \n");
        int height = scanner.nextInt();
        scanner.nextLine();

        return new Triangle (color, base, height);
    }


}
