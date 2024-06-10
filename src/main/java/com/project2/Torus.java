/**Sphere Class
* 18May2024
* Ryan Burkhardt
* This class will be used to make a 3D sphere shape that passes in a simple int of number of dimensions
*/

package com.project2;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.shape.ArcType;
 
// Sphere.java
public class Torus extends Shape {
    // constructor to initialize the sphere's position and radius
    public Torus(double x, double y, double minorRadius) {
        super(x, y, minorRadius, minorRadius); // call the Shape constructor with the specified width and height
    } 

    // implementation of the draw method for a 3D sphere
    @Override
    public void draw(GraphicsContext gc) {
    // draw the bottom elipse by dividing the radius by 2 for the height of the arc and the radius for the width
    gc.setLineWidth(2);//Set our line width to 2
    gc.setFill(javafx.scene.paint.Color.BLACK);//set stroke to black
    gc.strokeArc(getX() - getWidth()/2, getY()-getWidth()/5, getWidth(), getWidth()/4, 0.0, 180.0, ArcType.OPEN);//draw our top dashed arc
    gc.strokeArc(getX() - getWidth()/2, getY()-getWidth()/5, getWidth(), getWidth()/4, 180.0, 180.0, ArcType.OPEN);//draw the bottom of the arc

    gc.strokeArc(getX() - getWidth(), getY() - getWidth()/2, getWidth()*2, getWidth(), 0.0, 180.0, ArcType.OPEN);//draw our top dashed arc
    gc.strokeArc(getX() - getWidth(), getY() - getWidth()/2, getWidth()*2, getWidth(), 180.0, 180.0, ArcType.OPEN);//draw the bottom of the arc

    gc.strokeArc(getX() - getWidth()/1.34, getY()-getWidth()/8, getWidth()/4, getWidth()/8, 0.0, 90.0, ArcType.OPEN);//draw our top dashed arc
    gc.strokeArc(getX() + getWidth()/1.34 - getWidth()/4, getY()-getWidth()/8, getWidth()/4, getWidth()/8, 180, -90.0, ArcType.OPEN);//draw our mirrored top dashed arc
    }
}