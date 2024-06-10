/**Cone Class
* 18May2024
* Ryan Burkhardt
* This class represents a 3D cone shape that can be drawn on a canvas.
* It takes in the getWidth() and getHeight() from the shape class as well as the location on canvas 
*/

package com.project2;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.shape.ArcType;
 
 // Cone.java
public class Cone extends Shape {
     // constructor to initialize the cone's position, getWidth(), and getHeight()
    public Cone(double x, double y, double radius, double height) {
        super(x, y, radius, height); // call the Shape constructor with the specified width and getHeight()
    }

    // implementation of the draw method for a 3D cone
    @Override
    public void draw(GraphicsContext gc) {
    // draw the bottom half circle
    gc.setFill(javafx.scene.paint.Color.BLACK);
    gc.setLineDashes(10); // set the dash length to 10 units
    gc.strokeArc(getX() - getWidth(), getY() - getWidth()/2, getWidth(), getWidth()/2, 0.0, 180.0, ArcType.OPEN);
    gc.setLineDashes(0.0);
    gc.strokeArc(getX() - getWidth(), getY() - getWidth()/2, getWidth(), getWidth()/2, 180.0, 180.0, ArcType.OPEN);
    gc.setStroke(javafx.scene.paint.Color.BLACK);
    gc.setLineWidth(2);

    // draw lines from the middle of the lower circle's edge to the centerpoint of the upper circle
    gc.strokeLine(getX(), getY()-getWidth()/4, getX()-getWidth()/2, getY() - getHeight());
    gc.strokeLine(getX() - getWidth(), getY()-getWidth()/4, getX()-getWidth()/2, getY() - getHeight());
    }
}