package pekan9_2511533003;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Kalkulator_2511533003 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textHasil;
	
	double bilangan_1;
	boolean bilangan_1_exist = false;
	String operator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kalkulator_2511533003 frame = new Kalkulator_2511533003();
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
	public Kalkulator_2511533003() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 248, 298);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textHasil = new JTextField();
		textHasil.setBounds(12, 28, 217, 33);
		contentPane.add(textHasil);
		textHasil.setColumns(10);
		
		JButton button_back = new JButton("<=");
		button_back.setBounds(12, 99, 55, 27);
		contentPane.add(button_back);
		
		JButton button_c = new JButton("c");
		button_c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_c.setBounds(67, 99, 55, 27);
		contentPane.add(button_c);
		
		JButton button_00 = new JButton("00");
		button_00.setBounds(124, 99, 55, 27);
		contentPane.add(button_00);
		
		JButton button_tambah = new JButton("+");
		button_tambah.setBounds(180, 99, 55, 27);
		contentPane.add(button_tambah);
		
		JButton button_7 = new JButton("7");
		button_7.setBounds(12, 127, 55, 27);
		contentPane.add(button_7);
		
		JButton button_kurang = new JButton("-");
		button_kurang.setBounds(180, 127, 55, 27);
		contentPane.add(button_kurang);
		
		JButton button_kali = new JButton("*");
		button_kali.setBounds(180, 155, 55, 27);
		contentPane.add(button_kali);
		
		JButton button_bagi = new JButton("/");
		button_bagi.setBounds(180, 182, 55, 27);
		contentPane.add(button_bagi);
		
		JButton button_persen = new JButton("%");
		button_persen.setBounds(180, 209, 55, 27);
		contentPane.add(button_persen);
		
		JButton button_8 = new JButton("8");
		button_8.setBounds(67, 127, 55, 27);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("9");
		button_9.setBounds(124, 127, 55, 27);
		contentPane.add(button_9);
		
		JButton button_6 = new JButton("6");
		button_6.setBounds(124, 155, 55, 27);
		contentPane.add(button_6);
		
		JButton button_3 = new JButton("3");
		button_3.setBounds(124, 182, 55, 27);
		contentPane.add(button_3);
		
		JButton button_hasil = new JButton("=");
		button_hasil.setBounds(124, 209, 55, 27);
		contentPane.add(button_hasil);
		
		JButton button_5 = new JButton("5");
		button_5.setBounds(67, 155, 55, 27);
		contentPane.add(button_5);
		
		JButton button_4 = new JButton("4");
		button_4.setBounds(12, 155, 55, 27);
		contentPane.add(button_4);
		
		JButton button_1 = new JButton("1");
		button_1.setBounds(12, 182, 55, 27);
		contentPane.add(button_1);
		
		JButton button_0 = new JButton("0");
		button_0.setBounds(12, 209, 55, 27);
		contentPane.add(button_0);
		
		JButton button_titik = new JButton(".");
		button_titik.setBounds(67, 209, 55, 27);
		contentPane.add(button_titik);
		
		JButton button_2 = new JButton("2");
		button_2.setBounds(67, 182, 55, 27);
		contentPane.add(button_2);
		
		
		// anggka
		button_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tampil = textHasil.getText() + "0";
				textHasil.setText(tampil);
			}
		});
		
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tampil = textHasil.getText() + "1";
				textHasil.setText(tampil);
			}
		});
		
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tampil = textHasil.getText() + "2";
				textHasil.setText(tampil);
			}
		});
		
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tampil = textHasil.getText() + "3";
				textHasil.setText(tampil);
			}
		});
		
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tampil = textHasil.getText() + "5";
				textHasil.setText(tampil);
			}
		});
		
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tampil = textHasil.getText() + "6";
				textHasil.setText(tampil);
			}
		});
		
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tampil = textHasil.getText() + "7";
				textHasil.setText(tampil);
			}
		});
		
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tampil = textHasil.getText() + "8";
				textHasil.setText(tampil);
			}
		});
		
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tampil = textHasil.getText() + "9";
				textHasil.setText(tampil);
			}
		});
		
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tampil = textHasil.getText() + "4";
				textHasil.setText(tampil);
			}
		});
		
//		titik
		button_titik.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tampil = textHasil.getText() + ".";
				textHasil.setText(tampil);
			}
		});
		// 00
		button_00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tampil = textHasil.getText() + "00";
				textHasil.setText(tampil);
			}
		});
		// clear
		button_c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textHasil.setText("");
			}
		});
		// back
		button_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String _tampil = textHasil.getText();
				if (!_tampil.isEmpty()) {					
				String tampil = _tampil.substring(0, _tampil.length() - 1);
				textHasil.setText(tampil);
				}
			}
		});
		
		//	operator	
		button_tambah.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tampil = textHasil.getText();
				if (!tampil.isEmpty()) {					
				double value = Integer.valueOf(tampil);
				bilangan_1 = value;
				bilangan_1_exist = true;
				operator = "tambah";
				textHasil.setText("");
				}
			}
		});
		
		button_kurang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tampil = textHasil.getText();
				if (!tampil.isEmpty()) {					
				double value = Integer.valueOf(tampil);
				bilangan_1 = value;
				bilangan_1_exist = true;
				operator = "kurang";
				textHasil.setText("");
				}
			}
		});
		
		button_bagi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tampil = textHasil.getText();
				if (!tampil.isEmpty()) {					
				double value = Integer.valueOf(tampil);
				bilangan_1 = value;
				bilangan_1_exist = true;
				operator = "bagi";
				textHasil.setText("");
				}
			}
		});
		
		button_kali.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tampil = textHasil.getText();
				if (!tampil.isEmpty()) {					
				double value = Integer.valueOf(tampil);
				bilangan_1 = value;
				bilangan_1_exist = true;
				operator = "kali";
				textHasil.setText("");
				}
			}
		});
		
		// persen
		button_persen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tampil = textHasil.getText();
				if (!tampil.isEmpty()) {					
				double value = Integer.valueOf(tampil);
				double hasil= value * 0.01;
				textHasil.setText(String.valueOf(hasil));
				}
			}
		});
		
		// operator
		button_hasil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tampil = textHasil.getText();
				if (!tampil.isEmpty() && bilangan_1_exist) {					
				double bilangan_2 = Integer.valueOf(tampil);
				double hasil = 0;
				
				if (operator == "tambah") {
					hasil = bilangan_1 + bilangan_2;
				} else if (operator == "kurang") {
					hasil = bilangan_1 - bilangan_2;
				} else if (operator == "kali") {
					hasil = bilangan_1 * bilangan_2;
				} else if (operator == "bagi") {
					hasil = bilangan_1 / bilangan_2;
				}
				
				bilangan_1_exist = false;
				textHasil.setText(String.valueOf(hasil));
				}
			}
		});
	}
}
