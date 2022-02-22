package cartio1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.TextField;
import java.awt.Label;
import java.awt.Button;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.CompoundBorder;
import java.awt.Panel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

public class cartio1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cartio1 frame = new cartio1();
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
	public cartio1() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\srivar\\Desktop\\Cart.io.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 355, 438);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(158, 217, 204));
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel sspanel = new JPanel();
		sspanel.setBackground(new Color(102, 157, 178));
		sspanel.setBorder(new CompoundBorder());
		sspanel.setBounds(10, 13, 315, 365);
		contentPane.add(sspanel);
		sspanel.setLayout(null);
		
		TextField delaytextField = new TextField();
		delaytextField.setBackground(new Color(192, 192, 192));
		delaytextField.setBounds(122, 76, 134, 62);
		sspanel.add(delaytextField);
		
		Button stopbutton = new Button("Stop");
		stopbutton.setBounds(44, 212, 212, 62);
		sspanel.add(stopbutton);
		stopbutton.setBackground(new Color(240, 128, 128));
		stopbutton.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		
		Button startbutton = new Button("Start");
		startbutton.setBounds(45, 144, 212, 62);
		sspanel.add(startbutton);
		startbutton.setBackground(new Color(144, 238, 144));
		startbutton.setForeground(new Color(0, 0, 0));
		startbutton.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		
		Label delaylabel = new Label(" Delay");
		delaylabel.setBounds(45, 76, 78, 62);
		sspanel.add(delaylabel);
		delaylabel.setBackground(new Color(158, 217, 204));
		delaylabel.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		
		Label copyrightlabel = new Label("Copyright \u00A9 2020");
		copyrightlabel.setBounds(207, 341, 108, 24);
		sspanel.add(copyrightlabel);
		
		Label twitterlabel_1 = new Label("Twitter : @Cart__io");
		twitterlabel_1.setBounds(0, 341, 134, 24);
		sspanel.add(twitterlabel_1);
		
		Label wlabel_2 = new Label("The delay is in milliseconds.(1 s = 1000ms)   ");
		wlabel_2.setFont(new Font("Bookman Old Style", Font.PLAIN, 13));
		wlabel_2.setBounds(31, 280, 260, 24);
		sspanel.add(wlabel_2);
		
		Label titlelabel_3 = new Label("Cart.io");
		titlelabel_3.setFont(new Font("Bookman Old Style", Font.BOLD, 33));
		titlelabel_3.setBounds(94, 0, 108, 49);
		sspanel.add(titlelabel_3);
		
		Label titlelabel_4 = new Label("AutoClicker");
		titlelabel_4.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		titlelabel_4.setBounds(104, 44, 88, 24);
		sspanel.add(titlelabel_4);
		
		Label wlabel_3 = new Label(" Your cursor must be over the ATC button at all times");
		wlabel_3.setFont(new Font("Bookman Old Style", Font.PLAIN, 13));
		wlabel_3.setBounds(0, 299, 357, 24);
		sspanel.add(wlabel_3);
		
		Label wlabel_1 = new Label("(This will be fixed in later versions)");
		wlabel_1.setBounds(43, 310, 213, 45);
		sspanel.add(wlabel_1);
	}
}

























}