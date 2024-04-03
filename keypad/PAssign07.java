/* File: PAssign07.java
 * @author: Benedict Cabral
 * Created on: March 30, 2024
 * Last Modified; Mar 30, 2024
 * Description:  Makes a Calculator with a keypad
 */

//GitHub: https://github.com/bc18570/hello-world

package keypad;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import keypad.*;
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBase;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
//
import java.util.ArrayList;
import javafx.geometry.*;

public class PAssign07 extends Application {
	
	private TextField screen = new TextField("");

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {

		// create 2 KeyPadPanes
		PAssign07Keypad1 keypad1 = new PAssign07Keypad1(); // custom Keypad with math operations/symbols
		PAssign07Keypad2 keypad2 = new PAssign07Keypad2(); // custom Keypad with numbers in calculator format
		GridPane mainPane = new GridPane();
		
		//GUI Design:
		mainPane.setAlignment(Pos.CENTER);
		mainPane.setVgap(10);
		
		//Add keypads and text-field into GridPane:
		mainPane.add(screen,0,0);
		mainPane.add(keypad1,0,1);
		mainPane.add(keypad2,0,2);
		
		
		// create your scene 
		Scene scene = new Scene(mainPane,400,300);
		
		primaryStage.setTitle("PAssign07 Calculator"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
		
	}

	public static void main(String[] args) { 
		launch(args);
	}
}