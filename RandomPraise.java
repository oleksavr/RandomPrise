package org.my.java;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class RandomPraise extends JFrame implements ActionListener,PropertyChangeListener {
	
	
	int count = 0;
	static String[] praise = {"Excellent! Отлично!",

"Perfect! Идеально!",

"Brilliant! Блестяще!",

"Fantastic! Фантастически!",

"Magnificent! Великолепно!",

"Superb! Превосходно!",

"You’re doing great! У тебя великолепно получается!",

"Keep it up! Так держать!",

"That’s better than ever! Лучше, чем когда либо!",

"Well done! Молодец!",

"Good job! Хорошая работа!",

"Way to go! Хорошая работа! Молодец!",

"I like that! Мне это нравится!",

"Very good! Очень хорошо!",

"Good for you! Молодец!",

"Great you are! Молодец!",

"That’s nice. Это мило.",

"That’s right. Правильно.",

"That’s it. Это оно.",

"Exactly. Точно.",

"That’s perfectly correct. Абсолютно верно.",

"Yes, you’ve got it. Да, у тебя это получилось.",

"That’s just what I was looking for.",

"You really figured it out!", 

"That’s much better now! Теперь гораздо лучше!",

"You are improving. Ты делаешь успехи.",

"You’ve made a lot of progress.", 

"You didn’t make a single mistake."};

	public JPanel contentPane;
	public JTextField textF;
private JButton btnA;
private JProgressBar progressBar;
private JLabel lblNewLabel;
private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				try {
					RandomPraise frame = new RandomPraise();
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
	public RandomPraise() {
		setTitle("Praise for Everyday");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setFont(new Font("Tahoma", Font.BOLD, 17));
		contentPane.setToolTipText("Click on   admirableness button");
		contentPane.setBorder(new EmptyBorder(50, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblNewLabel = new JLabel("Sorehead");
		contentPane.add(lblNewLabel);
		
		progressBar = new JProgressBar(0,count);
		contentPane.add(progressBar);
		
		progressBar.setMaximum(10);
		progressBar.setStringPainted(true);
		Border border = BorderFactory.createTitledBorder("Reading..");
		progressBar.setBorder(border);
	
		
		lblNewLabel_1 = new JLabel("Slake");
		contentPane.add(lblNewLabel_1);
		
		
		
		
		textF = new JTextField();
		textF.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textF.setHorizontalAlignment(SwingConstants.CENTER);
		textF.setText("Your quote for today is : ");
		textF.setForeground(new Color(102, 0, 102));
		textF.setBackground(Color.LIGHT_GRAY);
		contentPane.add(textF);
		textF.addActionListener(this);
		textF.setColumns(30);
		textF.setEditable(true);
		
		 
		btnA = new JButton(" Admirableness");
		btnA.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnA.setBounds(new Rectangle(0, 0, 13, 0));
		btnA.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnA.setHorizontalTextPosition(SwingConstants.CENTER);
		contentPane.add(btnA);
		 btnA.addActionListener(this);
		
		
		
	}

	/* (non-Javadoc)
	 * @see org.my.java.Coloryzable#actionPerformed(java.awt.event.ActionEvent)
	 */
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals(" Admirableness")){
			//System.out.println("I clicked this bitch ...");
			textF.setText("\""+choise(praise)+"\"");
			textF.setForeground(color());
			count ++;
			contentPane.addPropertyChangeListener(this);
			progressBar.setValue(count);
			
			//System.out.println(count);
		}
			
		
	}
	
	private Color color() {
		int r = (int) (Math.random()*256);
		int g = (int) (Math.random()*256);
		int b = (int) (Math.random()*256);
		Color col = new Color(r,g,b);
		
		return col;
	}

	/* (non-Javadoc)
	 * @see org.my.java.Coloryzable#choise(java.lang.String[])
	 */
	public String choise(String [] praise) {
		 
		 int rnd = new Random().nextInt(praise.length);
		// System.out.println(food[rnd]);
		return praise[rnd];
		
				   
			   }

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		
		//if("count" == evt.getPropertyName()){
		//	progressBar.setValue(count);
			
	//}
	}
	
	

}
