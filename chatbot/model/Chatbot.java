package chatbot.model;

import java.util.*;
import model.ChatUser;
/**
 * 
 * @author Christina Sadlier
 * @version 1.4 11/4/14 - Added reference to the user.
 */
public class Chatbot
{
	private String name;
	private int numberOfChats;
	private ArrayList<String> memeList;
	private Scanner aScanner;
	private ArrayList<String> userInputList;
	private ChatUser myUser;
	
	

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
		userInputList = new ArrayList<String>();
		fillTheMemeList();
		myUser = new ChatUser();
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
		
		int randomChoice = (int) (Math.random() * 6);
		
		if(userText != null)
		{
			
			if (numberOfChats < 5)
			{
				// I need if's or a switch
			}
			else
			{
				if(randomChoice == 0)
				{
					myUser.setName(userText);
					processedText = "Hello " + myUser.getName() + ". What is your age?";
				}
				else if (randomChoice == 1)
				{
					int age = Integer.parseInt(userText);
					myUser.setAge(age);
					processedText = "Oh, so you're " + myUser.getAge() + ".";
					processedText +="\nWhat is your favorite Pokemon?";
				}
				
				else if (randomChoice == 2)
				{
					myUser.setFavoritePokemon(userText);
					processedText = "" + myUser.getFavoritePokemon() + " is your favorite Pokemon?";
				}
				else if (randomChoice == 3)
				{
					//userInput list add
					//Should store a string in processedText from another method (chooseRandomUserInfo(String))
				
				}
				
				else if (randomChoice ==4)
				{
					userInputList.add(0, userText);
					processedText = "Thanks for the input, "+ myUser.getName();
				}
				
				else
				{
					//userInputChecker
					if(userInputChecker(userText))
					{
						processedText = "Oh, what's this? Didn't we already talk about that?";
					}
					else
					{
						processedText = "I'm bored. Tell me something funny.";
					}
					
				}
				
				
				}
			}
		incrementChats();
		return processedText;
	
	}
	/**
	 * Checks to see if the supplied user text matches any of the memes in the Chatbot's meme list.
	 * @param currentText The user supplied text.
	 * @return Whether the String matched any of the built in memes. 
	 */
	
	
	private boolean userInputChecker(String input)
	{
		boolean matchesInput = false;
		
		if(userInputList.size() > 0)
		{
			for(int loopCount = 0; loopCount < userInputList.size(); loopCount++)
			{
				if(input.equalsIgnoreCase(userInputList.get(loopCount)))
				{
					matchesInput = true;
					userInputList.remove(loopCount);
					loopCount--;
				}
			}
		}
		return matchesInput;
	}
	
	
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
	
	/**
	 * 
	 * @param currentText
	 * @return isAMeme (will either be true or false based on the input.)
	 */
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
	
	/**
	 * 
	 * @param input If the user says "no" then it gives the OK to quit.
	 * @return Ok to quit. (Gives the OK for the program to quit.)
	 */
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
