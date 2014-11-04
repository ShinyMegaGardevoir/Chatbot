package chatbot.controller;

import chatbot.model.Chatbot;
import chatbot.view.ChatbotFrame;
import chatbot.view.ChatbotPanel;
import chatbot.view.ChatbotView;
/**
 * Imports the Chatbot and ChatbotView from the chatbot.model and chatbot.view packages.
 *
 */
public class ChatbotAppController
{
	/**
	 * This is the View.
	 */
	private ChatbotView appView;
	/**
	 * This is the Model.
	 */
	private Chatbot notSoCleverBot;
	/**
	 * This is the startup Message.
	 */
	private String startMessage;
	
	
	private String endMessage;
	
	/**
	 * This is the frame for the pop up.
	 */
	private ChatbotFrame baseFrame;
	/**
	 * Creates a ChatbotAppController and initializes the associated View and Model objects.
	 */
	/**
	 * Constructor needs to initialize all the data members.
	 */
	public ChatbotAppController()
	{
		appView = new ChatbotView(this);
		baseFrame = new ChatbotFrame(this);
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
	
	    ChatbotPanel myAppPanel = (ChatbotPanel) baseFrame.getContentPane();
	    myAppPanel.displayTextToUser(startMessage);
	    
//	    ((ChatbotPanel) baseFrame.getContentPane()).displayTextToUser(startMessage);
	    
	}
	
	public String sendTextToChatBot(String userInput)
	{
		String respondText = "";
		
		respondText = notSoCleverBot.processText(userInput);
		return respondText;
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
