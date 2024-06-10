/**Shape Class
 * 18May2024
 * Ryan Burkhardt
 * This class will be used to make a shape that passes in a simple 4 variable shape
 * It will be used in all of my shapes whether 2-d or 3-d
 */

package com.project2;

import javafx.scene.canvas.GraphicsContext;

//Create an abstract class so it can be used for 3-d and 2-d shapes
//The x and y will be the dimensions as well as the location on the canvas
public abstract class Shape {
    private double x;
    private double y;
    private double width;
    private double height;

    //Construct our shape with the setters
    public Shape(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    //Provide all getters to use in our shape code.
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public abstract void draw(GraphicsContext gc);
}