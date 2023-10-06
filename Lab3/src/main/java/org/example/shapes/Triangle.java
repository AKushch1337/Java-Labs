package org.example.shapes;

public class Triangle extends Shape {
    public final float a;
    public final float b;
    public final float c;

    public Triangle(String shapeColor, float a, float b, float c) {
        super(shapeColor);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void draw() {
        System.out.println("Draw the triangle NOW!");
    }

    @Override
    public float calcArea() {
        float halfPerimeter = (a + b + c) / 2;
        return (float) Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
    }

    @Override
    public String toString() {
        return "Triangle info. Color = " + shapeColor + " , a = " + a + " , b = " + b + " , c = " + c + " area: " + calcArea();
    }
}
