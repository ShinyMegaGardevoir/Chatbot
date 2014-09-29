package chatbot.model;

public class Chatbot
{
	private String name;
	private int numberOfChats;

	/**
	 * Creates a Chatbot object with a specified name. Initializes the total chats to 0.
	 * @param name The name of the chatbot.
	 */
	public Chatbot(String name)
	{
		this.name = name;
		numberOfChats = 0;
		// this. means talk to the current class
	}

	public String getName()
	{
		return name;
	}
	/**
	 * Returns number of chats for this Chatbot.
	 * @return The current number of chats.
	 */
	public int getNumberOfChats()
	{
		return numberOfChats;
	}

	/**
	 * Sets the name of the chatbot.
	 * @param name The new name for the Chatbot.
	 */

	public void setName(String name)
	{
		this.name = name;
	}

	public void incrementChats()
	{
		numberOfChats++;
	}
	
	public boolean quitChecker(String input)
	{
		boolean okToQuit = false;
	
		if(input != null && input.equals("no"))
		{
			okToQuit = true;
		}
		
		return okToQuit;
		
	}

}
