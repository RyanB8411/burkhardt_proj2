/**
* App Class
* 18May2024
* Ryan Burkhardt
* This class is the main application class for a JavaFX-based shape drawing program.
* It creates a GUI with a combo box to select the shape type, a combo box to select the shape size,
* and a button to draw the shape. The shape is drawn on a canvas in the GUI.
*/

package com.project2;

//import all necessary javafx packages
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
 
public class Project2 extends Application {
    // GUI components
    private ComboBox<String> shapeComboBox; // combo box to select the shape type
    private ComboBox<Double> sizeComboBox; // combo box to select the size
    private Button drawButton; // button to draw the shape
    private Canvas canvas; // canvas to draw on
 
    @SuppressWarnings("exports")//Suppress our exports warnings for error handling. I had to do this because it would not run unless suppressed
    @Override
    public void start(Stage primaryStage) {
        // create the GUI components
        shapeComboBox = new ComboBox<>();
        shapeComboBox.getItems().addAll("Circle", "Square", "Triangle", "Rectangle", "Cone", "Cube", "Cylinder", "Sphere", "Torus"); // add shape types to the combo box
 
        sizeComboBox = new ComboBox<>();
        sizeComboBox.getItems().addAll(10.0, 20.0, 30.0, 40.0, 50.0, 60.0, 70.0, 80.0, 90.0, 100.0); // add size options to the combo box
 
        drawButton = new Button("Draw"); // create the draw button
        drawButton.setOnAction(e -> drawShape()); // set the button's action to draw the shape
 
        canvas = new Canvas(400, 400); // create the canvas
 
        // create the GUI layout
        VBox root = new VBox(10);
        root.setPadding(new Insets(10));
        root.getChildren().addAll(new Label("Select Shape:"), shapeComboBox, new Label("Select Size:"), sizeComboBox, drawButton, canvas);
 
        // create the scene and stage
        Scene scene = new Scene(root, 420, 500);
        primaryStage.setTitle("Burkhardt Project 2");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
 
    // method to draw the shape
    private void drawShape() {
        String shapeType = shapeComboBox.getValue(); // get the selected shape type
        double size = sizeComboBox.getValue(); // get the selected size
    
        Shape shape = null; // create a Shape object based off the users selection from the drop box using a switch case
        switch (shapeType) {
            case "Circle":
                shape = new Circle(canvas.getWidth() / 2, canvas.getHeight() / 2, size); // create a Circle object
                break;
            case "Square":
                shape = new Square(canvas.getWidth() / 2, canvas.getHeight() / 2, size); // create a Square object
                break;
            case "Triangle":
                shape = new Triangle(canvas.getWidth() / 2, canvas.getHeight() / 2, size); // create a Triangle object
                break;
            case "Rectangle":
                shape = new Rectangle(canvas.getWidth() / 2, canvas.getHeight() / 2, size, size); // create a Rectangle object
                break;
            case "Cone":
                shape = new Cone(canvas.getWidth() / 2, canvas.getHeight() / 2, size, size); // create a Cone object
                break;
            case "Cube":
                shape = new Cube(canvas.getWidth() / 2, canvas.getHeight() / 2, size); // create a Cube object
                break;
            case "Cylinder":
                shape = new Cylinder(canvas.getWidth() / 2, canvas.getHeight() / 2, size, size); // create a Cylinder object
                break;
            case "Sphere":
                shape = new Sphere(canvas.getWidth() / 2, canvas.getHeight() / 2, size); // create a Sphere object
                break;
            case "Torus":
                shape = new Torus(canvas.getWidth() / 2, canvas.getHeight() / 2, size); // create a Torus object
                break;
            default:
                break;
        }
    
        GraphicsContext gc = canvas.getGraphicsContext2D(); // get the GraphicsContext
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight()); // clear the canvas that way the previous objects are not shown
        shape.draw(gc); // draw the shape on the canvas
    }
 
    public static void main(String[] args) {
        launch(args); // launch the JavaFX application
    }
}