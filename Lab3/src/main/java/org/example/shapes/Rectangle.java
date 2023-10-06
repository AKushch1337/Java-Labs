package org.example.shapes;

public class Rectangle extends Shape{

    private final float length;
    private final float width;
    public Rectangle(String shapeColor, float length, float width) {
        super(shapeColor);
        this.length = length;
        this.width = width;
    }

    @Override
    public float calcArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println("Draw the rectangle NOW!");
    }

    @Override
    public String toString() {
        return "Rectangle info. Color = " + shapeColor + " , width = " + width + " , length = " + length + " area: " + calcArea();
    }
}
