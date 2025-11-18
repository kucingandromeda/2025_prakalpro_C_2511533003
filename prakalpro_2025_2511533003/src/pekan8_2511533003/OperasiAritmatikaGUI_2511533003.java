package pekan8_2511533003;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class OperasiAritmatikaGUI_2511533003 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtBil1;
	private JTextField txtBil2;
	private JTextField txtHasil;
	
	private void pesanPeringatan (String pesan) {
		JOptionPane.showMessageDialog(this, pesan, "Peringatan", JOptionPane.WARNING_MESSAGE);
	}
	
	private void pesanError(String pesan) {
		JOptionPane.showMessageDialog(this, pesan, "Kesalahan", JOptionPane.ERROR_MESSAGE);
	}


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperasiAritmatikaGUI_2511533003 frame = new OperasiAritmatikaGUI_2511533003();
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
	public OperasiAritmatikaGUI_2511533003() {
		setTitle("OperatorAritmatika");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("OPERATOR ARITMATIKA");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(150, 0, 173, 17);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Bilangan 1");
		lblNewLabel_1.setBounds(35, 41, 86, 17);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Bilangan 2");
		lblNewLabel_1_1.setBounds(35, 70, 86, 17);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Operator");
		lblNewLabel_1_1_1.setBounds(35, 120, 86, 17);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Hasil");
		lblNewLabel_1_1_1_1.setBounds(35, 185, 86, 17);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		txtBil1 = new JTextField();
		txtBil1.setHorizontalAlignment(SwingConstants.CENTER);
		txtBil1.setBounds(110, 39, 114, 21);
		contentPane.add(txtBil1);
		txtBil1.setColumns(10);
		
		txtBil2 = new JTextField();
		txtBil2.setHorizontalAlignment(SwingConstants.CENTER);
		txtBil2.setColumns(10);
		txtBil2.setBounds(110, 70, 114, 21);
		contentPane.add(txtBil2);
		
		txtHasil = new JTextField();
		txtHasil.setEditable(false);
		txtHasil.setHorizontalAlignment(SwingConstants.CENTER);
		txtHasil.setColumns(10);
		txtHasil.setBounds(110, 183, 114, 21);
		contentPane.add(txtHasil);
		
		JComboBox cbOperator = new JComboBox();
		cbOperator.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "/", "x"}));
		cbOperator.setBounds(110, 115, 31, 26);
		contentPane.add(cbOperator);
		
		JButton btnNewButton = new JButton("Hitung");
		btnNewButton.addActionListener(new ActionListener() {
			int hasil;

			public void actionPerformed(ActionEvent e) {
				if (txtBil1.getText().trim().isEmpty()) {
					pesanPeringatan("Bilangan 1 harus diisi");
				} else if (txtBil2.getText().trim().isEmpty()) {
					pesanPeringatan("Bilangan 2 harus diisi");
				} else {
					try {
						int a = Integer.valueOf(txtBil1.getText());
						int b = Integer.valueOf(txtBil2.getText());
						int c = cbOperator.getSelectedIndex();
						
						if (c == 0) {
							
							hasil = a + b;
							
						} else  if (c == 1){
							
							hasil = a - b;
							
						} else if (c == 2) {
							
							hasil = a / b;
							
						} else if (c == 3) {
							
							hasil = a * b;
							
						}
						txtHasil.setText(String.valueOf(hasil));

					} catch (NumberFormatException ex) {
						pesanError("Bilangan 1 dan Bilangan 2 harus angka");
					}
				}
				
								
			}
		});
		btnNewButton.setBounds(163, 115, 106, 27);
		contentPane.add(btnNewButton);

	}
}
