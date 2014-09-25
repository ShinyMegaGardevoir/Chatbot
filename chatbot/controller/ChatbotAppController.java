package chatbot.controller;

import javax.swing.JOptionPane;

import chatbot.model.Chatbot;
import chatbot.view.ChatbotView;
/**
 * Imports the Chatbot and ChatbotView from the chatbot.model and chatbot.view packages.
 *
 */
public class ChatbotAppController
{
	private ChatbotView appView;
	private Chatbot notSoCleverBot;
	
	/**
	 * Creates a ChatbotAppController and initializes the associated View and Model objects.
	 */
	public ChatbotAppController()
	{
		appView = new ChatbotView(this);
		notSoCleverBot = new Chatbot("Lysandra");
		
	}
	/**
	 * Starts the Chatbot Application.
	 */
	public void start()
	{
	JOptionPane.showOptionDialog(null, "Yes or No?", null, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, appView);
	/**
	 * Currently this is just a little space I've left for testing stuff. JOptionPane.showOptionDialog works.
	 */
	String message = JOptionPane.showInputDialog(null, "Would you like to continue?");
	/**
	 * Shows this message and then gives an input option. Only activates once every time the program runs unless looped.
	 */
	
	
	if(notSoCleverBot.quitChecker(message))
	{
			quit();
	}
	
	JOptionPane.showMessageDialog(null, "I'm still here.");
	/**
	 * Says "I'm still here." if quitChecker returns false. 
	 */
	System.exit(0);
	}
	private void quit()
	{
		JOptionPane.showMessageDialog(null, "Bye.");
		System.exit(0);
		/**
		 * Completely closes the application, activated if quitChecker is true from line 34.
		 */
	}
	/**
	 * The items above only work once unless put in a loop. 
	 */

}
