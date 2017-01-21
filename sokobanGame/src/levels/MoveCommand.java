package levels;

public class MoveCommand {
	public MoveCommand(String s,Level lvl) {
		
		if(s.contains("Down"))
		{
			@SuppressWarnings("unused")
			Movement m=new MoveDown(lvl);
		}
		else if(s.contains("Right"))
		{
			@SuppressWarnings("unused")
			Movement m=new MoveRight(lvl);
		}
		else if(s.contains("Left"))
		{
			@SuppressWarnings("unused")
			Movement m=new MoveLeft(lvl);
		}
		else if(s.contains("Up"))
		{
			@SuppressWarnings("unused")
			Movement m=new MoveUp(lvl);
		}
		else 
		{
			System.out.println("Unknown Command");
		}
	}

}
