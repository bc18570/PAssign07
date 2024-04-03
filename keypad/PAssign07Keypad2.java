/* File: PAssign07Keypad2.java
 * @author: Benedict Cabral
 * Created on: March 30, 2024
 * Last Modified; Mar 30, 2024
 * Description:  Extends KeyPadPane to set custom values to buttons and sets a consistent size
 */
package keypad;

import java.util.ArrayList;
import javafx.scene.control.Button;

class PAssign07Keypad2 extends KeyPadPane { //Keypad in calculator format
	public PAssign07Keypad2() {
		btn1.setText("7");
		btn2.setText("8");
		btn3.setText("9");
		btn4.setText("4");
		btn5.setText("5");
		btn6.setText("6");
		btn7.setText("1");
		btn8.setText("2");
		btn9.setText("3");
		btnBlank1.setText("Clear");
		btn0.setText("0");
		btnBlank2.setText("Calculate");
		
		ArrayList<Button> buttons = new ArrayList<>();
		
		buttons.add(btn1);
		buttons.add(btn2);
		buttons.add(btn3);
		buttons.add(btn4);
		buttons.add(btn5);
		buttons.add(btn6);
		buttons.add(btn7);
		buttons.add(btn8);
		buttons.add(btn9);
		buttons.add(btnBlank1);
		buttons.add(btn0);
		buttons.add(btnBlank2);
		
		for(int i = 0; i < buttons.size(); i ++) {
			buttons.get(i).setPrefWidth(75);
		}
	}
	
	
	
}