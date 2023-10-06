package org.example.controllers;

import org.example.models.ShapeModel;
import org.example.shapes.Shape;
import org.example.views.ShapeView;

public class ShapeController {
    private final ShapeModel model;
    private final ShapeView view;

    public ShapeController(ShapeModel model, ShapeView view) {
        this.model = model;
        this.view = view;
    }

    public void printAllInfo() {
        view.printMessage("Willkommen!");
        view.printDatasetWithMessage("\nInfo about all shapes = ", model.showDatasetInfo());
        view.printNumberWithMessage("\nSum of all areas = ", model.calculateAllAreas());
        view.printNumberWithMessage("\nSum of all circle areas = ", model.calculateCircleAreas());
        view.printNumberWithMessage("\nSum of all rectangle = ", model.calculateRectangleAreas());
        view.printNumberWithMessage("\nSum of all triangle = ", model.calculateTriangleAreas());
        view.printDatasetWithMessage("\nDataset sorted by shape color(from a to z) = ", model.sortByColor());
        view.printDatasetWithMessage("\nDataset sorted by area(ascending) = ", model.sortByAreas());
    }
}
