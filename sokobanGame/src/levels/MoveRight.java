package levels;

public class MoveRight implements Movement {
	
public MoveRight(Level lvl) {
	Pointer2D to1, to2;
	to1 =new Pointer2D(lvl.getPl());
	to1.setY(to1.getY()+1);
	to2 =new Pointer2D(lvl.getPl());
	to2.setY(to2.getY()+2);
	
	@SuppressWarnings("unused")
	MovementPolicy mp = new MovementPolicy(lvl,lvl.getPl(),to1,to2);
}

}
