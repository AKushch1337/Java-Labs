package org.example;

import org.example.controllers.ShapeController;
import org.example.models.ShapeModel;
import org.example.views.ShapeView;

import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ShapeModel model = new ShapeModel();
        ShapeView view = new ShapeView();
        ShapeController controller = new ShapeController(model, view);
        controller.printAllInfo();
    }

}