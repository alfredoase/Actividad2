import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BailaTexto extends JFrame {

	private JPanel contentPane;
	private JTextField Campotextoizquierda;
	private JTextField Campotextoderecha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BailaTexto frame = new BailaTexto();
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
	public BailaTexto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setToolTipText("INTERCAMBIAR TEXTO");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Campotextoizquierda = new JTextField();
		Campotextoizquierda.setBounds(12, 104, 114, 36);
		contentPane.add(Campotextoizquierda);
		Campotextoizquierda.setColumns(10);
		
		Campotextoderecha = new JTextField();
		Campotextoderecha.setBounds(324, 104, 114, 36);
		contentPane.add(Campotextoderecha);
		Campotextoderecha.setColumns(10);
		
		JButton btnNewButton_ID = new JButton("-->");
		btnNewButton_ID.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Izquierda Derecha
				Campotextoderecha.setText(Campotextoizquierda.getText());
				//Borrar texto campo
				Campotextoizquierda.setText(" ");
			}
		});
		btnNewButton_ID.setBounds(159, 33, 117, 25);
		contentPane.add(btnNewButton_ID);
		
		JButton btnNewButton_DI = new JButton("<--");
		btnNewButton_DI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Izquierda Derecha
				Campotextoizquierda.setText(Campotextoderecha.getText());
				//Borrar texto campo
				Campotextoderecha.setText(" ");
			}
		});
		btnNewButton_DI.setBounds(159, 189, 117, 25);
		contentPane.add(btnNewButton_DI);
	}
}
