package chatbot.controller;

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
	private String startMessage;
	
	/**
	 * Creates a ChatbotAppController and initializes the associated View and Model objects.
	 */
	/**
	 * Constructor needs to initialize all the data members.
	 */
	public ChatbotAppController()
	{
		appView = new ChatbotView(this);
		notSoCleverBot = new Chatbot("Lysandra");
		startMessage = "Welcome to " + notSoCleverBot.getName() +"'s Chatbot, please type in your name.";
		
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
	String message = appView.displayChatbotConversations(startMessage);
	/**
	 * JOptionPane.showOptionDialog works.
	 */
	/**
	 * Shows this message and then gives an input option. Only activates once every time the program runs unless looped.
	 */
	
	while(!notSoCleverBot.quitChecker(message))
	{
		message = appView.displayChatbotConversations(message);
		
	}
	/**
	 * Quits the application with a message that the application is closing.
	 */
	    quit();
	}
	
	private void quit()
	{
		appView.displayInformation("Goodbye user.");
		System.exit(0);
		/**
		 * Completely closes the application, activated if quitChecker is true.
		 */
	}

}
