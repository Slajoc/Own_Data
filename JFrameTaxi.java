package de.szut.dqm15.schulze.till;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class JFrameTaxi extends JFrame {

	private JPanel contentPane;
	private JTextField tF_userDistance;
	private JTextField tF_guestsEntry;
	private JTextField tF_netto;
	private JTextField tF_mwst;
	private JTextField tF_brutto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameTaxi frame = new JFrameTaxi();
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
	public JFrameTaxi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 478, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(SystemColor.activeCaption);
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Eingaben", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panel.setBounds(22, 33, 419, 192);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lbl_cartype = new JLabel("Auswahl des Fahrzeugtyps");
		lbl_cartype.setBounds(12, 18, 195, 29);
		panel.add(lbl_cartype);
		lbl_cartype.setFont(new Font("Arial", Font.BOLD, 14));
		
		JComboBox cb_cartype = new JComboBox();
		cb_cartype.setBounds(229, 21, 184, 22);
		panel.add(cb_cartype);
		cb_cartype.setFont(new Font("Arial", Font.BOLD, 14));
		cb_cartype.setModel(new DefaultComboBoxModel(new String[] {"Normales Taxi", "Gro\u00DFraumtaxi", "Stretchlimousine"}));
		
		JLabel lbl_distance = new JLabel("Entfernung in km");
		lbl_distance.setBounds(12, 60, 195, 29);
		panel.add(lbl_distance);
		lbl_distance.setFont(new Font("Arial", Font.BOLD, 14));
		
		tF_userDistance = new JTextField();
		tF_userDistance.setBounds(297, 63, 116, 22);
		panel.add(tF_userDistance);
		tF_userDistance.setColumns(10);
		
		JCheckBox ckbox_night = new JCheckBox("Nachtfahrt (Zuschlag 10%)");
		ckbox_night.setBounds(6, 98, 222, 25);
		panel.add(ckbox_night);
		ckbox_night.setFont(new Font("Arial", Font.BOLD, 14));
		
		JCheckBox ckbox_kids = new JCheckBox("Kindersitz (Zuschlag 1\u20AC)");
		ckbox_kids.setBounds(6, 128, 222, 25);
		panel.add(ckbox_kids);
		ckbox_kids.setFont(new Font("Arial", Font.BOLD, 14));
		
		JCheckBox ckbox_bar = new JCheckBox("Bar (Zuschlag 15\u20AC)");
		ckbox_bar.setBounds(6, 158, 222, 25);
		panel.add(ckbox_bar);
		ckbox_bar.setFont(new Font("Arial", Font.BOLD, 14));
		
		JLabel lbl_guests = new JLabel("Fahrg\u00E4ste");
		lbl_guests.setBounds(262, 156, 81, 29);
		panel.add(lbl_guests);
		lbl_guests.setFont(new Font("Arial", Font.BOLD, 14));
		
		tF_guestsEntry = new JTextField();
		tF_guestsEntry.setBounds(355, 159, 58, 22);
		panel.add(tF_guestsEntry);
		tF_guestsEntry.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Rechnungs\u00FCbersicht", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(27, 241, 243, 155);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNettobetrag = new JLabel("Nettobetrag");
		lblNettobetrag.setBounds(6, 18, 128, 29);
		panel_1.add(lblNettobetrag);
		lblNettobetrag.setFont(new Font("Arial", Font.BOLD, 14));
		
		JLabel lblMehrwertsteuer = new JLabel("Mehrwertsteuer");
		lblMehrwertsteuer.setBounds(6, 60, 128, 29);
		panel_1.add(lblMehrwertsteuer);
		lblMehrwertsteuer.setFont(new Font("Arial", Font.BOLD, 14));
		
		JLabel lblBruttobetrag = new JLabel("Bruttobetrag");
		lblBruttobetrag.setBounds(6, 119, 128, 29);
		panel_1.add(lblBruttobetrag);
		lblBruttobetrag.setFont(new Font("Arial", Font.BOLD, 14));
		
		tF_netto = new JTextField();
		tF_netto.setBounds(146, 21, 91, 22);
		panel_1.add(tF_netto);
		tF_netto.setEditable(false);
		tF_netto.setColumns(10);
		
		tF_mwst = new JTextField();
		tF_mwst.setBounds(146, 63, 91, 22);
		panel_1.add(tF_mwst);
		tF_mwst.setEditable(false);
		tF_mwst.setColumns(10);
		
		tF_brutto = new JTextField();
		tF_brutto.setBounds(146, 122, 91, 22);
		panel_1.add(tF_brutto);
		tF_brutto.setEditable(false);
		tF_brutto.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(6, 102, 231, 4);
		panel_1.add(separator);
		
		JButton btn_calculate = new JButton("Berechnen");
		btn_calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DecimalFormat decimal = new DecimalFormat("0.00");
				double base = 3.90;
				double sum = 0;
				double mwst = 0;
				double netto = 0;
				if(cb_cartype.getSelectedItem().equals("Normales Taxi")) {
					sum = Double.parseDouble(String.valueOf(tF_userDistance.getText())) * 0.5;
				}
				if(cb_cartype.getSelectedItem().equals("Großraumtaxi")) {
					sum = Double.parseDouble(String.valueOf(tF_userDistance.getText())) * 1;
				}
				if(cb_cartype.getSelectedItem().equals("Stretchlimousine")) {
					sum = Double.parseDouble(String.valueOf(tF_userDistance.getText())) * 2;
				}
				if(ckbox_night.isSelected()) {
					sum *= 1.10;
				}
				if(ckbox_kids.isSelected()) {
					base += 1.00;
				}
				if(ckbox_bar.isSelected()) {
					
					base += (15.00 * Double.parseDouble(String.valueOf(tF_guestsEntry.getText())));
				}
				base += sum;
				tF_brutto.setText(String.valueOf(decimal.format(base)));
				tF_mwst.setText(String.valueOf(decimal.format((base / 107 * 7))));
				tF_netto.setText(String.valueOf(decimal.format((base / 107 * 100))));
			}
		});
		btn_calculate.setBounds(302, 248, 139, 25);
		contentPane.add(btn_calculate);
		
		JButton btn_print = new JButton("Drucken");
		btn_print.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DecimalFormat decimal = new DecimalFormat("0.00");
				System.out.println("Ihr Auswahl für:\n"
						+ "Fahrzeugtyp: " + cb_cartype.getSelectedItem() + "\n"
						+ "Entfernung in km: " + tF_userDistance.getText() + "\n"
						+ "Anzahl der Fahrgäste: " + tF_guestsEntry.getText());
				if(ckbox_night.isSelected()) {
					System.out.println(ckbox_night.getText());
				}
				if(ckbox_kids.isSelected()) {
					System.out.println(ckbox_kids.getText());
				}
				if(ckbox_bar.isSelected()) {
					System.out.println(ckbox_bar.getText());
				}
				System.out.println("Der Bruttobetrag beläuft sich auf:\t " + String.valueOf(tF_brutto.getText()));
				System.out.println("Die Mehrwertsteuer beläuft sich auf:\t " + String.valueOf(tF_mwst.getText()));
				System.out.println("Der Nettobetrag beläuft sich auf:\t " + String.valueOf(tF_netto.getText()));
				
			}
		});
		btn_print.setBounds(302, 286, 139, 25);
		contentPane.add(btn_print);
		
		JButton btn_new = new JButton("Neu");
		btn_new.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cb_cartype.setSelectedIndex(0);
				tF_userDistance.setText(null);
				tF_guestsEntry.setText(null);
				ckbox_night.setText(null);
				ckbox_kids.setText(null);
				ckbox_bar.setText(null);
			}
		});
		btn_new.setBounds(302, 324, 139, 25);
		contentPane.add(btn_new);
		
		JButton btn_end = new JButton("Ende");
		btn_end.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_end.setBounds(302, 362, 139, 25);
		contentPane.add(btn_end);
	}
}
