package hanoi;

import structures.LinkedStack;

/**
 * A {@link StackBasedHanoiPeg} is an implementation of {@link HanoiPeg}.
 * 
 * @author jcollard
 */
public class StackBasedHanoiPeg implements HanoiPeg {
LinkedStack<HanoiRing> hanoi;
	/**
	 * Creates a new {@link StackBasedHanoiPeg} that has no rings.
	 */
	public StackBasedHanoiPeg() {
			hanoi=new LinkedStack<HanoiRing>();
	}

	@Override
	public void addRing(HanoiRing ring) throws IllegalHanoiMoveException {
		if(ring==null)
			throw new NullPointerException();
		if(hanoi.isEmpty()==false){
		if(ring.getSize()>hanoi.peek().getSize()||ring.getSize()==hanoi.peek().getSize())
			throw new IllegalHanoiMoveException("Illegal Move");
		}
		//if(hanoi.isEmpty()||hanoi.peek().getSize()!=ring.getSize())
		hanoi.push(ring);
	}

	@Override
	public HanoiRing remove() throws IllegalHanoiMoveException {
		if(hanoi.isEmpty())
			throw new IllegalHanoiMoveException("Hanoi Peg does not contain any rings");
			else
				return hanoi.pop();
		//return null;
	}

	@Override
	public HanoiRing getTopRing() throws IllegalHanoiMoveException {
		if(hanoi.isEmpty())
			throw new IllegalHanoiMoveException("Hanoi Peg does not contain any rings");
		else
			return hanoi.peek();
		//return null;
	}

	@Override
	public boolean hasRings() {
		if(hanoi.isEmpty()==true)
			return false;
		else 
		return true;
	}
}
