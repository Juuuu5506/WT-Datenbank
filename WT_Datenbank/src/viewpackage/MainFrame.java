package viewpackage;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame{
	
	public MainFrame() {
		super();
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		JButton btnNeuesMitglied = new JButton("Neues Mitglied");
		GridBagConstraints gbc_btnNeuesMitglied = new GridBagConstraints();
		gbc_btnNeuesMitglied.insets = new Insets(0, 0, 5, 0);
		gbc_btnNeuesMitglied.gridx = 1;
		gbc_btnNeuesMitglied.gridy = 1;
		getContentPane().add(btnNeuesMitglied, gbc_btnNeuesMitglied);
		
		this.setLocationRelativeTo(null);
		this.setSize(500, 300);
		this.setVisible(true);
		
	}
}
