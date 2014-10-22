package chatbot.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


import chatbot.controller.ChatbotAppController;
import java.awt.Font;

public class ChatbotPanel extends JPanel
{
	/**
	 * JButton and JTextField. (A button and a text field).
	 */
	private JButton sampleButton;
	private JTextField sampleField;
	private JTextArea chatArea;
	private JScrollPane chatPane;
	private JButton randomButton;

	
	/**
	 * Makes it so items in the layout can be moved and placed in relativity to each other.
	 */
	private SpringLayout baseLayout;
	
	public ChatbotPanel(ChatbotAppController baseController)
	{
		/**
		  * The sample button and what is says.
		  */
		sampleButton = new JButton("Click on me. Now.");
		
		/**
		 * The text field and it's width (I think).
		 */
		sampleField = new JTextField(25);
		
		/**
		 * The spring Layout. Explained above.
		 */
		baseLayout = new SpringLayout();
		baseLayout.putConstraint(SpringLayout.WEST, sampleField, 163, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, sampleButton, -1, SpringLayout.NORTH, sampleField);
		baseLayout.putConstraint(SpringLayout.EAST, sampleButton, -6, SpringLayout.WEST, sampleField);
		
		/**
		 * Sets up the panel first. (Should always come before the layout stuff but after the base Controller.)
		 */
		chatPane = new JScrollPane();
		randomButton = new JButton("Give me a random topic.");
		baseLayout.putConstraint(SpringLayout.WEST, randomButton, 136, SpringLayout.WEST, this);
		
		
		setupPanel();
		/**
		 * Sets up the Layout into the Chatbot GUI panel.
		 */
		setupLayout();
		/**
		 * Sets up the listeners that check for button clicks and stuff.
		 */
		setupListeners();
		setupScrollPane();
	}
	
	private void setupScrollPane()
	{
		chatArea.setLineWrap(true);
		chatArea.setWrapStyleWord(true);
	}
	
	private void setupPanel()
	{
		/**
		 * Sets the background color.
		 */
		this.setBackground(Color.MAGENTA);
		this.setLayout(baseLayout);
		/**
		 * Adds in the button.
		 */
		this.add(sampleButton);
		/**
		 * Adds in the text field.
		 */
		this.add(sampleField);
		this.add(chatPane);
		this.add(randomButton);
		
		chatArea = new JTextArea(5, 25);
		baseLayout.putConstraint(SpringLayout.NORTH, randomButton, 19, SpringLayout.SOUTH, chatArea);
		baseLayout.putConstraint(SpringLayout.NORTH, sampleField, 78, SpringLayout.SOUTH, chatArea);
		baseLayout.putConstraint(SpringLayout.NORTH, chatArea, 73, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, chatArea, -108, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, chatArea, 53, SpringLayout.EAST, chatPane);
		baseLayout.putConstraint(SpringLayout.EAST, chatArea, 355, SpringLayout.WEST, this);
		add(chatArea);
		
		JLabel lblLysandrabot = new JLabel("LysandraBot");
		baseLayout.putConstraint(SpringLayout.WEST, lblLysandrabot, 109, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, lblLysandrabot, -9, SpringLayout.NORTH, chatArea);
		lblLysandrabot.setFont(new Font("Vijaya", Font.PLAIN, 53));
		add(lblLysandrabot);
	}
	
	private void setupLayout()
	/**
	 * This is where we dump all the layout code, always remove it from the constructor.
	 */
	{
		baseLayout.putConstraint(SpringLayout.WEST, chatPane, 30, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, chatPane, 100, SpringLayout.NORTH, this);
		
	}
	
	private void setupListeners()
	{
		sampleButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent Click)
			{
				sampleField.setText(sampleField.getText() + " :O ");
			}
		});
			
		
	}
}
