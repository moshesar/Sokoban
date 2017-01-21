package levels;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectLevelSaver implements LevelSaver{
	
		
	public ObjectLevelSaver(Level lvl,String str) throws IOException {
		FileOutputStream out = new FileOutputStream("C:\\Users\\Admin\\workspace\\sokobanLevels\\"+str); //to change path
		ObjectOutputStream objOut = new ObjectOutputStream(out);
		objOut.writeObject(lvl);
		objOut.close();
	}
}