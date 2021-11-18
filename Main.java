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
	private BasePane basePane;

    //@Override
    public void start(Stage stage) {
    	StackPane root = new StackPane();
    	basePane = new BasePane();
    	//basePane.setStyle("-fx-font-size: 16pt;" + "-fx-font-family: "Alegreya Sans SC";"+ "-fx-base: rgb(132, 145, 47);" + "-fx-background: rgb(225, 228, 203);");
    	root.getChildren().add(basePane);
       
    	
    	 
    	
    	
    	Scene scene = new Scene(root, 900, 400);
    	basePane.prefHeightProperty().bind(stage.heightProperty());
    	basePane.prefWidthProperty().bind(stage.widthProperty());
		stage.setTitle("doctor view-patient profile");
		stage.setScene(scene); 
		stage.show(); 
    
    	
//    	HBox topMenu = new HBox();
//   	 	topMenu.setStyle("-fx-background-color: pink;");
//        topMenu.setFillHeight(true);
//        topMenu.setMaxWidth(100);
//        topMenu.setAlignment(Pos.BASELINE_RIGHT);
//        
//        Button profileName = new Button();
//        profileName.setText("Doctor");
//        Button bellbtn = new Button();
//        bellbtn.setText("Bell");
//        
//    	 VBox leftMenu = new VBox();
//    	 leftMenu.setStyle("-fx-background-color: pink;");
//         leftMenu.setFillWidth(true);
//         leftMenu.setMaxWidth(100);
//         leftMenu.setAlignment(Pos.BASELINE_LEFT);
//    	
//        Button searchbtn = new Button();
//        searchbtn.setText("Search");
//        Button homebtn = new Button();
//        homebtn.setText("Home");
//        Button inboxbtn = new Button();
//        inboxbtn.setText("Inbox");
//        Button settingsbtn = new Button();
//        settingsbtn.setText("Settings");
//        Button apptbtn = new Button();
//        apptbtn.setText("Appointments");
//
//        final StackPane root = new StackPane();
//        HBox screens = new HBox();
//        AnchorPane editorRoot = new AnchorPane();
//        topMenu.getChildren().add(profileName);
//        topMenu.getChildren().add(bellbtn);
//        leftMenu.getChildren().add(searchbtn);
//        leftMenu.getChildren().add(homebtn);
//        leftMenu.getChildren().add(inboxbtn);
//        leftMenu.getChildren().add(apptbtn);
//        leftMenu.getChildren().add(settingsbtn);
//        //root.setAlignment(Pos.BASELINE_LEFT);
//        screens.getChildren().add(leftMenu);
//        screens.getChildren().add(topMenu);
//        root.getChildren().add(screens);
//        Scene scene = new Scene(root, 300, 250);
//        scene.getStylesheets().add("/jfxdemos/styles.css");
//
//        primaryStage.setScene(scene);
//        primaryStage.show();
//
//        HBox fileRoot = new HBox();
//        VBox menu = new VBox();
//        menu.setStyle("-fx-background-color: blue;");
//        menu.setFillWidth(true);
//        Button backBtn = new Button("Left Arrow");
//        backBtn.setPrefWidth(100);
//        backBtn.getStyleClass().add("custom-menu-button");
//        backBtn.setOnAction(new EventHandler<ActionEvent>(){
//            @Override
//            public void handle(ActionEvent event) {
//                FadeTransition hideFileRootTransition = new FadeTransition();
//                hideFileRootTransition.setFromValue(1.0);
//                hideFileRootTransition.setToValue(0.0);
//
//                FadeTransition showEditorRootTransition = new FadeTransition();
//                showEditorRootTransition.setFromValue(0.0);
//                showEditorRootTransition.setToValue(1.0);
//
//                showEditorRootTransition.play();
//                hideFileRootTransition.play();
//                root.getChildren().remove(fileRoot);
//            }
//        });
//        Button infoBtn = new Button("Info");
//        infoBtn.setPrefWidth(100);
//        infoBtn.getStyleClass().add("custom-menu-button");
//        Button newBtn = new Button("New");
//        newBtn.setPrefWidth(100);
//        newBtn.getStyleClass().add("custom-menu-button");
//        Button openBtn = new Button("Open");
//        openBtn.setPrefWidth(100);
//        openBtn.getStyleClass().add("custom-menu-button");
//        menu.getChildren().addAll(backBtn,infoBtn, newBtn, openBtn);
//        VBox.setVgrow(infoBtn, Priority.ALWAYS);
//        fileRoot.getChildren().add(menu);
//
////        btn.setOnAction(new EventHandler<ActionEvent>(){
////            public void handle(ActionEvent event) {
////                root.getChildren().add(fileRoot);
////                FadeTransition hideEditorRootTransition = new FadeTransition(Duration.ofMillis(500), editorRoot);
////                //hideEditorRootTransition.setDuration(Duration.ofMillis(500), editorRoot);
////                hideEditorRootTransition.setFromValue(1.0);
////                hideEditorRootTransition.setToValue(0.0);
////
////                FadeTransition showFileRootTransition = new FadeTransition(Duration.ofMillis(500), fileRoot);
////                showFileRootTransition.setFromValue(0.0);
////                showFileRootTransition.setToValue(1.0);
////                hideEditorRootTransition.play();
////                showFileRootTransition.play();
////            }
////        }
// //       );
//
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}