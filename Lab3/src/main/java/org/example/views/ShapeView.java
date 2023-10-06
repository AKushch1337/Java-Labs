package org.example.views;

import org.example.shapes.Shape;

public class ShapeView {

    public void printDatasetWithMessage(String message, Shape[] shapeDataset) {
        System.out.println(message);
        for (Shape s : shapeDataset) {
            System.out.println(s.toString());
        }
    }

    public void printNumberWithMessage(String message, float number) {
        System.out.println(message + number);
    }

    public void printMessage(String message) {
        System.out.println(message);
    }
}
