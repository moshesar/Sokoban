package levels;

import java.io.IOException;
import java.util.Scanner;

public class UI {
	public UI() throws IOException {	//lvl not exist here
		Level lvl = null;
		boolean exit = false;
		System.out.println("Hello I am UI");
		
		@SuppressWarnings("unused")
		MenuDisplayer md = new MenuDisplayer();
		System.out.println("enter command");
		while(!exit)
		{
			@SuppressWarnings("resource")
			Scanner s = new Scanner(System.in);
			String str = s.nextLine();
			@SuppressWarnings("unused")
			CommandCenter command = new CommandCenter(str, lvl, exit);
			exit=command.isExit();
			lvl=command.getLvl();
			if(lvl!=null){
				DisplayLevelCommand dc = new DisplayLevelCommand(lvl);
				dc.display();
			}
		}
		
	}
}
// Load C:\\Users\\moshe\\Desktop\\מדעי המחשב\\שנה ב'\\פיתוח תכנה מתקדם\\אבן דרך\\1\\textLvls\\level2.txt
