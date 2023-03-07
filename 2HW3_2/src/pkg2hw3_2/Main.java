package pkg2hw3_2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.transform.Rotate;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;

/*
Tyler Sanders
COP2805 - Homework #3-2
2/8/2023
This program is a gui that lets the user select a smiley or sad face to display
 */
public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
                // Draw the face as a circle
        Circle c1 = new Circle(30, 30, 60);
        c1.setStroke(Color.BLACK);
        c1.setFill(Color.WHITE);
        
        // Draw the left eye as an ellipse
        Ellipse o1 = new Ellipse(15, 15, 5, 10);
        o1.setStroke(Color.BLACK);
        o1.setFill(Color.WHITE);
        
        // Draw the right eye as another ellipse
        Ellipse o2 = new Ellipse(50, 15, 5, 10);
        o2.setStroke(Color.BLACK);
        o2.setFill(Color.WHITE);
        
        // Draw a smiley mouth as an open arc
        Arc arc1 = new Arc(30, 30, 40, 30, 240, 65); // Create an arc
        arc1.setStroke(Color.BLACK);
        arc1.setFill(Color.WHITE); // Set fill color
        arc1.setType(ArcType.OPEN); // Set arc type
        
        // group all the smiley face features, including the text, the face, two eyes and the smiley mouth
        Group group = new Group();
        group.getChildren().addAll(c1, o1, o2, arc1);
        
        // Draw the face as a circle
        Circle c2 = new Circle(30, 30, 60);
        c2.setStroke(Color.BLACK);
        c2.setFill(Color.WHITE);
        
        // Draw the left eye as an ellipse
        Ellipse o3 = new Ellipse(15, 15, 5, 10);
        o3.setStroke(Color.BLACK);
        o3.setFill(Color.WHITE);
        
        // Draw the right eye as another ellipse
        Ellipse o4 = new Ellipse(50, 15, 5, 10);
        o4.setStroke(Color.BLACK);
        o4.setFill(Color.WHITE);
        
        // Draw a smiley mouth as an open arc
        Arc arc2 = new Arc(30, 30, 40, 30, 240, 65); // Create an arc
        arc2.getTransforms().add(new Rotate(180,30,55)); //rotates the arc 180 degrees
        arc2.setStroke(Color.BLACK);
        arc2.setFill(Color.WHITE); // Set fill color
        arc2.setType(ArcType.OPEN); // Set arc type
        
        // group all the smiley face features, including the text, the face, two eyes and the smiley mouth
        Group group2 = new Group();
        group2.getChildren().addAll(c2, o3, o4, arc2);
 
        BorderPane borderPane = new BorderPane();
        //creates the radio buttons and puts them together in a toggle group
        RadioButton smiley = new RadioButton("Smiley Face");
        RadioButton sad = new RadioButton("Sad face");
        ToggleGroup toggleGroup = new ToggleGroup();
        smiley.setToggleGroup(toggleGroup);
        sad.setToggleGroup(toggleGroup);
        
        HBox radioButtons = new HBox(40, smiley, sad); //hbox to display the radio buttons with 40px spacing between them aligned to the bottom of the window
        radioButtons.setAlignment(Pos.CENTER);
        borderPane.setBottom(radioButtons);

        Scene scene = new Scene(borderPane, 250, 200);

        smiley.setOnAction(event -> { //when the smiley radio button is selected, will call the getHBox function with the smiley face as the parameter
            if (smiley.isSelected()) {
            borderPane.setCenter(getHBox(group));
        }
        });

        sad.setOnAction(event -> { //when the sad face radio button is selected, will call the getHBox function with the sad face as the parameter
        if (sad.isSelected()) {
            borderPane.setCenter(getHBox(group2));
        }
        });
        
        primaryStage.setTitle("Homework 3_2");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    //same HBox function from hw2_1, creates the hbox with the specified face object
    private HBox getHBox(Group group) {
    HBox hBox = new HBox(40); // Create an HBox with 40px spacing
    hBox.setPadding(new Insets(15, 15, 15, 15)); 
    hBox.getChildren().add(group);
    hBox.setAlignment(Pos.CENTER);     
    return hBox;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
