package levels;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TextLevelSaver implements LevelSaver{
	
	public TextLevelSaver(Level lvl,String str) throws IOException {
		
		BufferedWriter w = new BufferedWriter(new FileWriter("C:\\Users\\moshe\\Desktop\\מדעי המחשב\\שנה ב'\\פיתוח תכנה מתקדם\\אבן דרך\\1\\textLvls\\saves\\"+str));	//to change path	
		w.write(String.valueOf(lvl.getHeight()));
		w.write(String.valueOf('X'));
		w.write(String.valueOf(lvl.getWidth()));
		w.newLine();
		for(int i=0;i<lvl.getHeight();i++){
			for(int j=0;j<lvl.getWidth();j++){
				w.write(lvl.getMap()[i][j].getType());
			}
			w.newLine();
		}
		w.close();
		System.out.println("save ok");
	}
	
	
}
