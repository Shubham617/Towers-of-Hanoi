/**
 * 
 */
package structures;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @author shubh
 *
 */
public class ListImplementation<T> implements ListInterface<T>,Iterable<T> {
	int size=0;
	LLNode<T> head; 
	LLNode<T> rear;
	public ListImplementation(){
		head=null;
		rear=null;
	}
	
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (head==null);
	}

	@Override
	public T get(int n) throws NoSuchElementException {
		// TODO Auto-generated method stub
		int count=0;
		LLNode<T> currNode=head;
		//T e=null;
		//ListIterator<T> link=new ListIterator<T>(head);
	    if(n>=size||n<0)
	    	throw new NoSuchElementException();
	    else{
		while(currNode!=null)
		{
			//count++;
			if(count==n)
			return currNode.getInfo();
			else{
			currNode=currNode.getLink();
			count++;
			}
		}
	    }
		return null;
	}

	@Override
	public ListInterface<T> append(T elem) {
		// TODO Auto-generated method stub
		if(elem==null)
			throw new NullPointerException();
		else{
			LLNode<T> newNode= new LLNode<T>(elem);
		if(rear==null){
			head=newNode;
			rear=newNode;
			size++;
		}
			else{
		rear.setLink(newNode);
		rear=newNode;	
		size++;
		}
		}
		return this;
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new ListIterator<T>(this.head);
	}

}
