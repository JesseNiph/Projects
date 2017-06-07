package designer;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JMenuBar;

/**
 * 
 * @author Jesse
 *
 */
public class InterfaceMenu {
    
	lolChar tempChar = new lolChar();
	
	String line;
	BufferedReader br = null;
	JSpinner qspinner;
	JSpinner wspinner;
	JSpinner espinner;
	JSpinner rspinner;
	JPanel adc;
	JPanel mid;
	JPanel support;
	JPanel jungler;
	JPanel top;
	JOptionPane Ezreal;
	JOptionPane Caitlyn;
	JOptionPane Kalista;
	JOptionPane Jinx;
	JOptionPane Ahri;
	JOptionPane Azir;
	JOptionPane Katarina;
	JOptionPane Velkoz;
	JOptionPane Jarvan;
	JOptionPane Sejuani;
	JOptionPane Vi;
	JOptionPane Fiddlesticks;
	JOptionPane Sona;
	JOptionPane Nami;
	JOptionPane Janna;
	JOptionPane Leona;
	JOptionPane Sion;
	JOptionPane Riven;
	JOptionPane Gangplank;
	String qCurrentValue;
	String eCurrentValue;
	String wCurrentValue;
	String rCurrentValue;
	String qValue;
	String eValue;
	String wValue;
	String rValue;
	JTextField qText;
	JTextField wText;
	JTextField eText;
	JTextField rText;
	JButton btnSave;
	
	
	HashMap<String,lolChar> lolChamp = new HashMap<String,lolChar>();
	
	/**
	 * This method is used to write out and print the data to an external file
	 * @throws IOException
	 */
	public void writeOut() throws IOException{
		File characters = new File("C:/Users/Jesse/My Documents/characters.txt");
	
		if(!characters.exists()){
		    characters.createNewFile();
		}
		
		FileWriter fW = new FileWriter(characters.getAbsoluteFile());
		PrintWriter pW = new PrintWriter(fW);
		
		Iterator iterator = lolChamp.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry mapEntry = (Map.Entry) iterator.next();
			//System.out.println("The key is: " + mapEntry.getKey()
					//+ ",value is :" + mapEntry.getValue());
			pW.printf("The key is: " + mapEntry.getKey()
				+ ",value is :" + mapEntry.getValue());
		}
		        pW.close();
		       
		    }
	
	
		
	
	/**
	 * This Method is used to generate the hashmap by reading in a file tokenizing it and sending them all to the hashmap
	 */
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
		frame.setBounds(100, 100, 603, 305);
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
			
			final JRadioButton rdbtnJinx = new JRadioButton("Jinx");
			adc.add(rdbtnJinx);
			
			final JRadioButton rdbtnKalista = new JRadioButton("Kalista");
			adc.add(rdbtnKalista);
			
			final JRadioButton rdbtnCaitlyn = new JRadioButton("Caitlyn");
			adc.add(rdbtnCaitlyn);
			
			final JRadioButton rdbtnEzreal = new JRadioButton("Ezreal");
			adc.add(rdbtnEzreal);
			frame.revalidate();
			
			//Mid Panel
			frame.getContentPane().add(mid);
			mid.setBounds(147, 54, 114, 171);
			JLabel lblChooseMid = new JLabel("Choose Mid");
			mid.add(lblChooseMid);
			
			final JRadioButton rdbtnAhri = new JRadioButton("Ahri       ");
			mid.add(rdbtnAhri);
			
			final JRadioButton rdbtnKatarina = new JRadioButton("Katarina");
			mid.add(rdbtnKatarina);
			
			final JRadioButton rdbtnAzir = new JRadioButton("Azir       ");
			mid.add(rdbtnAzir);
			
			final JRadioButton rdbtnVelkoz = new JRadioButton("Velkoz   ");
			mid.add(rdbtnVelkoz);
			frame.revalidate();
			
			//support panel
			
	
			adc.setBounds(148, 59, 124, 174);
			support.setBounds(147, 54, 114, 171);
			frame.getContentPane().add(support);
			
			JLabel lblChooseSupport = new JLabel("Choose Support");
			support.add(lblChooseSupport);
			
			final JRadioButton rdbtnJanna = new JRadioButton("Janna       ");
			support.add(rdbtnJanna);
			
			final JRadioButton rdbtnLeona = new JRadioButton("Leona       ");
			support.add(rdbtnLeona);
			
			final JRadioButton rdbtnSona = new JRadioButton("Sona         ");
			support.add(rdbtnSona);
			
			final JRadioButton rdbtnNami = new JRadioButton("Nami        ");
			support.add(rdbtnNami);
			frame.revalidate();
	
			//Jungler Panel

			adc.setBounds(148, 59, 124, 174);
			jungler.setBounds(147, 54, 114, 171);
			frame.getContentPane().add(jungler);
			
			JLabel lblChooseJungler = new JLabel("Choose Jungler");
			jungler.add(lblChooseJungler);
			
			final JRadioButton rdbtnJarvan = new JRadioButton("Jarvan IV    ");
			jungler.add(rdbtnJarvan);
			
			final JRadioButton rdbtnFiddlesticks = new JRadioButton("Fiddlesticks");
			jungler.add(rdbtnFiddlesticks);
			
			final JRadioButton rdbtnVi = new JRadioButton("Vi                   ");
			jungler.add(rdbtnVi);
			
			final JRadioButton rdbtnSejuani = new JRadioButton("Sejuani        ");
			jungler.add(rdbtnSejuani);
			frame.revalidate();
			
			//Top Panel
			
			top.setBounds(147, 54, 114, 171);
			frame.getContentPane().add(top);
			
			final JLabel lblChooseTop = new JLabel("Choose Top");
			top.add(lblChooseTop);
			
			final JRadioButton rdbtnJarvan2 = new JRadioButton("Jarvan IV       ");
			top.add(rdbtnJarvan2);
			
			final JRadioButton rdbtnSion = new JRadioButton("Sion                 ");
			top.add(rdbtnSion);
			
			final JRadioButton rdbtnRiven = new JRadioButton("Riven               ");
			top.add(rdbtnRiven);
			
			final JRadioButton rdbtnGangplank = new JRadioButton("Gangplank     ");
			top.add(rdbtnGangplank);
			frame.revalidate();
			
			//Spinners
			JPanel panel = new JPanel();
			panel.setBounds(315, 60, 166, 195);
			frame.getContentPane().add(panel);
			
			JLabel lblChooseQLevel = new JLabel("Choose Q Level");
			panel.add(lblChooseQLevel);
			
			qText = new JTextField();
			qText.setText("Enter 1-5");
			panel.add(qText);
			qText.setColumns(10);
			
			
			
			
			//qspinner = new JSpinner();
			//qspinner.setModel(new SpinnerNumberModel(0, 0, 5, 1));
			//panel.add(qspinner);
			//Integer qCurrentValue = (Integer) qspinner.getValue();
			//qValue = qCurrentValue.toString();
			//System.out.println(qValue);
			//tempChar.setqStat(qValue);
			
			     
			
			
			JLabel lblChooseWLevel = new JLabel("Choose W Level");
			panel.add(lblChooseWLevel);
			
			wText = new JTextField();
			wText.setText("Enter 1-5");
			panel.add(wText);
			wText.setColumns(10);
			
			//wspinner = new JSpinner();
		//	wspinner.setModel(new SpinnerNumberModel(0, 0, 5, 1));
			//panel.add(wspinner);
			//Integer wCurrentValue = (Integer)wspinner.getValue();
			//wValue = wCurrentValue.toString();
			//tempChar.setwStat(wValue);
			
			
			JLabel lblChooseELevel = new JLabel("Choose E Level");
			panel.add(lblChooseELevel);
			
			eText = new JTextField();
			eText.setText("Enter 1-5");
			panel.add(eText);
			eText.setColumns(10);
			
			//espinner = new JSpinner();
			//espinner.setModel(new SpinnerNumberModel(0, 0, 5, 1));
			//panel.add(espinner);
			//Integer eCurrentValue = (Integer)espinner.getValue();
			//eValue = eCurrentValue.toString();
			//tempChar.seteStat(eValue);
			JLabel lblChooseRLevel = new JLabel("Choose R Level");
			panel.add(lblChooseRLevel);
			
			rText = new JTextField();
			rText.setText("Enter 1-3");
			panel.add(rText);
			rText.setColumns(10);
			
			//rspinner = new JSpinner();
			//rspinner.setModel(new SpinnerNumberModel(0, 0, 3, 1));
			//panel.add(rspinner);
			//Integer rCurrentValue = (Integer)rspinner.getValue();
			//rValue = rCurrentValue.toString();
			//tempChar.setrStat(rValue);
			
			JLabel lblChooseAbilityLevel = new JLabel("  Choose Ability Level");
			lblChooseAbilityLevel.setBounds(356, 11, 117, 14);
			frame.getContentPane().add(lblChooseAbilityLevel);
	
			
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
			
				
				
				
				adc.setVisible(false);
				mid.setVisible(true);
				jungler.setVisible(false);
				top.setVisible(false);
				support.setVisible(false);
			
		
			}
			
		}
	);
			
		rdbtnMid.setBounds(10, 100, 91, 23);
		frame.getContentPane().add(rdbtnMid);
		
		
		JRadioButton rdbtnJungler = new JRadioButton("Jungler");
		rdbtnJungler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				adc.setVisible(false);
				mid.setVisible(false);
				jungler.setVisible(true);
				top.setVisible(false);
				support.setVisible(false);

		
			}
			
		}
	);
		rdbtnJungler.setBounds(10, 126, 91, 23);
		frame.getContentPane().add(rdbtnJungler);
		
		
		JRadioButton rdbtnSupport = new JRadioButton("Support");
		rdbtnSupport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				
				adc.setVisible(false);
				mid.setVisible(false);
				jungler.setVisible(false);
				top.setVisible(false);
				support.setVisible(true);
				
			}
			
		}
	);
		rdbtnSupport.setBounds(10, 152, 91, 23);
		frame.getContentPane().add(rdbtnSupport);
		
		
		JRadioButton rdbtnTop = new JRadioButton("Top");
		rdbtnTop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				
				adc.setVisible(false);
				mid.setVisible(false);
				jungler.setVisible(false);
				top.setVisible(true);
				support.setVisible(false);
				
				
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
    /**
     * action listener used to take set all the info once the select button is clicked
     */
		btnSelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtnEzreal.isSelected()){
					
					
					if(qText.getText().equals("1")){
					
					lolChamp.get("Ezreal").setqStat("1");
					}
					
					else if(qText.getText().equals("2")){
						
						lolChamp.get("Ezreal").setqStat("2");
						}
					else if(qText.getText().equals("3")){
						
						lolChamp.get("Ezreal").setqStat("3");
						}
					else if(qText.getText().equals("4")){
						
						lolChamp.get("Ezreal").setqStat("5");
						}
					else 
					{
						System.out.print("Must be between 1 and 5");
						
					}
					 
					
					 if(wText.getText().equals("1")){
							
							lolChamp.get("Ezreal").setwStat("1");
							}
							
					 else if(wText.getText().equals("2")){
								
								lolChamp.get("Ezreal").setwStat("2");
								}
					 else if(wText.getText().equals("3")){
								
								lolChamp.get("Ezreal").setwStat("3");
								}
					 else if(wText.getText().equals("4")){
								
								lolChamp.get("Ezreal").setwStat("5");
								}
					 
					 else
					 {
						 System.out.print("must between 1 and 5");
					 }
					 
					
					 
					 if(eText.getText().equals("1")){
							
							lolChamp.get("Ezreal").seteStat("1");
							}
							
					 else if(eText.getText().equals("2")){
								
								lolChamp.get("Ezreal").seteStat("2");
								}
					 else if(eText.getText().equals("3")){
								
								lolChamp.get("Ezreal").seteStat("3");
								}
					 else if(eText.getText().equals("4")){
								
								lolChamp.get("Ezreal").seteStat("5");
								}
					 
					 else
					 {
						 System.out.print("must between 1 and 5");
					 }
					 
					
					 if(rText.getText().equals("1")){
							
							lolChamp.get("Ezreal").setrStat("1");
							}
							
					 else if(rText.getText().equals("2")){
								
								lolChamp.get("Ezreal").setrStat("2");
								}
					 else if(wText.getText().equals("3")){
						 lolChamp.get("Ezreal").setrStat("3");
					 }
					 
					 else
					 {
						 System.out.print("must between 1 and 3");
					 }
					 
			     	System.out.print(tempChar);
					JOptionPane.showMessageDialog(frame,
					       lolChamp.get("Ezreal"));
				
					 
					
				}
					else if(rdbtnCaitlyn.isSelected()){
						
						
						
						if(qText.getText().equals("1")){
						
						lolChamp.get("Caitlyn").setqStat("1");
						}
						
						else if(qText.getText().equals("2")){
							
							lolChamp.get("Caitlyn").setqStat("2");
							}
						else if(qText.getText().equals("3")){
							
							lolChamp.get("Caitlyn").setqStat("3");
							}
						else if(qText.getText().equals("4")){
							
							lolChamp.get("Caitlyn").setqStat("5");
							}
						else 
						{
							System.out.print("Must be between 1 and 5");
							
						}
						 
						
						 if(wText.getText().equals("1")){
								
								lolChamp.get("Caitlyn").setwStat("1");
								}
								
						 else if(wText.getText().equals("2")){
									
									lolChamp.get("Caitlyn").setwStat("2");
									}
						 else if(wText.getText().equals("3")){
									
									lolChamp.get("Caitlyn").setwStat("3");
									}
						 else if(wText.getText().equals("4")){
									
									lolChamp.get("Caitlyn").setwStat("5");
									}
						 
						 else
						 {
							 System.out.print("must between 1 and 5");
						 }
						 
						
						 
						 if(eText.getText().equals("1")){
								
								lolChamp.get("Caitlyn").seteStat("1");
								}
								
						 else if(eText.getText().equals("2")){
									
									lolChamp.get("Caitlyn").seteStat("2");
									}
						 else if(eText.getText().equals("3")){
									
									lolChamp.get("Caitlyn").seteStat("3");
									}
						 else if(eText.getText().equals("4")){
									
									lolChamp.get("Caitlyn").seteStat("5");
									}
						 
						 else
						 {
							 System.out.print("must between 1 and 5");
						 }
						 
						
						 if(rText.getText().equals("1")){
								
								lolChamp.get("Caitlyn").setrStat("1");
								}
								
						 else if(rText.getText().equals("2")){
									
									lolChamp.get("Caitlyn").setrStat("2");
									}
						 else if(wText.getText().equals("3")){
							 lolChamp.get("Caitlyn").setrStat("3");
							 
						 }
						 
						 else
						 {
							 System.out.print("must between 1 and 3");
						 }
						 
				     	
					 JOptionPane.showMessageDialog(frame,
							 tempChar= lolChamp.get("Caitlyn"));
					 		
						
						
					}
					else if(rdbtnKalista.isSelected()){
						
						
						if(qText.getText().equals("1")){
						
						lolChamp.get("Kalista").setqStat("1");
						}
						
						else if(qText.getText().equals("2")){
							
							lolChamp.get("Kalista").setqStat("2");
							}
						else if(qText.getText().equals("3")){
							
							lolChamp.get("Kalista").setqStat("3");
							}
						else if(qText.getText().equals("4")){
							
							lolChamp.get("Kalista").setqStat("5");
							}
						else 
						{
							System.out.print("Must be between 1 and 5");
							
						}
						 
						
						 if(wText.getText().equals("1")){
								
								lolChamp.get("Kalista").setwStat("1");
								}
								
						 else if(wText.getText().equals("2")){
									
									lolChamp.get("Kalista").setwStat("2");
									}
						 else if(wText.getText().equals("3")){
									
									lolChamp.get("Kalista").setwStat("3");
									}
						 else if(wText.getText().equals("4")){
									
									lolChamp.get("Kalista").setwStat("5");
									}
						 
						 else
						 {
							 System.out.print("must between 1 and 5");
						 }
						 
						
						 
						 if(eText.getText().equals("1")){
								
								lolChamp.get("Kalista").seteStat("1");
								}
								
						 else if(eText.getText().equals("2")){
									
									lolChamp.get("Kalista").seteStat("2");
									}
						 else if(eText.getText().equals("3")){
									
									lolChamp.get("Kalista").seteStat("3");
									}
						 else if(eText.getText().equals("4")){
									
									lolChamp.get("Kalista").seteStat("5");
									}
						 
						 else
						 {
							 System.out.print("must between 1 and 5");
						 }
						 
						
						 if(rText.getText().equals("1")){
								
								lolChamp.get("Kalista").setrStat("1");
								}
								
						 else if(rText.getText().equals("2")){
									
									lolChamp.get("Kalista").setrStat("2");
									}
						 else if(wText.getText().equals("3")){
							 lolChamp.get("Kalista").setrStat("3");
							 
						 }
						 
						 else
						 {
							 System.out.print("must between 1 and 3");
						 }
						
						 JOptionPane.showMessageDialog(frame,
								 tempChar=  lolChamp.get("Kalista"));
						
							
						}
					else if(rdbtnJinx.isSelected()){
						
						if(qText.getText().equals("1")){
							
							lolChamp.get("Jinx").setqStat("1");
							}
							
							else if(qText.getText().equals("2")){
								
								lolChamp.get("Jinx").setqStat("2");
								}
							else if(qText.getText().equals("3")){
								
								lolChamp.get("Jinx").setqStat("3");
								}
							else if(qText.getText().equals("4")){
								
								lolChamp.get("Jinx").setqStat("5");
								}
							else 
							{
								System.out.print("Must be between 1 and 5");
								
							}
							 
							
							 if(wText.getText().equals("1")){
									
									lolChamp.get("Jinx").setwStat("1");
									}
									
							 else if(wText.getText().equals("2")){
										
										lolChamp.get("Jinx").setwStat("2");
										}
							 else if(wText.getText().equals("3")){
										
										lolChamp.get("Jinx").setwStat("3");
										}
							 else if(wText.getText().equals("4")){
										
										lolChamp.get("Jinx").setwStat("5");
										}
							 
							 else
							 {
								 System.out.print("must between 1 and 5");
							 }
							 
							
							 
							 if(eText.getText().equals("1")){
									
									lolChamp.get("Jinx").seteStat("1");
									}
									
							 else if(eText.getText().equals("2")){
										
										lolChamp.get("Jinx").seteStat("2");
										}
							 else if(eText.getText().equals("3")){
										
										lolChamp.get("Jinx").seteStat("3");
										}
							 else if(eText.getText().equals("4")){
										
										lolChamp.get("Jinx").seteStat("5");
										}
							 
							 else
							 {
								 System.out.print("must between 1 and 5");
							 }
							 
							
							 if(rText.getText().equals("1")){
									
									lolChamp.get("Jinx").setrStat("1");
									}
									
							 else if(rText.getText().equals("2")){
										
										lolChamp.get("Jinx").setrStat("2");
										}
							 else if(wText.getText().equals("3")){
								 lolChamp.get("Jinx").setrStat("3");
								 
							 }
							 
							 else
							 {
								 System.out.print("must between 1 and 3");
							 }
							 
						 JOptionPane.showMessageDialog(frame,
								 tempChar=   lolChamp.get("Jinx"));
						 
							
						}
				
					else if(rdbtnVelkoz.isSelected()){
						
						if(qText.getText().equals("1")){
							
							lolChamp.get("Velkoz").setqStat("1");
							}
							
							else if(qText.getText().equals("2")){
								
								lolChamp.get("Velkoz").setqStat("2");
								}
							else if(qText.getText().equals("3")){
								
								lolChamp.get("Velkoz").setqStat("3");
								}
							else if(qText.getText().equals("4")){
								
								lolChamp.get("Velkoz").setqStat("5");
								}
							else 
							{
								System.out.print("Must be between 1 and 5");
								
							}
							 
							
							 if(wText.getText().equals("1")){
									
									lolChamp.get("Velkoz").setwStat("1");
									}
									
							 else if(wText.getText().equals("2")){
										
										lolChamp.get("Velkoz").setwStat("2");
										}
							 else if(wText.getText().equals("3")){
										
										lolChamp.get("Velkoz").setwStat("3");
										}
							 else if(wText.getText().equals("4")){
										
										lolChamp.get("Velkoz").setwStat("5");
										}
							 
							 else
							 {
								 System.out.print("must between 1 and 5");
							 }
							 
							
							 
							 if(eText.getText().equals("1")){
									
									lolChamp.get("Velkoz").seteStat("1");
									}
									
							 else if(eText.getText().equals("2")){
										
										lolChamp.get("Velkoz").seteStat("2");
										}
							 else if(eText.getText().equals("3")){
										
										lolChamp.get("Velkoz").seteStat("3");
										}
							 else if(eText.getText().equals("4")){
										
										lolChamp.get("Velkoz").seteStat("5");
										}
							 
							 else
							 {
								 System.out.print("must between 1 and 5");
							 }
							 
							
							 if(rText.getText().equals("1")){
									
									lolChamp.get("Velkoz").setrStat("1");
									}
									
							 else if(rText.getText().equals("2")){
										
										lolChamp.get("Velkoz").setrStat("2");
										}
							 else if(wText.getText().equals("3")){
								 lolChamp.get("Velkoz").setrStat("3");
							 }
							 
							 else
							 {
								 System.out.print("must between 1 and 3");
							 }
						 JOptionPane.showMessageDialog(frame,
								 tempChar= lolChamp.get("Velkoz"));
					
							
						}
						else if(rdbtnKatarina.isSelected()){
							
							if(qText.getText().equals("1")){
								
								lolChamp.get("Katarina").setqStat("1");
								}
								
								else if(qText.getText().equals("2")){
									
									lolChamp.get("Katarina").setqStat("2");
									}
								else if(qText.getText().equals("3")){
									
									lolChamp.get("Katarina").setqStat("3");
									}
								else if(qText.getText().equals("4")){
									
									lolChamp.get("Katarina").setqStat("5");
									}
								else 
								{
									System.out.print("Must be between 1 and 5");
									
								}
								 
								
								 if(wText.getText().equals("1")){
										
										lolChamp.get("Katarina").setwStat("1");
										}
										
								 else if(wText.getText().equals("2")){
											
											lolChamp.get("Katarina").setwStat("2");
											}
								 else if(wText.getText().equals("3")){
											
											lolChamp.get("Katarina").setwStat("3");
											}
								 else if(wText.getText().equals("4")){
											
											lolChamp.get("Katarina").setwStat("5");
											}
								 
								 else
								 {
									 System.out.print("must between 1 and 5");
								 }
								 
								
								 
								 if(eText.getText().equals("1")){
										
										lolChamp.get("Katarina").seteStat("1");
										}
										
								 else if(eText.getText().equals("2")){
											
											lolChamp.get("Katarina").seteStat("2");
											}
								 else if(eText.getText().equals("3")){
											
											lolChamp.get("Katarina").seteStat("3");
											}
								 else if(eText.getText().equals("4")){
											
											lolChamp.get("Katarina").seteStat("5");
											}
								 
								 else
								 {
									 System.out.print("must between 1 and 5");
								 }
								 
								
								 if(rText.getText().equals("1")){
										
										lolChamp.get("Katarina").setrStat("1");
										}
										
								 else if(rText.getText().equals("2")){
											
											lolChamp.get("Katarina").setrStat("2");
											}
								 else if(wText.getText().equals("3")){
									 lolChamp.get("Katarina").setrStat("3");
								 }
								 
								 else
								 {
									 System.out.print("must between 1 and 3");
								 }
							 JOptionPane.showMessageDialog(frame,
									 tempChar=   lolChamp.get("Katarina"));
							
							
							}
						else if(rdbtnAhri.isSelected()){
							
							if(qText.getText().equals("1")){
								
								lolChamp.get("Ahri").setqStat("1");
								}
								
								else if(qText.getText().equals("2")){
									
									lolChamp.get("Ahri").setqStat("2");
									}
								else if(qText.getText().equals("3")){
									
									lolChamp.get("Ahri").setqStat("3");
									}
								else if(qText.getText().equals("4")){
									
									lolChamp.get("Ahri").setqStat("5");
									}
								else 
								{
									System.out.print("Must be between 1 and 5");
									
								}
								 
								
								 if(wText.getText().equals("1")){
										
										lolChamp.get("Ahri").setwStat("1");
										}
										
								 else if(wText.getText().equals("2")){
											
											lolChamp.get("Ahri").setwStat("2");
											}
								 else if(wText.getText().equals("3")){
											
											lolChamp.get("Ahri").setwStat("3");
											}
								 else if(wText.getText().equals("4")){
											
											lolChamp.get("Ahri").setwStat("5");
											}
								 
								 else
								 {
									 System.out.print("must between 1 and 5");
								 }
								 
								
								 
								 if(eText.getText().equals("1")){
										
										lolChamp.get("Ahri").seteStat("1");
										}
										
								 else if(eText.getText().equals("2")){
											
											lolChamp.get("Ahri").seteStat("2");
											}
								 else if(eText.getText().equals("3")){
											
											lolChamp.get("Ahri").seteStat("3");
											}
								 else if(eText.getText().equals("4")){
											
											lolChamp.get("Ahri").seteStat("5");
											}
								 
								 else
								 {
									 System.out.print("must between 1 and 5");
								 }
								 
								
								 if(rText.getText().equals("1")){
										
										lolChamp.get("Ahri").setrStat("1");
										}
										
								 else if(rText.getText().equals("2")){
											
											lolChamp.get("Ahri").setrStat("2");
											}
								 else if(wText.getText().equals("3")){
									 lolChamp.get("Ahri").setrStat("3");
								 }
								 
								 else
								 {
									 System.out.print("must between 1 and 3");
								 }
							 JOptionPane.showMessageDialog(frame,
									 tempChar=   lolChamp.get("Ahri"));
						
								
							}
				
						else if(rdbtnAzir.isSelected()){
							if(qText.getText().equals("1")){
								
								lolChamp.get("Azir").setqStat("1");
								}
								
								else if(qText.getText().equals("2")){
									
									lolChamp.get("Azir").setqStat("2");
									}
								else if(qText.getText().equals("3")){
									
									lolChamp.get("Azir").setqStat("3");
									}
								else if(qText.getText().equals("4")){
									
									lolChamp.get("Azir").setqStat("5");
									}
								else 
								{
									System.out.print("Must be between 1 and 5");
									
								}
								 
								
								 if(wText.getText().equals("1")){
										
										lolChamp.get("Azir").setwStat("1");
										}
										
								 else if(wText.getText().equals("2")){
											
											lolChamp.get("Azir").setwStat("2");
											}
								 else if(wText.getText().equals("3")){
											
											lolChamp.get("Azir").setwStat("3");
											}
								 else if(wText.getText().equals("4")){
											
											lolChamp.get("Azir").setwStat("5");
											}
								 
								 else
								 {
									 System.out.print("must between 1 and 5");
								 }
								 
								
								 
								 if(eText.getText().equals("1")){
										
										lolChamp.get("Azir").seteStat("1");
										}
										
								 else if(eText.getText().equals("2")){
											
											lolChamp.get("Azir").seteStat("2");
											}
								 else if(eText.getText().equals("3")){
											
											lolChamp.get("Azir").seteStat("3");
											}
								 else if(eText.getText().equals("4")){
											
											lolChamp.get("Azir").seteStat("5");
											}
								 
								 else
								 {
									 System.out.print("must between 1 and 5");
								 }
								 
								
								 if(rText.getText().equals("1")){
										
										lolChamp.get("Azir").setrStat("1");
										}
										
								 else if(rText.getText().equals("2")){
											
											lolChamp.get("Azir").setrStat("2");
											}
								 else if(wText.getText().equals("3")){
									 lolChamp.get("Azir").setrStat("3");
								 }
								 
								 else
								 {
									 System.out.print("must between 1 and 3");
								 }
							 JOptionPane.showMessageDialog(frame,
									 tempChar=  lolChamp.get("Azir"));
							
								
							}
							else if(rdbtnNami.isSelected()){
								if(qText.getText().equals("1")){
									
									lolChamp.get("Nami").setqStat("1");
									}
									
									else if(qText.getText().equals("2")){
										
										lolChamp.get("Nami").setqStat("2");
										}
									else if(qText.getText().equals("3")){
										
										lolChamp.get("Nami").setqStat("3");
										}
									else if(qText.getText().equals("4")){
										
										lolChamp.get("Nami").setqStat("5");
										}
									else 
									{
										System.out.print("Must be between 1 and 5");
										
									}
									 
									
									 if(wText.getText().equals("1")){
											
											lolChamp.get("Nami").setwStat("1");
											}
											
									 else if(wText.getText().equals("2")){
												
												lolChamp.get("Nami").setwStat("2");
												}
									 else if(wText.getText().equals("3")){
												
												lolChamp.get("Nami").setwStat("3");
												}
									 else if(wText.getText().equals("4")){
												
												lolChamp.get("Nami").setwStat("5");
												}
									 
									 else
									 {
										 System.out.print("must between 1 and 5");
									 }
									 
									
									 
									 if(eText.getText().equals("1")){
											
											lolChamp.get("Nami").seteStat("1");
											}
											
									 else if(eText.getText().equals("2")){
												
												lolChamp.get("Nami").seteStat("2");
												}
									 else if(eText.getText().equals("3")){
												
												lolChamp.get("Nami").seteStat("3");
												}
									 else if(eText.getText().equals("4")){
												
												lolChamp.get("Nami").seteStat("5");
												}
									 
									 else
									 {
										 System.out.print("must between 1 and 5");
									 }
									 
									
									 if(rText.getText().equals("1")){
											
											lolChamp.get("Nami").setrStat("1");
											}
											
									 else if(rText.getText().equals("2")){
												
												lolChamp.get("Nami").setrStat("2");
												}
									 else if(wText.getText().equals("3")){
										 lolChamp.get("Nami").setrStat("3");
									 }
									 
									 else
									 {
										 System.out.print("must between 1 and 3");
									 }
								 JOptionPane.showMessageDialog(frame,
										 tempChar=  lolChamp.get("Nami"));
								
									
								}
							else if(rdbtnSona.isSelected()){
								if(qText.getText().equals("1")){
									
									lolChamp.get("Sona").setqStat("1");
									}
									
									else if(qText.getText().equals("2")){
										
										lolChamp.get("Sona").setqStat("2");
										}
									else if(qText.getText().equals("3")){
										
										lolChamp.get("Sona").setqStat("3");
										}
									else if(qText.getText().equals("4")){
										
										lolChamp.get("Sona").setqStat("5");
										}
									else 
									{
										System.out.print("Must be between 1 and 5");
										
									}
									 
									
									 if(wText.getText().equals("1")){
											
											lolChamp.get("Sona").setwStat("1");
											}
											
									 else if(wText.getText().equals("2")){
												
												lolChamp.get("Sona").setwStat("2");
												}
									 else if(wText.getText().equals("3")){
												
												lolChamp.get("Sona").setwStat("3");
												}
									 else if(wText.getText().equals("4")){
												
												lolChamp.get("Sona").setwStat("5");
												}
									 
									 else
									 {
										 System.out.print("must between 1 and 5");
									 }
									 
									
									 
									 if(eText.getText().equals("1")){
											
											lolChamp.get("Sona").seteStat("1");
											}
											
									 else if(eText.getText().equals("2")){
												
												lolChamp.get("Sona").seteStat("2");
												}
									 else if(eText.getText().equals("3")){
												
												lolChamp.get("Sona").seteStat("3");
												}
									 else if(eText.getText().equals("4")){
												
												lolChamp.get("Sona").seteStat("5");
												}
									 
									 else
									 {
										 System.out.print("must between 1 and 5");
									 }
									 
									
									 if(rText.getText().equals("1")){
											
											lolChamp.get("Sona").setrStat("1");
											}
											
									 else if(rText.getText().equals("2")){
												
												lolChamp.get("Sona").setrStat("2");
												}
									 else if(wText.getText().equals("3")){
										 lolChamp.get("Sona").setrStat("3");
									 }
									 
									 else
									 {
										 System.out.print("must between 1 and 3");
									 }
								 JOptionPane.showMessageDialog(frame,
										 tempChar= lolChamp.get("Sona"));
								
									
								}
				
							else if(rdbtnLeona.isSelected()){
								if(qText.getText().equals("1")){
									
									lolChamp.get("Leona").setqStat("1");
									}
									
									else if(qText.getText().equals("2")){
										
										lolChamp.get("Leona").setqStat("2");
										}
									else if(qText.getText().equals("3")){
										
										lolChamp.get("Leona").setqStat("3");
										}
									else if(qText.getText().equals("4")){
										
										lolChamp.get("Leona").setqStat("5");
										}
									else 
									{
										System.out.print("Must be between 1 and 5");
										
									}
									 
									
									 if(wText.getText().equals("1")){
											
											lolChamp.get("Leona").setwStat("1");
											}
											
									 else if(wText.getText().equals("2")){
												
												lolChamp.get("Leona").setwStat("2");
												}
									 else if(wText.getText().equals("3")){
												
												lolChamp.get("Leona").setwStat("3");
												}
									 else if(wText.getText().equals("4")){
												
												lolChamp.get("Leona").setwStat("5");
												}
									 
									 else
									 {
										 System.out.print("must between 1 and 5");
									 }
									 
									
									 
									 if(eText.getText().equals("1")){
											
											lolChamp.get("Leona").seteStat("1");
											}
											
									 else if(eText.getText().equals("2")){
												
												lolChamp.get("Leona").seteStat("2");
												}
									 else if(eText.getText().equals("3")){
												
												lolChamp.get("Leona").seteStat("3");
												}
									 else if(eText.getText().equals("4")){
												
												lolChamp.get("Leona").seteStat("5");
												}
									 
									 else
									 {
										 System.out.print("must between 1 and 5");
									 }
									 
									
									 if(rText.getText().equals("1")){
											
											lolChamp.get("Leona").setrStat("1");
											}
											
									 else if(rText.getText().equals("2")){
												
												lolChamp.get("Leona").setrStat("2");
												}
									 else if(wText.getText().equals("3")){
										 lolChamp.get("Leona").setrStat("3");
									 }
									 
									 else
									 {
										 System.out.print("must between 1 and 3");
									 }
								 JOptionPane.showMessageDialog(frame,
										 tempChar=  lolChamp.get("Leona"));
								
									
								}
							else if(rdbtnJanna.isSelected()){
								if(qText.getText().equals("1")){
									
									lolChamp.get("Janna").setqStat("1");
									}
									
									else if(qText.getText().equals("2")){
										
										lolChamp.get("Janna").setqStat("2");
										}
									else if(qText.getText().equals("3")){
										
										lolChamp.get("Janna").setqStat("3");
										}
									else if(qText.getText().equals("4")){
										
										lolChamp.get("Janna").setqStat("5");
										}
									else 
									{
										System.out.print("Must be between 1 and 5");
										
									}
									 
									
									 if(wText.getText().equals("1")){
											
											lolChamp.get("Janna").setwStat("1");
											}
											
									 else if(wText.getText().equals("2")){
												
												lolChamp.get("Janna").setwStat("2");
												}
									 else if(wText.getText().equals("3")){
												
												lolChamp.get("Janna").setwStat("3");
												}
									 else if(wText.getText().equals("4")){
												
												lolChamp.get("Janna").setwStat("5");
												}
									 
									 else
									 {
										 System.out.print("must between 1 and 5");
									 }
									 
									
									 
									 if(eText.getText().equals("1")){
											
											lolChamp.get("Janna").seteStat("1");
											}
											
									 else if(eText.getText().equals("2")){
												
												lolChamp.get("Janna").seteStat("2");
												}
									 else if(eText.getText().equals("3")){
												
												lolChamp.get("Janna").seteStat("3");
												}
									 else if(eText.getText().equals("4")){
												
												lolChamp.get("Janna").seteStat("5");
												}
									 
									 else
									 {
										 System.out.print("must between 1 and 5");
									 }
									 
									
									 if(rText.getText().equals("1")){
											
											lolChamp.get("Janna").setrStat("1");
											}
											
									 else if(rText.getText().equals("2")){
												
												lolChamp.get("Janna").setrStat("2");
												}
									 else if(wText.getText().equals("3")){
										 lolChamp.get("Janna").setrStat("3");
									 }
									 
									 else
									 {
										 System.out.print("must between 1 and 3");
									 }
								 JOptionPane.showMessageDialog(frame,
										 tempChar= lolChamp.get("Janna"));
									
								
								}
				
							else if(rdbtnJarvan.isSelected()){
								if(qText.getText().equals("1")){
									
									lolChamp.get("Jarvan").setqStat("1");
									}
									
									else if(qText.getText().equals("2")){
										
										lolChamp.get("Jarvan").setqStat("2");
										}
									else if(qText.getText().equals("3")){
										
										lolChamp.get("Jarvan").setqStat("3");
										}
									else if(qText.getText().equals("4")){
										
										lolChamp.get("Jarvan").setqStat("5");
										}
									else 
									{
										System.out.print("Must be between 1 and 5");
										
									}
									 
									
									 if(wText.getText().equals("1")){
											
											lolChamp.get("Jarvan").setwStat("1");
											}
											
									 else if(wText.getText().equals("2")){
												
												lolChamp.get("Jarvan").setwStat("2");
												}
									 else if(wText.getText().equals("3")){
												
												lolChamp.get("Jarvan").setwStat("3");
												}
									 else if(wText.getText().equals("4")){
												
												lolChamp.get("Jarvan").setwStat("5");
												}
									 
									 else
									 {
										 System.out.print("must between 1 and 5");
									 }
									 
									
									 
									 if(eText.getText().equals("1")){
											
											lolChamp.get("Jarvan").seteStat("1");
											}
											
									 else if(eText.getText().equals("2")){
												
												lolChamp.get("Jarvan").seteStat("2");
												}
									 else if(eText.getText().equals("3")){
												
												lolChamp.get("Jarvan").seteStat("3");
												}
									 else if(eText.getText().equals("4")){
												
												lolChamp.get("Jarvan").seteStat("5");
												}
									 
									 else
									 {
										 System.out.print("must between 1 and 5");
									 }
									 
									
									 if(rText.getText().equals("1")){
											
											lolChamp.get("Jarvan").setrStat("1");
											}
											
									 else if(rText.getText().equals("2")){
												
												lolChamp.get("Jarvan").setrStat("2");
												}
									 else if(wText.getText().equals("3")){
										 lolChamp.get("Jarvan").setrStat("3");
									 }
									 
									 else
									 {
										 System.out.print("must between 1 and 3");
									 }
								 JOptionPane.showMessageDialog(frame,
										 tempChar=  lolChamp.get("Jarvan IV"));
							
									
								}
							else if(rdbtnFiddlesticks.isSelected()){
								if(qText.getText().equals("1")){
									
									lolChamp.get("Fiddlesticks").setqStat("1");
									}
									
									else if(qText.getText().equals("2")){
										
										lolChamp.get("Fiddlesticks").setqStat("2");
										}
									else if(qText.getText().equals("3")){
										
										lolChamp.get("Fiddlesticks").setqStat("3");
										}
									else if(qText.getText().equals("4")){
										
										lolChamp.get("Fiddlesticks").setqStat("5");
										}
									else 
									{
										System.out.print("Must be between 1 and 5");
										
									}
									 
									
									 if(wText.getText().equals("1")){
											
											lolChamp.get("Fiddlesticks").setwStat("1");
											}
											
									 else if(wText.getText().equals("2")){
												
												lolChamp.get("Fiddlesticks").setwStat("2");
												}
									 else if(wText.getText().equals("3")){
												
												lolChamp.get("Fiddlesticks").setwStat("3");
												}
									 else if(wText.getText().equals("4")){
												
												lolChamp.get("Fiddlesticks").setwStat("5");
												}
									 
									 else
									 {
										 System.out.print("must between 1 and 5");
									 }
									 
									
									 
									 if(eText.getText().equals("1")){
											
											lolChamp.get("Fiddlesticks").seteStat("1");
											}
											
									 else if(eText.getText().equals("2")){
												
												lolChamp.get("Fiddlesticks").seteStat("2");
												}
									 else if(eText.getText().equals("3")){
												
												lolChamp.get("Fiddlesticks").seteStat("3");
												}
									 else if(eText.getText().equals("4")){
												
												lolChamp.get("Fiddlesticks").seteStat("5");
												}
									 
									 else
									 {
										 System.out.print("must between 1 and 5");
									 }
									 
									
									 if(rText.getText().equals("1")){
											
											lolChamp.get("Fiddlesticks").setrStat("1");
											}
											
									 else if(rText.getText().equals("2")){
												
												lolChamp.get("Fiddlesticks").setrStat("2");
												}
									 else if(wText.getText().equals("3")){
										 lolChamp.get("Fiddlesticks").setrStat("3");
									 }
									 
									 else
									 {
										 System.out.print("must between 1 and 3");
									 }
								 JOptionPane.showMessageDialog(frame,
										 tempChar=  lolChamp.get("Fiddlesticks"));
									
								 
								}
				
							else if(rdbtnSejuani.isSelected()){
								if(qText.getText().equals("1")){
									
									lolChamp.get("Sejuani").setqStat("1");
									}
									
									else if(qText.getText().equals("2")){
										
										lolChamp.get("Sejuani").setqStat("2");
										}
									else if(qText.getText().equals("3")){
										
										lolChamp.get("Sejuani").setqStat("3");
										}
									else if(qText.getText().equals("4")){
										
										lolChamp.get("Sejuani").setqStat("5");
										}
									else 
									{
										System.out.print("Must be between 1 and 5");
										
									}
									 
									
									 if(wText.getText().equals("1")){
											
											lolChamp.get("Sejuani").setwStat("1");
											}
											
									 else if(wText.getText().equals("2")){
												
												lolChamp.get("Sejuani").setwStat("2");
												}
									 else if(wText.getText().equals("3")){
												
												lolChamp.get("Sejuani").setwStat("3");
												}
									 else if(wText.getText().equals("4")){
												
												lolChamp.get("Sejuani").setwStat("5");
												}
									 
									 else
									 {
										 System.out.print("must between 1 and 5");
									 }
									 
									
									 
									 if(eText.getText().equals("1")){
											
											lolChamp.get("Sejuani").seteStat("1");
											}
											
									 else if(eText.getText().equals("2")){
												
												lolChamp.get("Sejuani").seteStat("2");
												}
									 else if(eText.getText().equals("3")){
												
												lolChamp.get("Sejuani").seteStat("3");
												}
									 else if(eText.getText().equals("4")){
												
												lolChamp.get("Sejuani").seteStat("5");
												}
									 
									 else
									 {
										 System.out.print("must between 1 and 5");
									 }
									 
									
									 if(rText.getText().equals("1")){
											
											lolChamp.get("Sejuani").setrStat("1");
											}
											
									 else if(rText.getText().equals("2")){
												
												lolChamp.get("Sejuani").setrStat("2");
												}
									 else if(wText.getText().equals("3")){
										 lolChamp.get("Sejuani").setrStat("3");
									 }
									 
									 else
									 {
										 System.out.print("must between 1 and 3");
									 }
								 JOptionPane.showMessageDialog(frame,
										 tempChar=  lolChamp.get("Sejuani"));
								
									
								}
							else if(rdbtnVi.isSelected()){
								if(qText.getText().equals("1")){
									
									lolChamp.get("Vi").setqStat("1");
									}
									
									else if(qText.getText().equals("2")){
										
										lolChamp.get("Vi").setqStat("2");
										}
									else if(qText.getText().equals("3")){
										
										lolChamp.get("Vi").setqStat("3");
										}
									else if(qText.getText().equals("4")){
										
										lolChamp.get("Vi").setqStat("5");
										}
									else 
									{
										System.out.print("Must be between 1 and 5");
										
									}
									 
									
									 if(wText.getText().equals("1")){
											
											lolChamp.get("Vi").setwStat("1");
											}
											
									 else if(wText.getText().equals("2")){
												
												lolChamp.get("Vi").setwStat("2");
												}
									 else if(wText.getText().equals("3")){
												
												lolChamp.get("Vi").setwStat("3");
												}
									 else if(wText.getText().equals("4")){
												
												lolChamp.get("Vi").setwStat("5");
												}
									 
									 else
									 {
										 System.out.print("must between 1 and 5");
									 }
									 
									
									 
									 if(eText.getText().equals("1")){
											
											lolChamp.get("Vi").seteStat("1");
											}
											
									 else if(eText.getText().equals("2")){
												
												lolChamp.get("Vi").seteStat("2");
												}
									 else if(eText.getText().equals("3")){
												
												lolChamp.get("Vi").seteStat("3");
												}
									 else if(eText.getText().equals("4")){
												
												lolChamp.get("Vi").seteStat("5");
												}
									 
									 else
									 {
										 System.out.print("must between 1 and 5");
									 }
									 
									
									 if(rText.getText().equals("1")){
											
											lolChamp.get("Vi").setrStat("1");
											}
											
									 else if(rText.getText().equals("2")){
												
												lolChamp.get("Vi").setrStat("2");
												}
									 else if(wText.getText().equals("3")){
										 lolChamp.get("Vi").setrStat("3");
									 }
									 
									 else
									 {
										 System.out.print("must between 1 and 3");
									 }
								 JOptionPane.showMessageDialog(frame,
										 tempChar=  lolChamp.get("Vi"));
							
								}
							else if(rdbtnGangplank.isSelected()){
								if(qText.getText().equals("1")){
									
									lolChamp.get("Gangplank").setqStat("1");
									}
									
									else if(qText.getText().equals("2")){
										
										lolChamp.get("Gangplank").setqStat("2");
										}
									else if(qText.getText().equals("3")){
										
										lolChamp.get("Gangplank").setqStat("3");
										}
									else if(qText.getText().equals("4")){
										
										lolChamp.get("Gangplank").setqStat("5");
										}
									else 
									{
										System.out.print("Must be between 1 and 5");
										
									}
									 
									
									 if(wText.getText().equals("1")){
											
											lolChamp.get("Gangplank").setwStat("1");
											}
											
									 else if(wText.getText().equals("2")){
												
												lolChamp.get("Gangplank").setwStat("2");
												}
									 else if(wText.getText().equals("3")){
												
												lolChamp.get("Gangplank").setwStat("3");
												}
									 else if(wText.getText().equals("4")){
												
												lolChamp.get("Gangplank").setwStat("5");
												}
									 
									 else
									 {
										 System.out.print("must between 1 and 5");
									 }
									 
									
									 
									 if(eText.getText().equals("1")){
											
											lolChamp.get("Gangplank").seteStat("1");
											}
											
									 else if(eText.getText().equals("2")){
												
												lolChamp.get("Gangplank").seteStat("2");
												}
									 else if(eText.getText().equals("3")){
												
												lolChamp.get("Gangplank").seteStat("3");
												}
									 else if(eText.getText().equals("4")){
												
												lolChamp.get("Gangplank").seteStat("5");
												}
									 
									 else
									 {
										 System.out.print("must between 1 and 5");
									 }
									 
									
									 if(rText.getText().equals("1")){
											
											lolChamp.get("Gangplank").setrStat("1");
											}
											
									 else if(rText.getText().equals("2")){
												
												lolChamp.get("Gangplank").setrStat("2");
												}
									 else if(wText.getText().equals("3")){
										 lolChamp.get("Gangplank").setrStat("3");
									 }
									 
									 else
									 {
										 System.out.print("must between 1 and 3");
									 }
								 JOptionPane.showMessageDialog(frame,
										 tempChar= lolChamp.get("Gangplank"));
								
									
								}
							else if(rdbtnRiven.isSelected()){
								if(qText.getText().equals("1")){
									
									lolChamp.get("Riven").setqStat("1");
									}
									
									else if(qText.getText().equals("2")){
										
										lolChamp.get("Riven").setqStat("2");
										}
									else if(qText.getText().equals("3")){
										
										lolChamp.get("Riven").setqStat("3");
										}
									else if(qText.getText().equals("4")){
										
										lolChamp.get("Riven").setqStat("5");
										}
									else 
									{
										System.out.print("Must be between 1 and 5");
										
									}
									 
									
									 if(wText.getText().equals("1")){
											
											lolChamp.get("Riven").setwStat("1");
											}
											
									 else if(wText.getText().equals("2")){
												
												lolChamp.get("Riven").setwStat("2");
												}
									 else if(wText.getText().equals("3")){
												
												lolChamp.get("Riven").setwStat("3");
												}
									 else if(wText.getText().equals("4")){
												
												lolChamp.get("Riven").setwStat("5");
												}
									 
									 else
									 {
										 System.out.print("must between 1 and 5");
									 }
									 
									
									 
									 if(eText.getText().equals("1")){
											
											lolChamp.get("Riven").seteStat("1");
											}
											
									 else if(eText.getText().equals("2")){
												
												lolChamp.get("Riven").seteStat("2");
												}
									 else if(eText.getText().equals("3")){
												
												lolChamp.get("Riven").seteStat("3");
												}
									 else if(eText.getText().equals("4")){
												
												lolChamp.get("Riven").seteStat("5");
												}
									 
									 else
									 {
										 System.out.print("must between 1 and 5");
									 }
									 
									
									 if(rText.getText().equals("1")){
											
											lolChamp.get("Riven").setrStat("1");
											}
											
									 else if(rText.getText().equals("2")){
												
												lolChamp.get("Riven").setrStat("2");
												}
									 else if(wText.getText().equals("3")){
										 lolChamp.get("Riven").setrStat("3");
									 }
									 
									 else
									 {
										 System.out.print("must between 1 and 3");
									 }
								 JOptionPane.showMessageDialog(frame,
										 tempChar=  lolChamp.get("Riven"));
								
									
								}
				
							else if(rdbtnJarvan2.isSelected()){
								if(qText.getText().equals("1")){
									
									lolChamp.get("Jarvan").setqStat("1");
									}
									
									else if(qText.getText().equals("2")){
										
										lolChamp.get("Jarvan").setqStat("2");
										}
									else if(qText.getText().equals("3")){
										
										lolChamp.get("Jarvan").setqStat("3");
										}
									else if(qText.getText().equals("4")){
										
										lolChamp.get("Jarvan").setqStat("5");
										}
									else 
									{
										System.out.print("Must be between 1 and 5");
										
									}
									 
									
									 if(wText.getText().equals("1")){
											
											lolChamp.get("Jarvan").setwStat("1");
											}
											
									 else if(wText.getText().equals("2")){
												
												lolChamp.get("Jarvan").setwStat("2");
												}
									 else if(wText.getText().equals("3")){
												
												lolChamp.get("Jarvan").setwStat("3");
												}
									 else if(wText.getText().equals("4")){
												
												lolChamp.get("Jarvan").setwStat("5");
												}
									 
									 else
									 {
										 System.out.print("must between 1 and 5");
									 }
									 
									
									 
									 if(eText.getText().equals("1")){
											
											lolChamp.get("Jarvan").seteStat("1");
											}
											
									 else if(eText.getText().equals("2")){
												
												lolChamp.get("Jarvan").seteStat("2");
												}
									 else if(eText.getText().equals("3")){
												
												lolChamp.get("Jarvan").seteStat("3");
												}
									 else if(eText.getText().equals("4")){
												
												lolChamp.get("Jarvan").seteStat("5");
												}
									 
									 else
									 {
										 System.out.print("must between 1 and 5");
									 }
									 
									
									 if(rText.getText().equals("1")){
											
											lolChamp.get("Jarvan").setrStat("1");
											}
											
									 else if(rText.getText().equals("2")){
												
												lolChamp.get("Jarvan").setrStat("2");
												}
									 else if(wText.getText().equals("3")){
										 lolChamp.get("Jarvan").setrStat("3");
									 }
									 
									 else
									 {
										 System.out.print("must between 1 and 3");
									 }
								 JOptionPane.showMessageDialog(frame,
										 tempChar=  lolChamp.get("Jarvan IV"));
								
									
								}
							else if(rdbtnSion.isSelected()){
								if(qText.getText().equals("1")){
									
									lolChamp.get("Sion").setqStat("1");
									}
									
									else if(qText.getText().equals("2")){
										
										lolChamp.get("Sion").setqStat("2");
										}
									else if(qText.getText().equals("3")){
										
										lolChamp.get("Sion").setqStat("3");
										}
									else if(qText.getText().equals("4")){
										
										lolChamp.get("Sion").setqStat("5");
										}
									else 
									{
										System.out.print("Must be between 1 and 5");
										
									}
									 
									
									 if(wText.getText().equals("1")){
											
											lolChamp.get("Sion").setwStat("1");
											}
											
									 else if(wText.getText().equals("2")){
												
												lolChamp.get("Sion").setwStat("2");
												}
									 else if(wText.getText().equals("3")){
												
												lolChamp.get("Sion").setwStat("3");
												}
									 else if(wText.getText().equals("4")){
												
												lolChamp.get("Sion").setwStat("5");
												}
									 
									 else
									 {
										 System.out.print("must between 1 and 5");
									 }
									 
									
									 
									 if(eText.getText().equals("1")){
											
											lolChamp.get("Sion").seteStat("1");
											}
											
									 else if(eText.getText().equals("2")){
												
												lolChamp.get("Sion").seteStat("2");
												}
									 else if(eText.getText().equals("3")){
												
												lolChamp.get("Sion").seteStat("3");
												}
									 else if(eText.getText().equals("4")){
												
												lolChamp.get("Sion").seteStat("5");
												}
									 
									 else
									 {
										 System.out.print("must between 1 and 5");
									 }
									 
									
									 if(rText.getText().equals("1")){
											
											lolChamp.get("Sion").setrStat("1");
											}
											
									 else if(rText.getText().equals("2")){
												
												lolChamp.get("Sion").setrStat("2");
												}
									 else if(wText.getText().equals("3")){
										 lolChamp.get("Jarvan").setrStat("3");
									 }
									 
									 else
									 {
										 System.out.print("must between 1 and 3");
									 }
								 JOptionPane.showMessageDialog(frame,
										 tempChar=  lolChamp.get("Sion"));
								
									
								}
					
		           
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
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(10, 4, 97, 21);
		frame.getContentPane().add(menuBar);
		
		/**
		 * action listener used to access writeOut method once the save button is clicked
		 */
		btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		           try {
					writeOut();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}});
		menuBar.add(btnSave);
		
			
	
		
	
		
		
		generateHash();
		
		
		
		
		
		

}
}
	