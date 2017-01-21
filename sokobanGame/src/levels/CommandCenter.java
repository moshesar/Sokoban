package levels;

import java.io.IOException;

public class CommandCenter 
{
	private boolean exit;
	private Level lvl;
public CommandCenter(String str,Level lvl,Boolean exit) throws IOException 
{	
	this.setExit(exit);
	this.setLvl(lvl);
	String splitCommand[]=str.split(" ", 2);
	if(splitCommand.length<2)
	{
		if (splitCommand[0].contains("Exit"))
		{
			@SuppressWarnings("unused")
			ExitCommand ec = new ExitCommand(lvl);
			this.exit = true;
		}
		else if (splitCommand[0].contains("Display"))
		{
			DisplayLevelCommand dc = new DisplayLevelCommand(lvl);
			dc.display();
		}
		else 
		{
			System.out.println("Unkown Command");
		}	
	}
	else if (splitCommand[1].length()<2)
	{
		System.out.println("this command need more information");
	}
	else
	if(splitCommand[0].contains("Load"))
	{		
		LoadLevelCommand load = new LoadLevelCommand(splitCommand[1]);
		this.lvl = load.getLvl();	
			
	}
	else if (splitCommand[0].contains("Move"))
	{		
		MoveCommand move = new MoveCommand(splitCommand[1], lvl);				
	}
	else if (splitCommand[0].contains("Save"))
	{			
				SaveLevelCommand save = new SaveLevelCommand(lvl, splitCommand[1]);
						
	}
	else 
	{
		System.out.println("Unkown Command");
	}
	}
public boolean isExit() {
	return exit;
}
public void setExit(boolean exit) {
	this.exit = exit;
}
public Level getLvl() {
	return lvl;
}
public void setLvl(Level lvl) {
	this.lvl = lvl;
}
}

