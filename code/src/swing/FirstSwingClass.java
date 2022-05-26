package swing;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
 * simple swing example where we are creating one button and adding it on the JFrame
 * object inside the main() method.
 */
public class FirstSwingClass {

	public static void main(String[] args) {
		JFrame frame=new JFrame();
		JButton button=new JButton("click");
		button.setBounds(130, 100, 100,40);
		frame.add(button);
		frame.setSize(400,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}

}
