package org.example.shapes;

public class Circle extends Shape {
    private final float radius;

    public Circle(String shapeColor, float radius) {
        super(shapeColor);
        this.radius = radius;
    }

    @Override
    public float calcArea() {
        return (float) (Math.PI * radius * radius);
    }

    @Override
    public void draw() {
        System.out.println("Draw the circle NOW!");
    }

    @Override
    public String toString() {
        return "Circle info. Color = " + shapeColor + " , radius = " + radius +  " area: " + calcArea();
    }
}
