package org.example.shapes;

abstract public class Shape implements Drawable {
    public String shapeColor;

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public abstract float calcArea();

    @Override
    public void draw() {

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
