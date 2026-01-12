package org.ies.tierno.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Draw {
    private double x;
    private double y;
    private Figure figure;

    public final void showInfo() {
        System.out.print("Posición: X: " + x + ", Y: " + y + ", Figura: ");

        if (figure.getClass().toString().contains("Square")) {
            System.out.print("Cuadrado, ");

        } else if (figure.getClass().toString().contains("Circle")) {
            System.out.print("Círculo, ");

        } else {
            System.out.print("Triángulo, ");
        }

        figure.showInfo();
    }

}
