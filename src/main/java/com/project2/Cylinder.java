/**
* Cylinder Class
* 18May2024
* Ryan Burkhardt
* This class represents a 3D cylinder shape that can be drawn on a canvas.
* It provides methods for drawing the cylinder, including the top and bottom elipses,
* as well as the lines connecting them.
*/

package com.project2;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.shape.ArcType;
 
// Cylinder.java
public class Cylinder extends Shape {
    // constructor to initialize the cylinder's position, radius, and height
    public Cylinder(double x, double y, double radius, double height) {
        super(x, y, radius, height); // call the Shape constructor with the specified width and height
    }
 
    // implementation of the draw method for a 3D cylinder where the getWidth() method is equal to the radius and getHeight() is equal to the height
    @Override
    public void draw(GraphicsContext gc) {
    // draw the bottom elipse by dividing the radius by 2 for the height of the arc and the radius for the width
    gc.setLineWidth(2);//Set our line width to 2
    gc.setFill(javafx.scene.paint.Color.BLACK);//set stroke to black
    gc.setLineDashes(10); // set the dash length to 10 units
    gc.strokeArc(getX() - getWidth(), getY() - getWidth()/2, getWidth(), getWidth()/2, 0.0, 180.0, ArcType.OPEN);//draw our top dashed arc
    gc.setLineDashes(0.0);//remove the dashes
    gc.strokeArc(getX() - getWidth(), getY() - getWidth()/2, getWidth(), getWidth()/2, 180.0, 180.0, ArcType.OPEN);//draw the bottom of the arc

    // draw lines from the middle of the lower circle's edge to the edge of the upper circle
    gc.strokeLine(getX() - getWidth(), getY() - getWidth()/4, getX() - getWidth(), getY() - getHeight());
    gc.strokeLine(getX(), getY()-getWidth()/4, getX(), getY() - getHeight());

    //draw the top elipse using the same method as the bottom but with no dashed lines
    gc.strokeArc(getX() - getWidth(), getY()-getHeight()-getWidth()/4, getWidth(), getWidth()/2, 360.0, 360.0, ArcType.OPEN);
    }
}