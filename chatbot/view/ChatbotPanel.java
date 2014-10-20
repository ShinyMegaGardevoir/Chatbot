package chatbot.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import chatbot.controller.ChatbotAppController;

public class ChatbotPanel extends JPanel
{
	private ChatbotAppController baseController;
	
	/**
	 * JButton and JTextField. (A button and a text field).
	 */
	private JButton sampleButton;
	private JTextField sampleField;
	
	/**
	 * Makes it so items in the layout can be moved and placed in relativity to each other.
	 */
	private SpringLayout baseLayout;
	
	public ChatbotPanel(ChatbotAppController baseController)
	{
		this.baseController = baseController;
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
		
		/**
		 * Sets up the panel first. (Should always come before the layout stuff but after the base Controller.)
		 */
		setupPanel();
		/**
		 * Sets up the Layout into the Chatbot GUI panel.
		 */
		setupLayout();
		/**
		 * Sets up the listeners that check for button clicks and stuff.
		 */
		setupListeners();
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
	}
	
	private void setupLayout()
	/**
	 * This is where we dump all the layout code, always remove it from the constructor.
	 */
	{
		baseLayout.putConstraint(SpringLayout.WEST, sampleButton, 0, SpringLayout.WEST, sampleField);
		baseLayout.putConstraint(SpringLayout.SOUTH, sampleButton, -6, SpringLayout.NORTH, sampleField);
		baseLayout.putConstraint(SpringLayout.WEST, sampleField, 25, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, sampleField, -10, SpringLayout.SOUTH, this);
		
	}
	
	private void setupListeners()
	{
		
	}

}
