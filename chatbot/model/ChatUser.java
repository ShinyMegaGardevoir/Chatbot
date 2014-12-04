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
	public void setName(String name)
	{
		this.name = name;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public void setFavoritePokemon(String favoritePokemon)
	{
		this.favoritePokemon = favoritePokemon;
	}
	public void setLikesCats(boolean likesCats)
	{
		this.likesCats = likesCats;
	}
	public void setIsReal(boolean isReal)
	{
		this.isReal = isReal;
	}
}
