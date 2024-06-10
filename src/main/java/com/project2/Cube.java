/**
* Cube Class
* 18May2024
* Ryan Burkhardt
* This class represents a 3D cube shape that can be drawn on a canvas.
* It provides methods for drawing the cube, including the front face and the lines connecting it.
*/

package com.project2;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Cube extends Shape {
    // constructor to initialize the cube's position and size
    public Cube(double x, double y, double size) {
        super(x, y, size, size); // call the Shape constructor with the size
    }

    // implementation of the draw method for a cube
    @Override
    public void draw(GraphicsContext gc) {
        // draw the front face of the cube
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(2);
        gc.strokeRect(getX(), getY(), getWidth(), getHeight());

        // draw the lines to make the cube three dimensional
        gc.strokeLine(getX(), getY(), getX()+getWidth()/2, getY()-getHeight()/2);
        gc.strokeLine(getX()+getWidth(), getY() + getHeight(), getX() + getWidth()*1.5, getY()+getHeight()/2);
        gc.strokeLine(getX()+getWidth(), getY(), getX()+getWidth()*1.5, getY()-getHeight()/2);
        gc.strokeLine(getX()+getWidth()/2, getY()-getHeight()/2, getX()+getWidth()*1.5, getY()-getHeight()/2);
        gc.strokeLine(getX()+getWidth()*1.5, getY()-getHeight()/2, getX()+getWidth()*1.5, getY()+getHeight()/2);
    }
}