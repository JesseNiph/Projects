
public class main {

	Champion Ezreal = new Champion();
	public Champion choose (String name, int league) 
	{
		String jesse = name;
		int champ = league;
	
		if(jesse.equals("champion"))
		{
		Ezreal = Champion.select(league);
		}
		else
		{
		Ezreal = Legend.select(league);
		}
		
		
		
		return Ezreal;
	}
	public void main(String[]args)
	{
		new Champions();
	}
}
