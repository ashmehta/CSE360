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

public class patientlandingpage extends HBox{
	private Label patient1;
	private Label number1;
	private Button message;
	private Button details;
	
	
	public PatientLandingPane(){
	
		
		number1 = new Label("PH:999-666-2323");
		message = new Button("MESSAGE");
		
		Button details = new Button("DETAILS");
		patient1 = new Label("JANE DOE");

		
		GridPane gp = new GridPane();	
		
		gp.add(patient1, 0, 0);
		gp.add(number1, 1, 0);	
		gp.add(message, 2, 0);
		gp.add(details, 3, 0);
		
		gp.setHgap(250);
		gp.setVgap(50);
		gp.setPadding(new Insets(100, 20, 20, 120)); 
		
		
	
		
		VBox leftMenu = new VBox();
   	 	leftMenu.setStyle("-fx-background-color: #f0ebeb;");
        leftMenu.setFillWidth(true);
        leftMenu.setMaxWidth(100);
        leftMenu.setAlignment(Pos.BASELINE_LEFT);
        leftMenu.setSpacing(20);
        
        

   	
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
       
       leftMenu.getChildren().add(homebtn);
       leftMenu.getChildren().add(inboxbtn);
       leftMenu.getChildren().add(apptbtn);
       leftMenu.getChildren().add(settingsbtn);
       
       
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

		

       gp.setAlignment(Pos.CENTER_LEFT);
       

       
      
       rightScreen.getChildren().add(topMenu);
     rightScreen.setStyle( "-fx-font-size: 16pt;" + "-fx-font-family: Alegreya Sans SC;"  );
      
     
       
      
       rightScreen.setFillWidth(true);
       rightScreen.setMargin(gp, new Insets(10, 150, 50, 150));
       rightScreen.getChildren().add(gp);
       
       

       this.getChildren().add(leftMenu);
       this.getChildren().add(rightScreen);
       this.setStyle("-fx-background-color: white;");
       this.setHgrow(leftMenu, Priority.ALWAYS);
       this.setHgrow(rightScreen, Priority.ALWAYS);
       
	}
}