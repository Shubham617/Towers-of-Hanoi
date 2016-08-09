package hanoi;

/**
 * A {@link ArrayBasedHanoiBoard} is a simple implementation of
 * {@link HanoiBoard}
 * 
 * @author jcollard
 * 
 */
public class ArrayBasedHanoiBoard implements HanoiBoard {
StackBasedHanoiPeg[] hanoi=new StackBasedHanoiPeg[3];
int number;
//int[] arrhanoi=new int[3];
//HanoiRing ring;	
//int number;;

	/**4
	 * 
	 * Creates a {@link ArrayBasedHanoiBoard} with three empty {@link HanoiPeg}s
	 * and {@code n} rings on peg 0.
	 */
	public ArrayBasedHanoiBoard(int n) {
		hanoi[0]=new StackBasedHanoiPeg();
		hanoi[1]=new StackBasedHanoiPeg();
		hanoi[2]=new StackBasedHanoiPeg();
		//number=n;
     if(n<0)
    	  throw new IllegalArgumentException();
		number=n;
      int rings=n;
		int i=1;
		while(i<=n){
			HanoiRing ring=new HanoiRing(rings);//(int)(100*Math.random()));
			hanoi[0].addRing(ring);
			i++;
			rings--;
		}
	
		//arrhanoi[0]=n;
	}

	@Override
	public void doMove(HanoiMove move) throws IllegalHanoiMoveException {
		if (!isLegalMove(move)) {
			throw new IllegalHanoiMoveException(
					"Could not perform illegal move.");
		}
	//HanoiRing k=hanoi[move.getFromPeg()].remove();
	hanoi[move.getToPeg()].addRing(hanoi[move.getFromPeg()].remove());
	//hanoi[move.getFromPeg()].remove();
	//arrhanoi[move.getFromPeg()]--;
	//arrhanoi[move.getToPeg()]++;
	}

	@Override
	public boolean isSolved() {
		if(hanoi[2].hasRings()==true&&hanoi[0].hasRings()==false&&hanoi[1].hasRings()==false)
			return true;
		if(number==0)
			return true;
		//if(number==0&&hanoi[2].hasRings()==false)
			//return true;
		//if(number==0)
			//return true;
		
		return false;
	}

	@Override
	public boolean isLegalMove(HanoiMove move) {
		//int a=hanoi[0];
		//int b=hanoi[1];
		//int c=hanoi[2];
		if(move==null)
			throw new NullPointerException();
		if(move.getFromPeg()<0||move.getFromPeg()>2)
			return false;
		if(move.getToPeg()<0||move.getToPeg()>2)
			return false;
	if(isSolved())
			return false;
		//if(arrhanoi[1]==rings-1&&move.getToPeg()==1)
			//return false;
		//if(hanoi[move.getFromPeg()].getTopRing().getSize()>hanoi[move.getToPeg()].getTopRing().getSize())
		 //return false;
		if(hanoi[move.getToPeg()].hasRings()&&hanoi[move.getFromPeg()].hasRings())
		{
			if(hanoi[move.getFromPeg()].getTopRing().getSize()>hanoi[move.getToPeg()].getTopRing().getSize())
				return false;
		}
		if(move.getFromPeg()==move.getToPeg()) 
			return false;
		if(hanoi[move.getFromPeg()].hasRings()==false)
			return false;
		return true;
	}
}
