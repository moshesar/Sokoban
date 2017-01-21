package levels;

public class DisplayLevelCommand implements Display {

	Level lvl;
	public DisplayLevelCommand(Level lvl) {
		this.lvl = lvl;
	}
	
	public void display() {
		for(int i=0;i<lvl.getHeight();i++){	
			for(int j=0;j<lvl.getWidth();j++){				
				System.out.print(lvl.getMap()[i][j].getType());				
			}
		System.out.println();
		}
	}
	}
