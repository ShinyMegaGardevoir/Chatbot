package chatbot.model;

import java.util.*;
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
	private Scanner aScanner;
	
	

	/**
	 * Creates a Chatbot object with a specified name. Initializes the total chats to 0.
	 * @param name The name of the chatbot.
	 */
	public Chatbot(String name)
	{
		this.name = name;
		numberOfChats = 0;
		// this. means talk to the current class
		name="";
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
		incrementChats();
		
		int randomChoice = (int) (Math.random() * 3);
		
		if(userText != null)
		{
			
		
		if(randomChoice == 0)
		{
			if(stringLengthChecker(userText))
			{
				processedText = "*Yaaaawn.* That's too long.";
			}
			else
			{
				processedText = "Why so short?";
			}
			
		}
		else if (randomChoice == 1)
		{
			processedText = "I'm bored. Do you remember my name?";
			String answer = aScanner.next();
			
			if(answer.equals("Lysandra"))
			{
				processedText = "Hey! You got it right.";
			}
			else
			{
				processedText = " " + userText + " is not my name.";
			}
		}
		else
		{
		 if(memeChecker(userText))
		 	{
			 processedText = "Oh, you found a meme: " + userText;
			 processedText += ". Heh.";
		 	}
		 else
		 	{
			 processedText = "Boring, that wasn't a meme.";
		 	}
		}
		}
		 
		return processedText;
	}
	/**
	 * Checks to see if the supplied user text matches any of the memes in the Chatbot's meme list.
	 * @param currentText The user supplied text.
	 * @return Whether the String matched any of the built in memes. 
	 */
	private boolean stringLengthChecker(String input)
	{
		boolean isTooLong = false;
		if(input.length() >= 20)
		{
			isTooLong = true;
		}
		return isTooLong;
	}
	
	
	
	
	private boolean contentChecker(String input)
	{
		boolean hasMyContent = false;
			if(input.contains(name))
			{
				hasMyContent = true;
			}
			
		return hasMyContent;
			
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
