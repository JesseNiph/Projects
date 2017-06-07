package designer;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JLabel;
import javax.swing.text.View;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.awt.Panel;
import java.awt.Button;

public class InterfaceMenu {

	String line;
	BufferedReader br = null;
	JPanel adc;
	JPanel mid;
	JPanel support;
	JPanel jungler;
	JPanel top;
	HashMap<String,lolChar> lolChamp = new HashMap<String,lolChar>();
	
	
	
	
		
	
	
	public void generateHash(){
		try {
			br = new BufferedReader(new FileReader("lol.txt"));
			while((line=br.readLine()) !=null){
				/*System.out.println(line);*/
				StringTokenizer st = new StringTokenizer(line, "|"); 
				while(st.hasMoreTokens()) { 
				String name = st.nextToken(); 
				String abilityQ= st.nextToken();
				String qStats1 = st.nextToken();
				String qStats2 = st.nextToken();
				String qStats3 = st.nextToken();
				String qStats4 = st.nextToken();
				String qStats5 = st.nextToken();
				String abilityW= st.nextToken();
				String wStats1 = st.nextToken();
				String wStats2 = st.nextToken();
				String wStats3 = st.nextToken();
				String wStats4 = st.nextToken();
				String wStats5 = st.nextToken();
				String abilityE= st.nextToken();
				String eStats1 = st.nextToken();
				String eStats2 = st.nextToken();
				String eStats3 = st.nextToken();
				String eStats4 = st.nextToken();
				String eStats5 = st.nextToken();
				String abilityR= st.nextToken();
				String rStats1 = st.nextToken();
				String rStats2 = st.nextToken();
				String rStats3 = st.nextToken();
				lolChar l=new lolChar(name,abilityQ,qStats1,qStats2,qStats3,qStats4,qStats5,abilityW,wStats1,wStats2,wStats3,wStats4,wStats5,
						abilityE,eStats1,eStats2,eStats3,eStats4,eStats5,abilityR,rStats1,rStats2,rStats3);
				lolChamp.put(name, l);
				
				
			}
}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
	 
		
	
	
	

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceMenu window = new InterfaceMenu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public InterfaceMenu() {
		System.out.println("program start");
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		 adc = new JPanel();
		 mid = new JPanel();
		 support = new JPanel();
		 jungler = new JPanel();
		 top= new JPanel();
		
		 // Adc Panel
		 frame.getContentPane().add(adc);
			adc.setBounds(148, 59, 124, 174);
			JLabel lblAdc = new JLabel("Choose Your ADC");
			adc.add(lblAdc);
			
			JRadioButton rdbtnJinx = new JRadioButton("Jinx");
			adc.add(rdbtnJinx);
			
			JRadioButton rdbtnKalista = new JRadioButton("Kalista");
			adc.add(rdbtnKalista);
			
			JRadioButton rdbtnCaitlyn = new JRadioButton("Caitlyn");
			adc.add(rdbtnCaitlyn);
			
			JRadioButton rdbtnEzreal = new JRadioButton("Ezreal");
			adc.add(rdbtnEzreal);
			frame.revalidate();
		
	
	
			
			
		JRadioButton rdbtnAdc = new JRadioButton("ADC");
		rdbtnAdc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				adc.setVisible(true);
				mid.setVisible(false);
				jungler.setVisible(false);
				top.setVisible(false);
				support.setVisible(false);
				
				 
				
				
			}
				
			}
		);
		rdbtnAdc.setSelected(true);
		rdbtnAdc.setBounds(10, 74, 91, 23);

		frame.getContentPane().add(rdbtnAdc);
		
		
		
		JRadioButton rdbtnMid = new JRadioButton("Mid");
		rdbtnMid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				
				
				mid.setBounds(147, 54, 114, 171);
				adc.setVisible(false);
				mid.setVisible(true);
				jungler.setVisible(false);
				top.setVisible(false);
				support.setVisible(false);
				frame.getContentPane().add(mid);
				
				JLabel lblChooseMid = new JLabel("Choose Mid");
				mid.add(lblChooseMid);
				
				JRadioButton rdbtnAhri = new JRadioButton("Ahri       ");
				mid.add(rdbtnAhri);
				
				JRadioButton rdbtnKatarina = new JRadioButton("Katarina");
				mid.add(rdbtnKatarina);
				
				JRadioButton rdbtnNewRadioButton = new JRadioButton("Azir       ");
				mid.add(rdbtnNewRadioButton);
				
				JRadioButton rdbtnVelkoz = new JRadioButton("Velkoz   ");
				mid.add(rdbtnVelkoz);
				frame.revalidate();
		
			}
			
		}
	);
			
		rdbtnMid.setBounds(10, 100, 91, 23);
		frame.getContentPane().add(rdbtnMid);
		
		
		JRadioButton rdbtnJungler = new JRadioButton("Jungler");
		rdbtnJungler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				adc.setBounds(148, 59, 124, 174);
				adc.setVisible(false);
				mid.setVisible(false);
				jungler.setVisible(true);
				top.setVisible(false);
				support.setVisible(false);
				
				jungler.setBounds(147, 54, 114, 171);
				frame.getContentPane().add(jungler);
				
				JLabel lblChooseJungler = new JLabel("Choose Jungler");
				jungler.add(lblChooseJungler);
				
				JRadioButton rdbtnJarvan = new JRadioButton("Jarvan IV    ");
				jungler.add(rdbtnJarvan);
				
				JRadioButton rdbtnFiddlesticks = new JRadioButton("Fiddlesticks");
				jungler.add(rdbtnFiddlesticks);
				
				JRadioButton rdbtnVi = new JRadioButton("Vi                   ");
				jungler.add(rdbtnVi);
				
				JRadioButton rdbtnSejuani = new JRadioButton("Sejuani        ");
				jungler.add(rdbtnSejuani);
				frame.revalidate();
		
			}
			
		}
	);
		rdbtnJungler.setBounds(10, 126, 91, 23);
		frame.getContentPane().add(rdbtnJungler);
		
		
		JRadioButton rdbtnSupport = new JRadioButton("Support");
		rdbtnSupport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				adc.setBounds(148, 59, 124, 174);
				adc.setVisible(false);
				mid.setVisible(false);
				jungler.setVisible(false);
				top.setVisible(false);
				support.setVisible(true);
				
				support.setBounds(147, 54, 114, 171);
				frame.getContentPane().add(support);
				
				JLabel lblChooseSupport = new JLabel("Choose Support");
				support.add(lblChooseSupport);
				
				JRadioButton rdbtnJanna = new JRadioButton("Janna       ");
				support.add(rdbtnJanna);
				
				JRadioButton rdbtnLeona = new JRadioButton("Leona       ");
				support.add(rdbtnLeona);
				
				JRadioButton rdbtnSona = new JRadioButton("Sona         ");
				support.add(rdbtnSona);
				
				JRadioButton rdbtnNami = new JRadioButton("Nami        ");
				support.add(rdbtnNami);
				frame.revalidate();
		
			}
			
		}
	);
		rdbtnSupport.setBounds(10, 152, 91, 23);
		frame.getContentPane().add(rdbtnSupport);
		
		
		JRadioButton rdbtnTop = new JRadioButton("Top");
		rdbtnTop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				adc.setBounds(148, 59, 124, 174);
				adc.setVisible(false);
				mid.setVisible(false);
				jungler.setVisible(false);
				top.setVisible(true);
				support.setVisible(false);
			
				top.setBounds(147, 54, 114, 171);
				frame.getContentPane().add(top);
				
				JLabel lblChooseTop = new JLabel("Choose Top");
				top.add(lblChooseTop);
				
				JRadioButton rdbtnJarvan = new JRadioButton("Jarvan IV       ");
				top.add(rdbtnJarvan);
				
				JRadioButton rdbtnSion = new JRadioButton("Sion                 ");
				top.add(rdbtnSion);
				
				JRadioButton rdbtnRiven = new JRadioButton("Riven               ");
				top.add(rdbtnRiven);
				
				JRadioButton rdbtnGangplank = new JRadioButton("Gangplank     ");
				top.add(rdbtnGangplank);
				frame.revalidate();
		
			}
			
		}
	);
		rdbtnTop.setBounds(10, 178, 91, 23);
		frame.getContentPane().add(rdbtnTop);
		ButtonGroup roles= new ButtonGroup();
		roles.add(rdbtnAdc);
		roles.add(rdbtnMid);
		roles.add(rdbtnSupport);
		roles.add(rdbtnJungler);
		roles.add(rdbtnTop);
		frame.revalidate();
		
		JButton btnSelect = new JButton("Select");
		btnSelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSelect.setBounds(10, 208, 89, 23);
		frame.getContentPane().add(btnSelect);
		
		JLabel lblChooseYour = new JLabel("Choose Role");
		lblChooseYour.setBounds(10, 17, 91, 38);
		frame.getContentPane().add(lblChooseYour);
		
		JLabel lblNewLabel = new JLabel("Choose Champion");
		lblNewLabel.setBounds(158, 25, 114, 23);
		frame.getContentPane().add(lblNewLabel);
		
		
		generateHash();
		
		
		System.out.print(lolChamp.get("Ezreal"));
		

}
}

