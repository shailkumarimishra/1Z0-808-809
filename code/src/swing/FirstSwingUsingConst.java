package swing;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FirstSwingUsingConst {
	private JFrame frame;
	public FirstSwingUsingConst() {
		super();
		this.frame=new JFrame();
		Icon icon=new ImageIcon("smile.png");
		JButton button=new JButton(icon);
		button.setBounds(300, 300, 300,300);
		frame.add(button);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new FirstSwingUsingConst();
	}

}
