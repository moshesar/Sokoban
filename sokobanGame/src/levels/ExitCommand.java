package levels;

import java.io.IOException;
import java.util.Scanner;

public class ExitCommand {
public ExitCommand(Level lvl) throws IOException {
	System.out.println("Save before exit ?");
	String str="";
	while(!str.contains("yes") & !str.contains("no"))
	{
		Scanner s = new Scanner(System.in);
		str = s.nextLine();	
		if (str.contains("yes"))
		{
			System.out.println("save as ? ");
			s = new Scanner(System.in);
			str = s.nextLine();
			SaveLevelCommand save = new SaveLevelCommand(lvl,str);
		}
		else if(str.contains("no"))
		{}
		else 
			{System.out.println("yes/no");}
	}
}
}

