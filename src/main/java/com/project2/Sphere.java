/**Sphere Class
* 18May2024
* Ryan Burkhardt
* This class will be used to make a 3D sphere shape that passes in a simple int of number of dimensions
*/

package com.project2;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
 
// Sphere.java
public class Sphere extends Shape {
    // constructor to initialize the sphere's position and radius
    public Sphere(double x, double y, double radius) {
        super(x, y, radius * 2, radius * 2); // call the Shape constructor with the specified width and height
        this.radius = radius;
    }
 
    private double radius;
 
    // implementation of the draw method for a 3D sphere
    @Override
    public void draw(GraphicsContext gc) {
        // Draw the sphere
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(2);
        gc.setLineDashes(0);
        gc.strokeOval(getX() - radius, getY() - radius, radius * 2, radius * 2);
     
        // Draw horizontal arc for 3D effect
        gc.strokeArc(getX() - radius, getY()-radius/2, radius * 2, radius, 180, 180,ArcType.OPEN);

     
        // Draw vertical arc for 3D effect
        gc.strokeArc(getX()-radius/2, getY() - radius, radius, radius*2, 90, 180,ArcType.OPEN);

        // Draw horizontal arc for 3D effect
        gc.setLineDashes(10);
        gc.strokeArc(getX() - radius, getY()-radius/2, radius * 2, radius, 0, 180,ArcType.OPEN);

        // Draw vertical arc for 3D effect
        gc.strokeArc(getX()-radius/2, getY() - radius, radius, radius*2, 270, 180,ArcType.OPEN);
        gc.setLineDashes(0);//needed to add this because it was throwing off the apps and making everything dashed
    }
}