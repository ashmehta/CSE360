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

public class ChatInbox extends HBox{
	private Label patient1;
	private Label patient2;
	private Label patient3;
	private Label time1;
	private Label time2;
	private Label time3;
	private Label message1;
	private Label message2;
	private Label message3;
	private CheckBox checkB;
	private CheckBox checkB1;
	private CheckBox checkB2;
	
	
	public ChatInbox(){
	
		
		time1 = new Label("TODAY, 12:00 PM");
		time2 = new Label("TODAY, 12:00 PM");
		time3 = new Label("TODAY, 12:00 PM");
		message1 = new Label("GOOD MORNING!!");
		message2 = new Label("HI DOCTOR...");
		message3 = new Label("I GOT DIARRHEA");
		
		Button details = new Button("DETAILS");
		Button details1 = new Button("DETAILS");
		Button details2 = new Button("DETAILS");
		patient1 = new Label("JANE DOE");
		checkB = new CheckBox("");
		patient2 = new Label("JOHN DOE");
		checkB1 = new CheckBox("");
		patient3 = new Label("JIM DOE");
		checkB2 = new CheckBox("");
		
		GridPane gp = new GridPane();	
		
		gp.add(checkB, 0, 0);
		gp.add(checkB1, 0, 1);
		gp.add(checkB2, 0, 2);
		gp.add(patient1, 1, 0);	
		gp.add(patient2, 1, 1);
		gp.add(patient3, 1, 2);
		gp.add(message1, 2, 0);
		gp.add(message2, 2, 1);
		gp.add(message3, 2, 2);
		gp.add(time1, 3, 0);
		gp.add(time2, 3, 1);
		gp.add(time3, 3, 2);
		
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