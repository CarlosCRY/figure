package org.ies.tierno.readers;

import lombok.AllArgsConstructor;
import org.ies.tierno.models.Figure;

import java.util.Scanner;

@AllArgsConstructor
public class FigureReader {
    private final Scanner scanner;
    private final SquareReader squareReader;
    private final CircleReader circleReader;
    private final TriangleReader triangleReader;

    public Figure read () {
        int option;
        while (true) {
            System.out.println("Tipos de figura:\n");
            System.out.println("1. Cuadrado.\n2. Círculo.\n3. Triángulo.");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    return squareReader.read();
                case 2:
                    return circleReader.read();
                case 3:
                    return triangleReader.read();
                default:
                    System.out.println("\nNo es una opción válida\n");
            }
        }
    }
}
