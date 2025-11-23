package pekan8_2511533003;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class tugasAlproPekan8_2511533003 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtBil1;
	private JTextField txtBil2;
	private JTextField txtHasil;
	private JTextField txtOperasi;

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
					tugasAlproPekan8_2511533003 frame = new tugasAlproPekan8_2511533003();
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
	public tugasAlproPekan8_2511533003() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblOperasiRelasional = new JLabel("Operasi Relasional");
		lblOperasiRelasional.setBounds(164, 12, 136, 17);
		contentPane.add(lblOperasiRelasional);
		
		JLabel lblBilangan = new JLabel("Bilangan 1");
		lblBilangan.setBounds(12, 44, 75, 17);
		contentPane.add(lblBilangan);
		
		JLabel lblBilangan_2 = new JLabel("Bilangan 2");
		lblBilangan_2.setBounds(12, 75, 75, 17);
		contentPane.add(lblBilangan_2);
		
		txtBil1 = new JTextField();
		txtBil1.setBounds(92, 42, 114, 21);
		contentPane.add(txtBil1);
		txtBil1.setColumns(10);
		
		txtBil2 = new JTextField();
		txtBil2.setColumns(10);
		txtBil2.setBounds(92, 73, 114, 21);
		contentPane.add(txtBil2);
		
		JLabel lblBilangan_2_1 = new JLabel("Operator");
		lblBilangan_2_1.setBounds(12, 118, 75, 17);
		contentPane.add(lblBilangan_2_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"==", "!=", ">", "<", ">=", "<="}));
		comboBox.setBounds(92, 113, 58, 26);
		contentPane.add(comboBox);

		
		JButton btnNewButton = new JButton("jalankan");
		btnNewButton.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent ae) {
                
				if(txtBil1.getText().trim().isEmpty()){
					pesanPeringatan("diharapkan isi bilangan 1");
				} else if (txtBil2.getText().trim().isEmpty()){
					pesanPeringatan("diharapkan isi bilangan 2");
				} else {

					try{
						boolean hasil;
						int bil1 = Integer.valueOf(txtBil1.getText());
						int bil2 = Integer.valueOf(txtBil2.getText());
						int operator = comboBox.getSelectedIndex();
						String oprasi = " " + bil1 + " ";

						if (operator == 0){
							hasil = bil1 == bil2;
							oprasi = oprasi + " == ";

						} else if (operator == 1){
							hasil = bil1 != bil2;
							oprasi = oprasi + " != ";

						} else if (operator == 2){
							hasil = bil1 > bil2;
							oprasi = oprasi + " > ";

						} else if (operator == 3){
							hasil = bil1 < bil2;
							oprasi = oprasi + " < ";

						} else if (operator == 4){
							hasil = bil1 >= bil2;
							oprasi = oprasi + " >= ";

						} else {
							hasil = bil1 <= bil2;
							oprasi = oprasi + " <= ";

						}
						oprasi = oprasi + " " + bil2;
						
						txtOperasi.setText(oprasi);
						txtHasil.setText(String.valueOf(hasil));

						
					} catch(NumberFormatException e) {
						pesanError("diharapkan input berupa angka");
					}
				};

            }
			
		});
		
		btnNewButton.setBounds(164, 113, 106, 27);
		contentPane.add(btnNewButton);
		
		JLabel lblBilangan_2_1_1 = new JLabel("Hasil");
		lblBilangan_2_1_1.setBounds(12, 198, 75, 17);
		contentPane.add(lblBilangan_2_1_1);
		
		txtHasil = new JTextField();
		txtHasil.setEditable(false);
		txtHasil.setColumns(10);
		txtHasil.setBounds(92, 196, 114, 21);
		contentPane.add(txtHasil);
		
		JLabel lblBilangan_2_1_1_1 = new JLabel("Operasi");
		lblBilangan_2_1_1_1.setBounds(12, 166, 75, 17);
		contentPane.add(lblBilangan_2_1_1_1);
		
		txtOperasi = new JTextField();
		txtOperasi.setEditable(false);
		txtOperasi.setColumns(10);
		txtOperasi.setBounds(92, 165, 114, 21);
		contentPane.add(txtOperasi);

	}
}
