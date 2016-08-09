package structures;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ListIterator<T> implements Iterator<T> {
	private LLNode<T> link;
	public ListIterator(LLNode<T> lk)
	{
		link=lk;
	}
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(link!=null)
			return true;
		else
		return false;
	}

	@Override
	public T next() {
		if(hasNext()){
		T info;
		info=link.getInfo();
		link=link.getLink();
		return info;
		}
		else
			throw new NoSuchElementException();
		// TODO Auto-generated method stub
		
	}

}
