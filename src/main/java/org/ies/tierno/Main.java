package org.ies.tierno;

import org.ies.tierno.models.Draw;

import org.ies.tierno.readers.SquareReader;
import org.ies.tierno.readers.CircleReader;
import org.ies.tierno.readers.TriangleReader;
import org.ies.tierno.readers.FigureReader;
import org.ies.tierno.readers.DrawReader;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SquareReader squareReader = new SquareReader (scanner);
        CircleReader circleReader = new CircleReader (scanner);
        TriangleReader triangleReader = new TriangleReader (scanner);
        FigureReader figureReader = new FigureReader (scanner, squareReader, circleReader, triangleReader);
        DrawReader drawReader = new DrawReader (scanner, figureReader);

        Draw draw = drawReader.read();

        draw.showInfo();

    }
}