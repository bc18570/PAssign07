/* File: PAssign07Keypad1.java
 * @author: Benedict Cabral
 * Created on: March 30, 2024
 * Last Modified; Mar 30, 2024
 * Description:  Extends KeyPadPane to set custom values to buttons and sets a consistent size
 */

package keypad;

import java.util.ArrayList;
import javafx.scene.control.Button;

class PAssign07Keypad1 extends KeyPadPane { //Keypad containing math symbols, operations, etc.
	public PAssign07Keypad1() {
		btn1.setText("sin");
		btn2.setText("cos");
		btn3.setText("tan");
		btn4.setText("^");
		btn5.setText("÷");
		btn6.setText("×");
		btn7.setText("π");
		btn8.setText("-");
		btn9.setText("+");
		btnBlank1.setText("(");
		btn0.setText(")");
		btnBlank2.setText(".");
		
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