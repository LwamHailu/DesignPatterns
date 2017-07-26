package lesson2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Adapter<T> implements TargetQueue<T>,TargetStack<T> {

	
	private Stack<T> stack=new Stack<>();
	private Queue<T> queue=new LinkedList<>();
	@Override
	public void push(T t) {
		stack.push(t);
		
	}

	@Override
	public T pop() throws Exception{
		if(!stack.isEmpty()){
			return stack.pop();
		}
		else {
			throw new Exception("Stack is Empty");
		}
		
	}

	@Override
	public T dequeue() throws Exception {
		if(!queue.isEmpty()){
			return queue.remove();
		}
		else{
			throw new Exception("Queue is empty");
		}
		
		
	}

	@Override
	public void enqueue(T t) {
		
		queue.add(t);
	}

	@Override
	public boolean isStackEmpty() {
		
		return stack.isEmpty();
	}

	@Override
	public boolean isQueueEmpty() {
		
		return queue.isEmpty();
	}


}
