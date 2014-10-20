package chatbot.view;

import javax.swing.JFrame;

import chatbot.controller.ChatbotAppController;

public class ChatbotFrame extends JFrame
{
	/**
	 * Makes the basePanel (and it's private).
	 */
	private ChatbotPanel basePanel;
	/**
	 * Imports the Chatbot App Controller and puts the basePanel and the Frame into it.
	 * @param baseController Chatbot App Controller.
	 */
	public ChatbotFrame(ChatbotAppController baseController) 
	{
		
		basePanel = new ChatbotPanel(baseController);
		
		setupFrame();
		
	}
	
	private void setupFrame()
	{
		/**
		 * Sets the pane's content.
		 */
		this.setContentPane(basePanel);
		/**
		 * Sets the size of the GUI.
		 */
		this.setSize(400, 400);
		/**
		 * Makes it so that the GUI is not resizable.
		 */
		this.setResizable(false);
		/**
		 * Makes it so that the GUI is visible (it'd suck if you couldn't see it).
		 */
		this.setVisible(true);
	}

}
