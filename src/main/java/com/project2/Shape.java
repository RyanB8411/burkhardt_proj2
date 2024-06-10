/**Shape Class
 * 18May2024
 * Ryan Burkhardt
 * This class will be used to make a shape that passes in a simple int of number of dimensions
 */

package com.project2;

import javafx.scene.canvas.GraphicsContext;

public abstract class Shape {
    private double x;
    private double y;
    private double width;
    private double height;

    public Shape(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

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