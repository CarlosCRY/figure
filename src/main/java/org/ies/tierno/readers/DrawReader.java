package org.ies.tierno.readers;

import lombok.AllArgsConstructor;
import org.ies.tierno.models.Draw;
import org.ies.tierno.models.Figure;

import java.util.Scanner;

@AllArgsConstructor
public class DrawReader {
    private final Scanner scanner;
    private final FigureReader figureReader;

    public Draw read () {
        System.out.println("\nCoordenada x:\n");
        double x = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("\nCoordenada y:\n");
        double y = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("\nDibuje la forma:\n");
        Figure figure = figureReader.read();

        return new Draw (x, y, figure);
    }
}
