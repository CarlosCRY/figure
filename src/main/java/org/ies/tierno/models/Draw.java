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
        System.out.print("Posición: X: " + x + ", Y: " + y);

        figure.showInfo();
    }

}
