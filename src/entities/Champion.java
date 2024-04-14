package entities;

public class Champion {
	
	private String name;
	private int life;
	private int attack;
	private int armor;
	
	public Champion (String name, int life, int attack, int armor)
	{
		this.name = name;
		this.life = life;
		this.attack = attack;
		this.armor = armor;
	}
	
	public void takeDamage(Champion other)
	{
		if (armor > other.attack)
		{
			life -= 1;
		}
		else
		{
			life -= (other.attack - armor);
		}
		
		if (life < 0 )
		{
			life = 0;
		}
		
	}
	
	public int getLife()
	{
		return this.life;
	}
	
	public String toString()
	{
		String deadOrAlive = life == 0 ? " (morreu)" : "";
		
		return name
			+ ": "
			+ life
			+ " de vida"
			+ deadOrAlive;
	}
}
