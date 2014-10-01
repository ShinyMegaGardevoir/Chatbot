package chatbot.model;

import java.util.ArrayList;
/**
 * 
 * @author Christina Sadlier
 * @version 1.2.1 10/1/14
 */
public class Chatbot
{
	private String name;
	private int numberOfChats;
	private ArrayList<String> memeList;
	
	

	/**
	 * Creates a Chatbot object with a specified name. Initializes the total chats to 0.
	 * @param name The name of the chatbot.
	 */
	public Chatbot(String name)
	{
		this.name = name;
		numberOfChats = 0;
		// this. means talk to the current class
		
		memeList = new ArrayList<String>();
		fillTheMemeList();
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
	
	/**
	 * Fills the memeList with memes.
	 */
	private void fillTheMemeList()
	
	{
		memeList.add("y u mad bro");
		memeList.add("Ain't nobody got time for dat");
		memeList.add("like a sir");
		memeList.add("No.");
		memeList.add("Challenge Accepted");
		memeList.add("Me gusta");
		memeList.add("One does not simply");
		memeList.add("Y U no");
	}
	
	
	/**
	 * Processed the supplied text from the user to provide a message from the Chatbot.
	 * @param userText The user supplied text.
	 * @return What the Chatbot says because of the supplied input.
	 */
	public String processText(String userText)
	{
		String processedText = "";
		return processedText;
	}
	
	private boolean memeChecker(String currentText)
	{
		boolean isAMeme = false;
		
		for(String currentMeme : memeList)
		{
			if(currentMeme.equalsIgnoreCase(currentText))
			{
				isAMeme = true;
			}
		}
		/**
		 * Loop above and loop below do the same thing.
		 */
		
		for(int loopCount = 0; loopCount < memeList.size(); loopCount++)
		{
			if(memeList.get(loopCount).equalsIgnoreCase(currentText))
			{
				isAMeme = true;
			}
		}
		
		return isAMeme;
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
