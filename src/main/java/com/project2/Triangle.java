/**Triangle Class
* 18May2024
* Ryan Burkhardt
* This class will be used to make a triangle by extending the shape class
* it takes in the graphic context object gc to draw a filled in polygon shape as the triangle.
*/

package com.project2;

import javafx.scene.canvas.GraphicsContext;

// Extend our Shape class to add the Triangle using the super methods
public class Triangle extends Shape {
    // constructor to initialize the triangle's position and size
    public Triangle(double x, double y, double size) {
        super(x, y, size, size); // call the Shape constructor with the same width and height
    }

    // implementation of the draw method for a triangle
    @Override
    public void draw(GraphicsContext gc) {
        // draw a filled triangle using the polygon methods
        gc.fillPolygon(new double[]{getX()-getWidth()/2, (getX() + getWidth())-getWidth()/2, (getX() + getWidth() / 2)-getWidth()/2}, new double[]{getY(), getY(), getY() - getHeight()}, 3);
    }
}