package application;
import javafx.animation.Transition.*;
import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene.*;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;

import java.time.Duration;
import java.util.ArrayList;
import javafx.scene.control.*;
public class Main extends Application {
	private TabPane tabPane;
	private LandingPane landingPane;

    //@Override
    public void start(Stage stage) {
    	StackPane root = new StackPane();
    	landingPane = new LandingPane();
    	//basePane.setStyle("-fx-font-size: 16pt;" + "-fx-font-family: "Alegreya Sans SC";"+ "-fx-base: rgb(132, 145, 47);" + "-fx-background: rgb(225, 228, 203);");
    	root.getChildren().add(landingPane);
       
    	
    	 
    	
    	
    	Scene scene = new Scene(root, 900, 400);
    	landingPane.prefHeightProperty().bind(stage.heightProperty());
    	landingPane.prefWidthProperty().bind(stage.widthProperty());
		stage.setTitle("Doctor Landing Page");
		stage.setScene(scene); 
		stage.show(); 
    
    	

}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}