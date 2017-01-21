package levels;

import java.io.IOException;

public interface LevelSaver {
	public default void saveLevel(Level lv) throws IOException{}
}
