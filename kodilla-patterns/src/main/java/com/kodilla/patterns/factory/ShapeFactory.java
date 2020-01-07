package com.kodilla.patterns.factory;

public final class ShapeFactory {
    public static final String CIRCLE = "CIRCLE";
    public static final String SQUARE = "SQUARE";
    public static final String REACTANGLE = "RECTANGLE";

    public final Shape makeShape(final String shapeClass) {
        switch (shapeClass) {
            case CIRCLE:
                return new Circle("The rounded circle", 4.50);
            case SQUARE:
                return new Squere("The angular square", 7.0);
            case REACTANGLE:
                return new Rectangle("The long Rectangle", 15.0, 2.50);
            default:
                return null;
        }
    }
}
