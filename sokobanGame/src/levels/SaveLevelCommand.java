package levels;

import java.io.IOException;

public class SaveLevelCommand {
public SaveLevelCommand(Level lvl, String str) throws IOException {
	if (lvl !=null)
	{
		ExtensionFinder ef = new ExtensionFinder(str);
		String str2 = ef.getStr2();
		if (str2!=null)
		{
		if (str2.contains("txt")){
			@SuppressWarnings("unused")
			TextLevelSaver textSave = new TextLevelSaver(lvl,str);
		}
		else if (str2.contains("xml")){
			@SuppressWarnings("unused")
			XMLLevelSaver xmlSave = new XMLLevelSaver(lvl, str);
		}
		else if (str2.contains("ser")){
			@SuppressWarnings("unused")
			ObjectLevelSaver objectSave = new ObjectLevelSaver(lvl, str);
		}
		else {
			System.out.println("Wrong Path");
		}
		}
		else
		{
			System.out.println("i dont know to save in that filetype");
		}
	}
	else
	{
		System.out.println("You can't save an empty Level");
	}
}
}

