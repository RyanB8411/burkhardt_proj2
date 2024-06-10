/**
 * Circle Class
 * 18May2024
 * Ryan Burkhardt
 * This class represents a 2D circle shape that can be drawn on a canvas.
 * It uses the shapes position on the canvas as well as the radius.
 */

package com.project2;

import javafx.scene.canvas.GraphicsContext;
//Extend our shape class to add the circle
public class Circle extends Shape {
    // constructor to initialize the circle's position and radius
    public Circle(double x, double y, double radius) {
        super(x, y, radius, radius); // call the Shape constructor with the diameter
    }

    // implementation of the draw method for a circle
    @Override
    public void draw(GraphicsContext gc) {
        gc.fillOval(getX() - getWidth() / 2, getY() - getHeight() / 2, getWidth(), getHeight()); // draw a filled oval (circle) at the specified position and size
    }
}