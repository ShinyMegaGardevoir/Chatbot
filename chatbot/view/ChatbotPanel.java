package chatbot.view;

import java.awt.Color;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


import chatbot.controller.ChatbotAppController;
import java.awt.Font;

public class ChatbotPanel extends JPanel
{
	
	private JLabel background;
		
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
		
		baseLayout.putConstraint(SpringLayout.WEST, sampleField, 225, SpringLayout.WEST, this);
		background=new JLabel(new ImageIcon(getClass().getResource("/chatbot/view/images/trinitylettersheet.png")));
		
		randomButton = new JButton("Give me a random topic.");
		
		
		/**
		 * Sets up the panel first. (Should always come before the layout stuff but after the base Controller.)
		 */
		chatArea = new JTextArea(5, 25);
		baseLayout.putConstraint(SpringLayout.NORTH, sampleField, 0, SpringLayout.SOUTH, chatArea);
		chatPane = new JScrollPane(chatArea);
		baseLayout.putConstraint(SpringLayout.NORTH, chatPane, 75, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, chatPane, 150, SpringLayout.WEST, this);
		randomButton = new JButton("Give me a random topic.");
		
		baseLayout.putConstraint(SpringLayout.NORTH, randomButton, -40, SpringLayout.SOUTH, chatArea);
		baseLayout.putConstraint(SpringLayout.WEST, randomButton, 190, SpringLayout.WEST, this);
		randomButton.setHorizontalAlignment(SwingConstants.LEADING);
		
		
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
		
		this.setLayout(baseLayout);
		this.setSize(603,333);
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
		this.add(background);
	}
	
	private void setupLayout()
	/**
	 * This is where we dump all the layout code, always remove it from the constructor.
	 */
	{
		baseLayout.putConstraint(SpringLayout.NORTH, sampleButton, -1, SpringLayout.NORTH, sampleField);
		baseLayout.putConstraint(SpringLayout.EAST, sampleButton, -6, SpringLayout.WEST, sampleField);
		baseLayout.putConstraint(SpringLayout.NORTH, chatArea, 73, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, chatArea, -108, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, chatArea, 53, SpringLayout.EAST, chatPane);
		baseLayout.putConstraint(SpringLayout.EAST, chatArea, 355, SpringLayout.WEST, this);
		
		baseLayout.putConstraint(SpringLayout.NORTH, randomButton, -40, SpringLayout.SOUTH, chatArea);
		baseLayout.putConstraint(SpringLayout.WEST, randomButton, 190, SpringLayout.WEST, this);
		
		
	}
	
	private void setupListeners()
	{
		sampleButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String userTypedText = sampleField.getText();
     			String chatbotResponse = baseController.sendTextToChatBot(userTypedText);
				displayTextToUser(userTypedText);
				displayTextToUser(chatbotResponse);
				sampleField.setText("");
			}
		});
			
		
	}
	
	public void displayTextToUser(String input)
	{
		chatArea.append("\n" + input);
	}
}
