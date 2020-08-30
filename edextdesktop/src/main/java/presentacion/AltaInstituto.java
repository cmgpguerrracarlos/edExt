package presentacion;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class AltaInstituto extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AltaInstituto frame = new AltaInstituto();
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
	public AltaInstituto() {
		setTitle("Alta de instituto");
		setMaximizable(true);
		setClosable(true);
		setBounds(100, 100, 450, 300);

	}

}
