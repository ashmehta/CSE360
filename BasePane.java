package application;

import javafx.scene.layout.*;

import java.io.FileInputStream;

import javafx.event.ActionEvent;   //**Need to import
import javafx.event.EventHandler;  //**Need to import
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.geometry.HPos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.paint.Color;

public class BasePane extends HBox{
	private Label patientName;
	private Label age; 
	private Label weight;
	private Label height;
	private Label gender; 
	private Label bloodPressure;
	private Label bloodGroup;
	private Label bodyTemp; 
	private Label age1; 
	private Label weight1;
	private Label height1;
	private Label gender1; 
	private Label bloodPressure1;
	private Label bloodGroup1;
	private Label bodyTemp1;
	private Label number;
	private Label number1;
	private Button prevRep;
	private Button newRep;
	
	
	public BasePane(){
		
		
		age = new Label("AGE");
		height = new Label("HEIGHT");
		weight = new Label("WEIGHT");
		gender = new Label("GENDER");
		bloodPressure = new Label("BLOOD PRESSURE");
		bloodGroup = new Label("BLOOD GROUP");
		bodyTemp = new Label("BODY TEMPERATURE");
		
		age1 = new Label("27 years");
		height1 = new Label("6.2 feet");
		weight1 = new Label("121 lbs");
		gender1 = new Label("Female");
		bloodPressure1 = new Label("140/90");
		bloodGroup1 = new Label("AB +");
		bodyTemp1 = new Label("37.3 C");
		
		final Separator separator = new Separator();
		
		
		
		VBox leftMenu = new VBox();
   	 	leftMenu.setStyle("-fx-background-color: #f0ebeb;");
        leftMenu.setFillWidth(true);
        leftMenu.setMaxWidth(100);
        leftMenu.setAlignment(Pos.BASELINE_LEFT);
        leftMenu.setSpacing(20);
        
        
//        Image imageDecline = new Image(getClass().getResourceAsStream("not.png"));
//        Button button5 = new Button();
//        button5.setGraphic(new ImageView(imageDecline));
//        FileInputStream input = new FileInputStream("3669253_ic_search_icon.png");
//        Image imageSearch = new Image(input);
//       // ImageView imageView = new ImageView(image);
   	
       Button searchbtn = new Button();
      // Image imageSearch = new Image(getClass().getResourceAsStream("C:\\Users\\Kiranmai\\eclipse-workspace\\HelloJavaFX\\src\\3669253_ic_search_icon.png"));
       searchbtn.setText("Search");
      // searchbtn.setGraphic(new ImageView(imageSearch));
       Button homebtn = new Button();
       homebtn.setText("Home");
       Button inboxbtn = new Button();
       inboxbtn.setText("Inbox");
       Button settingsbtn = new Button();
       settingsbtn.setText("Settings");
       Button apptbtn = new Button();
       apptbtn.setText("Appointments");
       
       leftMenu.getChildren().add(searchbtn);
       //leftMenu.getChildren().add(button5);
       leftMenu.getChildren().add(homebtn);
       leftMenu.getChildren().add(inboxbtn);
       leftMenu.getChildren().add(apptbtn);
       leftMenu.getChildren().add(settingsbtn);
       
       //leftMenu.setHgap(10);
       //leftMenu.setVgap(10);
       leftMenu.setPadding(new Insets(50, 10, 10, 10));
       
       VBox rightScreen = new VBox();
       
       HBox topMenu = new HBox();
  	   topMenu.setStyle("-fx-background-color:#ffe2d9;");
       topMenu.setFillHeight(true);
       topMenu.setMaxWidth(2000);
       topMenu.setAlignment(Pos.TOP_RIGHT);
       
       Label profileName = new Label();
       profileName.setText("DOCTOR");
       Button bellbtn = new Button();
       bellbtn.setText("Bell");
       
       AnchorPane apLeft = new AnchorPane();
       topMenu.setHgrow(apLeft, Priority.ALWAYS);//Make AnchorPane apLeft grow horizontally
       AnchorPane apRight = new AnchorPane();
       
       apLeft.getChildren().add(bellbtn);
       topMenu.getChildren().add(apLeft);
       apRight.getChildren().add(profileName);
       topMenu.getChildren().add(apRight);
       
       profileName.setPadding(new Insets(5,40, 5, 20));
       topMenu.setPadding(new Insets(20,20, 20, 20));
       topMenu.setSpacing(10);
       
       patientName = new Label("JANE DOE");
       patientName.setStyle("-fx-background-color: white;");
       patientName.setMaxWidth(2000);
       patientName.setPadding(new Insets(50, 20, 20, 20));
       
       HBox patientInfo = new HBox();
       
       
       VBox buttonContainer = new VBox();
       
       GridPane vitals = new GridPane();

		
		vitals.add(age, 0, 0);
		vitals.add(age1, 1, 0);
		vitals.add(weight, 0, 1);
		vitals.add(weight1, 1, 1);
		vitals.add(height, 0, 2);
		vitals.add(height1, 1, 2);
		vitals.add(gender, 0, 3);
		vitals.add(gender1, 1, 3);
		vitals.add(bloodPressure, 0, 4);
		vitals.add(bloodPressure1, 1, 4);
		vitals.add(bloodGroup, 0, 5);
		vitals.add(bloodGroup1, 1, 5);
		vitals.add(bodyTemp, 0, 6);
		vitals.add(bodyTemp1, 1, 6);
		
		vitals.setHgap(70);
		vitals.setVgap(50);
		vitals.setPadding(new Insets(100, 100, 100, 100));   
		
		
		GridPane gp = new GridPane();
		number = new Label("PHONE NUMBER");
		number1 = new Label("999-666-2323");
		prevRep = new Button("PREVIOUS REPORT");
		prevRep.setPrefWidth(250);
		newRep = new Button("NEW REPORT");
		newRep.setPrefWidth(250);
		
		gp.add(number, 0, 0);
		gp.add(number1, 1, 0);
		gp.add(prevRep, 0, 1);
		gp.add(newRep, 1, 1);	
		gp.setHgap(250);
		gp.setVgap(50);
		gp.setPadding(new Insets(100, 20, 20, 120)); 
		
		VBox patientButtons = new VBox();
		
		Button prescriptions = new Button("PRESCRIPTIONS");
		prescriptions.setPrefWidth(400);
		Button immunization = new Button("HISTORY OF IMMUNIZATION");
		immunization.setPrefWidth(400);
		Button insuranceInfo = new Button("INSURANCE INFORMATION");
		insuranceInfo.setPrefWidth(400);
		Button message = new Button("MESSAGE");
		message.setPrefWidth(400);
		
		patientButtons.getChildren().addAll(prescriptions, immunization, insuranceInfo, message);
		patientButtons.setPadding(new Insets(20, 100, 100, 200));
		patientButtons.setSpacing(50);
		patientButtons.setAlignment(Pos.BASELINE_CENTER);
		
		buttonContainer.getChildren().add(gp);
		buttonContainer.getChildren().add(patientButtons);
		//buttonContainer.setPadding(new Insets(100, 400, 100, 100)); 
		
		 final Separator sepVert2 = new Separator();
	     sepVert2.setOrientation(Orientation.VERTICAL);
	     sepVert2.setValignment(VPos.CENTER);
	     sepVert2.setPrefHeight(200);
	    
       patientInfo.getChildren().add(vitals);
       patientInfo.getChildren().add(sepVert2);
       patientInfo.getChildren().add(buttonContainer);
       patientInfo.setStyle("-fx-padding: 5;" + "-fx-border-style: solid inside;"
    	        + "-fx-border-width: 2;" + "-fx-border-insets: 5;"
    	        + "-fx-border-radius: 5;" + "-fx-border-color: grey;" + "-fx-font-size: 16pt;" + "-fx-font-family: Alegreya Sans SC;"  );
      // patientInfo.setStyle("-fx-font-size: 16pt;" + "-fx-font-family: "Alegreya Sans SC";" + "-fx-base: rgb(132, 145, 47);" + "-fx-background: rgb(225, 228, 203);");
       //patientInfo.setPadding(new Insets(200, 200, 200, 200));
       //patientInfo.setAlignment(Pos.CENTER_LEFT);
       

       separator.setMaxWidth(2000);
      
       rightScreen.getChildren().add(topMenu);
       rightScreen.getChildren().add(patientName);
       rightScreen.getChildren().add(separator);
       rightScreen.getChildren().add(patientInfo);
       rightScreen.setStyle( "-fx-font-size: 16pt;" + "-fx-font-family: Alegreya Sans SC;"  );
      
     
       
       rightScreen.setMargin(patientInfo, new Insets(10, 150, 50, 150));
//       rightScreen.setHgrow(topMenu, Priority.ALWAYS);
//       rightScreen.setHgrow(patientName, Priority.ALWAYS);
       rightScreen.setFillWidth(true);
       //topMenu.setPrefWidth(10000);
       

       this.getChildren().add(leftMenu);
       this.getChildren().add(rightScreen);
       this.setStyle("-fx-background-color: white;");
       //this.setAlignment(Pos.CENTER);
       this.setHgrow(leftMenu, Priority.ALWAYS);
       this.setHgrow(rightScreen, Priority.ALWAYS);
       
	}
}