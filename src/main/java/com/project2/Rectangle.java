/**Rectangle Class
* 18May2024
* Ryan Burkhardt
* This class represents a 2D rectangle shape that can be drawn on a canvas.
* It provides methods for drawing the rectangle, including the top and bottom edges,
* as well as the left and right sides.
*/

package com.project2;

import javafx.scene.canvas.GraphicsContext;
 
//Extend our shape class and use the super method to bring in the dimensions
public class Rectangle extends Shape {
    // constructor to initialize the rectangle's position and size
    public Rectangle(double x, double y, double width, double height) {
        super(x, y, width, height); // call the Shape constructor with the specified width and height
    }
 
    // implementation of the draw method for a rectangle using shapes getter methods
    @Override
    public void draw(GraphicsContext gc) {
        // draw a filled rectangle using the fillrect from graphics context
        gc.fillRect(getX()-getWidth()/2, getY()-getHeight()/2, getWidth(), getHeight()/2);
    }
}