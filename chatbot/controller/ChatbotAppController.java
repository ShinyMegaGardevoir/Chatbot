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
	 * Allows other objects access to the notSoCleverbot.
	 * @return The Chatbot for this app.
	 */
	
	public Chatbot getNotSoCleverBot()
	{
		return notSoCleverBot;
	}
	
	/**
	 * Starts the Chatbot Application.
	 */
	public void start()
	{
	String message = JOptionPane.showInputDialog(null, "Welcome to Chatbot, type in your name.");
	/**
	 * Currently this is just a little space I've left for testing stuff. JOptionPane.showOptionDialog works.
	 */
	/**
	 * Shows this message and then gives an input option. Only activates once every time the program runs unless looped.
	 */
	
	while(!notSoCleverBot.quitChecker(message))
	{
		message = appView.displayChatbotConversations(message);
		
	}
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
