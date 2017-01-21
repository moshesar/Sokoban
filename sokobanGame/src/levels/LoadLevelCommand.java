package levels;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class LoadLevelCommand {
	private Level lvl = new Level();
public LoadLevelCommand(String str) throws FileNotFoundException {
	FileInputStream in = new FileInputStream(str);
	ExtensionFinder ef = new ExtensionFinder(str);
	String str2 = ef.getStr2();
	if (str2.contains("txt")){
		this.lvl = new TextLevelLoader().loadLevel(in);
	}
	else if (str2.contains("xml")){
		this.lvl = new XMLLevelLoader().loadLevel(in);
	}
	else if (str2.contains("ser")){
		this.lvl = new ObjectLevelLoader().loadLevel(in);
	}
	else {
		System.out.println("Wrong Path");
	}
	//
}
public Level getLvl() {
	return lvl;
}
public void setLvl(Level lvl) {
	this.lvl = lvl;
}
}
