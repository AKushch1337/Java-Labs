package org.example.models;

import org.example.shapes.Circle;
import org.example.shapes.Rectangle;
import org.example.shapes.Shape;
import org.example.shapes.Triangle;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class ShapeModel {

    private final Shape[] shapeDataset;
    private final String[] colors = {"Red", "Blue", "Yellow", "White", "Green"};

    public ShapeModel() {
        shapeDataset = new Shape[10];
        generateDataset(10);
    }

    public void generateDataset(Integer size) {
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            String color = colors[random.nextInt(colors.length)];
            int shapeType = random.nextInt(3);
            switch (shapeType) {
                case 0 -> shapeDataset[i] = new Rectangle(color, random.nextFloat() * 30F, random.nextFloat() * 30F);
                case 1 -> {
                    float a, b, c;
                    do {
                        a = random.nextFloat() * 30F;
                        b = random.nextFloat() * 30F;
                        c = random.nextFloat() * 30F;
                    } while (!isValidTriangle(a, b, c));
                    shapeDataset[i] = new Triangle(color, a, b, c);
                }
                case 2 -> shapeDataset[i] = new Circle(color, random.nextFloat() * 30F);
            }
        }
    }

    private static boolean isValidTriangle(float a, float b, float c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    public Shape[] showDatasetInfo() {
        return shapeDataset;
    }


    public float calculateAllAreas() {
        float area = 0F;
        for (Shape shape : shapeDataset) {
            area += shape.calcArea();
        }
        return area;

    }

    public float calculateCircleAreas() {
        float area = 0F;
        for (Shape shape : shapeDataset) {
            if (shape instanceof Circle) {
                area += shape.calcArea();
            }

        }
        return area;
    }

    public float calculateRectangleAreas() {
        float area = 0F;
        for (Shape shape : shapeDataset) {
            if (shape instanceof Rectangle) {
                area += shape.calcArea();
            }

        }
        return area;
    }

    public float calculateTriangleAreas() {
        float area = 0F;
        for (Shape shape : shapeDataset) {
            if (shape instanceof Triangle) {
                area += shape.calcArea();
            }

        }
        return area;
    }

    public Shape[] sortByAreas() {
        Arrays.sort(shapeDataset, 0, 10, Comparator.comparingDouble(Shape::calcArea));
        return shapeDataset;
    }

    public Shape[] sortByColor() {
        Arrays.sort(shapeDataset, 0, 10, Comparator.comparing(shape -> shape.shapeColor.toLowerCase()));
        return shapeDataset;
    }
}

