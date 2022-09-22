package sub3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;

public class MyCalculator extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyCalculator frame = new MyCalculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MyCalculator() {
		setTitle("MyCalculator v1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 298, 354);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setFont(new Font("굴림", Font.BOLD, 22));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setText("0");
		textField.setBounds(12, 10, 254, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.setBounds(12, 50, 56, 56);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setBounds(80, 50, 56, 56);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setBounds(142, 50, 56, 56);
		contentPane.add(btn9);
		
		JButton btndiv = new JButton("/");
		btndiv.setBounds(210, 50, 56, 56);
		contentPane.add(btndiv);
		
		JButton btn4 = new JButton("4");
		btn4.setBounds(12, 116, 56, 56);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setBounds(80, 116, 56, 56);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setBounds(142, 116, 56, 56);
		contentPane.add(btn6);
		
		JButton btnmulti = new JButton("x");
		btnmulti.setBounds(210, 116, 56, 56);
		contentPane.add(btnmulti);
		
		JButton btn1 = new JButton("1");
		btn1.setBounds(12, 182, 56, 56);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setBounds(80, 182, 56, 56);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setBounds(142, 182, 56, 56);
		contentPane.add(btn3);
		
		JButton btnminus = new JButton("-");
		btnminus.setBounds(210, 182, 56, 56);
		contentPane.add(btnminus);
		
		JButton btn0 = new JButton("0");
		btn0.setBounds(12, 248, 56, 56);
		contentPane.add(btn0);
		
		JButton btnCancle = new JButton("C");
		btnCancle.setBounds(80, 248, 56, 56);
		contentPane.add(btnCancle);
		
		JButton btnequal = new JButton("=");
		btnequal.setBounds(142, 248, 56, 56);
		contentPane.add(btnequal);
		
		JButton btnplus = new JButton("+");
		btnplus.setBounds(210, 248, 56, 56);
		contentPane.add(btnplus);
	}

}
