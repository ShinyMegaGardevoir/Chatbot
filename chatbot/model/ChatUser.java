package chatbot.model;

public class ChatUser
{

	private String name;
	private int age;
	private String favoritePokemon;
	private boolean likesCats;
	private boolean isReal;
	
	public ChatUser()
	{
		this.name = "";
		this.age = -999;
		this.favoritePokemon = "";
		this.likesCats = false;
		this.isReal = false;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public String getFavoritePokemon()
	{
		return favoritePokemon;
	}
	public boolean getLikesCats()
	{
		return likesCats;
	}
	public boolean getIsReal()
	{
		return isReal;
	}
}
