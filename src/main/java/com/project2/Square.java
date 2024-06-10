/**Square Class
 * 18May2024
 * Ryan Burkhardt
 * This class will be used to make a shape that passes in a simple int of number of dimensions
 */

package com.project2;

import javafx.scene.canvas.GraphicsContext;

// Square.java
public class Square extends Shape {
    // constructor to initialize the square's position and size
    public Square(double x, double y, double size) {
        super(x, y, size, size); // call the Shape constructor with the same width and height
    }

    // implementation of the draw method for a square
    @Override
    public void draw(GraphicsContext gc) {
        gc.fillRect(getX()-getWidth()/2, getY()-getHeight(), getHeight(), getWidth()); // draw a filled rectangle ( square ) at the specified position and size
    }
}